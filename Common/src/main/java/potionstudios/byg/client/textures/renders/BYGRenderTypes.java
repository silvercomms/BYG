package potionstudios.byg.client.textures.renders;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import potionstudios.byg.BYG;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.registration.BYGBlockFamilies;
import potionstudios.byg.common.registration.BYGBlockFamiliesClient;
import potionstudios.byg.common.registration.BYGBlockFamily;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class BYGRenderTypes {
    public static void renderTypes(Consumer<Map<Block, RenderType>> mapConsumer) {
        BYG.logDebug("BYG: Rendering Texture Cutouts...");
        Map<Block, RenderType> map = new HashMap<>();



        for(BYGBlockFamily family: BYGBlockFamilies.woodFamilyMap.values()) {
            RenderType renderType = RenderType.cutoutMipped();
            if(BYGBlockFamiliesClient.renderTypes.containsKey(family)) {
                renderType = BYGBlockFamiliesClient.renderTypes.get(family);
            }
            Block door = family.get(BYGBlockFamily.BlockVariant.DOOR);
            if(door != null) {
                map.put(door, renderType);
            }
            Block trapdoor = family.get(BYGBlockFamily.BlockVariant.TRAPDOOR);
            if(trapdoor != null) {
                map.put(trapdoor, renderType);
            }
            Block leaves = family.get(BYGBlockFamily.BlockVariant.LEAVES);
            if(leaves != null) {
                map.put(leaves, RenderType.cutoutMipped());
            }
            Block fruitLeaves = family.get(BYGBlockFamily.BlockVariant.FRUIT_LEAVES);
            if(fruitLeaves != null) {
                map.put(fruitLeaves, RenderType.cutoutMipped());
            }
            Block floweringLeaves = family.get(BYGBlockFamily.BlockVariant.FLOWERING_LEAVES);
            if(floweringLeaves != null) {
                map.put(floweringLeaves, RenderType.cutoutMipped());
            }
            Block fruitBlock = family.get(BYGBlockFamily.BlockVariant.FRUIT_BLOCK);
            if(fruitBlock != null) {
                map.put(fruitBlock, RenderType.cutoutMipped());
            }
            Block vine = family.get(BYGBlockFamily.BlockVariant.VINE);
            if(vine != null) {
                map.put(vine, RenderType.cutoutMipped());
            }
            Block foliage = family.get(BYGBlockFamily.BlockVariant.FOLIAGE);
            if(foliage != null) {
                map.put(foliage, RenderType.cutoutMipped());
            }
            Block bush = family.get(BYGBlockFamily.BlockVariant.BUSH);
            if(bush != null) {
                map.put(bush, RenderType.cutoutMipped());
            }
            Block sprouts = family.get(BYGBlockFamily.BlockVariant.SPROUTS);
            if(sprouts != null) {
                map.put(sprouts, RenderType.cutoutMipped());
            }
            Block roots = family.get(BYGBlockFamily.BlockVariant.ROOTS);
            if(roots != null) {
                map.put(roots, RenderType.cutoutMipped());
            }
            Block growth = family.get(BYGBlockFamily.BlockVariant.GROWTH);
            if(growth != null) {
                map.put(growth, RenderType.cutoutMipped());
            }
            Block tendrils = family.get(BYGBlockFamily.BlockVariant.TENDRILS);
            if(tendrils != null) {
                map.put(tendrils, RenderType.cutoutMipped());
            }
            Block grass = family.get(BYGBlockFamily.BlockVariant.GRASS);
            if(grass != null) {
                map.put(grass, RenderType.cutoutMipped());
            }
            Block tallGrass = family.get(BYGBlockFamily.BlockVariant.TALL_GRASS);
            if(tallGrass != null) {
                map.put(tallGrass, RenderType.cutoutMipped());
            }
        }


        map.put(BYGBlocks.WITCH_HAZEL_BLOSSOM.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ALOE_VERA.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BLOOMING_ALOE_VERA.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.HORSEWEED.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BLUE_SAGE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BLUE_ROSE_BUSH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.MINI_CACTUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PRICKLY_PEAR_CACTUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WINTER_SUCCULENT.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.TALL_PINK_ALLIUM.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.TALL_ALLIUM.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WAILING_VINES.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BORIC_CAMPFIRE.get(), RenderType.cutoutMipped());
        //Nether
        map.put(BYGBlocks.SOUL_SHROOM.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.DEATH_CAP.get(), RenderType.cutoutMipped());

        //End
        map.put(BYGBlocks.PURPLE_BULBIS_ODDITY.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PURPLE_BULBIS_SHELL.get(), RenderType.translucent());
        map.put(BYGBlocks.BULBIS_SHELL.get(), RenderType.translucent());
        map.put(BYGBlocks.THERIUM_LANTERN.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.THERIUM_CRYSTAL_CLUSTER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.LARGE_THERIUM_CRYSTAL_BUD.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.MEDIUM_THERIUM_CRYSTAL_BUD.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.SMALL_THERIUM_CRYSTAL_BUD.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BORIC_LANTERN.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CRYPTIC_END_ROD.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ODDITY_BUSH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CRYPTIC_CAMPFIRE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ENDER_LILY.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.FUNGAL_IMPARIUS.get(), RenderType.cutoutMipped());

        //Sea Plants
        map.put(BYGBlocks.CATTAIL_SPROUT.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CATTAIL.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.TINY_LILYPADS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.FLOWERING_TINY_LILY_PADS.get(), RenderType.cutoutMipped());

        map.put(BYGBlocks.WATER_SILK.get(), RenderType.cutoutMipped());

        //Grass
        map.put(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.get(), RenderType.translucent());
        map.put(BYGBlocks.TALL_PRAIRIE_GRASS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BEACH_GRASS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.TALL_BEACH_GRASS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.LEAF_PILE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CLOVER_PATCH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.FLOWER_PATCH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.SHRUB.get(), RenderType.cutoutMipped());


        //Saplings
        map.put(BYGBlocks.JACARANDA_BUSH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.INDIGO_JACARANDA_BUSH.get(), RenderType.cutoutMipped());

        //Mushrooms
        map.put(BYGBlocks.WHITE_PUFFBALL.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WEEPING_MILKCAP.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WOOD_BLEWIT.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.GREEN_MUSHROOM.get(), RenderType.cutoutMipped());


        //FlowerBlocks
        map.put(BYGBlocks.ALLIUM_FLOWER_BUSH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ALPINE_BELLFLOWER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.AMARANTH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ANGELICA.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.HYDRANGEA_BUSH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.HYDRANGEA_HEDGE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BEGONIA.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BISTORT.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CALIFORNIA_POPPY.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CROCUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.BLACK_ROSE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CYAN_AMARANTH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CYAN_ROSE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CYAN_TULIP.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.DAFFODIL.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.DELPHINIUM.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.FAIRY_SLIPPER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.FIRECRACKER_FLOWER_BUSH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.FOXGLOVE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.GOLDEN_SPINED_CACTUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.GREEN_TULIP.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.GUZMANIA.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.INCAN_LILY.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.IRIS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.JAPANESE_ORCHID.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.KOVAN_FLOWER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.LAZARUS_BELLFLOWER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.LOLLIPOP_FLOWER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.MAGENTA_AMARANTH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.MAGENTA_TULIP.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ORANGE_AMARANTH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ORANGE_DAISY.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ORSIRIA_ROSE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PEACH_LEATHER_FLOWER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PINK_ALLIUM.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PINK_ALLIUM_FLOWER_BUSH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PINK_ANEMONE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PINK_DAFFODIL.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PROTEA_FLOWER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PURPLE_AMARANTH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PURPLE_SAGE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PURPLE_TULIP.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.RICHEA.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.ROSE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.SNOWDROPS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.SILVER_VASE_FLOWER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.VIOLET_LEATHER_FLOWER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WHITE_ANEMONE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WHITE_SAGE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WINTER_CYCLAMEN.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WINTER_ROSE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WINTER_SCILLA.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.YELLOW_DAFFODIL.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.YELLOW_TULIP.get(), RenderType.cutoutMipped());

        //Other renders
        map.put(BYGBlocks.BARREL_CACTUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.FLOWERING_BARREL_CACTUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.CARVED_BARREL_CACTUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.WATER_BARREL_CACTUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.HONEY_BARREL_CACTUS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.AMETRINE_CLUSTER.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.THERIUM_GLASS.get(), RenderType.translucent());
        map.put(BYGBlocks.THERIUM_GLASS_PANE.get(), RenderType.translucent());
        map.put(BYGBlocks.BLACK_ICE.get(), RenderType.translucent());
        map.put(BYGBlocks.AMETRINE_BLOCK.get(), RenderType.translucent());
        map.put(BYGBlocks.BLUEBERRY_BUSH.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.SYTHIAN_SCAFFOLDING.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.OVERGROWN_STONE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.OVERGROWN_DACITE.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.PRAIRIE_GRASS.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.LUSH_GRASS_BLOCK.get(), RenderType.cutoutMipped());
        map.put(BYGBlocks.POISON_IVY.get(), RenderType.cutoutMipped());

        for (final var potBlock : BYGBlocks.FLOWER_POT_BLOCKS.values())
            map.put(potBlock.get(), RenderType.cutoutMipped());

        BYG.logDebug("BYG: Texture Cutouts Rendered!");

        mapConsumer.accept(map);
    }
}
