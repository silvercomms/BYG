package corgiaoc.byg.core;

import corgiaoc.byg.BYG;
import corgiaoc.byg.common.properties.BYGBlockProperties;
import corgiaoc.byg.common.properties.blocks.BYGCraftingTableBlock;
import corgiaoc.byg.common.properties.blocks.BYGMushroomBlock;
import corgiaoc.byg.common.properties.blocks.BYGSapling;
import corgiaoc.byg.common.properties.blocks.BookshelfBlock;
import corgiaoc.byg.common.world.feature.features.overworld.mushrooms.util.BYGMushroomToHugeMushroom;
import corgiaoc.byg.common.world.feature.features.overworld.trees.BYGSaplingToTree;
import corgiaoc.byg.common.world.feature.features.overworld.trees.util.BYGTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.ToolType;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
public class BYGBlocks {

    public static void init() {}

    public static List<Block> flowerPotBlocks = new ArrayList<>();


    public static final Block ASPEN_PLANKS = createPlanks("aspen_planks");
    public static final Block BAOBAB_PLANKS = createPlanks("baobab_planks");
    public static final Block BLUE_ENCHANTED_PLANKS = createPlanks("blue_enchanted_planks");
    public static final Block CHERRY_PLANKS = createPlanks("cherry_planks");
    public static final Block CIKA_PLANKS = createPlanks("cika_planks");
    public static final Block CYPRESS_PLANKS = createPlanks("cypress_planks");
    public static final Block EBONY_PLANKS = createPlanks("ebony_planks");
    public static final Block FIR_PLANKS = createPlanks("fir_planks");
    public static final Block GREEN_ENCHANTED_PLANKS = createPlanks("green_enchanted_planks");
    public static final Block HOLLY_PLANKS = createPlanks("holly_planks");
    public static final Block JACARANDA_PLANKS = createPlanks("jacaranda_planks");
    public static final Block MAHOGANY_PLANKS = createPlanks("mahogany_planks");
    public static final Block MANGROVE_PLANKS = createPlanks("mangrove_planks");
    public static final Block MAPLE_PLANKS = createPlanks("maple_planks");
    public static final Block PINE_PLANKS = createPlanks("pine_planks");
    public static final Block RAINBOW_EUCALYPTUS_PLANKS = createPlanks("rainbow_eucalyptus_planks");
    public static final Block REDWOOD_PLANKS = createPlanks("redwood_planks");
    public static final Block SKYRIS_PLANKS = createPlanks("skyris_planks");
    public static final Block WILLOW_PLANKS = createPlanks("willow_planks");
    public static final Block WITCH_HAZEL_PLANKS = createPlanks("witch_hazel_planks");
    public static final Block ZELKOVA_PLANKS = createPlanks("zelkova_planks");
    public static final Block SYTHIAN_PLANKS = createPlanks("sythian_planks");
    public static final Block EMBUR_PLANKS = createPlanks("embur_planks");
    public static final Block PALM_PLANKS = createPlanks("palm_planks");
    public static final Block LAMENT_PLANKS = createPlanks("lament_planks");

    public static final Block ASPEN_BOOKSHELF = createBookshelf("aspen_bookshelf");
    public static final Block BAOBAB_BOOKSHELF = createBookshelf("baobab_bookshelf");
    public static final Block BLUE_ENCHANTED_BOOKSHELF = createBookshelf("blue_enchanted_bookshelf");
    public static final Block CHERRY_BOOKSHELF = createBookshelf("cherry_bookshelf");
    public static final Block CIKA_BOOKSHELF = createBookshelf("cika_bookshelf");
    public static final Block CYPRESS_BOOKSHELF = createBookshelf("cypress_bookshelf");
    public static final Block EBONY_BOOKSHELF = createBookshelf("ebony_bookshelf");
    public static final Block FIR_BOOKSHELF = createBookshelf("fir_bookshelf");
    public static final Block GREEN_ENCHANTED_BOOKSHELF = createBookshelf("green_enchanted_bookshelf");
    public static final Block HOLLY_BOOKSHELF = createBookshelf("holly_bookshelf");
    public static final Block JACARANDA_BOOKSHELF = createBookshelf("jacaranda_bookshelf");
    public static final Block MAHOGANY_BOOKSHELF = createBookshelf("mahogany_bookshelf");
    public static final Block MANGROVE_BOOKSHELF = createBookshelf("mangrove_bookshelf");
    public static final Block MAPLE_BOOKSHELF = createBookshelf("maple_bookshelf");
    public static final Block PINE_BOOKSHELF = createBookshelf("pine_bookshelf");
    public static final Block RAINBOW_EUCALYPTUS_BOOKSHELF = createBookshelf("rainbow_eucalyptus_bookshelf");
    public static final Block REDWOOD_BOOKSHELF = createBookshelf("redwood_bookshelf");
    public static final Block SKYRIS_BOOKSHELF = createBookshelf("skyris_bookshelf");
    public static final Block WILLOW_BOOKSHELF = createBookshelf("willow_bookshelf");
    public static final Block WITCH_HAZEL_BOOKSHELF = createBookshelf("witch_hazel_bookshelf");
    public static final Block ZELKOVA_BOOKSHELF = createBookshelf("zelkova_bookshelf");
    public static final Block SYTHIAN_BOOKSHELF = createBookshelf("sythian_bookshelf");
    public static final Block EMBUR_BOOKSHELF = createBookshelf("embur_bookshelf");
    public static final Block PALM_BOOKSHELF = createBookshelf("palm_bookshelf");
    public static final Block LAMENT_BOOKSHELF = createBookshelf("lament_bookshelf");

    public static final Block ASPEN_DOOR = createDoor("aspen_door");
    public static final Block BAOBAB_DOOR = createDoor("baobab_door");
    public static final Block BLUE_ENCHANTED_DOOR = createDoor("blue_enchanted_door");
    public static final Block CHERRY_DOOR = createDoor("cherry_door");
    public static final Block CIKA_DOOR = createDoor("cika_door");
    public static final Block CYPRESS_DOOR = createDoor("cypress_door");
    public static final Block EBONY_DOOR = createDoor("ebony_door");
    public static final Block FIR_DOOR = createDoor("fir_door");
    public static final Block GREEN_ENCHANTED_DOOR = createDoor("green_enchanted_door");
    public static final Block HOLLY_DOOR = createDoor("holly_door");
    public static final Block JACARANDA_DOOR = createDoor("jacaranda_door");
    public static final Block MAHOGANY_DOOR = createDoor("mahogany_door");
    public static final Block MANGROVE_DOOR = createDoor("mangrove_door");
    public static final Block MAPLE_DOOR = createDoor("maple_door");
    public static final Block PINE_DOOR = createDoor("pine_door");
    public static final Block RAINBOW_EUCALYPTUS_DOOR = createDoor("rainbow_eucalyptus_door");
    public static final Block REDWOOD_DOOR = createDoor("redwood_door");
    public static final Block SKYRIS_DOOR = createDoor("skyris_door");
    public static final Block WILLOW_DOOR = createDoor("willow_door");
    public static final Block WITCH_HAZEL_DOOR = createDoor("witch_hazel_door");
    public static final Block ZELKOVA_DOOR = createDoor("zelkova_door");
    public static final Block SYTHIAN_DOOR = createDoor("sythian_door");
    public static final Block EMBUR_DOOR = createDoor("embur_door");
    public static final Block PALM_DOOR = createDoor("palm_door");
    public static final Block LAMENT_DOOR = createDoor("lament_door");

    public static final Block ASPEN_PRESSURE_PLATE = createWoodPressurePlate("aspen_pressure_plate");
    public static final Block BAOBAB_PRESSURE_PLATE = createWoodPressurePlate("baobab_pressure_plate");
    public static final Block BLUE_ENCHANTED_PRESSURE_PLATE = createWoodPressurePlate("blue_enchanted_pressure_plate");
    public static final Block CHERRY_PRESSURE_PLATE = createWoodPressurePlate("cherry_pressure_plate");
    public static final Block CIKA_PRESSURE_PLATE = createWoodPressurePlate("cika_pressure_plate");
    public static final Block CYPRESS_PRESSURE_PLATE = createWoodPressurePlate("cypress_pressure_plate");
    public static final Block EBONY_PRESSURE_PLATE = createWoodPressurePlate("ebony_pressure_plate");
    public static final Block FIR_PRESSURE_PLATE = createWoodPressurePlate("fir_pressure_plate");
    public static final Block GREEN_ENCHANTED_PRESSURE_PLATE = createWoodPressurePlate("green_enchanted_pressure_plate");
    public static final Block HOLLY_PRESSURE_PLATE = createWoodPressurePlate("holly_pressure_plate");
    public static final Block JACARANDA_PRESSURE_PLATE = createWoodPressurePlate("jacaranda_pressure_plate");
    public static final Block MAHOGANY_PRESSURE_PLATE = createWoodPressurePlate("mahogany_pressure_plate");
    public static final Block MANGROVE_PRESSURE_PLATE = createWoodPressurePlate("mangrove_pressure_plate");
    public static final Block MAPLE_PRESSURE_PLATE = createWoodPressurePlate("maple_pressure_plate");
    public static final Block PINE_PRESSURE_PLATE = createWoodPressurePlate("pine_pressure_plate");
    public static final Block RAINBOW_EUCALYPTUS_PRESSURE_PLATE = createWoodPressurePlate("rainbow_eucalyptus_pressure_plate");
    public static final Block REDWOOD_PRESSURE_PLATE = createWoodPressurePlate("redwood_pressure_plate");
    public static final Block SKYRIS_PRESSURE_PLATE = createWoodPressurePlate("skyris_pressure_plate");
    public static final Block WILLOW_PRESSURE_PLATE = createWoodPressurePlate("willow_pressure_plate");
    public static final Block WITCH_HAZEL_PRESSURE_PLATE = createWoodPressurePlate("witch_hazel_pressure_plate");
    public static final Block ZELKOVA_PRESSURE_PLATE = createWoodPressurePlate("zelkova_pressure_plate");
    public static final Block SYTHIAN_PRESSURE_PLATE = createWoodPressurePlate("sythian_pressure_plate");
    public static final Block EMBUR_PRESSURE_PLATE = createWoodPressurePlate("embur_pressure_plate");
    public static final Block PALM_PRESSURE_PLATE = createWoodPressurePlate("palm_pressure_plate");
    public static final Block LAMENT_PRESSURE_PLATE = createWoodPressurePlate("lament_pressure_plate");

    public static final Block ASPEN_BUTTON = createWoodButton("aspen_button");
    public static final Block BAOBAB_BUTTON = createWoodButton("baobab_button");
    public static final Block BLUE_ENCHANTED_BUTTON = createWoodButton("blue_enchanted_button");
    public static final Block CHERRY_BUTTON = createWoodButton("cherry_button");
    public static final Block CIKA_BUTTON = createWoodButton("cika_button");
    public static final Block CYPRESS_BUTTON = createWoodButton("cypress_button");
    public static final Block EBONY_BUTTON = createWoodButton("ebony_button");
    public static final Block FIR_BUTTON = createWoodButton("fir_button");
    public static final Block GREEN_ENCHANTED_BUTTON = createWoodButton("green_enchanted_button");
    public static final Block HOLLY_BUTTON = createWoodButton("holly_button");
    public static final Block JACARANDA_BUTTON = createWoodButton("jacaranda_button");
    public static final Block MAHOGANY_BUTTON = createWoodButton("mahogany_button");
    public static final Block MANGROVE_BUTTON = createWoodButton("mangrove_button");
    public static final Block MAPLE_BUTTON = createWoodButton("maple_button");
    public static final Block PINE_BUTTON = createWoodButton("pine_button");
    public static final Block RAINBOW_EUCALYPTUS_BUTTON = createWoodButton("rainbow_eucalyptus_button");
    public static final Block REDWOOD_BUTTON = createWoodButton("redwood_button");
    public static final Block SKYRIS_BUTTON = createWoodButton("skyris_button");
    public static final Block WILLOW_BUTTON = createWoodButton("willow_button");
    public static final Block WITCH_HAZEL_BUTTON = createWoodButton("witch_hazel_button");
    public static final Block ZELKOVA_BUTTON = createWoodButton("zelkova_button");
    public static final Block SYTHIAN_BUTTON = createWoodButton("sythian_button");
    public static final Block EMBUR_BUTTON = createWoodButton("embur_button");
    public static final Block PALM_BUTTON = createWoodButton("palm_button");
    public static final Block LAMENT_BUTTON = createWoodButton("lament_button");

    public static final Block ASPEN_TRAPDOOR = createTrapDoor("aspen_trapdoor");
    public static final Block BAOBAB_TRAPDOOR = createTrapDoor("baobab_trapdoor");
    public static final Block BLUE_ENCHANTED_TRAPDOOR = createTrapDoor("blue_enchanted_trapdoor");
    public static final Block CHERRY_TRAPDOOR = createTrapDoor("cherry_trapdoor");
    public static final Block CIKA_TRAPDOOR = createTrapDoor("cika_trapdoor");
    public static final Block CYPRESS_TRAPDOOR = createTrapDoor("cypress_trapdoor");
    public static final Block EBONY_TRAPDOOR = createTrapDoor("ebony_trapdoor");
    public static final Block FIR_TRAPDOOR = createTrapDoor("fir_trapdoor");
    public static final Block GREEN_ENCHANTED_TRAPDOOR = createTrapDoor("green_enchanted_trapdoor");
    public static final Block HOLLY_TRAPDOOR = createTrapDoor("holly_trapdoor");
    public static final Block JACARANDA_TRAPDOOR = createTrapDoor("jacaranda_trapdoor");
    public static final Block MAHOGANY_TRAPDOOR = createTrapDoor("mahogany_trapdoor");
    public static final Block MANGROVE_TRAPDOOR = createTrapDoor("mangrove_trapdoor");
    public static final Block MAPLE_TRAPDOOR = createTrapDoor("maple_trapdoor");
    public static final Block PINE_TRAPDOOR = createTrapDoor("pine_trapdoor");
    public static final Block RAINBOW_EUCALYPTUS_TRAPDOOR = createTrapDoor("rainbow_eucalyptus_trapdoor");
    public static final Block REDWOOD_TRAPDOOR = createTrapDoor("redwood_trapdoor");
    public static final Block SKYRIS_TRAPDOOR = createTrapDoor("skyris_trapdoor");
    public static final Block WILLOW_TRAPDOOR = createTrapDoor("willow_trapdoor");
    public static final Block WITCH_HAZEL_TRAPDOOR = createTrapDoor("witch_hazel_trapdoor");
    public static final Block ZELKOVA_TRAPDOOR = createTrapDoor("zelkova_trapdoor");
    public static final Block SYTHIAN_TRAPDOOR = createTrapDoor("sythian_trapdoor");
    public static final Block EMBUR_TRAPDOOR = createTrapDoor("embur_trapdoor");
    public static final Block PALM_TRAPDOOR = createTrapDoor("palm_trapdoor");
    public static final Block LAMENT_TRAPDOOR = createTrapDoor("lament_trapdoor");

    public static final Block ASPEN_CRAFTING_TABLE = createCraftingTable("aspen_crafting_table");
    public static final Block BAOBAB_CRAFTING_TABLE = createCraftingTable("baobab_crafting_table");
    public static final Block BLUE_ENCHANTED_CRAFTING_TABLE = createCraftingTable("blue_enchanted_crafting_table");
    public static final Block CHERRY_CRAFTING_TABLE = createCraftingTable("cherry_crafting_table");
    public static final Block CIKA_CRAFTING_TABLE = createCraftingTable("cika_crafting_table");
    public static final Block CYPRESS_CRAFTING_TABLE = createCraftingTable("cypress_crafting_table");
    public static final Block EBONY_CRAFTING_TABLE = createCraftingTable("ebony_crafting_table");
    public static final Block FIR_CRAFTING_TABLE = createCraftingTable("fir_crafting_table");
    public static final Block GREEN_ENCHANTED_CRAFTING_TABLE = createCraftingTable("green_enchanted_crafting_table");
    public static final Block HOLLY_CRAFTING_TABLE = createCraftingTable("holly_crafting_table");
    public static final Block JACARANDA_CRAFTING_TABLE = createCraftingTable("jacaranda_crafting_table");
    public static final Block MAHOGANY_CRAFTING_TABLE = createCraftingTable("mahogany_crafting_table");
    public static final Block MANGROVE_CRAFTING_TABLE = createCraftingTable("mangrove_crafting_table");
    public static final Block MAPLE_CRAFTING_TABLE = createCraftingTable("maple_crafting_table");
    public static final Block PINE_CRAFTING_TABLE = createCraftingTable("pine_crafting_table");
    public static final Block RAINBOW_EUCALYPTUS_CRAFTING_TABLE = createCraftingTable("rainbow_eucalyptus_crafting_table");
    public static final Block REDWOOD_CRAFTING_TABLE = createCraftingTable("redwood_crafting_table");
    public static final Block SKYRIS_CRAFTING_TABLE = createCraftingTable("skyris_crafting_table");
    public static final Block WILLOW_CRAFTING_TABLE = createCraftingTable("willow_crafting_table");
    public static final Block WITCH_HAZEL_CRAFTING_TABLE = createCraftingTable("witch_hazel_crafting_table");
    public static final Block ZELKOVA_CRAFTING_TABLE = createCraftingTable("zelkova_crafting_table");
    public static final Block SYTHIAN_CRAFTING_TABLE = createCraftingTable("sythian_crafting_table");
    public static final Block EMBUR_CRAFTING_TABLE = createCraftingTable("embur_crafting_table");
    public static final Block PALM_CRAFTING_TABLE = createCraftingTable("palm_crafting_table");
    public static final Block LAMENT_CRAFTING_TABLE = createCraftingTable("lament_crafting_table");

    public static final Block ASPEN_FENCE_GATE = createFenceGate("aspen_fence_gate");
    public static final Block BAOBAB_FENCE_GATE = createFenceGate("baobab_fence_gate");
    public static final Block BLUE_ENCHANTED_FENCE_GATE = createFenceGate("blue_enchanted_fence_gate");
    public static final Block CHERRY_FENCE_GATE = createFenceGate("cherry_fence_gate");
    public static final Block CIKA_FENCE_GATE = createFenceGate("cika_fence_gate");
    public static final Block CYPRESS_FENCE_GATE = createFenceGate("cypress_fence_gate");
    public static final Block EBONY_FENCE_GATE = createFenceGate("ebony_fence_gate");
    public static final Block FIR_FENCE_GATE = createFenceGate("fir_fence_gate");
    public static final Block GREEN_ENCHANTED_FENCE_GATE = createFenceGate("green_enchanted_fence_gate");
    public static final Block HOLLY_FENCE_GATE = createFenceGate("holly_fence_gate");
    public static final Block JACARANDA_FENCE_GATE = createFenceGate("jacaranda_fence_gate");
    public static final Block MAHOGANY_FENCE_GATE = createFenceGate("mahogany_fence_gate");
    public static final Block MANGROVE_FENCE_GATE = createFenceGate("mangrove_fence_gate");
    public static final Block MAPLE_FENCE_GATE = createFenceGate("maple_fence_gate");
    public static final Block PINE_FENCE_GATE = createFenceGate("pine_fence_gate");
    public static final Block RAINBOW_EUCALYPTUS_FENCE_GATE = createFenceGate("rainbow_eucalyptus_fence_gate");
    public static final Block REDWOOD_FENCE_GATE = createFenceGate("redwood_fence_gate");
    public static final Block SKYRIS_FENCE_GATE = createFenceGate("skyris_fence_gate");
    public static final Block WILLOW_FENCE_GATE = createFenceGate("willow_fence_gate");
    public static final Block WITCH_HAZEL_FENCE_GATE = createFenceGate("witch_hazel_fence_gate");
    public static final Block ZELKOVA_FENCE_GATE = createFenceGate("zelkova_fence_gate");
    public static final Block SYTHIAN_FENCE_GATE = createFenceGate("sythian_fence_gate");
    public static final Block EMBUR_FENCE_GATE = createFenceGate("embur_fence_gate");
    public static final Block PALM_FENCE_GATE = createFenceGate("palm_fence_gate");
    public static final Block LAMENT_FENCE_GATE = createFenceGate("lament_fence_gate");

    public static final Block ASPEN_SLAB = createWoodSlab("aspen_slab");
    public static final Block BAOBAB_SLAB = createWoodSlab("baobab_slab");
    public static final Block BLUE_ENCHANTED_SLAB = createWoodSlab("blue_enchanted_slab");
    public static final Block CHERRY_SLAB = createWoodSlab("cherry_slab");
    public static final Block CIKA_SLAB = createWoodSlab("cika_slab");
    public static final Block CYPRESS_SLAB = createWoodSlab("cypress_slab");
    public static final Block EBONY_SLAB = createWoodSlab("ebony_slab");
    public static final Block FIR_SLAB = createWoodSlab("fir_slab");
    public static final Block GREEN_ENCHANTED_SLAB = createWoodSlab("green_enchanted_slab");
    public static final Block HOLLY_SLAB = createWoodSlab("holly_slab");
    public static final Block JACARANDA_SLAB = createWoodSlab("jacaranda_slab");
    public static final Block MAHOGANY_SLAB = createWoodSlab("mahogany_slab");
    public static final Block MANGROVE_SLAB = createWoodSlab("mangrove_slab");
    public static final Block MAPLE_SLAB = createWoodSlab("maple_slab");
    public static final Block PINE_SLAB = createWoodSlab("pine_slab");
    public static final Block RAINBOW_EUCALYPTUS_SLAB = createWoodSlab("rainbow_eucalyptus_slab");
    public static final Block REDWOOD_SLAB = createWoodSlab("redwood_slab");
    public static final Block SKYRIS_SLAB = createWoodSlab("skyris_slab");
    public static final Block WILLOW_SLAB = createWoodSlab("willow_slab");
    public static final Block WITCH_HAZEL_SLAB = createWoodSlab("witch_hazel_slab");
    public static final Block ZELKOVA_SLAB = createWoodSlab("zelkova_slab");
    public static final Block SYTHIAN_SLAB = createWoodSlab("sythian_slab");
    public static final Block EMBUR_SLAB = createWoodSlab("embur_slab");
    public static final Block PALM_SLAB = createWoodSlab("palm_slab");
    public static final Block LAMENT_SLAB = createWoodSlab("lament_slab");

    public static final Block ASPEN_STAIRS = createWoodStairs("aspen_stairs");
    public static final Block BAOBAB_STAIRS = createWoodStairs("baobab_stairs");
    public static final Block BLUE_ENCHANTED_STAIRS = createWoodStairs("blue_enchanted_stairs");
    public static final Block CHERRY_STAIRS = createWoodStairs("cherry_stairs");
    public static final Block CIKA_STAIRS = createWoodStairs("cika_stairs");
    public static final Block CYPRESS_STAIRS = createWoodStairs("cypress_stairs");
    public static final Block EBONY_STAIRS = createWoodStairs("ebony_stairs");
    public static final Block FIR_STAIRS = createWoodStairs("fir_stairs");
    public static final Block GREEN_ENCHANTED_STAIRS = createWoodStairs("green_enchanted_stairs");
    public static final Block HOLLY_STAIRS = createWoodStairs("holly_stairs");
    public static final Block JACARANDA_STAIRS = createWoodStairs("jacaranda_stairs");
    public static final Block MAHOGANY_STAIRS = createWoodStairs("mahogany_stairs");
    public static final Block MANGROVE_STAIRS = createWoodStairs("mangrove_stairs");
    public static final Block MAPLE_STAIRS = createWoodStairs("maple_stairs");
    public static final Block PINE_STAIRS = createWoodStairs("pine_stairs");
    public static final Block RAINBOW_EUCALYPTUS_STAIRS = createWoodStairs("rainbow_eucalyptus_stairs");
    public static final Block REDWOOD_STAIRS = createWoodStairs("redwood_stairs");
    public static final Block SKYRIS_STAIRS = createWoodStairs("skyris_stairs");
    public static final Block WILLOW_STAIRS = createWoodStairs("willow_stairs");
    public static final Block WITCH_HAZEL_STAIRS = createWoodStairs("witch_hazel_stairs");
    public static final Block ZELKOVA_STAIRS = createWoodStairs("zelkova_stairs");
    public static final Block SYTHIAN_STAIRS = createWoodStairs("sythian_stairs");
    public static final Block EMBUR_STAIRS = createWoodStairs("embur_stairs");
    public static final Block PALM_STAIRS = createWoodStairs("palm_stairs");
    public static final Block LAMENT_STAIRS = createWoodStairs("lament_stairs");

    public static final Block ASPEN_FENCE = createFence("aspen_fence");
    public static final Block BAOBAB_FENCE = createFence("baobab_fence");
    public static final Block BLUE_ENCHANTED_FENCE = createFence("blue_enchanted_fence");
    public static final Block CHERRY_FENCE = createFence("cherry_fence");
    public static final Block CIKA_FENCE = createFence("cika_fence");
    public static final Block CYPRESS_FENCE = createFence("cypress_fence");
    public static final Block EBONY_FENCE = createFence("ebony_fence");
    public static final Block FIR_FENCE = createFence("fir_fence");
    public static final Block GREEN_ENCHANTED_FENCE = createFence("green_enchanted_fence");
    public static final Block HOLLY_FENCE = createFence("holly_fence");
    public static final Block JACARANDA_FENCE = createFence("jacaranda_fence");
    public static final Block MAHOGANY_FENCE = createFence("mahogany_fence");
    public static final Block MANGROVE_FENCE = createFence("mangrove_fence");
    public static final Block MAPLE_FENCE = createFence("maple_fence");
    public static final Block PINE_FENCE = createFence("pine_fence");
    public static final Block RAINBOW_EUCALYPTUS_FENCE = createFence("rainbow_eucalyptus_fence");
    public static final Block REDWOOD_FENCE = createFence("redwood_fence");
    public static final Block SKYRIS_FENCE = createFence("skyris_fence");
    public static final Block WILLOW_FENCE = createFence("willow_fence");
    public static final Block WITCH_HAZEL_FENCE = createFence("witch_hazel_fence");
    public static final Block ZELKOVA_FENCE = createFence("zelkova_fence");
    public static final Block SYTHIAN_FENCE = createFence("sythian_fence");
    public static final Block EMBUR_FENCE = createFence("embur_fence");
    public static final Block PALM_FENCE = createFence("palm_fence");
    public static final Block LAMENT_FENCE = createFence("lament_fence");

    public static final Block PEAT = new BYGBlockProperties.BYGDirt("peat");
    public static final Block GLOWCELIUM = new BYGBlockProperties.BYGGlowcelium("glowcelium_block");
    public static final Block MEADOW_DIRT = new BYGBlockProperties.BYGDirt("meadow_dirt");
    public static final Block MUD_BLOCK = new BYGBlockProperties.BYGMud("mud_block");
    public static final Block MUD_BRICKS = new BYGBlockProperties.BYGDirt("mud_bricks");

    public static final Block ARAUCARIA_SAPLING = createSapling(new BYGSaplingToTree.AraucariaSaplingToTree(), "araucaria_sapling");
    public static final Block ASPEN_SAPLING = createSapling(new BYGSaplingToTree.AspenSaplingToTree(), "aspen_sapling");
    public static final Block BAOBAB_SAPLING = createSapling(new BYGSaplingToTree.BaobabSaplingToTree(), "baobab_sapling");
    public static final Block BLUE_ENCHANTED_SAPLING = createSapling(new BYGSaplingToTree.BlueEnchantedSaplingToTree(), "blue_enchanted_sapling");
    public static final Block BLUE_SPRUCE_SAPLING = createSapling(new BYGSaplingToTree.BlueSpruceSaplingToTree(), "blue_spruce_sapling");
    public static final Block BROWN_BIRCH_SAPLING = createSapling(new BYGSaplingToTree.BrownBirchSaplingToTree(), "brown_birch_sapling");
    public static final Block BROWN_OAK_SAPLING = createSapling(new BYGSaplingToTree.BrownOakSaplingToTree(), "brown_oak_sapling");
    public static final Block BROWN_ZELKOVA_SAPLING = createSapling(new BYGSaplingToTree.BrownZelkovaSaplingToTree(), "brown_zelkova_sapling");
    public static final Block CIKA_SAPLING = createSapling(new BYGSaplingToTree.CikaSaplingToTree(), "cika_sapling");
    public static final Block CYPRESS_SAPLING = createSapling(new BYGSaplingToTree.CypressSaplingToTree(), "cypress_sapling");
    public static final Block EBONY_SAPLING = createSapling(new BYGSaplingToTree.EbonySaplingToTree(), "ebony_sapling");
    public static final Block FIR_SAPLING = createSapling(new BYGSaplingToTree.FirSaplingToTree(), "fir_sapling");
    public static final Block GREEN_ENCHANTED_SAPLING = createSapling(new BYGSaplingToTree.GreenEnchantedSaplingToTree(), "green_enchanted_sapling");
    public static final Block HOLLY_SAPLING = createSapling(new BYGSaplingToTree.HollySaplingToTree(), "holly_sapling");
    public static final Block JACARANDA_SAPLING = createSapling(new BYGSaplingToTree.JacarandaSaplingToTree(), "jacaranda_sapling");
    public static final Block INDIGO_JACARANDA_SAPLING = createSapling(new BYGSaplingToTree.IndigoJacarandaSaplingToTree(), "indigo_jacaranda_sapling");
    public static final Block JOSHUA_SAPLING = createSapling(new BYGSaplingToTree.JoshuaSaplingToTree(), "joshua_sapling");
    public static final Block MAHOGANY_SAPLING = createSapling(new BYGSaplingToTree.MahogonySaplingToTree(), "mahogany_sapling");
    public static final Block MANGROVE_SAPLING = createSapling(new BYGSaplingToTree.MangroveSaplingToTree(), "mangrove_sapling");
    public static final Block MAPLE_SAPLING = createSapling(new BYGSaplingToTree.MapleSaplingToTree(), "maple_sapling");
    public static final Block ORANGE_BIRCH_SAPLING = createSapling(new BYGSaplingToTree.OrangeBirchSaplingToTree(), "orange_birch_sapling");
    public static final Block ORANGE_OAK_SAPLING = createSapling(new BYGSaplingToTree.OrangeOakSaplingToTree(), "orange_oak_sapling");
    public static final Block ORANGE_SPRUCE_SAPLING = createSapling(new BYGSaplingToTree.OrangeSpruceSaplingToTree(), "orange_spruce_sapling");
    public static final Block ORCHARD_SAPLING = createSapling(new BYGSaplingToTree.OrchardSaplingToTree(), "orchard_sapling");
    public static final Block PALO_VERDE_SAPLING = createSapling(new BYGSaplingToTree.PaloVerdeSaplingToTree(), "palo_verde_sapling");
    public static final Block PINE_SAPLING = createSapling(new BYGSaplingToTree.PineSaplingToTree(), "pine_sapling");
    public static final Block PINK_CHERRY_SAPLING = createSapling(new BYGSaplingToTree.PinkCherrySaplingToTree(), "pink_cherry_sapling");
    public static final Block RAINBOW_EUCALYPTUS_SAPLING = createSapling(new BYGSaplingToTree.RainbowEucalyptusSaplingToTree(), "rainbow_eucalyptus_sapling");
    public static final Block RED_BIRCH_SAPLING = createSapling(new BYGSaplingToTree.RedBirchSaplingToTree(), "red_birch_sapling");
    public static final Block RED_MAPLE_SAPLING = createSapling(new BYGSaplingToTree.RedMapleSaplingToTree(), "red_maple_sapling");
    public static final Block RED_OAK_SAPLING = createSapling(new BYGSaplingToTree.RedOakSaplingToTree(), "red_oak_sapling");
    public static final Block RED_SPRUCE_SAPLING = createSapling(new BYGSaplingToTree.RedSpruceSaplingToTree(), "red_spruce_sapling");
    public static final Block REDWOOD_SAPLING = createSapling(new BYGSaplingToTree.RedwoodSaplingToTree(), "redwood_sapling");
    public static final Block SILVER_MAPLE_SAPLING = createSapling(new BYGSaplingToTree.SilverMapleSaplingToTree(), "silver_maple_sapling");
    public static final Block SKYRIS_SAPLING = createSapling(new BYGSaplingToTree.SkyrisSaplingToTree(), "skyris_sapling");
    public static final Block WHITE_CHERRY_SAPLING = createSapling(new BYGSaplingToTree.WhiteCherrySaplingToTree(), "white_cherry_sapling");
    public static final Block WILLOW_SAPLING = createSapling(new BYGSaplingToTree.WillowSaplingToTree(), "willow_sapling");
    public static final Block WITCH_HAZEL_SAPLING = createSapling(new BYGSaplingToTree.WitchHazelSaplingToTree(), "witch_hazel_sapling");
    public static final Block YELLOW_BIRCH_SAPLING = createSapling(new BYGSaplingToTree.YellowBirchSaplingToTree(), "yellow_birch_sapling");
    public static final Block YELLOW_SPRUCE_SAPLING = createSapling(new BYGSaplingToTree.YellowSpruceSaplingToTree(), "yellow_spruce_sapling");
    public static final Block ZELKOVA_SAPLING = createSapling(new BYGSaplingToTree.ZelkovaSaplingToTree(), "zelkova_sapling");
    public static final Block PALM_SAPLING = createSapling(new BYGSaplingToTree.PalmSaplingToTree(), "palm_sapling");
    public static final Block LAMENT_SAPLING = createSapling(new BYGSaplingToTree.LamentSaplingToTree(), "lament_sapling");
    public static final Block WITHERING_OAK_SAPLING = createSapling(new BYGSaplingToTree.WitheringOakSaplingToTree(), "withering_oak_sapling");

    public static final Block ARAUCARIA_LEAVES = createLeaves("araucaria_leaves");
    public static final Block ASPEN_LEAVES = createLeaves("aspen_leaves");
    public static final Block BAOBAB_LEAVES = createLeaves("baobab_leaves");
    public static final Block BLOOMING_WITCH_HAZEL_LEAVES = new BYGBlockProperties.BYGBloomingWitchhazelLeaves("blooming_witch_hazel_leaves");
    public static final Block BLUE_ENCHANTED_LEAVES = new BYGBlockProperties.BYGBloomingWitchhazelLeaves("blue_enchanted_leaves");
    public static final Block BLUE_SPRUCE_LEAVES = createLeaves("blue_spruce_leaves");
    public static final Block BROWN_BIRCH_LEAVES = createLeaves("brown_birch_leaves");
    public static final Block BROWN_OAK_LEAVES = createLeaves("brown_oak_leaves");
    public static final Block BROWN_ZELKOVA_LEAVES = createLeaves("brown_zelkova_leaves");
    public static final Block CIKA_LEAVES = createLeaves("cika_leaves");
    public static final Block CYPRESS_LEAVES = createLeaves("cypress_leaves");
    public static final Block EBONY_LEAVES = createLeaves("ebony_leaves");
    public static final Block FIR_LEAVES = createLeaves("fir_leaves");
    public static final Block FLOWERING_ORCHARD_LEAVES = createLeaves("flowering_orchard_leaves");
    public static final Block FLOWERING_PALO_VERDE_LEAVES = createLeaves("flowering_palo_verde_leaves");
    public static final Block GREEN_ENCHANTED_LEAVES = new BYGBlockProperties.BYGBloomingWitchhazelLeaves("green_enchanted_leaves");
    public static final Block HOLLY_BERRY_LEAVES = createLeaves("holly_berry_leaves");
    public static final Block HOLLY_LEAVES = createLeaves("holly_leaves");
    public static final Block JACARANDA_LEAVES = createLeaves("jacaranda_leaves");
    public static final Block INDIGO_JACARANDA_LEAVES = createLeaves("indigo_jacaranda_leaves");
    public static final Block JOSHUA_LEAVES = createLeaves("joshua_leaves");
    public static final Block RIPE_JOSHUA_LEAVES = createLeaves("ripe_joshua_leaves");
    public static final Block MAHOGANY_LEAVES = createLeaves("mahogany_leaves");
    public static final Block MANGROVE_LEAVES = createLeaves("mangrove_leaves");
    public static final Block MAPLE_LEAVES = createLeaves("maple_leaves");
    public static final Block ORANGE_BIRCH_LEAVES = createLeaves("orange_birch_leaves");
    public static final Block ORANGE_OAK_LEAVES = createLeaves("orange_oak_leaves");
    public static final Block ORANGE_SPRUCE_LEAVES = createLeaves("orange_spruce_leaves");
    public static final Block ORCHARD_LEAVES = createLeaves("orchard_leaves");
    public static final Block PALO_VERDE_LEAVES = createLeaves("palo_verde_leaves");
    public static final Block PINE_LEAVES = createLeaves("pine_leaves");
    public static final Block PINK_CHERRY_LEAVES = createLeaves("pink_cherry_leaves");
    public static final Block RAINBOW_EUCALYPTUS_LEAVES = createLeaves("rainbow_eucalyptus_leaves");
    public static final Block RED_BIRCH_LEAVES = createLeaves("red_birch_leaves");
    public static final Block RED_MAPLE_LEAVES = createLeaves("red_maple_leaves");
    public static final Block RED_OAK_LEAVES = createLeaves("red_oak_leaves");
    public static final Block RED_SPRUCE_LEAVES = createLeaves("red_spruce_leaves");
    public static final Block REDWOOD_LEAVES = createLeaves("redwood_leaves");
    public static final Block RIPE_ORCHARD_LEAVES = createLeaves("ripe_orchard_leaves");
    public static final Block SILVER_MAPLE_LEAVES = createLeaves("silver_maple_leaves");
    public static final Block SKYRIS_LEAVES_GREEN_APPLE = createLeaves("green_apple_skyris_leaves");
    public static final Block SKYRIS_LEAVES = createLeaves("skyris_leaves");
    public static final Block WHITE_CHERRY_LEAVES = createLeaves("white_cherry_leaves");
    public static final Block WILLOW_LEAVES = createLeaves("willow_leaves");
    public static final Block WITCH_HAZEL_LEAVES = createLeaves("witch_hazel_leaves");
    public static final Block YELLOW_BIRCH_LEAVES = createLeaves("yellow_birch_leaves");
    public static final Block YELLOW_SPRUCE_LEAVES = createLeaves("yellow_spruce_leaves");
    public static final Block ZELKOVA_LEAVES = createLeaves("zelkova_leaves");
    public static final Block PALM_LEAVES = createLeaves("palm_leaves");
    public static final Block LAMENT_LEAVES = createLeaves("lament_leaves");
    public static final Block WITHERING_OAK_LEAVES = createLeaves("withering_oak_leaves");

    public static final Block GREEN_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("green_mushroom_block");
    public static final Block MILKCAP_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("weeping_milkcap_mushroom_block");
    public static final Block BLEWIT_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("wood_blewit_mushroom_block");
    public static final Block PUFF_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("black_puff_mushroom_block");
    public static final Block WHITE_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("white_mushroom_stem");
    public static final Block BROWN_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("brown_mushroom_stem");
    public static final Block BLUE_GLOWSHROOM_BLOCK = new BYGBlockProperties.BlockHugeGlowshroom("blue_glowshroom_block");
    public static final Block PURPLE_GLOWSHROOM_BLOCK = new BYGBlockProperties.BlockHugeGlowshroom("purple_glowshroom_block");
    public static final Block RED_GLOWSHROOM_STEM = new BYGBlockProperties.BlockHugeGlowshroomStem("red_glowshroom_stem");
    public static final Block YELLOW_GLOWSHROOM_STEM = new BYGBlockProperties.BlockHugeGlowshroomStem("yellow_glowshroom_stem");
    public static final Block SOUL_SHROOM_STEM = new BYGBlockProperties.BlockHugeNetherMushroomStem("soul_shroom_stem");
    public static final Block SOUL_SHROOM_BLOCK = new BYGBlockProperties.BlockHugeNetherMushroom("soul_shroom_block");
    public static final Block DEATH_CAP_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeNetherMushroom("death_cap_mushroom_block");

    public static final Block CATTAIL = new BYGBlockProperties.BlockCattail("cattail");
    public static final Block REEDS = new BYGBlockProperties.BlockCattail("reeds");
    public static final Block REED_THATCH = new BYGBlockProperties.BYGThatch("reed_thatch");
    public static final Block REED_THATCH_CARPET = new BYGBlockProperties.ThatchCarpet("reed_thatch_carpet");
    public static final Block REED_THATCH_STAIRS = new BYGBlockProperties.ThatchStairs("reed_thatch_stairs");
    public static final Block REED_THATCH_SLAB = new BYGBlockProperties.ThatchSlab("reed_thatch_slab");
    public static final Block HORSEWEED = createFlower("horseweed");
    public static final Block MINI_CACTUS = new BYGBlockProperties.BYGDesertPlant("mini_cactus");
    public static final Block PRICKLY_PEAR_CACTUS = new BYGBlockProperties.BYGDesertPlant("prickly_pear_cactus");
    public static final Block WINTER_SUCCULENT = createFlower("winter_succulent");
    public static final Block SHORT_GRASS = new BYGBlockProperties.BYGTallGrass("short_grass");
    public static final Block TALL_PRAIRIE_GRASS = new BYGBlockProperties.BYGDoublePlant("tall_prairie_grass");
    public static final Block BLUE_GLOWCANE = new BYGBlockProperties.BYGBLUEGlowCane("blue_glowcane");
    public static final Block RED_GLOWCANE = new BYGBlockProperties.BYGREDGlowCane("red_glowcane");
    public static final Block PURPLE_GLOWCANE = new BYGBlockProperties.BYGPURPLEGlowCane("purple_glowcane");
    public static final Block PINK_GLOWCANE = new BYGBlockProperties.BYGPINKGlowCane("pink_glowcane");
    public static final Block POISON_IVY = new BYGBlockProperties.BYGPoisonIvy("poison_ivy");
    public static final Block SKYRIS_VINE = new BYGBlockProperties.BYGSkyrisVine("skyris_vine");
    public static final Block BLUEBERRY_BUSH = new BYGBlockProperties.BYGBerryBush("blueberry_bush");
    public static final Block TINY_LILYPADS = new BYGBlockProperties.BYGLily("tiny_lilypads");
    public static final Block WATER_SILK = new BYGBlockProperties.BYGWaterSilk("water_silk");
    public static final Block WEEPING_ROOTS = new BYGBlockProperties.BYGHangingVine("weeping_roots");
    public static final Block WEEPING_ROOTS_PLANT = new BYGBlockProperties.BYGHangingVinePlant("weeping_roots_plant");
    public static final Block WINTER_GRASS = new BYGBlockProperties.BYGWinterTallGrass("winter_grass");
    public static final Block WEED_GRASS = new BYGBlockProperties.BYGTallGrass("weed_grass");
    public static final Block WILTED_GRASS = new BYGBlockProperties.BYGTallGrass("wilted_grass");
    public static final Block SHORT_BEACH_GRASS = new BYGBlockProperties.BYGBeachGrass("short_beach_grass");
    public static final Block BEACH_GRASS = new BYGBlockProperties.BYGBeachGrass("beach_grass");
    public static final Block LEAF_PILE = new BYGBlockProperties.BYGLeafPile("leaf_pile");
    public static final Block CLOVER_PATCH = new BYGBlockProperties.BYGLeafPile("clover_patch");
    public static final Block FLOWER_PATCH = new BYGBlockProperties.BYGLeafPile("flower_patch");

    public static final Block ANTHRACITE_BLOCK = new BYGBlockProperties.AnthraciteOre("anthracite_block");
    public static final Block ANTHRACITE_ORE = new BYGBlockProperties.AnthraciteOre("anthracite_ore");

    public static final Block MYCELIUM_NETHERRACK = new BYGBlockProperties.OvergrownNetherrack("mycelium_netherrack");
    public static final Block NETHER_BRISTLE = new BYGBlockProperties.BYGDoubleDamagePlant("nether_bristle");
    public static final Block MOSSY_NETHERRACK = new BYGBlockProperties.BYGNetherrack("mossy_netherrack");

    public static final Block CRIMSON_BERRY_BUSH = new BYGBlockProperties.CrimsonBerryBush("crimson_berry_bush");
    public static final Block TALL_CRIMSON_ROOTS = new BYGBlockProperties.BYGDoubleNetherPlant("tall_crimson_roots");
    public static final Block BRIMSTONE = new BYGBlockProperties.BYGNetherrack("brimstone");
    public static final Block YELLOW_NETHER_BRICKS = new BYGBlockProperties.BYGNetherrack("yellow_nether_bricks");
    public static final Block BORIC_CAMPFIRE = new BYGBlockProperties.BoricCampfire("boric_campfire");
    public static final Block BORIC_FIRE = new BYGBlockProperties.BoricFire("boric_fire");

    public static final Block HANGING_BONE = new BYGBlockProperties.HangingBones("hanging_bones");
    public static final Block QUARTZ_CRYSTAL = new BYGBlockProperties.BYGQuartzCrystal("quartz_crystal");
    public static final Block QUARTZITE_SAND = new BYGBlockProperties.BYGQuartziteSand("quartzite_sand");
    public static final Block RAW_QUARTZ_BLOCK = new BYGBlockProperties.BYGStone("raw_quartz_block");

    public static final Block WAILING_VINES = new BYGBlockProperties.WailingVines("whaling_vine");
    public static final Block WHALING_GRASS = new BYGBlockProperties.WhalingGrass("whaling_grass");
    public static final Block MAGMATIC_STONE = new BYGBlockProperties.BYGNetherrack("magmatic_stone");
    public static final Block SCORCHED_BUSH = new BYGBlockProperties.ScorchedPlant("scorched_bush");
    public static final Block SCORCHED_GRASS = new BYGBlockProperties.ScorchedPlant("scorched_grass");

    public static final Block WARPED_CACTUS = new BYGBlockProperties.BYGWarpedCacti("warped_cactus");
    public static final Block WARPED_BUSH = new BYGBlockProperties.BYGWarpedBush("warped_bush");
    public static final Block WARPED_CORAL_BLOCK = new BYGBlockProperties.BYGWarpedCoralBlock("warped_coral_block");
    public static final Block WARPED_CORAL = new BYGBlockProperties.BYGWarpedCoral("warped_coral");
    public static final Block WARPED_CORAL_FAN = new BYGBlockProperties.BYGWarpedFanCoral("warped_coral_fan");
    public static final Block WARPED_CORAL_WALL_FAN = new BYGBlockProperties.BYGWarpedWallFanCoral("warped_coral_wall_fan");
    public static final Block NYLIUM_SOUL_SAND = new BYGBlockProperties.BYGNyliumSoulSand("nylium_soul_sand");
    public static final Block NYLIUM_SOUL_SOIL = new BYGBlockProperties.BYGNyliumSoulSoil("nylium_soul_soil");

    public static final Block SYTHIAN_WART_BLOCK = new BYGBlockProperties.BYGWartBlock("sythian_wart_block");
    public static final Block SYTHIAN_ROOTS = new BYGBlockProperties.SythianPlant("sythian_roots");
    public static final Block SYTHIAN_SPROUT = new BYGBlockProperties.SythianPlant("sythian_sprout");
    public static final Block SYTHIAN_STALK_BLOCK = new BYGBlockProperties.SythianStalk("sythian_stalk_block");
    public static final Block SYTHIAN_SCAFFOLDING = new BYGBlockProperties.BYGScaffolding("sythian_scaffolding");
    public static final Block SYTHIAN_SAPLING = new BYGBlockProperties.SythianSapling("sythian_sapling");;
    public static final Block HANGING_SYTHIAN_ROOTS = new BYGBlockProperties.BYGSythianHangingRoots("hanging_sythian_roots");
    public static final Block HANGING_SYTHIAN_ROOTS_PLANT = new BYGBlockProperties.BYGSythianHangingRootsPlant("hanging_sythian_roots_plant");

    public static final Block EMBUR_LILY = new BYGBlockProperties.BYGEmburLily("embur_lily");
    public static final Block EMBUR_GEL_BLOCK = new BYGBlockProperties.BYGEmburGelBlock("embur_gel_block");
    public static final Block EMBUR_GEL_VINES = new BYGBlockProperties.BYGEmburGelVine("embur_gel_vines");
    public static final Block EMBUR_SPROUTS = new BYGBlockProperties.BYGEmburPlant("embur_sprouts");
    public static final Block EMBUR_ROOTS = new BYGBlockProperties.BYGEmburPlant("embur_roots");
    public static final Block EMBUR_WART = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.EmburWart(), "embur_wart");
    public static final Block TALL_EMBUR_ROOTS = new BYGBlockProperties.BYGDoubleNetherPlant("tall_embur_roots");

    public static final Block BLUE_NETHERRACK = new BYGBlockProperties.BYGBlueNetherrack("blue_netherrack");
    public static final Block BLUE_NETHERRACK_BRICKS = new BYGBlockProperties.BYGNetherrack("blue_nether_bricks");

    public static final Block IVIS_ROOTS = new BYGBlockProperties.BYGIvisPlant("ivis_roots");
    public static final Block IVIS_SPROUT = new BYGBlockProperties.BYGIvisPlant("ivis_sprout");

    public static final Block BLUE_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("blue_glowcane_block");
    public static final Block RED_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("red_glowcane_block");
    public static final Block PINK_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("pink_glowcane_block");
    public static final Block PURPLE_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("purple_glowcane_block");

    public static final Block GLOWSTONE_LAMP = new BYGBlockProperties.BYGGlowCaneBlock("glowstone_lamp");
    public static final Block PERVADED_NETHERRACK = new BYGBlockProperties.BYGPervadedNetherrack("pervaded_netherrack");
    public static final Block GLOWSTONE_LANTERN = new BYGBlockProperties.BYGLantern("glowstone_lantern");
    public static final Block PACKED_BLACK_ICE = new BYGBlockProperties.BYGPackedIceBlock("packed_black_ice");
    public static final Block BLACK_ICE = new BYGBlockProperties.BYGIceBlock("black_ice");
    public static final Block FROST_MAGMA = new BYGBlockProperties.BYGFrostMagma("frost_magma");
    public static final Block SUBZERO_ASH = new BYGBlockProperties.BYGSubzeroAsh("subzero_ash");
    public static final Block SUBZERO_ASH_BLOCK = new BYGBlockProperties.BYGSubzeroAshBlock("subzero_ash_block");
    public static final Block LAMENT_SPROUTS = new BYGBlockProperties.BYGLamentPlant("lament_sprouts");
    public static final Block LAMENT_VINE = new BYGBlockProperties.BYGLamentVine("lament_vine");
    public static final Block LAMENT_VINE_PLANT = new BYGBlockProperties.BYGLamentVinePlant("lament_vine_plant");

    public static final Block PINK_CHERRY_FOLIAGE = new BYGBlockProperties.BYGLeafFoilage("pink_cherry_foliage");
    public static final Block WHITE_CHERRY_FOLIAGE = new BYGBlockProperties.BYGLeafFoilage("white_cherry_foliage");

    public static final Block WHITE_PETAL = new BYGBlockProperties.BYGPetal("white_petal_block");
    public static final Block RED_PETAL = new BYGBlockProperties.BYGPetal("red_petal_block");
    public static final Block PURPLE_PETAL = new BYGBlockProperties.BYGPetal("purple_petal_block");
    public static final Block BLUE_PETAL = new BYGBlockProperties.BYGPetal("blue_petal_block");
    public static final Block LIGHT_BLUE_PETAL = new BYGBlockProperties.BYGPetal("light_blue_petal_block");
    public static final Block YELLOW_PETAL = new BYGBlockProperties.BYGPetal("yellow_petal_block");
    public static final Block PLANT_STEM = createLog("plant_stem");
    public static final Block POLLEN_BLOCK = new BYGBlockProperties.BYGPollen("pollen_block");

    public static final Block BLACK_SAND = createSand(5197647, "black_sand");
    public static final Block BLACK_SANDSTONE = new BYGBlockProperties.BYGStone("black_sandstone");
    public static final Block BLACK_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("black_chiseled_sandstone");
    public static final Block BLACK_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("black_cut_sandstone");
    public static final Block BLACK_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("black_smooth_sandstone");

    public static final Block WHITE_SAND = createSand(15395562, "white_sand");
    public static final Block WHITE_SANDSTONE = new BYGBlockProperties.BYGStone("white_sandstone");
    public static final Block WHITE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("white_chiseled_sandstone");
    public static final Block WHITE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("white_cut_sandstone");
    public static final Block WHITE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("white_smooth_sandstone");
    
    public static final Block BLUE_SAND = createSand(13559021, "blue_sand");
    public static final Block BLUE_SANDSTONE = new BYGBlockProperties.BYGStone("blue_sandstone");
    public static final Block BLUE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("blue_chiseled_sandstone");
    public static final Block BLUE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("blue_cut_sandstone");
    public static final Block BLUE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("blue_smooth_sandstone");

    public static final Block PURPLE_SAND = createSand(12887002, "purple_sand");
    public static final Block PURPLE_SANDSTONE = new BYGBlockProperties.BYGStone("purple_sandstone");
    public static final Block PURPLE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("purple_chiseled_sandstone");
    public static final Block PURPLE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("purple_cut_sandstone");
    public static final Block PURPLE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("purple_smooth_sandstone");

    public static final Block PINK_SAND = createSand(15585004, "pink_sand");
    public static final Block PINK_SANDSTONE = new BYGBlockProperties.BYGStone("pink_sandstone");
    public static final Block PINK_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("pink_chiseled_sandstone");
    public static final Block PINK_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("pink_cut_sandstone");
    public static final Block PINK_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("pink_smooth_sandstone");

    
    public static final Block ASPEN_LOG = createLog("aspen_log");
    public static final Block BAOBAB_LOG = createLog("baobab_log");
    public static final Block BLUE_ENCHANTED_LOG = createLog("blue_enchanted_log");
    public static final Block CHERRY_LOG = createLog("cherry_log");
    public static final Block CIKA_LOG = createLog("cika_log");
    public static final Block CYPRESS_LOG = createLog("cypress_log");
    public static final Block EBONY_LOG = createLog("ebony_log");
    public static final Block FIR_LOG = createLog("fir_log");
    public static final Block GREEN_ENCHANTED_LOG = createLog("green_enchanted_log");
    public static final Block HOLLY_LOG = createLog("holly_log");
    public static final Block JACARANDA_LOG = createLog("jacaranda_log");
    public static final Block MAHOGANY_LOG = createLog("mahogany_log");
    public static final Block MANGROVE_LOG = createLog("mangrove_log");
    public static final Block MAPLE_LOG = createLog("maple_log");
    public static final Block PALO_VERDE_LOG = createLog("palo_verde_log");
    public static final Block PINE_LOG = createLog("pine_log");
    public static final Block RAINBOW_EUCALYPTUS_LOG = createLog("rainbow_eucalyptus_log");
    public static final Block REDWOOD_LOG = createLog("redwood_log");
    public static final Block SKYRIS_LOG = createLog("skyris_log");
    public static final Block WILLOW_LOG = createLog("willow_log");
    public static final Block WITCH_HAZEL_LOG = createLog("witch_hazel_log");
    public static final Block ZELKOVA_LOG = createLog("zelkova_log");
    public static final Block SYTHIAN_STEM = new BYGBlockProperties.BYGNetherLog("sythian_stem");
    public static final Block EMBUR_PEDU = new BYGBlockProperties.BYGNetherLog("embur_pedu");
    public static final Block PALM_LOG = createLog("palm_log");
    public static final Block LAMENT_LOG = createLog("lament_log");
    public static final Block WITHERING_OAK_LOG = createLog("withering_oak_log");

    public static final Block ASPEN_WOOD = createWood("aspen_wood");
    public static final Block BAOBAB_WOOD = createWood("baobab_wood");
    public static final Block BLUE_ENCHANTED_WOOD = createWood("blue_enchanted_wood");
    public static final Block CHERRY_WOOD = createWood("cherry_wood");
    public static final Block CIKA_WOOD = createWood("cika_wood");
    public static final Block CYPRESS_WOOD = createWood("cypress_wood");
    public static final Block EBONY_WOOD = createWood("ebony_wood");
    public static final Block FIR_WOOD = createWood("fir_wood");
    public static final Block GREEN_ENCHANTED_WOOD = createWood("green_enchanted_wood");
    public static final Block HOLLY_WOOD = createWood("holly_wood");
    public static final Block JACARANDA_WOOD = createWood("jacaranda_wood");
    public static final Block MAHOGANY_WOOD = createWood("mahogany_wood");
    public static final Block MANGROVE_WOOD = createWood("mangrove_wood");
    public static final Block MAPLE_WOOD = createWood("maple_wood");
    public static final Block PALO_VERDE_WOOD = createWood("palo_verde_wood");
    public static final Block PINE_WOOD = createWood("pine_wood");
    public static final Block RAINBOW_EUCALYPTUS_WOOD = createWood("rainbow_eucalyptus_wood");
    public static final Block REDWOOD_WOOD = createWood("redwood_wood");
    public static final Block SKYRIS_WOOD = createWood("skyris_wood");
    public static final Block WILLOW_WOOD = createWood("willow_wood");
    public static final Block WITCH_HAZEL_WOOD = createWood("witch_hazel_wood");
    public static final Block ZELKOVA_WOOD = createWood("zelkova_wood");
    public static final Block SYTHIAN_HYPHAE = new BYGBlockProperties.BYGNetherWood("sythian_hyphae");
    public static final Block EMBUR_HYPHAE = new BYGBlockProperties.BYGNetherWood("embur_hyphae");
    public static final Block PALM_WOOD = createWood("palm_wood");
    public static final Block LAMENT_WOOD = createWood("lament_wood");
    public static final Block WITHERING_OAK_WOOD = createWood("withering_oak_wood");

    public static final Block BLACK_PUFF = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.BlackPuff(), "black_puff");
    public static final Block WEEPING_MILKCAP = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.WeepingMilkCap(), "weeping_milkcap");
    public static final Block WOOD_BLEWIT = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.WoodBlewit(), "wood_blewit");
    public static final Block GREEN_MUSHROOM = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.GreenMushroom(), "green_mushroom");
    public static final Block BLUE_GLOWSHROOM = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.BlueGlowshroom(), "blue_glowshroom");
    public static final Block PURPLE_GLOWSHROOM = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.PurpleGlowshroom(), "purple_glowshroom");

    public static final Block SYTHIAN_FUNGUS = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.SythianFungus(), "sythian_fungus");
    public static final Block SOUL_SHROOM = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.SoulShroom(), "soul_shroom");
    public static final Block DEATH_CAP = new BYGMushroomBlock(new BYGMushroomToHugeMushroom.DeathCap(), "death_cap");

    public static final Block SOUL_SHROOM_SPORE = new BYGBlockProperties.BYGSoulShroomSpore("soul_shroom_spore");
    public static final Block SOUL_SHROOM_SPORE_END = new BYGBlockProperties.BYGSoulShroomSporeEnd("soul_shroom_spore_end");

    public static final Block PENDORITE_ORE = new BYGBlockProperties.BYGOrePendorite("pendorite_ore");
    public static final Block AMETRINE_ORE = new BYGBlockProperties.BYGOreAmetrine("ametrine_ore");
    public static final Block PENDORITE_BLOCK = new BYGBlockProperties.BYGOrePendorite("pendorite_block");
    public static final Block AMETRINE_BLOCK = new BYGBlockProperties.BYGOreAmetrine("ametrine_block");

    public static final Block DACITE = new BYGBlockProperties.BYGStone("dacite");
    public static final Block DACITE_SLAB = createStoneSlab("dacite_slab");
    public static final Block DACITE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_stairs");
    public static final Block DACITE_WALL = createStoneWall("dacite_wall");
    public static final Block DACITE_BRICKS = new BYGBlockProperties.BYGStone("dacite_bricks");
    public static final Block DACITE_BRICK_SLAB = createStoneSlab("dacite_brick_slab");
    public static final Block DACITE_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_brick_stairs");
    public static final Block DACITE_BRICK_WALL = createStoneWall("dacite_brick_wall");
    public static final Block DACITE_COBBLESTONE = new BYGBlockProperties.BYGStone("dacite_cobblestone");
    public static final Block DACITE_COBBLESTONE_SLAB = createStoneSlab("dacite_cobblestone_slab");
    public static final Block DACITE_COBBLESTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_cobblestone_stairs");
    public static final Block DACITE_COBBLESTONE_WALL = createStoneWall("dacite_cobblestone_wall");
    public static final Block DACITE_PILLAR = new BYGBlockProperties.BYGPillar("dacite_pillar");
    public static final Block DACITE_TILE = new BYGBlockProperties.BYGStone("dacite_tile");
    public static final Block DACITE_TILE_SLAB = createStoneSlab("dacite_tile_slab");
    public static final Block DACITE_TILE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_tile_stairs");
    public static final Block DACITE_TILE_WALL = createStoneWall("dacite_tile_wall");

    public static final Block RED_ROCK = new BYGBlockProperties.BYGStone("red_rock");
    public static final Block RED_ROCK_SLAB = createStoneSlab("red_rock_slab");
    public static final Block RED_ROCK_STAIRS = new BYGBlockProperties.BYGStoneStairs("red_rock_stairs");
    public static final Block RED_ROCK_WALL = createStoneWall("red_rock_wall");
    public static final Block RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("red_rock_bricks");
    public static final Block RED_ROCK_BRICK_SLAB = createStoneSlab("red_rock_brick_slab");
    public static final Block RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("red_rock_brick_stairs");
    public static final Block RED_ROCK_BRICK_WALL = createStoneWall("red_rock_brick_wall");
    public static final Block CRACKED_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("cracked_red_rock_bricks");
    public static final Block CRACKED_RED_ROCK_BRICK_SLAB = createStoneSlab("cracked_red_rock_brick_slab");
    public static final Block CRACKED_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("cracked_red_rock_brick_stairs");
    public static final Block CRACKED_RED_ROCK_BRICK_WALL = createStoneWall("cracked_red_rock_brick_wall");
    public static final Block CHISELED_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("chiseled_red_rock_bricks");
    public static final Block CHISELED_RED_ROCK_BRICK_SLAB = createStoneSlab("chiseled_red_rock_brick_slab");
    public static final Block CHISELED_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("chiseled_red_rock_brick_stairs");
    public static final Block CHISELED_RED_ROCK_BRICK_WALL = createStoneWall("chiseled_red_rock_brick_wall");
    public static final Block MOSSY_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("mossy_red_rock_bricks");
    public static final Block MOSSY_RED_ROCK_BRICK_SLAB = createStoneSlab("mossy_red_rock_brick_slab");
    public static final Block MOSSY_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("mossy_red_rock_brick_stairs");
    public static final Block MOSSY_RED_ROCK_BRICK_WALL = createStoneWall("mossy_red_rock_brick_wall");

    public static final Block MOSSY_STONE = new BYGBlockProperties.BYGStone("mossy_stone");
    public static final Block MOSSY_STONE_SLAB = createStoneSlab("mossy_stone_slab");
    public static final Block MOSSY_STONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("mossy_stone_stairs");
    public static final Block MOSSY_STONE_WALL = createStoneWall("mossy_stone_wall");
    public static final Block PODZOL_DACITE = new BYGBlockProperties.BlockOvergrownDaciteBlock("podzol_dacite");

    public static final Block ROCKY_STONE = new BYGBlockProperties.BYGStone("rocky_stone");
    public static final Block ROCKY_SLAB = createStoneSlab("rocky_stone_slab");
    public static final Block ROCKY_STAIRS = new BYGBlockProperties.BYGStoneStairs("rocky_stone_stairs");
    public static final Block ROCKY_WALL = createStoneWall("rocky_stone_wall");

    public static final Block SCORIA_STONE = new BYGBlockProperties.BYGStone("scoria_stone");
    public static final Block SCORIA_SLAB = createStoneSlab("scoria_stone_slab");
    public static final Block SCORIA_STAIRS = new BYGBlockProperties.BYGStoneStairs("scoria_stone_stairs");
    public static final Block SCORIA_WALL = createStoneWall("scoria_stone_wall");
    public static final Block SCORIA_COBBLESTONE = new BYGBlockProperties.BYGStone("scoria_cobblestone");
    public static final Block SCORIA_COBBLESTONE_SLAB = createStoneSlab("scoria_cobblestone_slab");
    public static final Block SCORIA_COBBLESTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("scoria_cobblestone_stairs");
    public static final Block SCORIA_COBBLESTONE_WALL = createStoneWall("scoria_cobblestone_wall");
    public static final Block SCORIA_PILLAR = new BYGBlockProperties.BYGPillar("scoria_pillar");
    public static final Block SCORIA_STONEBRICKS = new BYGBlockProperties.BYGStone("scoria_stonebricks");
    public static final Block SCORIA_STONEBRICK_SLAB = createStoneSlab("scoria_stonebrick_slab");
    public static final Block SCORIA_STONEBRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("scoria_stonebrick_stairs");
    public static final Block SCORIA_STONEBRICK_WALL = createStoneWall("scoria_stonebrick_wall");

    public static final Block SOAPSTONE = new BYGBlockProperties.BYGStone("soapstone");
    public static final Block SOAPSTONE_SLAB = createStoneSlab("soapstone_slab");
    public static final Block SOAPSTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_stairs");
    public static final Block SOAPSTONE_WALL = createStoneWall("soapstone_wall");
    public static final Block POLISHED_SOAPSTONE = new BYGBlockProperties.BYGStone("polished_soapstone");
    public static final Block POLISHED_SOAPSTONE_SLAB = createStoneSlab("polished_soapstone_slab");
    public static final Block POLISHED_SOAPSTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("polished_soapstone_stairs");
    public static final Block POLISHED_SOAPSTONE_WALL = createStoneWall("polished_soapstone_wall");
    public static final Block SOAPSTONE_BRICKS = new BYGBlockProperties.BYGStone("soapstone_bricks");
    public static final Block SOAPSTONE_BRICK_SLAB = createStoneSlab("soapstone_brick_slab");
    public static final Block SOAPSTONE_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_brick_stairs");
    public static final Block SOAPSTONE_BRICK_WALL = createStoneWall("soapstone_brick_wall");
    public static final Block SOAPSTONE_PILLAR = new BYGBlockProperties.BYGPillar("soapstone_pillar");
    public static final Block SOAPSTONE_TILE = new BYGBlockProperties.BYGStone("soapstone_tile");
    public static final Block SOAPSTONE_TILE_SLAB = createStoneSlab("soapstone_tile_slab");
    public static final Block SOAPSTONE_TILE_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_tile_stairs");
    public static final Block SOAPSTONE_TILE_WALL = createStoneWall("soapstone_tile_wall");

    public static final Block STRIPPED_ASPEN_LOG = createStrippedLog("stripped_aspen_log");
    public static final Block STRIPPED_BAOBAB_LOG = createStrippedLog("stripped_baobab_log");
    public static final Block STRIPPED_BLUE_ENCHANTED_LOG = createStrippedLog("stripped_blue_enchanted_log");
    public static final Block STRIPPED_CHERRY_LOG = createStrippedLog("stripped_cherry_log");
    public static final Block STRIPPED_CIKA_LOG = createStrippedLog("stripped_cika_log");
    public static final Block STRIPPED_CYPRESS_LOG = createStrippedLog("stripped_cypress_log");
    public static final Block STRIPPED_EBONY_LOG = createStrippedLog("stripped_ebony_log");
    public static final Block STRIPPED_FIR_LOG = createStrippedLog("stripped_fir_log");
    public static final Block STRIPPED_GREEN_ENCHANTED_LOG = createStrippedLog("stripped_green_enchanted_log");
    public static final Block STRIPPED_HOLLY_LOG = createStrippedLog("stripped_holly_log");
    public static final Block STRIPPED_JACARANDA_LOG = createStrippedLog("stripped_jacaranda_log");
    public static final Block STRIPPED_MAHOGANY_LOG = createStrippedLog("stripped_mahogany_log");
    public static final Block STRIPPED_MANGROVE_LOG = createStrippedLog("stripped_mangrove_log");
    public static final Block STRIPPED_MAPLE_LOG = createStrippedLog("stripped_maple_log");
    public static final Block STRIPPED_PALO_VERDE_LOG = createStrippedLog("stripped_palo_verde_log");
    public static final Block STRIPPED_PINE_LOG = createStrippedLog("stripped_pine_log");
    public static final Block STRIPPED_RAINBOW_EUCALYPTUS_LOG = createStrippedLog("stripped_rainbow_eucalyptus_log");
    public static final Block STRIPPED_SKYRIS_LOG = createStrippedLog("stripped_skyris_log");
    public static final Block STRIPPED_WILLOW_LOG = createStrippedLog("stripped_willow_log");
    public static final Block STRIPPED_REDWOOD_LOG = createStrippedLog("stripped_redwood_log");
    public static final Block STRIPPED_WITCH_HAZEL_LOG = createStrippedLog("stripped_witch_hazel_log");
    public static final Block STRIPPED_ZELKOVA_LOG = createStrippedLog("stripped_zelkova_log");
    public static final Block STRIPPED_SYTHIAN_STEM = new BYGBlockProperties.BYGNetherLog("stripped_sythian_stem");
    public static final Block STRIPPED_EMBUR_PEDU = new BYGBlockProperties.BYGNetherLog("stripped_embur_pedu");
    public static final Block STRIPPED_PALM_LOG = createStrippedLog("stripped_palm_log");
    public static final Block STRIPPED_LAMENT_LOG = createStrippedLog("stripped_lament_log");

    public static final Block STRIPPED_ASPEN_WOOD = createWood("stripped_aspen_wood");
    public static final Block STRIPPED_BAOBAB_WOOD = createWood("stripped_baobab_wood");
    public static final Block STRIPPED_BLUE_ENCHANTED_WOOD = createWood("stripped_blue_enchanted_wood");
    public static final Block STRIPPED_CHERRY_WOOD = createWood("stripped_cherry_wood");
    public static final Block STRIPPED_CIKA_WOOD = createWood("stripped_cika_wood");
    public static final Block STRIPPED_CYPRESS_WOOD = createWood("stripped_cypress_wood");
    public static final Block STRIPPED_EBONY_WOOD = createWood("stripped_ebony_wood");
    public static final Block STRIPPED_FIR_WOOD = createWood("stripped_fir_wood");
    public static final Block STRIPPED_GREEN_ENCHANTED_WOOD = createWood("stripped_green_enchanted_wood");
    public static final Block STRIPPED_HOLLY_WOOD = createWood("stripped_holly_wood");
    public static final Block STRIPPED_JACARANDA_WOOD = createWood("stripped_jacaranda_wood");
    public static final Block STRIPPED_MAHOGANY_WOOD = createWood("stripped_mahogany_wood");
    public static final Block STRIPPED_MANGROVE_WOOD = createWood("stripped_mangrove_wood");
    public static final Block STRIPPED_MAPLE_WOOD = createWood("stripped_maple_wood");
    public static final Block STRIPPED_PALO_VERDE_WOOD = createWood("stripped_palo_verde_wood");
    public static final Block STRIPPED_PINE_WOOD = createWood("stripped_pine_wood");
    public static final Block STRIPPED_RAINBOW_EUCALYPTUS_WOOD = createWood("stripped_rainbow_eucalyptus_wood");
    public static final Block STRIPPED_SKYRIS_WOOD = createWood("stripped_skyris_wood");
    public static final Block STRIPPED_WILLOW_WOOD = createWood("stripped_willow_wood");
    public static final Block STRIPPED_REDWOOD_WOOD = createWood("stripped_redwood_wood");
    public static final Block STRIPPED_WITCH_HAZEL_WOOD = createWood("stripped_witch_hazel_wood");
    public static final Block STRIPPED_ZELKOVA_WOOD = createWood("stripped_zelkova_wood");
    public static final Block STRIPPED_SYTHIAN_HYPHAE = new BYGBlockProperties.BYGNetherWood("stripped_sythian_hyphae");
    public static final Block STRIPPED_EMBUR_HYPHAE = new BYGBlockProperties.BYGNetherWood("stripped_embur_hyphae");
    public static final Block STRIPPED_PALM_WOOD = createWood("stripped_palm_wood");
    public static final Block STRIPPED_LAMENT_WOOD = createWood("stripped_lament_wood");

    public static final Block TALL_ALLIUM = new BYGBlockProperties.BYGDoublePlant("tall_allium");
    public static final Block TALL_PINK_ALLIUM = new BYGBlockProperties.BYGDoublePlant("tall_pink_allium");
    public static final Block ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BYGAllium("allium_flower_bush");
    public static final Block ALPINE_BELLFLOWER = createFlower("alpine_bellflower");
    public static final Block AMARANTH = new BYGBlockProperties.BYGAmaranth("amaranth");
    public static final Block ANGELICA = createFlower("angelica");
    public static final Block AZALEA = new BYGBlockProperties.BYGDoublePlant("azalea");
    public static final Block BEGONIA = createFlower("begonia");
    public static final Block BISTORT = createFlower("bistort");
    public static final Block BLUE_SAGE = createFlower("blue_sage");
    public static final Block CALIFORNIA_POPPY = createFlower("california_poppy");
    public static final Block CROCUS = createFlower("crocus");
    public static final Block BLACK_ROSE = createFlower("black_rose");
    public static final Block CYAN_AMARANTH = new BYGBlockProperties.BYGAmaranth("cyan_amaranth");
    public static final Block CYAN_ROSE = createFlower("cyan_rose");
    public static final Block CYAN_TULIP = createFlower("cyan_tulip");
    public static final Block DAFFODIL = createFlower("daffodil");
    public static final Block DELPHINIUM = new BYGBlockProperties.BYGDoublePlant("delphinium");
    public static final Block FAIRY_SLIPPER = new BYGBlockProperties.BYGFairySlipperFlower("fairy_slipper");
    public static final Block FIRECRACKER_FLOWER_BUSH = createFlower("firecracker_flower_bush");
    public static final Block FOXGLOVE = new BYGBlockProperties.BYGDoublePlant("foxglove");
    public static final Block GOLDEN_SPINED_CACTUS = new BYGBlockProperties.BYGDesertPlant("golden_spined_cactus");
    public static final Block GREEN_TULIP = createFlower("green_tulip");
    public static final Block GUZMANIA = createFlower("guzmania");
    public static final Block INCAN_LILY = createFlower("incan_lily");
    public static final Block IRIS = createFlower("iris");
    public static final Block JAPANESE_ORCHID = new BYGBlockProperties.BYGDoublePlant("japanese_orchid");
    public static final Block KOVAN_FLOWER = createFlower("kovan_flower");
    public static final Block LAZARUS_BELLFLOWER = createFlower("lazarus_bellflower");
    public static final Block LOLIPOP_FLOWER = createFlower("lolipop_flower");
    public static final Block MAGENTA_AMARANTH = new BYGBlockProperties.BYGAmaranth("magenta_amaranth");
    public static final Block MAGENTA_TULIP = createFlower("magenta_tulip");
    public static final Block ORANGE_AMARANTH = new BYGBlockProperties.BYGAmaranth("orange_amaranth");
    public static final Block ORANGE_DAISY = createFlower("orange_daisy");
    public static final Block ORSIRIA_ROSE = createFlower("osiria_rose");
    public static final Block PEACH_LEATHER_FLOWER = createFlower("peach_leather_flower");
    public static final Block PINK_ALLIUM = createFlower("pink_allium");
    public static final Block PINK_ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BYGPinkAllium("pink_allium_flower_bush");
    public static final Block PINK_ANEMONE = createFlower("pink_anemone");
    public static final Block PINK_DAFFODIL = createFlower("pink_daffodil");
    public static final Block PINK_ORCHID = createFlower("pink_orchid");
    public static final Block PRAIRIE_GRASS = new BYGBlockProperties.BYGPrairieGrass("prairie_grass");
    public static final Block PROTEA_FLOWER = createFlower("protea_flower");
    public static final Block PURPLE_AMARANTH = new BYGBlockProperties.BYGAmaranth("purple_amaranth");
    public static final Block PURPLE_ORCHID = createFlower("purple_orchid");
    public static final Block PURPLE_SAGE = createFlower("purple_sage");
    public static final Block PURPLE_TULIP = createFlower("purple_tulip");
    public static final Block RED_CORNFLOWER = createFlower("red_cornflower");
    public static final Block RED_ORCHID = createFlower("red_orchid");
    public static final Block RICHEA = createFlower("richea");
    public static final Block ROSE = createFlower("rose");
    public static final Block SNOWDROPS = new BYGBlockProperties.BYGSnowyPlant("snowdrops");
    public static final Block SILVER_VASE_FLOWER = createFlower("silver_vase_flower");
    public static final Block TORCH_GINGER = createFlower("torch_ginger");
    public static final Block VIOLET_LEATHER_FLOWER = createFlower("violet_leather_flower");
    public static final Block WHITE_ANEMONE = createFlower("white_anemone");
    public static final Block WHITE_SAGE = createFlower("white_sage");
    public static final Block WINTER_CYCLAMEN = new BYGBlockProperties.BYGSnowyPlant("winter_cyclamen");
    public static final Block WINTER_ROSE = new BYGBlockProperties.BYGSnowyPlant("winter_rose");
    public static final Block WINTER_SCILLA = new BYGBlockProperties.BYGSnowyPlant("winter_scilla");
    public static final Block YELLOW_DAFFODIL = createFlower("yellow_daffodil");
    public static final Block YELLOW_TULIP = createFlower("yellow_tulip");

    public static final Block OVERGROWN_DACITE = new BYGBlockProperties.BlockOvergrownDaciteBlock("overgrown_dacite");
    public static final Block OVERGROWN_STONE = new BYGBlockProperties.BlockOvergrownStoneBlock("overgrown_stone");
    public static final Block OVERGROWN_CRIMSON_BLACKSTONE = new BYGBlockProperties.OvergrownCrimsonBlackstone("overgrown_crimson_blackstone");
    public static final Block OVERGROWN_NETHERRACK = new BYGBlockProperties.OvergrownNetherrack("overgrown_netherrack");
    public static final Block IVIS_PHYLIUM = new BYGBlockProperties.BYGIvisPhylium("ivis_phylium");
    public static final Block EMBUR_NYLIUM = new BYGBlockProperties.BYGEmberNylium("embur_nylium");
    public static final Block SYTHIAN_NYLIUM = new BYGBlockProperties.BYGSythianNylium("sythian_nylium");
    public static final Block MEADOW_GRASSBLOCK = new BYGBlockProperties.BYGMeadowGrass("meadow_grass_block");


    static Block createFence(String id) {
        Block fence = new FenceBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0f, 3.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), fence);
        return fence;
    }

    static Block createFenceGate(String id) {
        Block fenceGate = new FenceGateBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0f, 3.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), fenceGate);
        return fenceGate;
    }

    static Block createSand(int dustColor, String id) {
        Block sandBlock = new SandBlock(dustColor, Block.Properties.create(Material.SAND).sound(SoundType.SAND).hardnessAndResistance(0.2f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), sandBlock);
        return sandBlock;
    }

    static Block createWoodSlab(String id) {
        Block woodSlab = new SlabBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0f, 3.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), woodSlab);
        return woodSlab;
    }

    static Block createStoneSlab(String id) {
        Block stoneSlab = new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0f, 6.0f).harvestTool(ToolType.PICKAXE));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), stoneSlab);
        return stoneSlab;
    }

    static Block createStoneWall(String id) {
        Block stoneWall = new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0f, 6.0f).harvestTool(ToolType.PICKAXE));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), stoneWall);
        return stoneWall;
    }

    static Block createWoodPressurePlate(String id) {
        Block woodPressurePlate = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), woodPressurePlate);
        return woodPressurePlate;
    }

    static Block createWoodStairs(String id) {
        Block woodStairs = new StairsBlock(Registry.BLOCK.getOrDefault(new ResourceLocation(BYG.MOD_ID, id.replace("_stairs", "planks"))).getDefaultState(), Block.Properties.from(Blocks.OAK_PLANKS).sound(SoundType.WOOD).hardnessAndResistance(2.0f, 3.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), woodStairs);
        return woodStairs;
    }

    static Block createTrapDoor(String id) {
        Block trapDoor = new TrapDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).hardnessAndResistance(2.0f, 3.0f).notSolid());
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), trapDoor);
        return trapDoor;
    }

    static Block createCraftingTable(String id) {
        Block trapDoor = new BYGCraftingTableBlock(Block.Properties.from(Blocks.CRAFTING_TABLE));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), trapDoor);
        return trapDoor;
    }

    static Block createWoodButton(String id) {
        Block woodButton = new WoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), woodButton);
        return woodButton;
    }

    static Block createBookshelf(String id) {
        Block bookShelf = new BookshelfBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).hardnessAndResistance(2.0f, 3.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), bookShelf);
        return bookShelf;
    }

    static Block createDoor(String id) {
        Block door = new DoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).hardnessAndResistance(2.0f, 3.0f).notSolid());
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), door);
        return door;
    }

    static Block createPlanks(String id) {
        Block planks = new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).hardnessAndResistance(2.0f, 3.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), planks);
        return planks;
    }

    static Block createWood(String id) {
        Block wood = new RotatedPillarBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), wood);
        return wood;
    }

    static Block createStrippedLog(String id) {
        Block strippedLog = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), strippedLog);
        return strippedLog;
    }

    static Block createLog(String id) {
        Block log = new RotatedPillarBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0f));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), log);
        return log;
    }

    static Block createFlower(String id) {
        Block flower = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.0f).doesNotBlockMovement().notSolid());
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), flower);
//        createPottedBlock(flower, "potted_" + id);
        return flower;
    }

    static Block createSapling(BYGTree tree, String id) {
        Block sapling = new BYGSapling(Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.0f).doesNotBlockMovement().tickRandomly(), tree);
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), sapling);
//        createPottedBlock(sapling, "potted_" + id);
        return sapling;
    }

    public static void createPottedBlock(Block blockForPot, String id) {
        Block flowerPot = new FlowerPotBlock(blockForPot, AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid());
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), flowerPot);
        flowerPotBlocks.add(flowerPot);
    }

    static Block createLeaves(String id) {
        Block leaves = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid().harvestTool(ToolType.HOE));
        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), leaves);
        return leaves;
    }
}
