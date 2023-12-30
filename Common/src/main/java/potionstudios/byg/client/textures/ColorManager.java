package potionstudios.byg.client.textures;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.state.BlockState;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.block.BYGWoodTypes;
import potionstudios.byg.common.item.BYGItems;
import potionstudios.byg.common.registration.BYGBlockFamilies;
import potionstudios.byg.common.registration.BYGBlockFamily;

public class ColorManager {

    //TODO Figure out why this is important and if it is find a way to replace it

    public static synchronized void onBlockColorsInit(BlockColors blockColors) {
        //registers the colors for blocks that changes colors based on biome
        blockColors.register((unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? BiomeColors.getAverageGrassColor(lightReader, pos) : GrassColor.get(0.5D, 1.0D),  BYGBlocks.FLOWER_PATCH.get(), BYGBlocks.LUSH_GRASS_BLOCK.get(), BYGBlocks.OVERGROWN_STONE.get(), BYGBlocks.TINY_LILYPADS.get(), BYGBlocks.FLOWERING_TINY_LILY_PADS.get(), BYGBlocks.OVERGROWN_DACITE.get());
        blockColors.register((unknown, lightReader, pos, unknown2) ->
                lightReader != null && pos != null ? BiomeColors.getAverageFoliageColor(lightReader, pos) :
                        FoliageColor.get(0.5D, 1.0D), BYGBlocks.CLOVER_PATCH.get(), BYGWoodTypes.MAHOGANY.leaves().get(),BYGBlocks.LEAF_PILE.get(), BYGBlocks.POISON_IVY.get(), BYGWoodTypes.WILLOW.leaves().get(), BYGBlockFamilies.MAPLE.get(BYGBlockFamily.BlockVariant.LEAVES));
        blockColors.register((unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? BiomeColors.getAverageWaterColor(lightReader, pos) : -1, BYGBlocks.WATER_BARREL_CACTUS.get());
    }

    public static synchronized void onItemColorsInit(BlockColors blockColors, ItemColors itemColors) {
        // Use the Block's colour handler from BlockItem
        ItemColor itemBlockColourHandler = (stack, tintIndex) -> {
            BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
            return blockColors.getColor(state, null, null, tintIndex);
        };

        itemColors.register(itemBlockColourHandler,
                BYGItems.CLOVER_PATCH.get(), BYGItems.LUSH_GRASS_BLOCK.get(), BYGWoodTypes.MAHOGANY.leaves().get(),
            BYGItems.POISON_IVY.get(), BYGItems.OVERGROWN_STONE.get(),
            BYGItems.TINY_LILYPADS.get(), BYGItems.FLOWERING_TINY_LILY_PADS.get(), BYGItems.OVERGROWN_DACITE.get(), BYGItems.LEAF_PILE.get(),
            BYGWoodTypes.WILLOW.leaves(),
            BYGBlockFamilies.MAPLE.get(BYGBlockFamily.BlockVariant.LEAVES));
    }
}