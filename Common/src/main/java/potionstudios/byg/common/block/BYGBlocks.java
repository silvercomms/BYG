package potionstudios.byg.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.features.NetherFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.material.MapColor;
import potionstudios.byg.BYG;
import potionstudios.byg.BYGConstants;
import potionstudios.byg.common.entity.BYGEntityTags;
import potionstudios.byg.common.registration.BYGBlockFamily;
import potionstudios.byg.mixin.access.*;
import potionstudios.byg.reg.BlockRegistryObject;
import potionstudios.byg.reg.RegistrationProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

@SuppressWarnings("ALL")
public class BYGBlocks {
    public static final RegistrationProvider<Block> PROVIDER = RegistrationProvider.get(Registries.BLOCK, BYG.MOD_ID);

    public static final Map<ResourceLocation, BlockRegistryObject<Block>> FLOWER_POT_BLOCKS = new HashMap<>();
    public static final List<BlockRegistryObject<Block>> SIGN_BLOCKS = new ArrayList<>();

    public static final BlockRegistryObject<Block> FORAGERS_TABLE = createBlock(() -> new Block(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), "foragers_table");


    public static final BlockRegistryObject<Block> PEAT = createDirt("peat");
    public static final BlockRegistryObject<Block> LUSH_DIRT = createDirt("lush_dirt");
    public static final BlockRegistryObject<Block> LUSH_FARMLAND = createLushFarmland("lush_farmland");

    public static final BlockRegistryObject<Block> JACARANDA_BUSH = createJacarandaBush("jacaranda_bush");
    public static final BlockRegistryObject<Block> INDIGO_JACARANDA_BUSH = createIndigoJacarandaBush("indigo_jacaranda_bush");
    public static final BlockRegistryObject<Block> SHRUB = createShrub("shrub");

    public static final BlockRegistryObject<Block> WITCH_HAZEL_BLOSSOM = createWitchHazelBlossomBlock(MapColor.COLOR_YELLOW, "witch_hazel_blossom");

    public static final BlockRegistryObject<Block> BLUE_SPRUCE_LEAVES = createLeaves(MapColor.COLOR_LIGHT_BLUE, "blue_spruce_leaves");
    public static final BlockRegistryObject<Block> BLOOMING_WITCH_HAZEL_LEAVES = createLeaves(MapColor.COLOR_ORANGE, "blooming_witch_hazel_leaves");
    public static final BlockRegistryObject<Block> BROWN_BIRCH_LEAVES = createLeaves(MapColor.COLOR_BROWN, "brown_birch_leaves");
    public static final BlockRegistryObject<Block> BROWN_OAK_LEAVES = createLeaves(MapColor.COLOR_BROWN, "brown_oak_leaves");
    public static final BlockRegistryObject<Block> FLOWERING_PALO_VERDE_LEAVES = createFloweringPaloVerdeLeaves(MapColor.COLOR_YELLOW, "flowering_palo_verde_leaves");
    public static final BlockRegistryObject<Block> INDIGO_JACARANDA_LEAVES = createLeaves(MapColor.TERRACOTTA_BLUE, "indigo_jacaranda_leaves");
    public static final BlockRegistryObject<Block> FLOWERING_JACARANDA_LEAVES = createLeaves(MapColor.TERRACOTTA_PURPLE, "flowering_jacaranda_leaves");
    public static final BlockRegistryObject<Block> FLOWERING_INDIGO_JACARANDA_LEAVES = createLeaves(MapColor.TERRACOTTA_BLUE, "flowering_indigo_jacaranda_leaves");
    public static final BlockRegistryObject<Block> ORANGE_BIRCH_LEAVES = createLeaves(MapColor.COLOR_ORANGE, "orange_birch_leaves");
    public static final BlockRegistryObject<Block> ORANGE_OAK_LEAVES = createLeaves(MapColor.COLOR_ORANGE, "orange_oak_leaves");
    public static final BlockRegistryObject<Block> ORANGE_SPRUCE_LEAVES = createLeaves(MapColor.COLOR_ORANGE, "orange_spruce_leaves");
    public static final BlockRegistryObject<Block> PALO_VERDE_LEAVES = createLeaves(MapColor.COLOR_GREEN, "palo_verde_leaves");
    public static final BlockRegistryObject<Block> RED_BIRCH_LEAVES = createLeaves(MapColor.COLOR_RED, "red_birch_leaves");
    public static final BlockRegistryObject<Block> RED_OAK_LEAVES = createLeaves(MapColor.COLOR_RED, "red_oak_leaves");
    public static final BlockRegistryObject<Block> RED_SPRUCE_LEAVES = createLeaves(MapColor.COLOR_RED, "red_spruce_leaves");
    public static final BlockRegistryObject<Block> YELLOW_BIRCH_LEAVES = createLeaves(MapColor.COLOR_YELLOW, "yellow_birch_leaves");
    public static final BlockRegistryObject<Block> YELLOW_SPRUCE_LEAVES = createLeaves(MapColor.COLOR_YELLOW, "yellow_spruce_leaves");
    public static final BlockRegistryObject<Block> FIRECRACKER_LEAVES = createFirecrackerLeavesBlock(MapColor.COLOR_GREEN, "firecracker_leaves");

    public static final BlockRegistryObject<Block> GREEN_MUSHROOM_BLOCK = createBlock(BYGBlockProperties.BlockHugeMushroom::new, "green_mushroom_block");
    public static final BlockRegistryObject<Block> MILKCAP_MUSHROOM_BLOCK = createBlock(BYGBlockProperties.BlockHugeMushroom::new, "weeping_milkcap_mushroom_block");
    public static final BlockRegistryObject<Block> BLEWIT_MUSHROOM_BLOCK = createBlock(BYGBlockProperties.BlockHugeMushroom::new, "wood_blewit_mushroom_block");
    public static final BlockRegistryObject<Block> WHITE_MUSHROOM_STEM = createBlock(BYGBlockProperties.BlockHugeMushroom::new, "white_mushroom_stem");
    public static final BlockRegistryObject<Block> BROWN_MUSHROOM_STEM = createBlock(BYGBlockProperties.BlockHugeMushroom::new, "brown_mushroom_stem");
    public static final BlockRegistryObject<Block> SOUL_SHROOM_STEM = createBlock(BYGBlockProperties.BlockHugeNetherMushroomStem::new, "soul_shroom_stem");
    public static final BlockRegistryObject<Block> SOUL_SHROOM_BLOCK = createBlock(BYGBlockProperties.BlockHugeNetherMushroom::new, "soul_shroom_block");
    public static final BlockRegistryObject<Block> DEATH_CAP_MUSHROOM_BLOCK = createBlock(BYGBlockProperties.BlockHugeNetherMushroom::new, "death_cap_mushroom_block");
    public static final BlockRegistryObject<Block> BULBIS_SHELL = createBlock(BYGBlockProperties.BulbisShell::new, "bulbis_shell");
    public static final BlockRegistryObject<Block> PURPLE_BULBIS_SHELL = createBlock(BYGBlockProperties.BulbisShell::new, "purple_bulbis_shell");

    public static final BlockRegistryObject<Block> CATTAIL_SPROUT = createCattailSproutBlock("cattail_sprout");
    public static final BlockRegistryObject<Block> CATTAIL = createCattailPlantBlock("cattail");
    public static final BlockRegistryObject<Block> CATTAIL_THATCH = createBlock(BYGBlockProperties.BYGThatch::new, "cattail_thatch");
    public static final BlockRegistryObject<Block> CATTAIL_THATCH_CARPET = createBlock(BYGBlockProperties.ThatchCarpet::new, "cattail_thatch_carpet");
    public static final BlockRegistryObject<Block> CATTAIL_THATCH_STAIRS = createBlock(BYGBlockProperties.ThatchStairs::new, "cattail_thatch_stairs");
    public static final BlockRegistryObject<Block> CATTAIL_THATCH_SLAB = createBlock(BYGBlockProperties.ThatchSlab::new, "cattail_thatch_slab");
    public static final BlockRegistryObject<Block> HORSEWEED = createFlower("horseweed", BYGBlockTags.GROUND_HORSEWEED);
    public static final BlockRegistryObject<Block> ALOE_VERA = createAloeVeraPlantBlock("aloe_vera");
    public static final BlockRegistryObject<Block> BLOOMING_ALOE_VERA = createBloomingAloeVeraPlantBlock("blooming_aloe_vera");
    public static final BlockRegistryObject<Block> MINI_CACTUS = createDesertPlant("mini_cactus", BYGBlockTags.GROUND_MINI_CACTUS);
    public static final BlockRegistryObject<Block> PRICKLY_PEAR_CACTUS = createDesertPlant("prickly_pear_cactus", BYGBlockTags.GROUND_PRICKLY_PEAR_CACTUS);
    public static final BlockRegistryObject<Block> WINTER_SUCCULENT = createFlower("winter_succulent", BYGBlockTags.GROUND_WINTER_SUCCULENT);
    public static final BlockRegistryObject<BYGDoublePlantBlock> TALL_PRAIRIE_GRASS = createBlock(() -> new BYGDoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS), BYGBlockTags.GROUND_TALL_PRAIRIE_GRASS), "tall_prairie_grass");
    public static final BlockRegistryObject<Block> POISON_IVY = createBlock(BYGBlockProperties.BYGPoisonIvy::new, "poison_ivy");
    public static final BlockRegistryObject<Block> BLUEBERRY_BUSH = createBlueBerryBush("blueberry_bush");
    public static final BlockRegistryObject<Block> TINY_LILYPADS = createWaterLilyBlock(MapColor.TERRACOTTA_GREEN, "tiny_lilypads");
    public static final BlockRegistryObject<Block> FLOWERING_TINY_LILY_PADS = createWaterLilyBlock(MapColor.COLOR_PINK, "flowering_tiny_lily_pads");
    public static final BlockRegistryObject<Block> WATER_SILK = createWaterSilkBlock(MapColor.TERRACOTTA_LIGHT_GREEN, "water_silk");
    public static final BlockRegistryObject<Block> BEACH_GRASS = createBlock(() -> new BYGBonemealActionBlock(BlockBehaviour.Properties.copy(Blocks.GRASS), BYGBlockTags.GROUND_BEACH_GRASS, BYGBonemealActionBlock.BonemealAction.growDoublePlant(() -> BYGBlocks.TALL_BEACH_GRASS.get())), "beach_grass");
    public static final BlockRegistryObject<BYGDoublePlantBlock> TALL_BEACH_GRASS = createBlock(() -> new BYGDoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS), BYGBlockTags.GROUND_TALL_BEACH_GRASS), "tall_beach_grass");
    public static final BlockRegistryObject<Block> LEAF_PILE = createBlock(() -> new FlatVegetationBlock(BlockBehaviour.Properties.of().noCollission().instabreak().sound(SoundType.GRASS)), "leaf_pile");
    public static final BlockRegistryObject<Block> CLOVER_PATCH = createBlock(() -> new FlatVegetationBlock(BlockBehaviour.Properties.of().noCollission().instabreak().sound(SoundType.GRASS), BYGBlockTags.GROUND_CLOVER_PATCH), "clover_patch");
    public static final BlockRegistryObject<Block> FLOWER_PATCH = createBlock(() -> new FlatVegetationBlock(BlockBehaviour.Properties.of().noCollission().instabreak().sound(SoundType.GRASS), BYGBlockTags.GROUND_FLOWER_PATCH), "flower_patch");
    public static final BlockRegistryObject<Block> ANTHRACITE_BLOCK = createBlock(BYGBlockProperties.AnthraciteOre::new, "anthracite_block");
    public static final BlockRegistryObject<Block> ANTHRACITE_ORE = createBlock(BYGBlockProperties.AnthraciteOre::new, "anthracite_ore");
    public static final BlockRegistryObject<Block> BRIMSTONE = createNetherStone(MapColor.TERRACOTTA_YELLOW, "brimstone");
    public static final BlockRegistryObject<Block> BORIC_CAMPFIRE = createCampfireBlock(3, "boric_campfire");
    public static final BlockRegistryObject<Block> BORIC_LANTERN = createLanternBlock(MapColor.COLOR_GREEN, "boric_lantern");

    public static final BlockRegistryObject<Block> BRIMSTONE_NETHER_QUARTZ_ORE = createNetherOre(SoundType.NETHER_ORE, MapColor.TERRACOTTA_YELLOW, "brimstone_nether_quartz_ore", UniformInt.of(2, 5));
    public static final BlockRegistryObject<Block> BRIMSTONE_NETHER_GOLD_ORE = createNetherOre(SoundType.NETHER_GOLD_ORE, MapColor.TERRACOTTA_YELLOW, "brimstone_nether_gold_ore", UniformInt.of(0, 1));

    public static final BlockRegistryObject<Block> WAILING_VINES = createWailingVine("wailing_vine");
    public static final BlockRegistryObject<Block> MAGMATIC_STONE = createBlock(BYGBlockProperties.BYGNetherrack::new, "magmatic_stone");

    public static final BlockRegistryObject<Block> WARPED_CORAL_BLOCK = createBlock(BYGBlockProperties.BYGWarpedCoralBlock::new, "warped_coral_block");
    public static final BlockRegistryObject<Block> WARPED_SOUL_SAND = createBlock(BYGBlockProperties.BYGNyliumSoulSand::new, "warped_soul_sand");
    public static final BlockRegistryObject<Block> WARPED_SOUL_SOIL = createBlock(BYGBlockProperties.BYGNyliumSoulSoil::new, "warped_soul_soil");

    public static final BlockRegistryObject<Block> SYTHIAN_SCAFFOLDING = createScaffoldingBlock(15, MapColor.COLOR_YELLOW, "sythian_scaffolding");

    public static final BlockRegistryObject<Block> ENDER_LILY = createBlock(BYGBlockProperties.BYGEnderLily::new, "ender_lily");

    public static final BlockRegistryObject<Block> PURPUR_STONE = createBlock(BYGBlockProperties.BYGStone::new, "purpur_stone");
    public static final BlockRegistryObject<Block> PURPUR_STONE_SLAB = createStoneSlab("purpur_stone_slab");
    public static final BlockRegistryObject<Block> PURPUR_STONE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "purpur_stone_stairs");
    public static final BlockRegistryObject<Block> PURPUR_STONE_WALL = createStoneWall("purpur_stone_wall");
    public static final BlockRegistryObject<Block> ODDITY_BUSH = createOddityDesertPlant("oddity_bush");
    public static final BlockRegistryObject<Block> END_SAND = createSand(MapColor.SAND, 16053687, "end_sand");

    public static final BlockRegistryObject<Block> THERIUM_CRYSTAL_BLOCK = createCrystalBlock(MapColor.COLOR_YELLOW, "therium_crystal_block");
    public static final BlockRegistryObject<Block> THERIUM_CRYSTAL_CLUSTER = createCrystalClusterBlock(5, 7, 3, MapColor.COLOR_YELLOW, "therium_crystal_cluster");
    public static final BlockRegistryObject<Block> LARGE_THERIUM_CRYSTAL_BUD = createCrystalClusterBlock(4, 5, 3, MapColor.COLOR_YELLOW, "large_therium_crystal_bud");
    public static final BlockRegistryObject<Block> MEDIUM_THERIUM_CRYSTAL_BUD = createCrystalClusterBlock(2, 4, 3, MapColor.COLOR_YELLOW, "medium_therium_crystal_bud");
    public static final BlockRegistryObject<Block> SMALL_THERIUM_CRYSTAL_BUD = createCrystalClusterBlock(1, 3, 4, MapColor.COLOR_YELLOW, "small_therium_crystal_bud");

    public static final BlockRegistryObject<Block> THERIUM_LANTERN = createLanternBlock(MapColor.COLOR_CYAN, "therium_lantern");
    public static final BlockRegistryObject<Block> THERIUM_LAMP = createBlock(() -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)), "therium_lamp");
    public static final BlockRegistryObject<Block> CHISELED_THERIUM = createChiseledTherium("chiseled_therium");
    public static final BlockRegistryObject<Block> CHISELED_THERIUM_STAIRS = createChiseledTheriumStairs("chiseled_therium_stairs");
    public static final BlockRegistryObject<Block> CHISELED_THERIUM_SLAB = createChiseledTheriumSlab("chiseled_therium_slab");
    public static final BlockRegistryObject<Block> CHISELED_THERIUM_WALL = createChiseledTheriumWall("chiseled_therium_wall");
    public static final BlockRegistryObject<Block> SHINY_CHISELED_THERIUM = createShinyChiseledTherium("shiny_chiseled_therium");
    public static final BlockRegistryObject<Block> SHINY_CHISELED_THERIUM_STAIRS = createShinyChiseledTheriumStairs("shiny_chiseled_therium_stairs");
    public static final BlockRegistryObject<Block> SHINY_CHISELED_THERIUM_SLAB = createShinyChiseledTheriumSlab("shiny_chiseled_therium_slab");
    public static final BlockRegistryObject<Block> SHINY_CHISELED_THERIUM_WALL = createShinyChiseledTheriumWall("shiny_chiseled_therium_wall");
    public static final BlockRegistryObject<Block> THERIUM_GLASS = createTheriumGlass("therium_glass");
    public static final BlockRegistryObject<Block> THERIUM_GLASS_PANE = createTheriumGlassPane("therium_glass_pane");

    public static final BlockRegistryObject<Block> CRYPTIC_END_ROD = createEndRodBlock(MapColor.COLOR_RED, "cryptic_end_rod");
    public static final BlockRegistryObject<Block> CRYPTIC_CAMPFIRE = createCampfireBlock(4, "cryptic_campfire");
    public static final BlockRegistryObject<Block> CRYPTIC_MAGMA_BLOCK = createBlock(BYGBlockProperties.BYGMagma::new, "cryptic_magma_block");
    public static final BlockRegistryObject<Block> CRYPTIC_STONE = createBlock(BYGBlockProperties.BYGStone::new, "cryptic_stone");
    public static final BlockRegistryObject<Block> CRYPTIC_STONE_SLAB = createStoneSlab("cryptic_stone_slab");
    public static final BlockRegistryObject<Block> CRYPTIC_STONE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "cryptic_stone_stairs");
    public static final BlockRegistryObject<Block> CRYPTIC_STONE_WALL = createStoneWall("cryptic_stone_wall");
    public static final BlockRegistryObject<Block> CRYPTIC_REDSTONE_ORE = createBlock(() -> new RedStoneOreBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHER_GOLD_ORE).strength(0.4F, 0.4F).lightLevel(litBlockEmission(13)).requiresCorrectToolForDrops()), "cryptic_redstone_ore");

    public static final BlockRegistryObject<Block> IMPARIUS_MUSHROOM_BLOCK = createImpariusMushroom("imparius_mushroom_block");
    public static final BlockRegistryObject<Block> FUNGAL_IMPARIUS_BLOCK = createFungalImparius("fungal_imparius_block");
    public static final BlockRegistryObject<Block> CHISELED_FUNGAL_IMPARIUS = createFungalImparius("chiseled_fungal_imparius");
    public static final BlockRegistryObject<Block> CHISELED_FUNGAL_IMPARIUS_SLAB = createChiseledFungalImpariusSlab("chiseled_fungal_imparius_slab");
    public static final BlockRegistryObject<Block> CHISELED_FUNGAL_IMPARIUS_STAIRS = createChiseledFungalImpariusStairs("chiseled_fungal_imparius_stairs");
    public static final BlockRegistryObject<Block> CHISELED_FUNGAL_IMPARIUS_WALL = createChiseledFungalImpariusWall("chiseled_fungal_imparius_wall");
    public static final BlockRegistryObject<Block> FUNGAL_IMPARIUS_FILAMENT_BLOCK = createFungalImpariusFilamentBlock("fungal_imparius_filament_block");

    public static final BlockRegistryObject<Block> PURPLE_SHROOMLIGHT = createShroomlight("purple_shroomlight");

    public static final BlockRegistryObject<Block> PACKED_BLACK_ICE = createBlock(() -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)), "packed_black_ice");
    public static final BlockRegistryObject<Block> BLACK_ICE = createBlock(() -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.ICE)), "black_ice");
    public static final BlockRegistryObject<Block> CRACKED_RED_SAND = createSand(MapColor.COLOR_ORANGE, 11098145, "cracked_red_sand");

    public static final BlockRegistryObject<Block> BLACK_SAND = createSand(MapColor.TERRACOTTA_BLACK, 5197647, "black_sand");
    public static final BlockRegistryObject<Block> BLACK_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "black_sandstone");
    public static final BlockRegistryObject<Block> BLACK_CHISELED_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "black_chiseled_sandstone");
    public static final BlockRegistryObject<Block> BLACK_CUT_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "black_cut_sandstone");
    public static final BlockRegistryObject<Block> BLACK_SMOOTH_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "black_smooth_sandstone");

    public static final BlockRegistryObject<Block> WHITE_SAND = createSand(MapColor.TERRACOTTA_WHITE, 15395562, "white_sand");
    public static final BlockRegistryObject<Block> WHITE_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "white_sandstone");
    public static final BlockRegistryObject<Block> WHITE_CHISELED_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "white_chiseled_sandstone");
    public static final BlockRegistryObject<Block> WHITE_CUT_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "white_cut_sandstone");
    public static final BlockRegistryObject<Block> WHITE_SMOOTH_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "white_smooth_sandstone");

    public static final BlockRegistryObject<Block> BLUE_SAND = createSand(MapColor.TERRACOTTA_WHITE, 13559021, "blue_sand");
    public static final BlockRegistryObject<Block> BLUE_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "blue_sandstone");
    public static final BlockRegistryObject<Block> BLUE_CHISELED_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "blue_chiseled_sandstone");
    public static final BlockRegistryObject<Block> BLUE_CUT_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "blue_cut_sandstone");
    public static final BlockRegistryObject<Block> BLUE_SMOOTH_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "blue_smooth_sandstone");

    public static final BlockRegistryObject<Block> PURPLE_SAND = createSand(MapColor.TERRACOTTA_PURPLE, 12887002, "purple_sand");
    public static final BlockRegistryObject<Block> PURPLE_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "purple_sandstone");
    public static final BlockRegistryObject<Block> PURPLE_CHISELED_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "purple_chiseled_sandstone");
    public static final BlockRegistryObject<Block> PURPLE_CUT_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "purple_cut_sandstone");
    public static final BlockRegistryObject<Block> PURPLE_SMOOTH_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "purple_smooth_sandstone");

    public static final BlockRegistryObject<Block> PINK_SAND = createSand(MapColor.COLOR_PINK, 15585004, "pink_sand");
    public static final BlockRegistryObject<Block> PINK_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "pink_sandstone");
    public static final BlockRegistryObject<Block> PINK_CHISELED_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "pink_chiseled_sandstone");
    public static final BlockRegistryObject<Block> PINK_CUT_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "pink_cut_sandstone");
    public static final BlockRegistryObject<Block> PINK_SMOOTH_SANDSTONE = createBlock(BYGBlockProperties.BYGStone::new, "pink_smooth_sandstone");

    public static final BlockRegistryObject<Block> WINDSWEPT_SAND = createSand(MapColor.TERRACOTTA_PINK, 15585004, "windswept_sand");
    public static final BlockRegistryObject<Block> WINDSWEPT_SANDSTONE = createSandstone(MapColor.TERRACOTTA_PINK, "windswept_sandstone");
    public static final BlockRegistryObject<Block> WINDSWEPT_SANDSTONE_SLAB = createSandstoneSlab(MapColor.TERRACOTTA_PINK, "windswept_sandstone_slab");
    public static final BlockRegistryObject<Block> WINDSWEPT_SANDSTONE_STAIRS = createSandstoneStairs(MapColor.TERRACOTTA_PINK, "windswept_sandstone_stairs");
    public static final BlockRegistryObject<Block> WINDSWEPT_SANDSTONE_WALL = createSandstoneWall(MapColor.TERRACOTTA_PINK, "windswept_sandstone_wall");

    public static final BlockRegistryObject<Block> CHISELED_WINDSWEPT_SANDSTONE = createSandstone(MapColor.TERRACOTTA_PINK, "chiseled_windswept_sandstone");
    public static final BlockRegistryObject<Block> CHISELED_WINDSWEPT_SANDSTONE_SLAB = createSandstoneSlab(MapColor.TERRACOTTA_PINK, "chiseled_windswept_sandstone_slab");
    public static final BlockRegistryObject<Block> CHISELED_WINDSWEPT_SANDSTONE_STAIRS = createSandstoneStairs(MapColor.TERRACOTTA_PINK, "chiseled_windswept_sandstone_stairs");
    public static final BlockRegistryObject<Block> CHISELED_WINDSWEPT_SANDSTONE_WALL = createSandstoneWall(MapColor.TERRACOTTA_PINK, "chiseled_windswept_sandstone_wall");

    public static final BlockRegistryObject<Block> CUT_WINDSWEPT_SANDSTONE = createSandstone(MapColor.TERRACOTTA_PINK, "cut_windswept_sandstone");
    public static final BlockRegistryObject<Block> CUT_WINDSWEPT_SANDSTONE_SLAB = createSandstoneSlab(MapColor.TERRACOTTA_PINK, "cut_windswept_sandstone_slab");
    public static final BlockRegistryObject<Block> CUT_WINDSWEPT_SANDSTONE_STAIRS = createSandstoneStairs(MapColor.TERRACOTTA_PINK, "cut_windswept_sandstone_stairs");
    public static final BlockRegistryObject<Block> CUT_WINDSWEPT_SANDSTONE_WALL = createSandstoneWall(MapColor.TERRACOTTA_PINK, "cut_windswept_sandstone_wall");

    public static final BlockRegistryObject<Block> SMOOTH_WINDSWEPT_SANDSTONE = createSandstone(MapColor.TERRACOTTA_PINK, "smooth_windswept_sandstone");
    public static final BlockRegistryObject<Block> SMOOTH_WINDSWEPT_SANDSTONE_SLAB = createSandstoneSlab(MapColor.TERRACOTTA_PINK, "smooth_windswept_sandstone_slab");
    public static final BlockRegistryObject<Block> SMOOTH_WINDSWEPT_SANDSTONE_STAIRS = createSandstoneStairs(MapColor.TERRACOTTA_PINK, "smooth_windswept_sandstone_stairs");
    public static final BlockRegistryObject<Block> SMOOTH_WINDSWEPT_SANDSTONE_WALL = createSandstoneWall(MapColor.TERRACOTTA_PINK, "smooth_windswept_sandstone_wall");

    public static final BlockRegistryObject<Block> WINDSWEPT_SANDSTONE_PILLAR = createSandstonePillar(MapColor.TERRACOTTA_PINK, "windswept_sandstone_pillar");


    public static final BlockRegistryObject<Block> PALO_VERDE_LOG = createLog("palo_verde_log");
    public static final BlockRegistryObject<Block> FUNGAL_IMPARIUS_STEM = createBlock(BYGBlockProperties.BYGNetherLog::new, "fungal_imparius_stem");
    public static final BlockRegistryObject<Block> PALO_VERDE_WOOD = createWood("palo_verde_wood");
    public static final BlockRegistryObject<Block> FUNGAL_IMPARIUS_HYPHAE = createBlock(BYGBlockProperties.BYGNetherWood::new, "fungal_imparius_hyphae");

    public static final BlockRegistryObject<Block> WHITE_PUFFBALL = createWhitePuffBlock(SoundType.FUNGUS, MapColor.TERRACOTTA_WHITE, "white_puffball");
    public static final BlockRegistryObject<Block> WEEPING_MILKCAP = createMushroom(BYGBlockTags.GROUND_WEEPING_MILK_CAP, "weeping_milkcap");
    public static final BlockRegistryObject<Block> WOOD_BLEWIT = createMushroom(BYGBlockTags.GROUND_WOOD_BLEWIT, "wood_blewit");
    public static final BlockRegistryObject<Block> GREEN_MUSHROOM = createMushroom(BYGBlockTags.GROUND_GREEN_MUSHROOM, "green_mushroom");

    public static final BlockRegistryObject<Block> SOUL_SHROOM = createFungus(BYGBlockTags.GROUND_SOUL_SHROOM, "soul_shroom");
    public static final BlockRegistryObject<Block> DEATH_CAP = createFungus(BYGBlockTags.GROUND_DEATH_CAP, "death_cap");

    public static final BlockRegistryObject<Block> PURPLE_BULBIS_ODDITY = createMushroom(BYGBlockTags.GROUND_PURPLE_BULBIS_ODDITY, "purple_bulbis_oddity");
    public static final BlockRegistryObject<Block> FUNGAL_IMPARIUS = createMushroom(BYGBlockTags.GROUND_FUNGAL_IMPARIUS, "fungal_imparius");



    public static final BlockRegistryObject<Block> RAW_PENDORITE_BLOCK = createRawPendoriteBlock("raw_pendorite_block");
    public static final BlockRegistryObject<Block> AMETRINE_ORE = createAmetrineOre("ametrine_ore");
    public static final BlockRegistryObject<Block> AMETRINE_BLOCK = createAmetrineBlock("ametrine_block");
    public static final BlockRegistryObject<Block> BUDDING_AMETRINE_ORE = createBuddingAmetrineOre("budding_ametrine_ore");
    public static final BlockRegistryObject<Block> AMETRINE_CLUSTER = createAmetrineCluster("ametrine_cluster");
    public static final BlockRegistryObject<Block> DACITE = createDacite("dacite");
    public static final BlockRegistryObject<Block> DACITE_SLAB = createStoneSlab("dacite_slab");
    public static final BlockRegistryObject<Block> DACITE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "dacite_stairs");
    public static final BlockRegistryObject<Block> DACITE_WALL = createStoneWall("dacite_wall");
    public static final BlockRegistryObject<Block> DACITE_BRICKS = createBlock(BYGBlockProperties.BYGStone::new, "dacite_bricks");
    public static final BlockRegistryObject<Block> DACITE_BRICK_SLAB = createStoneSlab("dacite_brick_slab");
    public static final BlockRegistryObject<Block> DACITE_BRICK_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "dacite_brick_stairs");
    public static final BlockRegistryObject<Block> DACITE_BRICK_WALL = createStoneWall("dacite_brick_wall");
    public static final BlockRegistryObject<Block> DACITE_COBBLESTONE = createBlock(BYGBlockProperties.BYGStone::new, "dacite_cobblestone");
    public static final BlockRegistryObject<Block> DACITE_COBBLESTONE_SLAB = createStoneSlab("dacite_cobblestone_slab");
    public static final BlockRegistryObject<Block> DACITE_COBBLESTONE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "dacite_cobblestone_stairs");
    public static final BlockRegistryObject<Block> DACITE_COBBLESTONE_WALL = createStoneWall("dacite_cobblestone_wall");
    public static final BlockRegistryObject<Block> DACITE_PILLAR = createBlock(BYGBlockProperties.BYGPillar::new, "dacite_pillar");
    public static final BlockRegistryObject<Block> DACITE_TILE = createBlock(BYGBlockProperties.BYGStone::new, "dacite_tile");
    public static final BlockRegistryObject<Block> DACITE_TILE_SLAB = createStoneSlab("dacite_tile_slab");
    public static final BlockRegistryObject<Block> DACITE_TILE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "dacite_tile_stairs");
    public static final BlockRegistryObject<Block> DACITE_TILE_WALL = createStoneWall("dacite_tile_wall");

    public static final BlockRegistryObject<Block> RED_ROCK = createRedRock("red_rock");
    public static final BlockRegistryObject<Block> RED_ROCK_SLAB = createStoneSlab("red_rock_slab");
    public static final BlockRegistryObject<Block> RED_ROCK_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "red_rock_stairs");
    public static final BlockRegistryObject<Block> RED_ROCK_WALL = createStoneWall("red_rock_wall");
    public static final BlockRegistryObject<Block> RED_ROCK_BRICKS = createBlock(BYGBlockProperties.BYGStone::new, "red_rock_bricks");
    public static final BlockRegistryObject<Block> RED_ROCK_BRICK_SLAB = createStoneSlab("red_rock_brick_slab");
    public static final BlockRegistryObject<Block> RED_ROCK_BRICK_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "red_rock_brick_stairs");
    public static final BlockRegistryObject<Block> RED_ROCK_BRICK_WALL = createStoneWall("red_rock_brick_wall");
    public static final BlockRegistryObject<Block> CRACKED_RED_ROCK_BRICKS = createBlock(BYGBlockProperties.BYGStone::new, "cracked_red_rock_bricks");
    public static final BlockRegistryObject<Block> CRACKED_RED_ROCK_BRICK_SLAB = createStoneSlab("cracked_red_rock_brick_slab");
    public static final BlockRegistryObject<Block> CRACKED_RED_ROCK_BRICK_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "cracked_red_rock_brick_stairs");
    public static final BlockRegistryObject<Block> CRACKED_RED_ROCK_BRICK_WALL = createStoneWall("cracked_red_rock_brick_wall");
    public static final BlockRegistryObject<Block> CHISELED_RED_ROCK_BRICKS = createBlock(BYGBlockProperties.BYGStone::new, "chiseled_red_rock_bricks");
    public static final BlockRegistryObject<Block> CHISELED_RED_ROCK_BRICK_SLAB = createStoneSlab("chiseled_red_rock_brick_slab");
    public static final BlockRegistryObject<Block> CHISELED_RED_ROCK_BRICK_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "chiseled_red_rock_brick_stairs");
    public static final BlockRegistryObject<Block> CHISELED_RED_ROCK_BRICK_WALL = createStoneWall("chiseled_red_rock_brick_wall");
    public static final BlockRegistryObject<Block> MOSSY_RED_ROCK_BRICKS = createBlock(BYGBlockProperties.BYGStone::new, "mossy_red_rock_bricks");
    public static final BlockRegistryObject<Block> MOSSY_RED_ROCK_BRICK_SLAB = createStoneSlab("mossy_red_rock_brick_slab");
    public static final BlockRegistryObject<Block> MOSSY_RED_ROCK_BRICK_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "mossy_red_rock_brick_stairs");
    public static final BlockRegistryObject<Block> MOSSY_RED_ROCK_BRICK_WALL = createStoneWall("mossy_red_rock_brick_wall");

    public static final BlockRegistryObject<Block> MOSSY_STONE = createMossyStone("mossy_stone");
    public static final BlockRegistryObject<Block> MOSSY_STONE_SLAB = createStoneSlab("mossy_stone_slab");
    public static final BlockRegistryObject<Block> MOSSY_STONE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "mossy_stone_stairs");
    public static final BlockRegistryObject<Block> MOSSY_STONE_WALL = createStoneWall("mossy_stone_wall");

    public static final BlockRegistryObject<Block> ROCKY_STONE = createRockyStone("rocky_stone");
    public static final BlockRegistryObject<Block> ROCKY_SLAB = createStoneSlab("rocky_stone_slab");
    public static final BlockRegistryObject<Block> ROCKY_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "rocky_stone_stairs");
    public static final BlockRegistryObject<Block> ROCKY_WALL = createStoneWall("rocky_stone_wall");
    public static final BlockRegistryObject<Block> DUSTED_POLISHED_BLACKSTONE_BRICKS = createDustedPolishedBlackstoneBricks("dusted_polished_blackstone_bricks");

    public static final BlockRegistryObject<Block> SOAPSTONE = createSoapstone("soapstone");
    public static final BlockRegistryObject<Block> SOAPSTONE_SLAB = createStoneSlab("soapstone_slab");
    public static final BlockRegistryObject<Block> SOAPSTONE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "soapstone_stairs");
    public static final BlockRegistryObject<Block> SOAPSTONE_WALL = createStoneWall("soapstone_wall");
    public static final BlockRegistryObject<Block> POLISHED_SOAPSTONE = createBlock(BYGBlockProperties.BYGStone::new, "polished_soapstone");
    public static final BlockRegistryObject<Block> POLISHED_SOAPSTONE_SLAB = createStoneSlab("polished_soapstone_slab");
    public static final BlockRegistryObject<Block> POLISHED_SOAPSTONE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "polished_soapstone_stairs");
    public static final BlockRegistryObject<Block> POLISHED_SOAPSTONE_WALL = createStoneWall("polished_soapstone_wall");
    public static final BlockRegistryObject<Block> SOAPSTONE_BRICKS = createBlock(BYGBlockProperties.BYGStone::new, "soapstone_bricks");
    public static final BlockRegistryObject<Block> SOAPSTONE_BRICK_SLAB = createStoneSlab("soapstone_brick_slab");
    public static final BlockRegistryObject<Block> SOAPSTONE_BRICK_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "soapstone_brick_stairs");
    public static final BlockRegistryObject<Block> SOAPSTONE_BRICK_WALL = createStoneWall("soapstone_brick_wall");
    public static final BlockRegistryObject<Block> SOAPSTONE_PILLAR = createBlock(BYGBlockProperties.BYGPillar::new, "soapstone_pillar");
    public static final BlockRegistryObject<Block> SOAPSTONE_TILE = createBlock(BYGBlockProperties.BYGStone::new, "soapstone_tile");
    public static final BlockRegistryObject<Block> SOAPSTONE_TILE_SLAB = createStoneSlab("soapstone_tile_slab");
    public static final BlockRegistryObject<Block> SOAPSTONE_TILE_STAIRS = createBlock(BYGBlockProperties.BYGStoneStairs::new, "soapstone_tile_stairs");
    public static final BlockRegistryObject<Block> SOAPSTONE_TILE_WALL = createStoneWall("soapstone_tile_wall");

    public static final BlockRegistryObject<Block> STRIPPED_PALO_VERDE_LOG = createStrippedLog("stripped_palo_verde_log");

    public static final BlockRegistryObject<Block> STRIPPED_PALO_VERDE_WOOD = createWood("stripped_palo_verde_wood");

    public static final BlockRegistryObject<Block> TALL_ALLIUM = createTallFlower(MapColor.COLOR_PURPLE, "tall_allium", BYGBlockTags.GROUND_TALL_ALLIUM);
    public static final BlockRegistryObject<Block> TALL_PINK_ALLIUM = createTallFlower(MapColor.COLOR_PINK, "tall_pink_allium", BYGBlockTags.GROUND_TALL_PINK_ALLIUM);
    public static final BlockRegistryObject<Block> ALLIUM_FLOWER_BUSH = createFlower("allium_flower_bush", BYGBlockTags.GROUND_ALLIUM_FLOWER_BUSH, false);
    public static final BlockRegistryObject<Block> AMARANTH = createFlower("amaranth", BYGBlockTags.GROUND_AMARANTH, false);
    public static final BlockRegistryObject<Block> ALPINE_BELLFLOWER = createFlower("alpine_bellflower", BYGBlockTags.GROUND_ALPINE_BELLFLOWER);
    public static final BlockRegistryObject<Block> ANGELICA = createFlower("angelica", BYGBlockTags.GROUND_ANGELICA);
    public static final BlockRegistryObject<Block> BARREL_CACTUS = createBarrelCactus("barrel_cactus");
    public static final BlockRegistryObject<Block> FLOWERING_BARREL_CACTUS = createBarrelCactus("flowering_barrel_cactus");
    public static final BlockRegistryObject<Block> CARVED_BARREL_CACTUS = createCarvedBarrelCactus("carved_barrel_cactus");
    public static final BlockRegistryObject<Block> WATER_BARREL_CACTUS = createWaterBarrelCactus("water_barrel_cactus");
    public static final BlockRegistryObject<Block> HONEY_BARREL_CACTUS = createHoneyBarrelCactus("honey_barrel_cactus");
    public static final BlockRegistryObject<Block> BEGONIA = createFlower("begonia", BYGBlockTags.GROUND_BEGONIA);
    public static final BlockRegistryObject<Block> BISTORT = createFlower("bistort", BYGBlockTags.GROUND_BISTORT);
    public static final BlockRegistryObject<Block> BLUE_ROSE_BUSH = createTallFlower(MapColor.COLOR_BLUE, "blue_rose_bush", BYGBlockTags.GROUND_BLUE_ROSE_BUSH);
    public static final BlockRegistryObject<Block> BLUE_SAGE = createFlower("blue_sage", BYGBlockTags.GROUND_BLUE_SAGE);
    public static final BlockRegistryObject<Block> CALIFORNIA_POPPY = createFlower("california_poppy", BYGBlockTags.GROUND_CALIFORNIA_POPPY);
    public static final BlockRegistryObject<Block> CROCUS = createFlower("crocus", BYGBlockTags.GROUND_CROCUS);
    public static final BlockRegistryObject<Block> BLACK_ROSE = createFlower("black_rose", BYGBlockTags.GROUND_BLACK_ROSE);
    public static final BlockRegistryObject<Block> CYAN_AMARANTH = createFlower("cyan_amaranth", BYGBlockTags.GROUND_CYAN_AMARANTH, false);
    public static final BlockRegistryObject<Block> CYAN_ROSE = createFlower("cyan_rose", BYGBlockTags.GROUND_ALPINE_BELLFLOWER);
    public static final BlockRegistryObject<Block> CYAN_TULIP = createFlower("cyan_tulip", BYGBlockTags.GROUND_ALPINE_BELLFLOWER);
    public static final BlockRegistryObject<Block> DAFFODIL = createFlower("daffodil", BYGBlockTags.GROUND_ALPINE_BELLFLOWER);
    public static final BlockRegistryObject<Block> DELPHINIUM = createTallFlower(MapColor.TERRACOTTA_BLUE, "delphinium", BYGBlockTags.GROUND_DELPHINIUM);
    public static final BlockRegistryObject<Block> FAIRY_SLIPPER = createBlock(() -> new BYGFlowerBlock(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.0f).noCollission().noOcclusion().lightLevel((state) -> 8), BYGBlockTags.GROUND_FAIRY_SLIPPER), "fairy_slipper");
    public static final BlockRegistryObject<Block> FIRECRACKER_FLOWER_BUSH = createShrub("firecracker_flower_bush");
    public static final BlockRegistryObject<Block> FOXGLOVE = createTallFlower(MapColor.COLOR_ORANGE, "foxglove", BYGBlockTags.GROUND_FOXGLOVE);
    public static final BlockRegistryObject<Block> GOLDEN_SPINED_CACTUS = createDesertPlant("golden_spined_cactus", BYGBlockTags.GROUND_GOLDEN_SPINED_CACTUS);
    public static final BlockRegistryObject<Block> GREEN_TULIP = createFlower("green_tulip", BYGBlockTags.GROUND_GREEN_TULIP);
    public static final BlockRegistryObject<Block> GUZMANIA = createFlower("guzmania", BYGBlockTags.GROUND_GUZMANIA);
    public static final BlockRegistryObject<Block> INCAN_LILY = createFlower("incan_lily", BYGBlockTags.GROUND_INCAN_LILY);
    public static final BlockRegistryObject<Block> IRIS = createFlower("iris", BYGBlockTags.GROUND_IRIS);
    public static final BlockRegistryObject<Block> JAPANESE_ORCHID = createTallFlower(MapColor.COLOR_PINK, "japanese_orchid", BYGBlockTags.GROUND_JAPANESE_ORCHID);
    public static final BlockRegistryObject<Block> KOVAN_FLOWER = createFlower("kovan_flower", BYGBlockTags.GROUND_KOVAN_FLOWER);
    public static final BlockRegistryObject<Block> LAZARUS_BELLFLOWER = createFlower("lazarus_bellflower", BYGBlockTags.GROUND_LAZARUS_BELLFLOWER);
    public static final BlockRegistryObject<Block> LOLLIPOP_FLOWER = createFlower("lollipop_flower", BYGBlockTags.GROUND_LOLLIPOP_FLOWER);
    public static final BlockRegistryObject<Block> MAGENTA_AMARANTH = createFlower("magenta_amaranth", BYGBlockTags.GROUND_MAGENTA_AMARANTH, false);
    public static final BlockRegistryObject<Block> MAGENTA_TULIP = createFlower("magenta_tulip", BYGBlockTags.GROUND_MAGENTA_TULIP);
    public static final BlockRegistryObject<Block> ORANGE_AMARANTH = createFlower("orange_amaranth", BYGBlockTags.GROUND_ORANGE_AMARANTH, false);
    public static final BlockRegistryObject<Block> ORANGE_DAISY = createFlower("orange_daisy", BYGBlockTags.GROUND_ORANGE_DAISY);
    public static final BlockRegistryObject<Block> ORSIRIA_ROSE = createFlower("osiria_rose", BYGBlockTags.GROUND_ORSIRIA_ROSE);
    public static final BlockRegistryObject<Block> PEACH_LEATHER_FLOWER = createFlower("peach_leather_flower", BYGBlockTags.GROUND_PEACH_LEATHER_FLOWER);
    public static final BlockRegistryObject<Block> PINK_ALLIUM = createFlower("pink_allium", BYGBlockTags.GROUND_PINK_ALLIUM);
    public static final BlockRegistryObject<Block> PINK_ALLIUM_FLOWER_BUSH = createFlower("pink_allium_flower_bush", BYGBlockTags.GROUND_PINK_ALLIUM_BUSH, false);
    public static final BlockRegistryObject<Block> PINK_ANEMONE = createFlower("pink_anemone", BYGBlockTags.GROUND_PINK_ANEMONE);
    public static final BlockRegistryObject<Block> PINK_DAFFODIL = createFlower("pink_daffodil", BYGBlockTags.GROUND_PINK_DAFFODIL);
    public static final BlockRegistryObject<Block> PRAIRIE_GRASS = createBlock(() -> new BYGBonemealActionBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS), BYGBlockTags.GROUND_PRAIRIE_GRASS, BYGBonemealActionBlock.BonemealAction.growDoublePlant(() -> BYGBlocks.TALL_PRAIRIE_GRASS.get())), "prairie_grass");
    public static final BlockRegistryObject<Block> PROTEA_FLOWER = createFlower("protea_flower", BYGBlockTags.GROUND_PROTEA_FLOWER);
    public static final BlockRegistryObject<Block> PURPLE_AMARANTH = createFlower("purple_amaranth", BYGBlockTags.GROUND_PURPLE_AMARANTH, false);
    public static final BlockRegistryObject<Block> PURPLE_SAGE = createFlower("purple_sage", BYGBlockTags.GROUND_PURPLE_SAGE);
    public static final BlockRegistryObject<Block> PURPLE_TULIP = createFlower("purple_tulip", BYGBlockTags.GROUND_PURPLE_TULIP);
    public static final BlockRegistryObject<Block> RICHEA = createFlower("richea", BYGBlockTags.GROUND_RICHEA);
    public static final BlockRegistryObject<Block> ROSE = createFlower("rose", BYGBlockTags.GROUND_ROSE);
    public static final BlockRegistryObject<Block> SNOWDROPS = createPottedBlock(BYGBlockProperties.BYGSnowyPlant::new, "snowdrops");
    public static final BlockRegistryObject<Block> SILVER_VASE_FLOWER = createFlower("silver_vase_flower", BYGBlockTags.GROUND_SILVER_VASE_FLOWER);
    public static final BlockRegistryObject<Block> VIOLET_LEATHER_FLOWER = createFlower("violet_leather_flower", BYGBlockTags.GROUND_VIOLET_LEATHER_FLOWER);
    public static final BlockRegistryObject<Block> WHITE_ANEMONE = createFlower("white_anemone", BYGBlockTags.GROUND_WHITE_ANEMONE);
    public static final BlockRegistryObject<Block> WHITE_SAGE = createFlower("white_sage", BYGBlockTags.GROUND_WHITE_SAGE);
    public static final BlockRegistryObject<Block> WINTER_CYCLAMEN = createPottedBlock(BYGBlockProperties.BYGSnowyPlant::new, "winter_cyclamen");
    public static final BlockRegistryObject<Block> WINTER_ROSE = createPottedBlock(BYGBlockProperties.BYGSnowyPlant::new, "winter_rose");
    public static final BlockRegistryObject<Block> WINTER_SCILLA = createPottedBlock(BYGBlockProperties.BYGSnowyPlant::new, "winter_scilla");
    public static final BlockRegistryObject<Block> YELLOW_DAFFODIL = createFlower("yellow_daffodil", BYGBlockTags.GROUND_YELLOW_DAFFODIL);
    public static final BlockRegistryObject<Block> YELLOW_TULIP = createFlower("yellow_tulip", BYGBlockTags.GROUND_YELLOW_TULIP);
    public static final BlockRegistryObject<Block> HYDRANGEA_BUSH = createHydrangeaBush("hydrangea_bush", BYGBlockTags.GROUND_HYDRANGEA_BUSH);
    public static final BlockRegistryObject<Block> HYDRANGEA_HEDGE = createHydrangeaHedge("hydrangea_hedge", BYGBlockTags.GROUND_HYDRANGEA_BUSH);
    public static final BlockRegistryObject<Block> PODZOL_DACITE = createBlock(() -> SnowyDirtBlockAccess.byg_create(BlockBehaviour.Properties.copy(BYGBlocks.DACITE.get())), "podzol_dacite");
    public static final BlockRegistryObject<Block> OVERGROWN_DACITE = createStoneSpreadable(DACITE, MapColor.COLOR_GREEN, "overgrown_dacite");
    public static final BlockRegistryObject<Block> OVERGROWN_STONE = createStoneSpreadable(() -> Blocks.STONE, MapColor.COLOR_GREEN, "overgrown_stone");
    public static final BlockRegistryObject<Block> OVERGROWN_CRIMSON_BLACKSTONE = createNetherStoneSpreadable(() -> Blocks.BLACKSTONE, MapColor.COLOR_RED, () -> NetherFeatures.CRIMSON_FOREST_VEGETATION_BONEMEAL, "overgrown_crimson_blackstone");
    public static final BlockRegistryObject<Block> LUSH_GRASS_BLOCK = createDirtSpreadable(LUSH_DIRT, MapColor.COLOR_GREEN, "lush_grass_block");
    public static final BlockRegistryObject<DirtPathBlock> LUSH_GRASS_PATH = createBlock(() -> DirtPathBlockAccess.byg_create(BlockBehaviour.Properties.of().strength(0.65F).sound(SoundType.GRASS).isViewBlocking((state, reader, pos) -> true).isSuffocating((state, reader, pos) -> true)), "lush_grass_path");

 //    public static final BlockRO<Block> BORIC_TORCH = createBlock(new BoricTorchBlock(AbstractBlock.Properties.of().instabreak().lightLevel((state) -> 14), BoricFlameParticle.BoricParticleData.BORIC), "boric_torch");

    private static BlockRegistryObject<Block> createWaterLilyBlock(MapColor MapColor, String id) {
        return createBlock(() -> WaterlilyBlockAccess.byg_create(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).mapColor(MapColor)), id);
    }

    private static BlockRegistryObject<Block> createWaterSilkBlock(MapColor MapColor, String id) {
        return createBlock(() -> new WaterSilkBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).noCollission().mapColor(MapColor)), id);
    }

    private static BlockRegistryObject<Block> createScaffoldingBlock(int light, MapColor MapColor, String id) {
        return createBlock(() -> BYGBlockFactory.INSTANCE.createScaffolding(BlockBehaviour.Properties.copy(Blocks.SCAFFOLDING).lightLevel(state -> light).mapColor(MapColor)), id);
    }

    private static BlockRegistryObject<Block> createChiseledFungalImpariusSlab(String id) {
        return createBlock(() -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_WART_BLOCK).sound(SoundType.HONEY_BLOCK).strength(2.0f)), id);
    }

    private static BlockRegistryObject<Block> createChiseledFungalImpariusStairs(String id) {
        return createBlock(() -> StairBlockAccess.byg_create(Blocks.COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_WART_BLOCK).sound(SoundType.HONEY_BLOCK).strength(2.0f)), id);
    }

    private static BlockRegistryObject<Block> createChiseledFungalImpariusWall(String id) {
        return createBlock(() -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_WART_BLOCK).sound(SoundType.HONEY_BLOCK).strength(2.0f)), id);
    }

    private static BlockRegistryObject<Block> createCrystalClusterBlock(int light, int i, int j, MapColor MapColor, String id) {
        return createBlock(() -> new AmethystClusterBlock(i, j, BlockBehaviour.Properties.of().sound(SoundType.GLASS).mapColor(MapColor).strength(1.5f).requiresCorrectToolForDrops().noOcclusion().lightLevel((state) -> light)), id);
    }

    private static BlockRegistryObject<Block> createCrystalBlock(MapColor MapColor, String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor).sound(SoundType.GLASS).lightLevel((state) -> 8).strength(1.5f, 1.5f).requiresCorrectToolForDrops()), id);
    }

    private static BlockRegistryObject<Block> createWailingVine(String id) {
        return createBlock(() -> new VineBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).sound(SoundType.TWISTING_VINES).instabreak().randomTicks().noCollission()), id);
    }

    private static BlockRegistryObject<Block> createTheriumGlass(String id) {
        return createBlock(() -> new GlassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).sound(SoundType.GLASS).lightLevel((state) -> 12).noOcclusion().isValidSpawn(BYGBlocks::neverAllowSpawn).isRedstoneConductor(BYGBlocks::isntSolid).isSuffocating(BYGBlocks::isntSolid).isViewBlocking(BYGBlocks::isntSolid).strength(0.4f, 8.0f)), id);
    }

    private static BlockRegistryObject<Block> createTheriumGlassPane(String id) {
        return createBlock(() -> IronBarsBlockAccess.byg_create(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).sound(SoundType.GLASS).lightLevel((state) -> 12).noOcclusion().strength(0.4f, 8.0f)), id);
    }

    private static BlockRegistryObject<Block> createChiseledTherium(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 9.0f)), id);
    }

    private static BlockRegistryObject<Block> createChiseledTheriumStairs(String id) {
        return createBlock(() -> StairBlockAccess.byg_create(Blocks.PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PRISMARINE).requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 9.0f)), id);
    }

    private static BlockRegistryObject<Block> createChiseledTheriumSlab(String id) {
        return createBlock(() -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 9.0f)), id);
    }

    private static BlockRegistryObject<Block> createChiseledTheriumWall(String id) {
        return createBlock(() -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 9.0f)), id);
    }

    private static BlockRegistryObject<Block> createShinyChiseledTherium(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).requiresCorrectToolForDrops().sound(SoundType.GLASS).lightLevel((state) -> 12).strength(1.5f, 9.0f)), id);
    }

    private static BlockRegistryObject<Block> createShinyChiseledTheriumStairs(String id) {
        return createBlock(() -> StairBlockAccess.byg_create(Blocks.PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PRISMARINE).requiresCorrectToolForDrops().sound(SoundType.GLASS).lightLevel((state) -> 12).strength(1.5f, 9.0f)), id);
    }

    private static BlockRegistryObject<Block> createShinyChiseledTheriumSlab(String id) {
        return createBlock(() -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).requiresCorrectToolForDrops().sound(SoundType.GLASS).lightLevel((state) -> 12).strength(1.5f, 9.0f)), id);
    }

    private static BlockRegistryObject<Block> createShinyChiseledTheriumWall(String id) {
        return createBlock(() -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).requiresCorrectToolForDrops().sound(SoundType.GLASS).lightLevel((state) -> 12).strength(1.5f, 9.0f)), id);
    }

    public static BlockRegistryObject<Block> createFence(String id) {
        return createBlock(() -> new FenceBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0f, 3.0f)), id);
    }

    public static BlockRegistryObject<Block> createFenceGate(String id, WoodType woodType) {
        return createBlock(() -> new FenceGateBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0f, 3.0f), woodType), id);
    }

    private static BlockRegistryObject<Block> createSand(MapColor color, int dustColor, String id) {
        return createBlock(() -> new SandBlock(dustColor, BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.SAND).strength(0.2f)), id);
    }

    private static BlockRegistryObject<Block> createSandstone(MapColor color, String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)), id);
    }

    private static BlockRegistryObject<Block> createSandstoneSlab(MapColor color, String id) {
        return createBlock(() -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)), id);
    }

    private static BlockRegistryObject<Block> createSandstoneWall(MapColor color, String id) {
        return createBlock(() -> new WallBlock(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)), id);
    }

    private static BlockRegistryObject<Block> createSandstoneStairs(MapColor color, String id) {
        return createBlock(() -> StairBlockAccess.byg_create(BYGBlocks.WINDSWEPT_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)), id);
    }

    private static BlockRegistryObject<Block> createSandstonePillar(MapColor color, String id) {
        return createBlock(() -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)), id);
    }

    public static BlockRegistryObject<Block> createWoodSlab(String id) {
        return createBlock(() -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0f, 3.0f)), id);
    }

    public static BlockRegistryObject<Block> createStoneSlab(String id) {
        return createBlock(() -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2.0f, 6.0f).requiresCorrectToolForDrops()), id);
    }

    public static BlockRegistryObject<Block> createStoneWall(String id) {
        return createBlock(() -> new WallBlock(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2.0f, 6.0f).requiresCorrectToolForDrops()), id);
    }

    public static BlockRegistryObject<Block> createWoodPressurePlate(String id, BlockSetType blockSetType) {
        return createBlock(() -> PressurePlateBlockAccess.byg_create(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().sound(SoundType.WOOD).noCollission().strength(0.5F), blockSetType), id);
    }

    public static BlockRegistryObject<Block> createWoodStairs(String id) {
        return createBlock(() -> StairBlockAccess.byg_create(BuiltInRegistries.BLOCK.get(BYG.createLocation(id.replace("_stairs", "planks"))).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2.0f, 3.0f)), id);
    }

    public static BlockRegistryObject<Block> createTrapDoor(String id, BlockSetType blockSetType) {
        return createBlock(() -> TrapDoorBlockAccess.byg_create(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f).noOcclusion(), blockSetType), id);
    }

    public static BlockRegistryObject<Block> createWoodButton(String id, BlockSetType blockSetType) {
        return createBlock(() -> WoodButtonBlockAccess.byg_create(blockSetType, FeatureFlags.VANILLA), id);
    }

    public static BlockRegistryObject<Block> createBookshelf(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f)), id);
    }

    public static BlockRegistryObject<Block> createDoor(String id, BlockSetType blockSetType) {
        return createBlock(() -> DoorBlockAccess.byg_create(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f).noOcclusion(), blockSetType), id);
    }

    public static BlockRegistryObject<Block> createPlanks(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f)), id);
    }

    public static BlockRegistryObject<Block> createWood(String id) {
        return createBlock(() -> new RotatedPillarBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0f)), id);
    }

    public static BlockRegistryObject<Block> createStrippedLog(String id) {
        return createBlock(() -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(2.0f)), id);
    }

    public static BlockRegistryObject<Block> createLog(String id) {
        return createBlock(() -> new RotatedPillarBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0f)), id);
    }

    private static BlockRegistryObject<Block> createSoapstone(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BLACK).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f)), id);
    }

    private static BlockRegistryObject<Block> createNetherStone(MapColor color, String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(0.4f, 0.4f)), id);
    }

    private static BlockRegistryObject<Block> createDoubleDamagePlantBlock(String id, TagKey<Block> groundTag) {
        return createBlock(() -> new DoubleDamagePlantBlock(BlockBehaviour.Properties.of().sound(SoundType.TWISTING_VINES).strength(0.0f).noCollission().noOcclusion(), groundTag), id);
    }

    private static BlockRegistryObject<Block> createDesertPlant(String id, TagKey<Block> groundTag) {
        return createPottedBlock(() -> new DesertPlant(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.0f).noCollission().noOcclusion(), groundTag), id);
    }

    private static BlockRegistryObject<Block> createDustedPolishedBlackstoneBricks(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f, 6.0f)), id);
    }

    private static BlockRegistryObject<Block> createDacite(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f, 6.0f)), id);
    }

    public static BlockRegistryObject<Block> createEtherStone(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_CYAN).requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f, 6.0f)), id);
    }

    private static BlockRegistryObject<Block> createRockyStone(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f, 6.0f)), id);
    }

    private static BlockRegistryObject<Block> createMossyStone(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f, 6.0f)), id);
    }

    private static BlockRegistryObject<Block> createRedRock(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f, 6.0f)), id);
    }

    private static BlockRegistryObject<Block> createAmetrineOre(String id) {
        return createBlock(() -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f, 6.0f), UniformInt.of(3, 9)), id);
    }

    private static BlockRegistryObject<Block> createBuddingAmetrineOre(String id) {
        return createBlock(() -> new BuddingAmetrineBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).requiresCorrectToolForDrops().sound(SoundType.STONE).randomTicks()), id);
    }

    private static BlockRegistryObject<Block> createAmetrineBlock(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK).isSuffocating(BYGBlocks::isntSolid).isViewBlocking(BYGBlocks::isntSolid).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 6.0f)), id);
    }

    private static BlockRegistryObject<Block> createCampfireBlock(int type, String id) {
        return createBlock(() -> new CampfireBlock(true, type, BlockBehaviour.Properties.of().mapColor(MapColor.PODZOL).strength(2.0F).sound(SoundType.WOOD).noOcclusion().lightLevel(litBlockEmission(14))), id);
    }

    private static BlockRegistryObject<Block> createRawPendoriteBlock(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS).strength(1.5f, 6.0f)), id);
    }

    private static BlockRegistryObject<Block> createNetherOre(SoundType sound, MapColor color, String id, UniformInt xpRange) {
        return createBlock(() -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().sound(sound).strength(3.0f, 3.0f), xpRange), id);
    }

    private static BlockRegistryObject<Block> createBarrelCactus(String id) {
        return createBlock(() -> new AbstractBarrelCactusBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.WOOL).strength(0.4f).noOcclusion()), id);
    }

    private static BlockRegistryObject<Block> createCarvedBarrelCactus(String id) {
        return createBlock(() -> new CarvedBarrelCactusBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.WOOL).strength(0.4f).noOcclusion()), id);
    }

    private static BlockRegistryObject<Block> createWaterBarrelCactus(String id) {
        return createBlock(() -> new WaterBarrelCactusBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.WOOL).strength(0.4f)), id);
    }

    private static BlockRegistryObject<Block> createHoneyBarrelCactus(String id) {
        return createBlock(() -> new HoneyBarrelCactusBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.WOOL).strength(0.4f)), id);
    }

    private static BlockRegistryObject<Block> createLanternBlock(MapColor color, String id) {
        return createBlock(() -> new LanternBlock(BlockBehaviour.Properties.of().mapColor(color).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.LANTERN).strength(3.5f).lightLevel((state) -> 15)), id);
    }

    private static BlockRegistryObject<Block> createEndRodBlock(MapColor color, String id) {
        return createBlock(() -> new CrypticEndRodBlock(BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.CANDLE).instabreak().noOcclusion().lightLevel((state) -> 14)), id);
    }

    private static BlockRegistryObject<Block> createCattailSproutBlock(String id) {
        return createBlock(() -> new CattailSproutBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).sound(SoundType.WET_GRASS).strength(0.0f).randomTicks().noCollission().noOcclusion()), id);
    }

    private static BlockRegistryObject<Block> createCattailPlantBlock(String id) {
        return createBlock(() -> new CattailPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).sound(SoundType.WET_GRASS).strength(0.0f).noCollission().noOcclusion()), id);
    }

    private static BlockRegistryObject<Block> createAloeVeraPlantBlock(String id) {
        return createBlock(() -> new AloeVeraBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).sound(SoundType.WET_GRASS).strength(0.0f).randomTicks().noCollission().noOcclusion()), id);
    }

    private static BlockRegistryObject<Block> createBloomingAloeVeraPlantBlock(String id) {
        return createBlock(() -> new BloomingAloeVeraBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).sound(SoundType.WET_GRASS).strength(0.0f).noCollission().noOcclusion()), id);
    }

    private static BlockRegistryObject<Block> createWhitePuffBlock(SoundType sound, MapColor color, String id) {
        return createPottedBlock(() -> new WhitePuffballBlock(BlockBehaviour.Properties.of().mapColor(color).sound(sound).noOcclusion().noCollission().strength(0.0f).randomTicks()), id);
    }

    public static BlockRegistryObject<Block> createMushroom(TagKey<Block> blockTagKey, String id) {
        return createPottedBlock(() -> new BYGMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM), blockTagKey), id);
    }

    public static BlockRegistryObject<Block> createFungus(TagKey<Block> blockTagKey, String id) {
        return createPottedBlock(() -> new BYGFungusBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FUNGUS), blockTagKey), id);
    }

    private static BlockRegistryObject<Block> createHydrangeaBush(String id, TagKey<Block> groundTag) {
        return createPottedBlock(() -> new HydrangeaBushBlock(BlockBehaviour.Properties.of().sound(SoundType.SWEET_BERRY_BUSH).strength(0.0f).noCollission().noOcclusion(), groundTag), id);
    }

    private static BlockRegistryObject<Block> createHydrangeaHedge(String id, TagKey<Block> groundTag) {
        return createBlock(() -> new HydrangeaHedgeBlock(BlockBehaviour.Properties.of().sound(SoundType.AZALEA).instabreak().noOcclusion(), groundTag), id);
    }

    private static BlockRegistryObject<Block> createFlower(String id, TagKey<Block> groundTag) {
        return createFlower(id, groundTag, true);
    }

    private static BlockRegistryObject<Block> createFlower(String id, TagKey<Block> groundTag, boolean potted) {
        Supplier<Block> block = () -> new BYGFlowerBlock(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.0f).noCollission().noOcclusion(), groundTag);

        if (potted) {
            return createPottedBlock(block, id);
        } else {
            return createBlock(block, id);
        }
    }

    private static BlockRegistryObject<Block> createTallFlower(MapColor color, String id, TagKey<Block> groundTag) {
        return createBlock(() -> new BYGTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.GRASS).strength(0.0f).noCollission().noOcclusion(), groundTag), id);
    }

    private static BlockRegistryObject<Block> createAmetrineCluster(String id) {
        return createBlock(() -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1.5f).randomTicks().requiresCorrectToolForDrops().noCollission().lightLevel((state) -> 6)), id);
    }

    private static BlockRegistryObject<Block> createOddityDesertPlant(String id) {
        return createBlock(() -> new DesertOddityPlantBlock(BlockBehaviour.Properties.of().sound(SoundType.TWISTING_VINES).instabreak().noOcclusion().noCollission()), id);
    }

    private static BlockRegistryObject<Block> createBlueBerryBush(String id) {
        return createBlock(() -> new BlueBerryBush(BlockBehaviour.Properties.of().sound(SoundType.SWEET_BERRY_BUSH).randomTicks().instabreak().noCollission()), id);
    }

    public static BlockRegistryObject<Block> createFruitBlock(String id, BYGBlockFamily fruitType) {
        return createBlock(() -> new FruitBlock(fruitType, BlockBehaviour.Properties.of().sound(SoundType.SWEET_BERRY_BUSH).randomTicks().instabreak().noCollission()), id);
    }

    public static BlockRegistryObject<Block> createNightshadeBerryBush(String id) {
        return createNightshadeBerryBush(id);
    }

    private static BlockRegistryObject<Block> createShrub(String id) {
        return createPottedBlock(() -> new ShrubBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion().noCollission()), id);
    }

    private static BlockRegistryObject<Block> createJacarandaBush(String id) {
        return createPottedBlock(() -> new JacarandaBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion()), id);
    }

    private static BlockRegistryObject<Block> createFloweringJacarandaBush(int taskRange, String id) {
        return createPottedBlock(() -> new FloweringJacarandaBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion(), taskRange), id);
    }

    private static BlockRegistryObject<Block> createIndigoJacarandaBush(String id) {
        return createPottedBlock(() -> new IndigoJacarandaBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion()), id);
    }

    private static BlockRegistryObject<Block> createFloweringIndigoJacarandaBush(int taskRange, String id) {
        return createPottedBlock(() -> new FloweringJacarandaBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion(), taskRange), id);
    }

    public static BlockRegistryObject<Block> createPottedBlock(Supplier<Block> blockForPot, String id) {
        final var b = createBlock(blockForPot, id);
        final BlockRegistryObject<Block> potted = createBlock(() -> BYGBlockFactory.INSTANCE.createPottedBlock(b, BlockBehaviour.Properties.of().instabreak().noOcclusion()), "potted_" + id);
        FLOWER_POT_BLOCKS.put(b.getId(), potted);
        return b;
    }

    private static BlockRegistryObject<Block> createShroomlight(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(1.0F).sound(SoundType.SHROOMLIGHT).lightLevel((state) -> 14)), id);
    }

    private static BlockRegistryObject<Block> createImpariusMushroom(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(0.2F).sound(SoundType.TWISTING_VINES).speedFactor(0.5F).jumpFactor(0.5F)), id);
    }

    private static BlockRegistryObject<Block> createWitchHazelBlossomBlock(MapColor color, String id) {
        return createBlock(() -> new WitchHazelBlossomBlock(BlockBehaviour.Properties.of().mapColor(color).instabreak().sound(SoundType.TWISTING_VINES).noOcclusion().noCollission().lightLevel((state) -> 10)), id);
    }

    private static BlockRegistryObject<Block> createFungalImpariusFilamentBlock(String id) {
        return createBlock(() -> new SlimeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(0.2F).sound(SoundType.HONEY_BLOCK).speedFactor(0.5F).jumpFactor(2.5F).lightLevel((state) -> 15)), id);
    }

    private static BlockRegistryObject<Block> createFungalImparius(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_WART_BLOCK).strength(0.2F).sound(SoundType.HONEY_BLOCK)), id);
    }

    public static BlockRegistryObject<Block> createLeaves(MapColor color, String id) {
        return createLeaves(color, null, id);
    }

    public static BlockRegistryObject<Block> createLeaves(MapColor color, Supplier<ParticleOptions> particleOptions, String id) {
        return createBlock(() -> new BYGLeavesBlock(BlockBehaviour.Properties.of().mapColor(color).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isViewBlocking((state, world, pos) -> false).isSuffocating((state, world, pos) -> false), particleOptions), id);
    }

    public static BlockRegistryObject<Block> createChangingLeaves(MapColor color, Supplier<LeavesBlock> next, float chance, String id) {
        return createChangingLeaves(color, next, chance, null, id);
    }

    public static BlockRegistryObject<Block> createChangingLeaves(MapColor color, Supplier<LeavesBlock> next, float chance, Supplier<ParticleOptions> particleOptions, String id) {
        return createBlock(() -> new ChangingLeavesBlock(BlockBehaviour.Properties.of().mapColor(color).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isViewBlocking((state, world, pos) -> false).isSuffocating((state, world, pos) -> false), next, chance, particleOptions), id);
    }

    public static BlockRegistryObject<Block> createGlowingLeaves(MapColor color, int lightLevel, String id) {
        return createBlock(() -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(color).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isViewBlocking((state, world, pos) -> false).isSuffocating((state, world, pos) -> false).lightLevel((state) -> lightLevel)), id);
    }

    public static BlockRegistryObject<Block> createFruitLeaves(MapColor color, Supplier<BlockState> fruit, String id, float tickSpawnChance) {
        return createFruitLeaves(color, fruit, null, id, tickSpawnChance);
    }

    public static BlockRegistryObject<Block> createFruitLeaves(MapColor color, Supplier<BlockState> fruit, Supplier<ParticleOptions> particleOptions, String id, float tickSpawnChance) {
        return createBlock(() -> new HangingFruitLeavesBlock(BlockBehaviour.Properties.of().mapColor(color).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isViewBlocking((state, world, pos) -> false).isSuffocating((state, world, pos) -> false), fruit, particleOptions, tickSpawnChance), id);
    }

    private static BlockRegistryObject<Block> createFirecrackerLeavesBlock(MapColor color, String id) {
        return createBlock(() -> new FirecrackerLeavesBlock(BlockBehaviour.Properties.of().mapColor(color).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isViewBlocking((state, world, pos) -> false).isSuffocating((state, world, pos) -> false)), id);
    }

    private static BlockRegistryObject<Block> createFloweringPaloVerdeLeaves(MapColor color, String id) {
        return createBlock(() -> new FloweringPaloVerdeLeavesBlock(BlockBehaviour.Properties.of().mapColor(color).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isViewBlocking((state, world, pos) -> false).isSuffocating((state, world, pos) -> false)), id);
    }

    private static BlockRegistryObject<Block> createPetal(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.2f).noOcclusion()), id);
    }

    public static BlockRegistryObject<Block> createDirt(String id) {
        return createBlock(() -> new Block(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(0.2f).randomTicks()), id);
    }

    private static BlockRegistryObject<Block> createLushFarmland(String id) {
        return createBlock(() -> new LushFarmBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).strength(0.2f)), id);
    }

    public static BlockRegistryObject<Block> createDirtSpreadable(Supplier<? extends Block> blockToSpreadToo, MapColor color, String id) {
        return createBlock(() -> new BYGGrassBlock(BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.GRASS).strength(0.4f).randomTicks(), blockToSpreadToo.get()), id);
    }

    public static BlockRegistryObject<Block> createStoneSpreadable(Supplier<? extends Block> blockToSpreadToo, MapColor color, String id) {
        return createBlock(() -> new BYGGrassBlock(BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.STONE).strength(1.5f, 6.0f).randomTicks().requiresCorrectToolForDrops(), blockToSpreadToo.get()), id);
    }

    public static BlockRegistryObject<Block> createEndStoneSpreadable(Supplier<? extends Block> blockToSpreadToo, MapColor color, Supplier<ResourceKey<ConfiguredFeature<?, ?>>> feature, String id) {
        return createBlock(() -> new BYGNylium(BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.STONE).strength(0.4f).randomTicks().requiresCorrectToolForDrops(), feature, blockToSpreadToo.get()), id);
    }

    public static BlockRegistryObject<Block> createEndDirtSpreadable(Supplier<? extends Block> blockToSpreadToo, MapColor color, Supplier<ResourceKey<ConfiguredFeature<?, ?>>> feature, String id) {
        return createBlock(() -> new BYGNylium(BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.NYLIUM).strength(0.4f).randomTicks().requiresCorrectToolForDrops(), feature, blockToSpreadToo.get()), id);
    }

    public static BlockRegistryObject<Block> createNetherSpreadable(Supplier<? extends Block> blockToSpreadToo, MapColor color, Supplier<ResourceKey<ConfiguredFeature<?, ?>>> feature, String id) {
        return createBlock(() -> new BYGNylium(BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.NYLIUM).strength(0.4F).randomTicks().requiresCorrectToolForDrops(), feature, blockToSpreadToo.get()), id);
    }

    public static BlockRegistryObject<Block> createNetherStoneSpreadable(Supplier<? extends Block> blockToSpreadToo, MapColor color, Supplier<ResourceKey<ConfiguredFeature<?, ?>>> feature, String id) {
        return createBlock(() -> new BYGNylium(BlockBehaviour.Properties.of().mapColor(color).sound(SoundType.NYLIUM).strength(0.4f).randomTicks().requiresCorrectToolForDrops(), feature, blockToSpreadToo.get()), id);
    }

    static BlockRegistryObject<Block> createSign(String id, WoodType type, BlockRegistryObject<Block> color) {
        return createSign(id, type, () -> color.get().defaultMapColor());
    }

    private static BlockRegistryObject<Block> createSign(String id, WoodType type, Supplier<? extends MapColor> color) {
        BlockRegistryObject<Block> signBlock = BYGConstants.SIGNS ? createBlock(() -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(color.get()), type), id) : null;
        if (signBlock != null) {
            SIGN_BLOCKS.add(signBlock);
        }
        return signBlock;
    }

    static BlockRegistryObject<Block> createWallSign(String id, WoodType type, BlockRegistryObject<Block> color, BlockRegistryObject<Block> sign) {
        return createWallSign(id, type, () -> color.get().defaultMapColor(), sign);
    }

    private static BlockRegistryObject<Block> createWallSign(String id, WoodType type, Supplier<? extends MapColor> color, BlockRegistryObject<Block> sign) {
        BlockRegistryObject<Block> signBlock = BYGConstants.SIGNS ? createBlock(() -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(color.get()).dropsLike(sign.get()), type), id) : null;
        if (signBlock != null) {
            SIGN_BLOCKS.add(signBlock);
        }
        return signBlock;
    }

    static BlockRegistryObject<Block> createHangingSign(String id, WoodType type, BlockRegistryObject<Block> color) {
        return createHangingSign(id, type, () -> color.get().defaultMapColor());
    }

    private static BlockRegistryObject<Block> createHangingSign(String id, WoodType type, Supplier<? extends MapColor> color) {
        BlockRegistryObject<Block> signBlock = BYGConstants.SIGNS ? createBlock(() -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(color.get()), type), id) : null;
        if (signBlock != null) {
            SIGN_BLOCKS.add(signBlock);
        }
        return signBlock;
    }

    static BlockRegistryObject<Block> createWallHangingSign(String id, WoodType type, BlockRegistryObject<Block> color, BlockRegistryObject<Block> hangingSign) {
        return createWallHangingSign(id, type, () -> color.get().defaultMapColor(), hangingSign);
    }

    private static BlockRegistryObject<Block> createWallHangingSign(String id, WoodType type, Supplier<? extends MapColor> color, BlockRegistryObject<Block> hangingSign) {
        BlockRegistryObject<Block> signBlock = BYGConstants.SIGNS ? createBlock(() -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(color.get()).dropsLike(hangingSign.get()), type), id) : null;
        if (signBlock != null) SIGN_BLOCKS.add(signBlock);

        return signBlock;
    }

    public static <B extends Block> BlockRegistryObject<B> createBlock(Supplier<? extends B> block, String id) {
        final var ro = PROVIDER.<B>register(id, block);
        return BlockRegistryObject.wrap(ro);
    }

    private static Boolean neverAllowSpawn(BlockState state, BlockGetter reader, BlockPos pos, EntityType<?> entity) {
        return false;
    }

    private static boolean isntSolid(BlockState state, BlockGetter reader, BlockPos pos) {
        return false;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int light) {
        return (state) -> {
            return state.getValue(BlockStateProperties.LIT) ? light : 0;
        };
    }

    public static void loadClass() {
    }
}
