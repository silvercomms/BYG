package potionstudios.byg.common.block;

import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

@SuppressWarnings("deprecation")
public class BYGBlockProperties {

    public static class BYGSnowyPlant extends BYGSnowyPlants {
        public BYGSnowyPlant() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.GRASS)
                    .strength(0.0f)
                    .noCollission()
                    .noOcclusion()
            );
        }
    }

    public static class BYGEnderLily extends WaterlilyBlock {
        public BYGEnderLily() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.LILY_PAD)
                    .instabreak()
                    .noOcclusion()
            );

        }
    }

    public static class BYGMagma extends MagmaBlock {
        public BYGMagma() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
                    .strength(0.2f)
                    .randomTicks()
                    .lightLevel((state) -> 10)
                    .requiresCorrectToolForDrops()

            );

        }
    }

    public static class BYGMud extends Block {
        public BYGMud() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.GRAVEL)
                    .strength(0.2f)
                    .speedFactor(0.4F)
            );

        }
    }

    public static class BYGNyliumSoulSand extends Block {

        public BYGNyliumSoulSand() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.SOUL_SAND)
                    .strength(0.5f)
                    .speedFactor(0.6F)

            );

        }

    }

    public static class BYGNyliumSoulSoil extends Block {

        public BYGNyliumSoulSoil() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.SOUL_SOIL)
                    .strength(0.5f)


            );

        }

    }

    public static class BYGQuartziteSand extends Block {
        public BYGQuartziteSand() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.SAND)
                    .strength(0.2f)

            );

        }
    }

    public static class BYGWartBlock extends Block {
        public BYGWartBlock() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.WART_BLOCK)
                    .strength(1.0F)
            );
        }
    }

    public static class BYGWarpedCoralBlock extends Block {
        public BYGWarpedCoralBlock() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.CORAL_BLOCK)
                    .strength(0.2f)
                    .lightLevel((state) -> 8)
            );

        }
    }

    public static class BYGPollen extends BYGPollenBlock {
        public BYGPollen() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.CORAL_BLOCK)
                    .strength(0.2f)
                    .randomTicks()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel((state) -> 9)
            );

        }
    }

    public static class BYGThatch extends HayBlock {
        public BYGThatch() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.GRASS)
                    .strength(0.5f)
            );

        }
    }

    public static class ThatchCarpet extends WoolCarpetBlock {
        public ThatchCarpet() {
            super(DyeColor.BROWN, BlockBehaviour.Properties.of()
                    .sound(SoundType.GRASS)
                    .strength(0.5f)
            );

        }
    }

    public static class ThatchStairs extends StairBlock {
        public ThatchStairs() {
            super(BYGBlocks.CATTAIL_THATCH.defaultBlockState(), Properties.copy(BYGBlocks.CATTAIL_THATCH.get())
                    .sound(SoundType.GRASS)
                    .strength(0.5f)
            );

        }
    }

    public static class ThatchSlab extends SlabBlock {
        public ThatchSlab() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.GRASS)
                    .strength(0.5f)
            );

        }
    }

    public static class BYGPoisonIvy extends PoisonIvyBlock {
        public BYGPoisonIvy() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.GRASS)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );

        }
    }

    public static class BYGSkyrisVine extends VineBlock {
        public BYGSkyrisVine() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.GRASS)
                    .strength(0.2f)
                    .randomTicks()
                    .noCollission()
            );

        }
    }

    public static class LogBlock extends RotatedPillarBlock {
        public LogBlock(Properties properties) {
            super(properties);
        }
    }

    public static class BYGNetherLog extends LogBlock {
        public BYGNetherLog() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.STEM)
                    .strength(2.0f)
            );

        }
    }

    public static class BYGNetherWood extends RotatedPillarBlock {
        public BYGNetherWood() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.STEM)
                    .strength(2.0f)
            );

        }
    }

    //Saving this for later do not touch
//    
//    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
//        return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
//    }

    public static class BYGPervadedNetherrack extends DropExperienceBlock {
        public BYGPervadedNetherrack() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .strength(0.4F, 0.4F)
                    .lightLevel((state) -> 13)
                    .requiresCorrectToolForDrops()

            );

        }
    }

    public static class AnthraciteOre extends DropExperienceBlock {
        public AnthraciteOre() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.NETHER_ORE)
                    .strength(0.4F, 0.4F)
                    .requiresCorrectToolForDrops()

            );

        }
    }


    public static class BlockHugeMushroom extends HugeMushroomBlock {
        public BlockHugeMushroom() {
            super(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
                    .sound(SoundType.STEM)
                    .strength(0.2F)
            );

            this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, true).setValue(EAST, true).setValue(SOUTH, true).setValue(WEST, true).setValue(UP, true).setValue(DOWN, true));
        }
    }

    public static class BlockHugeNetherMushroom extends HugeMushroomBlock {
        public BlockHugeNetherMushroom() {
            super(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
                    .sound(SoundType.STEM)
                    .strength(0.2F)
                    .lightLevel((state) -> 12)
            );

            this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, true).setValue(EAST, true).setValue(SOUTH, true).setValue(WEST, true).setValue(UP, true).setValue(DOWN, true));
        }


        @Override
        public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side);
        }
    }

    public static class BlockHugeNetherMushroomStem extends HugeMushroomBlock {
        public BlockHugeNetherMushroomStem() {
            super(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
                    .sound(SoundType.STEM)
                    .strength(0.2F)
            );

            this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, true).setValue(EAST, true).setValue(SOUTH, true).setValue(WEST, true).setValue(UP, true).setValue(DOWN, true));
        }


        @Override
        public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side);
        }
    }

    public static class BulbisShell extends HugeMushroomBlock {
        public BulbisShell() {
            super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN)
                    .sound(SoundType.SHROOMLIGHT)
                    .strength(0.2F)
                    .noOcclusion()
                    .lightLevel((state) -> 12)
            );

            this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, true).setValue(EAST, true).setValue(SOUTH, true).setValue(WEST, true).setValue(UP, true).setValue(DOWN, true));
        }


        public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side);
        }
    }

    public static class BYGStoneStairs extends StairBlock {
        public BYGStoneStairs() {
            super(Blocks.COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)

                    .sound(SoundType.STONE)
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()

            );

        }
    }

    public static class BYGGlowCaneBlock extends Block {
        public BYGGlowCaneBlock() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.SHROOMLIGHT)
                    .strength(0.3F)
                    .lightLevel((state) -> 15)
            );

        }
    }

    public static class BYGStone extends Block {
        public BYGStone() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()

            );

        }
    }

    public static class BYGNetherrack extends Block {
        public BYGNetherrack() {
            super(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BLUE)
                    .sound(SoundType.NETHERRACK)
                    .strength(0.4F, 0.4F)
                    .requiresCorrectToolForDrops()

            );
        }
    }

    public static class BygNetherBricks extends Block {
        public BygNetherBricks(MapColor color) {
            super(BlockBehaviour.Properties.of().mapColor(color)
                    .sound(SoundType.NETHER_BRICKS)
                    .strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops()
            );
        }
    }

    public static class BYGPillar extends RotatedPillarBlock {
        public BYGPillar() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()


            );

        }
    }

    public static class BYGLantern extends LanternBlock {
        public BYGLantern() {
            super(BlockBehaviour.Properties.of()
                    .sound(SoundType.LANTERN)
                    .strength(3.5F)
                    .lightLevel((state) -> 15)
                    .noOcclusion()

                    .requiresCorrectToolForDrops()

            );

        }
    }
}

