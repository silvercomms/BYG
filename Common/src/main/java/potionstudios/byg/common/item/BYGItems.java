package potionstudios.byg.common.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluids;
import potionstudios.byg.BYG;
import potionstudios.byg.BYGConstants;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.block.BYGWoodTypes;
import potionstudios.byg.common.entity.BYGEntities;
import potionstudios.byg.reg.RegistrationProvider;
import potionstudios.byg.reg.RegistryObject;
import potionstudios.byg.util.ModPlatform;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class BYGItems {

    public static final RegistrationProvider<Item> PROVIDER = RegistrationProvider.get(Registries.ITEM, BYG.MOD_ID);

    public static final List<ResourceKey<Item>> REGISTRATION_ORDERED_ITEMS = new ArrayList<>();

    public static final RegistryObject<Item> BYG_LOGO = createItem(() -> new Item(new Properties()), "byg_logo");

    public static final RegistryObject<Item> PEAT = createItem(BYGBlocks.PEAT);
    public static final RegistryObject<Item> LUSH_GRASS_BLOCK = createItem(BYGBlocks.LUSH_GRASS_BLOCK);
    public static final RegistryObject<Item> LUSH_GRASS_PATH = createItem(BYGBlocks.LUSH_GRASS_PATH);
    public static final RegistryObject<Item> LUSH_DIRT = createItem(BYGBlocks.LUSH_DIRT);
    public static final RegistryObject<Item> LUSH_FARMLAND = createItem(BYGBlocks.LUSH_FARMLAND);

    public static final RegistryObject<Item> FORAGERS_TABLE = createItem(BYGBlocks.FORAGERS_TABLE);

    public static final RegistryObject<Item> AMETRINE_GEMS = createItem(() -> new Item(new Properties()), "ametrine_gems");
    public static final RegistryObject<Item> AMETRINE_ORE = createItem(BYGBlocks.AMETRINE_ORE);
    public static final RegistryObject<Item> AMETRINE_CLUSTER = createItem(BYGBlocks.AMETRINE_CLUSTER);
    public static final RegistryObject<Item> BUDDING_AMETRINE_ORE = createItem(BYGBlocks.BUDDING_AMETRINE_ORE);
    public static final RegistryObject<Item> AMETRINE_BLOCK = createItem(BYGBlocks.AMETRINE_BLOCK);

    public static final RegistryObject<Item> DACITE = createItem(BYGBlocks.DACITE);
    public static final RegistryObject<Item> DACITE_STAIRS = createItem(BYGBlocks.DACITE_STAIRS);
    public static final RegistryObject<Item> DACITE_SLAB = createItem(BYGBlocks.DACITE_SLAB);
    public static final RegistryObject<Item> DACITE_WALL = createItem(BYGBlocks.DACITE_WALL);

    public static final RegistryObject<Item> DACITE_BRICKS = createItem(BYGBlocks.DACITE_BRICKS);
    public static final RegistryObject<Item> DACITE_BRICK_STAIRS = createItem(BYGBlocks.DACITE_BRICK_STAIRS);
    public static final RegistryObject<Item> DACITE_BRICK_SLAB = createItem(BYGBlocks.DACITE_BRICK_SLAB);
    public static final RegistryObject<Item> DACITE_BRICK_WALL = createItem(BYGBlocks.DACITE_BRICK_WALL);

    public static final RegistryObject<Item> DACITE_COBBLESTONE = createItem(BYGBlocks.DACITE_COBBLESTONE);
    public static final RegistryObject<Item> DACITE_COBBLESTONE_STAIRS = createItem(BYGBlocks.DACITE_COBBLESTONE_STAIRS);
    public static final RegistryObject<Item> DACITE_COBBLESTONE_SLAB = createItem(BYGBlocks.DACITE_COBBLESTONE_SLAB);
    public static final RegistryObject<Item> DACITE_COBBLESTONE_WALL = createItem(BYGBlocks.DACITE_COBBLESTONE_WALL);

    public static final RegistryObject<Item> DACITE_PILLAR = createItem(BYGBlocks.DACITE_PILLAR);
    public static final RegistryObject<Item> DACITE_TILE = createItem(BYGBlocks.DACITE_TILE);
    public static final RegistryObject<Item> DACITE_TILE_STAIRS = createItem(BYGBlocks.DACITE_TILE_STAIRS);
    public static final RegistryObject<Item> DACITE_TILE_SLAB = createItem(BYGBlocks.DACITE_TILE_SLAB);
    public static final RegistryObject<Item> DACITE_TILE_WALL = createItem(BYGBlocks.DACITE_TILE_WALL);

    public static final RegistryObject<Item> MOSSY_STONE = createItem(BYGBlocks.MOSSY_STONE);
    public static final RegistryObject<Item> MOSSY_STONE_STAIRS = createItem(BYGBlocks.MOSSY_STONE_STAIRS);
    public static final RegistryObject<Item> MOSSY_STONE_SLAB = createItem(BYGBlocks.MOSSY_STONE_SLAB);
    public static final RegistryObject<Item> MOSSY_STONE_WALL = createItem(BYGBlocks.MOSSY_STONE_WALL);

    public static final RegistryObject<Item> PODZOL_DACITE = createItem(BYGBlocks.PODZOL_DACITE);
    public static final RegistryObject<Item> OVERGROWN_DACITE = createItem(BYGBlocks.OVERGROWN_DACITE);
    public static final RegistryObject<Item> OVERGROWN_STONE = createItem(BYGBlocks.OVERGROWN_STONE);

    public static final RegistryObject<Item> RED_ROCK = createItem(BYGBlocks.RED_ROCK);
    public static final RegistryObject<Item> RED_ROCK_STAIRS = createItem(BYGBlocks.RED_ROCK_STAIRS);
    public static final RegistryObject<Item> RED_ROCK_SLAB = createItem(BYGBlocks.RED_ROCK_SLAB);
    public static final RegistryObject<Item> RED_ROCK_WALL = createItem(BYGBlocks.RED_ROCK_WALL);

    public static final RegistryObject<Item> RED_ROCK_BRICKS = createItem(BYGBlocks.RED_ROCK_BRICKS);
    public static final RegistryObject<Item> RED_ROCK_BRICK_STAIRS = createItem(BYGBlocks.RED_ROCK_BRICK_STAIRS);
    public static final RegistryObject<Item> RED_ROCK_BRICK_SLAB = createItem(BYGBlocks.RED_ROCK_BRICK_SLAB);
    public static final RegistryObject<Item> RED_ROCK_BRICK_WALL = createItem(BYGBlocks.RED_ROCK_BRICK_WALL);

    public static final RegistryObject<Item> MOSSY_RED_ROCK_BRICKS = createItem(BYGBlocks.MOSSY_RED_ROCK_BRICKS);
    public static final RegistryObject<Item> MOSSY_RED_ROCK_BRICK_STAIRS = createItem(BYGBlocks.MOSSY_RED_ROCK_BRICK_STAIRS);
    public static final RegistryObject<Item> MOSSY_RED_ROCK_BRICK_SLAB = createItem(BYGBlocks.MOSSY_RED_ROCK_BRICK_SLAB);
    public static final RegistryObject<Item> MOSSY_RED_ROCK_BRICK_WALL = createItem(BYGBlocks.MOSSY_RED_ROCK_BRICK_WALL);

    public static final RegistryObject<Item> CHISELED_RED_ROCK_BRICKS = createItem(BYGBlocks.CHISELED_RED_ROCK_BRICKS);
    public static final RegistryObject<Item> CHISELED_RED_ROCK_BRICK_STAIRS = createItem(BYGBlocks.CHISELED_RED_ROCK_BRICK_STAIRS);
    public static final RegistryObject<Item> CHISELED_RED_ROCK_BRICK_SLAB = createItem(BYGBlocks.CHISELED_RED_ROCK_BRICK_SLAB);
    public static final RegistryObject<Item> CHISELED_RED_ROCK_BRICK_WALL = createItem(BYGBlocks.CHISELED_RED_ROCK_BRICK_WALL);

    public static final RegistryObject<Item> CRACKED_RED_ROCK_BRICKS = createItem(BYGBlocks.CRACKED_RED_ROCK_BRICKS);
    public static final RegistryObject<Item> CRACKED_RED_ROCK_BRICK_STAIRS = createItem(BYGBlocks.CRACKED_RED_ROCK_BRICK_STAIRS);
    public static final RegistryObject<Item> CRACKED_RED_ROCK_BRICK_SLAB = createItem(BYGBlocks.CRACKED_RED_ROCK_BRICK_SLAB);
    public static final RegistryObject<Item> CRACKED_RED_ROCK_BRICK_WALL = createItem(BYGBlocks.CRACKED_RED_ROCK_BRICK_WALL);

    public static final RegistryObject<Item> ROCKY_STONE = createItem(BYGBlocks.ROCKY_STONE);
    public static final RegistryObject<Item> ROCKY_STAIRS = createItem(BYGBlocks.ROCKY_STAIRS);
    public static final RegistryObject<Item> ROCKY_SLAB = createItem(BYGBlocks.ROCKY_SLAB);
    public static final RegistryObject<Item> ROCKY_WALL = createItem(BYGBlocks.ROCKY_WALL);

    public static final RegistryObject<Item> SOAPSTONE = createItem(BYGBlocks.SOAPSTONE);
    public static final RegistryObject<Item> SOAPSTONE_STAIRS = createItem(BYGBlocks.SOAPSTONE_STAIRS);
    public static final RegistryObject<Item> SOAPSTONE_SLAB = createItem(BYGBlocks.SOAPSTONE_SLAB);
    public static final RegistryObject<Item> SOAPSTONE_WALL = createItem(BYGBlocks.SOAPSTONE_WALL);

    public static final RegistryObject<Item> POLISHED_SOAPSTONE = createItem(BYGBlocks.POLISHED_SOAPSTONE);
    public static final RegistryObject<Item> POLISHED_SOAPSTONE_STAIRS = createItem(BYGBlocks.POLISHED_SOAPSTONE_STAIRS);
    public static final RegistryObject<Item> POLISHED_SOAPSTONE_SLAB = createItem(BYGBlocks.POLISHED_SOAPSTONE_SLAB);
    public static final RegistryObject<Item> POLISHED_SOAPSTONE_WALL = createItem(BYGBlocks.POLISHED_SOAPSTONE_WALL);

    public static final RegistryObject<Item> SOAPSTONE_BRICKS = createItem(BYGBlocks.SOAPSTONE_BRICKS);
    public static final RegistryObject<Item> SOAPSTONE_BRICK_STAIRS = createItem(BYGBlocks.SOAPSTONE_BRICK_STAIRS);
    public static final RegistryObject<Item> SOAPSTONE_BRICK_SLAB = createItem(BYGBlocks.SOAPSTONE_BRICK_SLAB);
    public static final RegistryObject<Item> SOAPSTONE_BRICK_WALL = createItem(BYGBlocks.SOAPSTONE_BRICK_WALL);

    public static final RegistryObject<Item> SOAPSTONE_PILLAR = createItem(BYGBlocks.SOAPSTONE_PILLAR);
    public static final RegistryObject<Item> SOAPSTONE_TILE = createItem(BYGBlocks.SOAPSTONE_TILE);
    public static final RegistryObject<Item> SOAPSTONE_TILE_STAIRS = createItem(BYGBlocks.SOAPSTONE_TILE_STAIRS);
    public static final RegistryObject<Item> SOAPSTONE_TILE_SLAB = createItem(BYGBlocks.SOAPSTONE_TILE_SLAB);
    public static final RegistryObject<Item> SOAPSTONE_TILE_WALL = createItem(BYGBlocks.SOAPSTONE_TILE_WALL);

    public static final RegistryObject<Item> BLACK_SAND = createItem(BYGBlocks.BLACK_SAND);
    public static final RegistryObject<Item> BLACK_SANDSTONE = createItem(BYGBlocks.BLACK_SANDSTONE);
    public static final RegistryObject<Item> BLACK_CHISELED_SANDSTONE = createItem(BYGBlocks.BLACK_CHISELED_SANDSTONE);
    public static final RegistryObject<Item> BLACK_CUT_SANDSTONE = createItem(BYGBlocks.BLACK_CUT_SANDSTONE);
    public static final RegistryObject<Item> BLACK_SMOOTH_SANDSTONE = createItem(BYGBlocks.BLACK_SMOOTH_SANDSTONE);

    public static final RegistryObject<Item> WHITE_SAND = createItem(BYGBlocks.WHITE_SAND);
    public static final RegistryObject<Item> WHITE_SANDSTONE = createItem(BYGBlocks.WHITE_SANDSTONE);
    public static final RegistryObject<Item> WHITE_CHISELED_SANDSTONE = createItem(BYGBlocks.WHITE_CHISELED_SANDSTONE);
    public static final RegistryObject<Item> WHITE_CUT_SANDSTONE = createItem(BYGBlocks.WHITE_CUT_SANDSTONE);
    public static final RegistryObject<Item> WHITE_SMOOTH_SANDSTONE = createItem(BYGBlocks.WHITE_SMOOTH_SANDSTONE);

    public static final RegistryObject<Item> BLUE_SAND = createItem(BYGBlocks.BLUE_SAND);
    public static final RegistryObject<Item> BLUE_SANDSTONE = createItem(BYGBlocks.BLUE_SANDSTONE);
    public static final RegistryObject<Item> BLUE_CHISELED_SANDSTONE = createItem(BYGBlocks.BLUE_CHISELED_SANDSTONE);
    public static final RegistryObject<Item> BLUE_CUT_SANDSTONE = createItem(BYGBlocks.BLUE_CUT_SANDSTONE);
    public static final RegistryObject<Item> BLUE_SMOOTH_SANDSTONE = createItem(BYGBlocks.BLUE_SMOOTH_SANDSTONE);

    public static final RegistryObject<Item> PURPLE_SAND = createItem(BYGBlocks.PURPLE_SAND);
    public static final RegistryObject<Item> PURPLE_SANDSTONE = createItem(BYGBlocks.PURPLE_SANDSTONE);
    public static final RegistryObject<Item> PURPLE_CHISELED_SANDSTONE = createItem(BYGBlocks.PURPLE_CHISELED_SANDSTONE);
    public static final RegistryObject<Item> PURPLE_CUT_SANDSTONE = createItem(BYGBlocks.PURPLE_CUT_SANDSTONE);
    public static final RegistryObject<Item> PURPLE_SMOOTH_SANDSTONE = createItem(BYGBlocks.PURPLE_SMOOTH_SANDSTONE);

    public static final RegistryObject<Item> PINK_SAND = createItem(BYGBlocks.PINK_SAND);
    public static final RegistryObject<Item> PINK_SANDSTONE = createItem(BYGBlocks.PINK_SANDSTONE);
    public static final RegistryObject<Item> PINK_CHISELED_SANDSTONE = createItem(BYGBlocks.PINK_CHISELED_SANDSTONE);
    public static final RegistryObject<Item> PINK_CUT_SANDSTONE = createItem(BYGBlocks.PINK_CUT_SANDSTONE);
    public static final RegistryObject<Item> PINK_SMOOTH_SANDSTONE = createItem(BYGBlocks.PINK_SMOOTH_SANDSTONE);

    public static final RegistryObject<Item> WINDSWEPT_SAND = createItem(BYGBlocks.WINDSWEPT_SAND);
    public static final RegistryObject<Item> WINDSWEPT_SANDSTONE = createItem(BYGBlocks.WINDSWEPT_SANDSTONE);
    public static final RegistryObject<Item> WINDSWEPT_SANDSTONE_SLAB = createItem(BYGBlocks.WINDSWEPT_SANDSTONE_SLAB);
    public static final RegistryObject<Item> WINDSWEPT_SANDSTONE_STAIRS = createItem(BYGBlocks.WINDSWEPT_SANDSTONE_STAIRS);
    public static final RegistryObject<Item> WINDSWEPT_SANDSTONE_WALL = createItem(BYGBlocks.WINDSWEPT_SANDSTONE_WALL);

    public static final RegistryObject<Item> CHISELED_WINDSWEPT_SANDSTONE = createItem(BYGBlocks.CHISELED_WINDSWEPT_SANDSTONE);
    public static final RegistryObject<Item> CHISELED_WINDSWEPT_SANDSTONE_SLAB = createItem(BYGBlocks.CHISELED_WINDSWEPT_SANDSTONE_SLAB);
    public static final RegistryObject<Item> CHISELED_WINDSWEPT_SANDSTONE_STAIRS = createItem(BYGBlocks.CHISELED_WINDSWEPT_SANDSTONE_STAIRS);
    public static final RegistryObject<Item> CHISELED_WINDSWEPT_SANDSTONE_WALL = createItem(BYGBlocks.CHISELED_WINDSWEPT_SANDSTONE_WALL);

    public static final RegistryObject<Item> CUT_WINDSWEPT_SANDSTONE = createItem(BYGBlocks.CUT_WINDSWEPT_SANDSTONE);
    public static final RegistryObject<Item> CUT_WINDSWEPT_SANDSTONE_SLAB = createItem(BYGBlocks.CUT_WINDSWEPT_SANDSTONE_SLAB);
    public static final RegistryObject<Item> CUT_WINDSWEPT_SANDSTONE_STAIRS = createItem(BYGBlocks.CUT_WINDSWEPT_SANDSTONE_STAIRS);
    public static final RegistryObject<Item> CUT_WINDSWEPT_SANDSTONE_WALL = createItem(BYGBlocks.CUT_WINDSWEPT_SANDSTONE_WALL);

    public static final RegistryObject<Item> SMOOTH_WINDSWEPT_SANDSTONE = createItem(BYGBlocks.SMOOTH_WINDSWEPT_SANDSTONE);
    public static final RegistryObject<Item> SMOOTH_WINDSWEPT_SANDSTONE_SLAB = createItem(BYGBlocks.SMOOTH_WINDSWEPT_SANDSTONE_SLAB);
    public static final RegistryObject<Item> SMOOTH_WINDSWEPT_SANDSTONE_STAIRS = createItem(BYGBlocks.SMOOTH_WINDSWEPT_SANDSTONE_STAIRS);
    public static final RegistryObject<Item> SMOOTH_WINDSWEPT_SANDSTONE_WALL = createItem(BYGBlocks.SMOOTH_WINDSWEPT_SANDSTONE_WALL);

    public static final RegistryObject<Item> WINDSWEPT_SANDSTONE_PILLAR = createItem(BYGBlocks.WINDSWEPT_SANDSTONE_PILLAR);

    public static final RegistryObject<Item> CRACKED_RED_SAND = createItem(BYGBlocks.CRACKED_RED_SAND);

    //Bulbis Woodtype
    public static final RegistryObject<Item> PURPLE_BULBIS_SHELL;
    public static final RegistryObject<Item> BULBIS_SHELL;

    //Imparius Woodtype
    public static final RegistryObject<Item> IMPARIUS_MUSHROOM_BLOCK;
    public static final RegistryObject<Item> FUNGAL_IMPARIUS_FILAMENT_BLOCK;
    public static final RegistryObject<Item> FUNGAL_IMPARIUS_BLOCK;
    public static final RegistryObject<Item> FUNGAL_IMPARIUS_STEM;
    public static final RegistryObject<Item> FUNGAL_IMPARIUS_HYPHAE;

    //Jacaranda Woodtype
    public static final RegistryObject<Item> JACARANDA_BUSH;
    public static final RegistryObject<Item> FLOWERING_JACARANDA_LEAVES;
    public static final RegistryObject<Item> INDIGO_JACARANDA_BUSH;
    public static final RegistryObject<Item> INDIGO_JACARANDA_LEAVES;
    public static final RegistryObject<Item> FLOWERING_INDIGO_JACARANDA_LEAVES;


    //Palo Verde Woodtype
    public static final RegistryObject<Item> FLOWERING_PALO_VERDE_LEAVES;
    public static final RegistryObject<Item> PALO_VERDE_LEAVES;
    public static final RegistryObject<Item> PALO_VERDE_LOG;
    public static final RegistryObject<Item> PALO_VERDE_WOOD;
    public static final RegistryObject<Item> STRIPPED_PALO_VERDE_LOG;
    public static final RegistryObject<Item> STRIPPED_PALO_VERDE_WOOD;

    //Witch-Hazel Woodtype
    public static final RegistryObject<Item> WITCH_HAZEL_BLOSSOM;
    public static final RegistryObject<Item> BLOOMING_WITCH_HAZEL_LEAVES;

    static {
        PURPLE_BULBIS_SHELL = createItem(BYGBlocks.PURPLE_BULBIS_SHELL);
        BULBIS_SHELL = createItem(BYGBlocks.BULBIS_SHELL);
        BYGWoodTypes.BULBIS.init();

        IMPARIUS_MUSHROOM_BLOCK = createItem(BYGBlocks.IMPARIUS_MUSHROOM_BLOCK);
        FUNGAL_IMPARIUS_FILAMENT_BLOCK = createItem(BYGBlocks.FUNGAL_IMPARIUS_FILAMENT_BLOCK);
        FUNGAL_IMPARIUS_BLOCK = createItem(BYGBlocks.FUNGAL_IMPARIUS_BLOCK);
        FUNGAL_IMPARIUS_STEM = createItem(BYGBlocks.FUNGAL_IMPARIUS_STEM);
        FUNGAL_IMPARIUS_HYPHAE = createItem(BYGBlocks.FUNGAL_IMPARIUS_HYPHAE);
        BYGWoodTypes.IMPARIUS.init();

        JACARANDA_BUSH = createItem(BYGBlocks.JACARANDA_BUSH);
        FLOWERING_JACARANDA_LEAVES = createItem(BYGBlocks.FLOWERING_JACARANDA_LEAVES);
        INDIGO_JACARANDA_BUSH = createItem(BYGBlocks.INDIGO_JACARANDA_BUSH);
        INDIGO_JACARANDA_LEAVES = createItem(BYGBlocks.INDIGO_JACARANDA_LEAVES);
        FLOWERING_INDIGO_JACARANDA_LEAVES = createItem(BYGBlocks.FLOWERING_INDIGO_JACARANDA_LEAVES);
        BYGWoodTypes.JACARANDA.init();

        BYGWoodTypes.MAHOGANY.init();

        FLOWERING_PALO_VERDE_LEAVES = createItem(BYGBlocks.FLOWERING_PALO_VERDE_LEAVES);
        PALO_VERDE_LEAVES = createItem(BYGBlocks.PALO_VERDE_LEAVES);
        PALO_VERDE_LOG = createItem(BYGBlocks.PALO_VERDE_LOG);
        PALO_VERDE_WOOD = createItem(BYGBlocks.PALO_VERDE_WOOD);
        STRIPPED_PALO_VERDE_LOG = createItem(BYGBlocks.STRIPPED_PALO_VERDE_LOG);
        STRIPPED_PALO_VERDE_WOOD = createItem(BYGBlocks.STRIPPED_PALO_VERDE_WOOD);

        BYGWoodTypes.WILLOW.init();

        WITCH_HAZEL_BLOSSOM = createItem(BYGBlocks.WITCH_HAZEL_BLOSSOM);
        BLOOMING_WITCH_HAZEL_LEAVES = createItem(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES);
        BYGWoodTypes.WITCH_HAZEL.init();

        BYGWoodTypes.SYTHIAN.init();

    }

    public static final RegistryObject<Item> BLUE_SPRUCE_LEAVES = createItem(BYGBlocks.BLUE_SPRUCE_LEAVES);

    public static final RegistryObject<Item> BROWN_BIRCH_LEAVES = createItem(BYGBlocks.BROWN_BIRCH_LEAVES);

    public static final RegistryObject<Item> BROWN_OAK_LEAVES = createItem(BYGBlocks.BROWN_OAK_LEAVES);
    public static final RegistryObject<Item> ORANGE_BIRCH_LEAVES = createItem(BYGBlocks.ORANGE_BIRCH_LEAVES);

    public static final RegistryObject<Item> ORANGE_OAK_LEAVES = createItem(BYGBlocks.ORANGE_OAK_LEAVES);

    public static final RegistryObject<Item> ORANGE_SPRUCE_LEAVES = createItem(BYGBlocks.ORANGE_SPRUCE_LEAVES);

    public static final RegistryObject<Item> RED_BIRCH_LEAVES = createItem(BYGBlocks.RED_BIRCH_LEAVES);

    public static final RegistryObject<Item> RED_OAK_LEAVES = createItem(BYGBlocks.RED_OAK_LEAVES);

    public static final RegistryObject<Item> RED_SPRUCE_LEAVES = createItem(BYGBlocks.RED_SPRUCE_LEAVES);

    public static final RegistryObject<Item> YELLOW_BIRCH_LEAVES = createItem(BYGBlocks.YELLOW_BIRCH_LEAVES);

    public static final RegistryObject<Item> YELLOW_SPRUCE_LEAVES = createItem(BYGBlocks.YELLOW_SPRUCE_LEAVES);

    public static final RegistryObject<Item> FIRECRACKER_LEAVES = createItem(BYGBlocks.FIRECRACKER_LEAVES);
    public static final RegistryObject<Item> FIRECRACKER_FLOWER_BUSH = createItem(BYGBlocks.FIRECRACKER_FLOWER_BUSH);

    //Nether
    public static final RegistryObject<Item> OVERGROWN_CRIMSON_BLACKSTONE = createItem(BYGBlocks.OVERGROWN_CRIMSON_BLACKSTONE);
    public static final RegistryObject<Item> WARPED_CORAL_BLOCK = createItem(BYGBlocks.WARPED_CORAL_BLOCK);
    public static final RegistryObject<Item> WARPED_SOUL_SAND = createItem(BYGBlocks.WARPED_SOUL_SAND);
    public static final RegistryObject<Item> WARPED_SOUL_SOIL = createItem(BYGBlocks.WARPED_SOUL_SOIL);

    public static final RegistryObject<Item> ANTHRACITE = createItem(() -> new Item(new Properties()), "anthracite");
    public static final RegistryObject<Item> ANTHRACITE_BLOCK = createItem(BYGBlocks.ANTHRACITE_BLOCK);
    public static final RegistryObject<Item> ANTHRACITE_ORE = createItem(BYGBlocks.ANTHRACITE_ORE);
    public static final RegistryObject<Item> BRIMSTONE = createItem(BYGBlocks.BRIMSTONE);
    public static final RegistryObject<Item> BRIM_POWDER = createItem(() -> new Item(new Properties()), "brim_powder");
    public static final RegistryObject<Item> BORIC_CAMPFIRE = createItem(BYGBlocks.BORIC_CAMPFIRE);
    public static final RegistryObject<Item> BORIC_LANTERN = createItem(BYGBlocks.BORIC_LANTERN);
    public static final RegistryObject<Item> MAGMATIC_STONE = createItem(BYGBlocks.MAGMATIC_STONE);

    public static final RegistryObject<Item> BRIMSTONE_NETHER_GOLD_ORE = createItem(BYGBlocks.BRIMSTONE_NETHER_GOLD_ORE);
    public static final RegistryObject<Item> BRIMSTONE_NETHER_QUARTZ_ORE = createItem(BYGBlocks.BRIMSTONE_NETHER_QUARTZ_ORE);

    public static final RegistryObject<Item> WAILING_VINES = createItem(BYGBlocks.WAILING_VINES);
    public static final RegistryObject<Item> DUSTED_POLISHED_BLACKSTONE_BRICKS = createItem(BYGBlocks.DUSTED_POLISHED_BLACKSTONE_BRICKS);

    public static final RegistryObject<Item> SOUL_SHROOM_STEM = createItem(BYGBlocks.SOUL_SHROOM_STEM);
    public static final RegistryObject<Item> SOUL_SHROOM_BLOCK = createItem(BYGBlocks.SOUL_SHROOM_BLOCK);
    public static final RegistryObject<Item> DEATH_CAP_MUSHROOM_BLOCK = createItem(BYGBlocks.DEATH_CAP_MUSHROOM_BLOCK);
    public static final RegistryObject<Item> SYTHIAN_SCAFFOLDING = createScaffoldingBlockItem(BYGBlocks.SYTHIAN_SCAFFOLDING);

    //End
    public static final RegistryObject<Item> ENDER_LILY = createItem(BYGBlocks.ENDER_LILY);

    public static final RegistryObject<Item> CHISELED_FUNGAL_IMPARIUS = createItem(BYGBlocks.CHISELED_FUNGAL_IMPARIUS);
    public static final RegistryObject<Item> CHISELED_FUNGAL_IMPARIUS_SLAB = createItem(BYGBlocks.CHISELED_FUNGAL_IMPARIUS_SLAB);
    public static final RegistryObject<Item> CHISELED_FUNGAL_IMPARIUS_STAIRS = createItem(BYGBlocks.CHISELED_FUNGAL_IMPARIUS_STAIRS);
    public static final RegistryObject<Item> CHISELED_FUNGAL_IMPARIUS_WALL = createItem(BYGBlocks.CHISELED_FUNGAL_IMPARIUS_WALL);

    public static final RegistryObject<Item> PURPUR_STONE = createItem(BYGBlocks.PURPUR_STONE);
    public static final RegistryObject<Item> PURPUR_STONE_SLAB = createItem(BYGBlocks.PURPUR_STONE_SLAB);
    public static final RegistryObject<Item> PURPUR_STONE_STAIRS = createItem(BYGBlocks.PURPUR_STONE_STAIRS);
    public static final RegistryObject<Item> PURPUR_STONE_WALL = createItem(BYGBlocks.PURPUR_STONE_WALL);

    public static final RegistryObject<Item> ODDITY_BUSH = createItem(BYGBlocks.ODDITY_BUSH);
    public static final RegistryObject<Item> END_SAND = createItem(BYGBlocks.END_SAND);

    public static final RegistryObject<Item> THERIUM_CRYSTAL_BLOCK = createItem(BYGBlocks.THERIUM_CRYSTAL_BLOCK);
    public static final RegistryObject<Item> SMALL_THERIUM_CRYSTAL_BUD = createItem(BYGBlocks.SMALL_THERIUM_CRYSTAL_BUD);
    public static final RegistryObject<Item> MEDIUM_THERIUM_CRYSTAL_BUD = createItem(BYGBlocks.MEDIUM_THERIUM_CRYSTAL_BUD);
    public static final RegistryObject<Item> LARGE_THERIUM_CRYSTAL_BUD = createItem(BYGBlocks.LARGE_THERIUM_CRYSTAL_BUD);
    public static final RegistryObject<Item> THERIUM_CRYSTAL_CLUSTER = createItem(BYGBlocks.THERIUM_CRYSTAL_CLUSTER);
    public static final RegistryObject<Item> THERIUM_CRYSTAL_SHARD = createItem(() -> new Item(new Properties()), "therium_crystal_shard");
    public static final RegistryObject<Item> CHISELED_THERIUM = createItem(BYGBlocks.CHISELED_THERIUM);
    public static final RegistryObject<Item> CHISELED_THERIUM_STAIRS = createItem(BYGBlocks.CHISELED_THERIUM_STAIRS);
    public static final RegistryObject<Item> CHISELED_THERIUM_SLAB = createItem(BYGBlocks.CHISELED_THERIUM_SLAB);
    public static final RegistryObject<Item> CHISELED_THERIUM_WALL = createItem(BYGBlocks.CHISELED_THERIUM_WALL);
    public static final RegistryObject<Item> SHINY_CHISELED_THERIUM = createItem(BYGBlocks.SHINY_CHISELED_THERIUM);
    public static final RegistryObject<Item> SHINY_CHISELED_THERIUM_STAIRS = createItem(BYGBlocks.SHINY_CHISELED_THERIUM_STAIRS);
    public static final RegistryObject<Item> SHINY_CHISELED_THERIUM_SLAB = createItem(BYGBlocks.SHINY_CHISELED_THERIUM_SLAB);
    public static final RegistryObject<Item> SHINY_CHISELED_THERIUM_WALL = createItem(BYGBlocks.SHINY_CHISELED_THERIUM_WALL);
    public static final RegistryObject<Item> THERIUM_GLASS = createItem(BYGBlocks.THERIUM_GLASS);
    public static final RegistryObject<Item> THERIUM_GLASS_PANE = createItem(BYGBlocks.THERIUM_GLASS_PANE);
    public static final RegistryObject<Item> THERIUM_LANTERN = createItem(BYGBlocks.THERIUM_LANTERN);
    public static final RegistryObject<Item> THERIUM_LAMP = createItem(BYGBlocks.THERIUM_LAMP);

    public static final RegistryObject<Item> PURPLE_SHROOMLIGHT = createItem(BYGBlocks.PURPLE_SHROOMLIGHT);

    public static final RegistryObject<Item> CRYPTIC_END_ROD = createItem(BYGBlocks.CRYPTIC_END_ROD);
    public static final RegistryObject<Item> CRYPTIC_CAMPFIRE = createItem(BYGBlocks.CRYPTIC_CAMPFIRE);
    public static final RegistryObject<Item> CRYPTIC_MAGMA_BLOCK = createItem(BYGBlocks.CRYPTIC_MAGMA_BLOCK);
    public static final RegistryObject<Item> CRYPTIC_REDSTONE_ORE = createItem(BYGBlocks.CRYPTIC_REDSTONE_ORE);
    public static final RegistryObject<Item> CRYPTIC_STONE = createItem(BYGBlocks.CRYPTIC_STONE);
    public static final RegistryObject<Item> CRYPTIC_STONE_SLAB = createItem(BYGBlocks.CRYPTIC_STONE_SLAB);
    public static final RegistryObject<Item> CRYPTIC_STONE_STAIRS = createItem(BYGBlocks.CRYPTIC_STONE_STAIRS);
    public static final RegistryObject<Item> CRYPTIC_STONE_WALL = createItem(BYGBlocks.CRYPTIC_STONE_WALL);
    public static final RegistryObject<Item> CRYPTIC_BRAMBLE_BRANCH = createItem(() -> new Item(new Properties()), "cryptic_bramble_branch");

    //Ice
    public static final RegistryObject<Item> BLACK_ICE = createItem(BYGBlocks.BLACK_ICE);
    public static final RegistryObject<Item> PACKED_BLACK_ICE = createItem(BYGBlocks.PACKED_BLACK_ICE);

    //Mushrooms
    public static final RegistryObject<Item> GREEN_MUSHROOM_BLOCK = createItem(BYGBlocks.GREEN_MUSHROOM_BLOCK);
    public static final RegistryObject<Item> MILKCAP_MUSHROOM_BLOCK = createItem(BYGBlocks.MILKCAP_MUSHROOM_BLOCK);
    public static final RegistryObject<Item> BLEWIT_MUSHROOM_BLOCK = createItem(BYGBlocks.BLEWIT_MUSHROOM_BLOCK);
    public static final RegistryObject<Item> WHITE_PUFFBALL_SPORES = createItem(() -> new ItemNameBlockItem(BYGBlocks.WHITE_PUFFBALL.get(), new Properties()), "white_puffball_spores");
    public static final RegistryObject<Item> WHITE_PUFFBALL_CAP = createItem(() -> new Item(new Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).build())), "white_puffball_cap");
    public static final RegistryObject<Item> COOKED_WHITE_PUFFBALL_CAP = createItem(() -> new Item(new Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.6f).build())), "cooked_white_puffball_cap");
    public static final RegistryObject<Item> WHITE_PUFFBALL_STEW = createItem(() -> new BowlFoodItem(new Properties().stacksTo(1).food(new FoodProperties.Builder().nutrition(9).saturationMod(1.0f).build())), "white_puffball_stew");

    public static final RegistryObject<Item> WHITE_MUSHROOM_STEM = createItem(BYGBlocks.WHITE_MUSHROOM_STEM);
    public static final RegistryObject<Item> BROWN_MUSHROOM_STEM = createItem(BYGBlocks.BROWN_MUSHROOM_STEM);

    //Plants
    public static final RegistryObject<Item> SHRUB = createItem(BYGBlocks.SHRUB);
    public static final RegistryObject<Item> BLUE_BERRY = createItem(() -> new ItemNameBlockItem(BYGBlocks.BLUEBERRY_BUSH.get(), new Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())), "blueberries");
    public static final RegistryObject<Item> BLUEBERRY_PIE = createItem(() -> new Item(new Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0F).build())), "blueberry_pie");

    public static final RegistryObject<Item> ALOE_VERA_JUICE = createItem(() -> new HoneyBottleItem(new Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).food(new FoodProperties.Builder().nutrition(3).saturationMod(1.0F).build())), "aloe_vera_juice");
    public static final RegistryObject<Item> ALOE_VERA = createItem(BYGBlocks.ALOE_VERA);
    public static final RegistryObject<Item> BARREL_CACTUS = createItem(BYGBlocks.BARREL_CACTUS);
    public static final RegistryObject<Item> FLOWERING_BARREL_CACTUS = createItem(BYGBlocks.FLOWERING_BARREL_CACTUS);
    public static final RegistryObject<Item> CARVED_BARREL_CACTUS = createItem(BYGBlocks.CARVED_BARREL_CACTUS);
    public static final RegistryObject<Item> GOLDEN_SPINED_CACTUS = createItem(BYGBlocks.GOLDEN_SPINED_CACTUS);
    public static final RegistryObject<Item> HORSEWEED = createItem(BYGBlocks.HORSEWEED);
    public static final RegistryObject<Item> MINI_CACTUS = createItem(BYGBlocks.MINI_CACTUS);
    public static final RegistryObject<Item> POISON_IVY = createItem(BYGBlocks.POISON_IVY);
    public static final RegistryObject<Item> PRICKLY_PEAR_CACTUS = createItem(BYGBlocks.PRICKLY_PEAR_CACTUS);
    public static final RegistryObject<Item> TALL_PRAIRIE_GRASS = createItem(BYGBlocks.TALL_PRAIRIE_GRASS);
    public static final RegistryObject<Item> PRAIRIE_GRASS = createItem(BYGBlocks.PRAIRIE_GRASS);
    public static final RegistryObject<Item> CATTAIL_SPROUT = createItem(() -> new CampfireExplodingBlockItem(BYGBlocks.CATTAIL_SPROUT.get(), new Properties()), BYGBlocks.CATTAIL_SPROUT);
    public static final RegistryObject<Item> CATTAIL_THATCH = createItem(BYGBlocks.CATTAIL_THATCH);
    public static final RegistryObject<Item> CATTAIL_THATCH_STAIRS = createItem(BYGBlocks.CATTAIL_THATCH_STAIRS);
    public static final RegistryObject<Item> CATTAIL_THATCH_CARPET = createItem(BYGBlocks.CATTAIL_THATCH_CARPET);
    public static final RegistryObject<Item> CATTAIL_THATCH_SLAB = createItem(BYGBlocks.CATTAIL_THATCH_SLAB);

    public static final RegistryObject<Item> FLOWERING_TINY_LILY_PADS = createItem(() -> new PlaceOnWaterBlockItem(BYGBlocks.FLOWERING_TINY_LILY_PADS.get(), new Properties()), BYGBlocks.FLOWERING_TINY_LILY_PADS);
    public static final RegistryObject<Item> TINY_LILYPADS = createItem(() -> new PlaceOnWaterBlockItem(BYGBlocks.TINY_LILYPADS.get(), new Properties()), BYGBlocks.TINY_LILYPADS);
    public static final RegistryObject<Item> WATER_SILK = createItem(() -> new PlaceOnWaterBlockItem(BYGBlocks.WATER_SILK.get(), new Properties()), BYGBlocks.WATER_SILK);
    public static final RegistryObject<Item> WINTER_SUCCULENT = createItem(BYGBlocks.WINTER_SUCCULENT);

    public static final RegistryObject<Item> BEACH_GRASS = createItem(BYGBlocks.BEACH_GRASS);
    public static final RegistryObject<Item> LEAF_PILE = createItem(BYGBlocks.LEAF_PILE);
    public static final RegistryObject<Item> CLOVER_PATCH = createItem(BYGBlocks.CLOVER_PATCH);
    public static final RegistryObject<Item> FLOWER_PATCH = createItem(BYGBlocks.FLOWER_PATCH);

    //FlowerItems
    public static final RegistryObject<Item> ALLIUM_FLOWER_BUSH = createItem(BYGBlocks.ALLIUM_FLOWER_BUSH);
    public static final RegistryObject<Item> TALL_ALLIUM = createItem(BYGBlocks.TALL_ALLIUM);
    public static final RegistryObject<Item> ALPINE_BELLFLOWER = createItem(BYGBlocks.ALPINE_BELLFLOWER);
    public static final RegistryObject<Item> AMARANTH = createItem(BYGBlocks.AMARANTH);
    public static final RegistryObject<Item> ANGELICA = createItem(BYGBlocks.ANGELICA);
    public static final RegistryObject<Item> HYDRANGEA_BUSH = createItem(BYGBlocks.HYDRANGEA_BUSH);
    public static final RegistryObject<Item> HYDRANGEA_HEDGE = createItem(BYGBlocks.HYDRANGEA_HEDGE);
    public static final RegistryObject<Item> BEGONIA = createItem(BYGBlocks.BEGONIA);
    public static final RegistryObject<Item> BISTORT = createItem(BYGBlocks.BISTORT);
    public static final RegistryObject<Item> BLACK_ROSE = createItem(BYGBlocks.BLACK_ROSE);
    public static final RegistryObject<Item> BLUE_ROSE_BUSH = createItem(BYGBlocks.BLUE_ROSE_BUSH);
    public static final RegistryObject<Item> BLUE_SAGE = createItem(BYGBlocks.BLUE_SAGE);
    public static final RegistryObject<Item> CALIFORNIA_POPPY = createItem(BYGBlocks.CALIFORNIA_POPPY);
    public static final RegistryObject<Item> CROCUS = createItem(BYGBlocks.CROCUS);
    public static final RegistryObject<Item> CYAN_AMARANTH = createItem(BYGBlocks.CYAN_AMARANTH);
    public static final RegistryObject<Item> CYAN_ROSE = createItem(BYGBlocks.CYAN_ROSE);
    public static final RegistryObject<Item> CYAN_TULIP = createItem(BYGBlocks.CYAN_TULIP);
    public static final RegistryObject<Item> DAFFODIL = createItem(BYGBlocks.DAFFODIL);
    public static final RegistryObject<Item> DELPHINIUM = createItem(BYGBlocks.DELPHINIUM);
    public static final RegistryObject<Item> FAIRY_SLIPPER = createItem(BYGBlocks.FAIRY_SLIPPER);
    public static final RegistryObject<Item> FOXGLOVE = createItem(BYGBlocks.FOXGLOVE);
    public static final RegistryObject<Item> GREEN_TULIP = createItem(BYGBlocks.GREEN_TULIP);
    public static final RegistryObject<Item> GUZMANIA = createItem(BYGBlocks.GUZMANIA);
    public static final RegistryObject<Item> INCAN_LILY = createItem(BYGBlocks.INCAN_LILY);
    public static final RegistryObject<Item> IRIS = createItem(BYGBlocks.IRIS);
    public static final RegistryObject<Item> JAPANESE_ORCHID = createItem(BYGBlocks.JAPANESE_ORCHID);
    public static final RegistryObject<Item> KOVAN_FLOWER = createItem(BYGBlocks.KOVAN_FLOWER);
    public static final RegistryObject<Item> LAZARUS_BELLFLOWER = createItem(BYGBlocks.LAZARUS_BELLFLOWER);
    public static final RegistryObject<Item> LOLLIPOP_FLOWER = createItem(BYGBlocks.LOLLIPOP_FLOWER);
    public static final RegistryObject<Item> MAGENTA_AMARANTH = createItem(BYGBlocks.MAGENTA_AMARANTH);
    public static final RegistryObject<Item> MAGENTA_TULIP = createItem(BYGBlocks.MAGENTA_TULIP);
    public static final RegistryObject<Item> ORANGE_AMARANTH = createItem(BYGBlocks.ORANGE_AMARANTH);
    public static final RegistryObject<Item> ORANGE_DAISY = createItem(BYGBlocks.ORANGE_DAISY);
    public static final RegistryObject<Item> ORSIRIA_ROSE = createItem(BYGBlocks.ORSIRIA_ROSE);
    public static final RegistryObject<Item> PEACH_LEATHER_FLOWER = createItem(BYGBlocks.PEACH_LEATHER_FLOWER);
    public static final RegistryObject<Item> PINK_ALLIUM = createItem(BYGBlocks.PINK_ALLIUM);
    public static final RegistryObject<Item> PINK_ALLIUM_FLOWER_BUSH = createItem(BYGBlocks.PINK_ALLIUM_FLOWER_BUSH);
    public static final RegistryObject<Item> TALL_PINK_ALLIUM = createItem(BYGBlocks.TALL_PINK_ALLIUM);
    public static final RegistryObject<Item> PINK_ANEMONE = createItem(BYGBlocks.PINK_ANEMONE);
    public static final RegistryObject<Item> PINK_DAFFODIL = createItem(BYGBlocks.PINK_DAFFODIL);
    public static final RegistryObject<Item> PROTEA_FLOWER = createItem(BYGBlocks.PROTEA_FLOWER);
    public static final RegistryObject<Item> PURPLE_AMARANTH = createItem(BYGBlocks.PURPLE_AMARANTH);
    public static final RegistryObject<Item> PURPLE_SAGE = createItem(BYGBlocks.PURPLE_SAGE);
    public static final RegistryObject<Item> PURPLE_TULIP = createItem(BYGBlocks.PURPLE_TULIP);
    public static final RegistryObject<Item> RICHEA = createItem(BYGBlocks.RICHEA);
    public static final RegistryObject<Item> ROSE = createItem(BYGBlocks.ROSE);
    public static final RegistryObject<Item> SILVER_VASE_FLOWER = createItem(BYGBlocks.SILVER_VASE_FLOWER);
    public static final RegistryObject<Item> SNOWDROPS = createItem(BYGBlocks.SNOWDROPS);
    public static final RegistryObject<Item> VIOLET_LEATHER_FLOWER = createItem(BYGBlocks.VIOLET_LEATHER_FLOWER);
    public static final RegistryObject<Item> WHITE_ANEMONE = createItem(BYGBlocks.WHITE_ANEMONE);
    public static final RegistryObject<Item> WHITE_SAGE = createItem(BYGBlocks.WHITE_SAGE);
    public static final RegistryObject<Item> WINTER_CYCLAMEN = createItem(BYGBlocks.WINTER_CYCLAMEN);
    public static final RegistryObject<Item> WINTER_ROSE = createItem(BYGBlocks.WINTER_ROSE);
    public static final RegistryObject<Item> WINTER_SCILLA = createItem(BYGBlocks.WINTER_SCILLA);
    public static final RegistryObject<Item> YELLOW_DAFFODIL = createItem(BYGBlocks.YELLOW_DAFFODIL);
    public static final RegistryObject<Item> YELLOW_TULIP = createItem(BYGBlocks.YELLOW_TULIP);

    public static RegistryObject<Item> createItem(RegistryObject<? extends Block> block) {
        return block == null ? null : createItem(() -> new BlockItem(block.get(), new Properties()), block);
    }

    public static RegistryObject<Item> createScaffoldingBlockItem(RegistryObject<? extends Block> block) {
        return createItem(() -> new ScaffoldingBlockItem(block.get(), new Properties()), block);
    }

    public static RegistryObject<SignItem> createSign(String id, RegistryObject<? extends Block> signBlock, RegistryObject<? extends Block> wallSignBlock) {
        return BYGConstants.SIGNS ? createItem(() -> new SignItem(new Properties().stacksTo(16), signBlock.get(), wallSignBlock.get()), id) : null;
    }

    public static RegistryObject<HangingSignItem> createHangingSign(String id, RegistryObject<? extends Block> signBlock, RegistryObject<? extends Block> wallSignBlock) {
        return BYGConstants.SIGNS ? createItem(() -> new HangingSignItem(signBlock.get(), wallSignBlock.get(), new Properties().stacksTo(16)), id) : null;
    }

    public static <T extends Item> RegistryObject<T> createItem(Supplier<? extends T> item, RegistryObject<? extends Block> block) {
        return createItem(item, block.getId().getPath());
    }

    public static <T extends Item> potionstudios.byg.reg.RegistryObject<T> createItem(Supplier<? extends T> item, String id) {
        REGISTRATION_ORDERED_ITEMS.add(ResourceKey.create(Registries.ITEM, BYG.createLocation(id)));
        return PROVIDER.register(id, item);
    }

    public static void loadClass() {
    }
}