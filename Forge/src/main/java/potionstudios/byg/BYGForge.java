package potionstudios.byg;

import corgitaco.corgilib.network.ForgeNetworkHandler;
import corgitaco.corgilib.serialization.jankson.JanksonUtil;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import potionstudios.byg.client.BYGClient;
import potionstudios.byg.client.BYGForgeClient;
import potionstudios.byg.client.textures.renders.BYGRenderTypes;
import potionstudios.byg.common.BYGCompostables;
import potionstudios.byg.common.BYGFuels;
import potionstudios.byg.common.BYGStrippables;
import potionstudios.byg.core.BYGRegistry;
import potionstudios.byg.mixin.access.AxeItemAccess;

import java.util.IdentityHashMap;
import java.util.Map;

@Mod(BYG.MOD_ID)
public class BYGForge {

    public BYGForge() {
        BYG.INITIALIZED = true;
        final var modBus = FMLJavaModLoadingContext.get().getModEventBus();
//        BYGCreativeTab.init(new CreativeModeTab("byg.byg") {
//            @Override
//            public @NotNull ItemStack makeIcon() {
//                return new ItemStack(BYGItems.BYG_LOGO.get());
//            }
//
//            @Override
//            public boolean hasSearchBar() {
//                return true;
//            }
//
//            @Override
//            public boolean canScroll() {
//                return true;
//            }
//
//            @Override
//            public @NotNull ResourceLocation getBackgroundImage() {
//                return new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png");
//            }
//        });

        BYGRegistry.loadClasses();
        modBus.addListener(this::createTestEntityAttributes);
        modBus.addListener(this::commonLoad);
        modBus.addListener(this::loadFinish);
        modBus.addListener(this::clientLoad);
    }

    public void createTestEntityAttributes(final EntityAttributeCreationEvent event) {
    }

    private void commonLoad(FMLCommonSetupEvent event) {
        BYG.commonLoad();
        event.enqueueWork(BYG::threadSafeCommonLoad);
        event.enqueueWork(ForgeNetworkHandler::init);

        BYGFuels.loadFuels(BYGForgeBusEventsHandler.BURN_TIMES::put);
        Map<Block, Block> strippables = new IdentityHashMap<>(AxeItemAccess.byg_getStrippables());
        BYGStrippables.strippableLogsBYG(strippables::put);
        AxeItemAccess.byg_setStripables(strippables);
    }

    private void loadFinish(FMLLoadCompleteEvent event) {
        event.enqueueWork(BYG::threadSafeLoadFinish);
        event.enqueueWork(() -> ComposterBlock.COMPOSTABLES.putAll(BYGCompostables.COMPOSTABLES.get()));
        // Because Forge's enqueueWork eats exceptions, we need to cache it ourselves and throw it after the fact.
        // TODO: Remove this ugly workaround once forge fixes this issue.
        if (JanksonUtil.thrown != null) {
            throw JanksonUtil.thrown;
        }
    }

    private void clientLoad(FMLClientSetupEvent event) {
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            BYGClient.load();
            BYGRenderTypes.renderTypes(blockRenderTypeMap -> blockRenderTypeMap.forEach(ItemBlockRenderTypes::setRenderLayer));
            BYGForgeClient.client();
            event.enqueueWork(BYGClient::threadSafeLoad);
        });
    }
}