package potionstudios.byg;

import corgitaco.corgilib.CorgiLibFabric;
import corgitaco.corgilib.network.FabricNetworkHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import potionstudios.byg.common.BYGCompostables;
import potionstudios.byg.common.BYGFuels;
import potionstudios.byg.common.BYGStrippables;
import potionstudios.byg.common.block.BYGScaffoldingBlock;
import potionstudios.byg.common.entity.BYGEntities;
import potionstudios.byg.common.item.BYGItems;
import potionstudios.byg.core.BYGRegistry;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class BYGFabric implements ModInitializer {

    private static String firstInitialized = null;

    @Override
    public void onInitialize() {
        initializeBYG("BYG Fabric Mod Initializer");
    }

    public static void initializeBYG(String initializedFrom) {
        CorgiLibFabric.initializeCorgiLib(initializedFrom);
        Objects.requireNonNull(initializedFrom, "BYG must be told where it was initialized from.");
        if (firstInitialized != null || BYG.INITIALIZED) {
            BYG.logDebug(String.format("Attempted to Initialize Oh The Biomes You'll Go (BYG) from \"%s\" but BYG already was initialized from \"%s\", this should not be a problem.", initializedFrom, firstInitialized));
            return;
        }
        firstInitialized = initializedFrom;
        BYG.INITIALIZED = true;

        registryBootStrap();
        BYGRegistry.loadClasses();

        registerEntityAttributes();

        BYGFuels.loadFuels(FuelRegistry.INSTANCE::add);

        CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, commandSelection) -> BYG.attachCommands(dispatcher, commandSelection));
        FabricNetworkHandler.init();

        BYG.logInfo(String.format("Oh The Biomes You'll Go (BYG) was initialized from \"%s\"", initializedFrom));
    }

    public static void registerEntityAttributes() {
    }

    public static void afterRegistriesFreeze() {
        BYG.commonLoad();
        BYG.blockToInstanceOfReplacement(Blocks.SCAFFOLDING, BYGScaffoldingBlock.class);
        BYG.threadSafeCommonLoad();
        BYG.threadSafeLoadFinish();
        BYGCompostables.COMPOSTABLES.get().forEach(CompostingChanceRegistry.INSTANCE::add);

        BYGStrippables.strippableLogsBYG(StrippableBlockRegistry::register);
        BYG.logInfo("\"Oh The Biomes You'll Go\" after registries freeze event complete!");
    }

    private static void registryBootStrap() {
//        BYGCreativeTab.init(FabricItemGroupBuilder.build(createLocation(BYG.MOD_ID), () -> new ItemStack(BYGItems.BYG_LOGO.get())));

        BYG.logInfo("BYG registries bootstrapped");
    }
}
