package potionstudios.byg.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import potionstudios.byg.BYG;
import potionstudios.byg.common.world.BYGDamageTypes;
import potionstudios.byg.datagen.providers.BYGRecipeProviders;
import potionstudios.byg.datagen.providers.BYGWoodAssetsProvider;
import potionstudios.byg.datagen.providers.lang.EnUsLanguageProvider;
import potionstudios.byg.datagen.providers.loot.BYGLootTablesProvider;
import potionstudios.byg.datagen.providers.tag.BYGBlockTagsProvider;
import potionstudios.byg.datagen.providers.tag.BYGEntityTagsProvider;
import potionstudios.byg.datagen.providers.tag.BYGItemTagsProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = BYG.MOD_ID)
public class BYGDataGen {


    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.DAMAGE_TYPE, pContext -> {
                BYGDamageTypes.DAMAGE_TYPE_FACTORIES.forEach((resourceKey, factory) -> {
                    pContext.register(resourceKey, factory.generate(pContext));

                });
            });

    @SubscribeEvent
    static void onDatagen(final GatherDataEvent event) {
        final var gen = event.getGenerator();
        final var existingFileHelper = event.getExistingFileHelper();

        // Server:
        gen.addProvider(event.includeServer(), new BYGLootTablesProvider(gen));
        CompletableFuture<HolderLookup.Provider> completablefuture = event.getLookupProvider();
//
        final var blockTags = new BYGBlockTagsProvider(completablefuture, gen , existingFileHelper);
        gen.addProvider(event.includeServer(), blockTags);
        gen.addProvider(event.includeServer(), new BYGItemTagsProvider(gen, completablefuture, blockTags.contentsGetter(), existingFileHelper));
        gen.addProvider(event.includeServer(), new BYGEntityTagsProvider(gen, completablefuture, existingFileHelper));

        gen.addProvider(event.includeServer(), new BYGRecipeProviders(gen));

         Client:
        gen.addProvider(event.includeServer(), new BYGWoodAssetsProvider(gen, existingFileHelper));
        gen.addProvider(event.includeClient(), new EnUsLanguageProvider(gen));
        gen.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(gen.getPackOutput(), event.getLookupProvider(), BUILDER, Set.of(BYG.MOD_ID)));

//        StructureTemplateUtil.removeBlocks(existingFileHelper);
    }

}
