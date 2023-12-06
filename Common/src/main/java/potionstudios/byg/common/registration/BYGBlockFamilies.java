package potionstudios.byg.common.registration;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.NotNull;
import potionstudios.byg.BYG;
import potionstudios.byg.common.block.BYGBlockProperties;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.block.FruitBlock;
import potionstudios.byg.common.item.BaobabFruitItem;
import potionstudios.byg.mixin.access.BlockSetTypeAccess;
import potionstudios.byg.mixin.access.SimpleParticleTypeAccess;
import potionstudios.byg.mixin.access.WoodTypeAccess;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BYGBlockFamilies {

    public static Map<String, BYGBlockFamily> woodFamilyMap = new HashMap<>();
    public static Map<String, BYGBlockFamily> blockFamilyMap = new HashMap<>();

    public static BYGBlockFamily ASPEN = register(new BYGBlockFamily.OrganicBuilder("aspen",
            getOverworldWoodType("aspen"), () -> MapColor.TERRACOTTA_YELLOW, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily BAOBAB = register(new BYGBlockFamily.OrganicBuilder("baobab",
            getOverworldWoodType("baobab"), () -> MapColor.TERRACOTTA_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .fruit("baobab_fruit_block", "baobab_fruit", "ripe_baobab_leaves",
                    (block) -> new BaobabFruitItem(block,
                            new Item.Properties().food(new FoodProperties.Builder().nutrition(3)
                                    .saturationMod(0.5f).alwaysEat().build())))
            .hangingSign()
            .leaves((id, family) -> BYGBlocks.createFruitLeaves(MapColor.COLOR_GREEN,
                    () -> family.get(BYGBlockFamily.BlockVariant.FRUIT_BLOCK).defaultBlockState()
                            .setValue(FruitBlock.AGE, 0), id, 0.01F))
            .floweringLeaves((s, family) -> BYGBlocks.createChangingLeaves(MapColor.COLOR_GREEN,
                    () -> (LeavesBlock) family.get(BYGBlockFamily.BlockVariant.FRUIT_LEAVES),
                    0.02F, "flowering_baobab_leaves"))
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily BLUE_ENCHANTED = register(new BYGBlockFamily.OrganicBuilder("blue_enchanted",
            getOverworldWoodType("blue_enchanted"), () -> MapColor.COLOR_BLUE, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .imbuedLog()
            .leaves((id, family) -> BYGBlocks.createGlowingLeaves(MapColor.COLOR_GREEN, 15, id))
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .strippables((consumer, family) -> consumer.accept(family.get(BYGBlockFamily.BlockVariant.IMBUED_LOG),
                    family.get(BYGBlockFamily.BlockVariant.LOG)))
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily CIKA = register(new BYGBlockFamily.OrganicBuilder("cika",
            getOverworldWoodType("cika"), () -> MapColor.TERRACOTTA_ORANGE, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily CYPRESS = register(new BYGBlockFamily.OrganicBuilder("cypress",
            getOverworldWoodType("cypress"), () -> MapColor.TERRACOTTA_LIGHT_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily EBONY = register(new BYGBlockFamily.OrganicBuilder("ebony",
            getOverworldWoodType("ebony"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily FIR = register(new BYGBlockFamily.OrganicBuilder("fir",
            getOverworldWoodType("fir"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily GREEN_ENCHANTED = register(new BYGBlockFamily.OrganicBuilder("green_enchanted",
            getOverworldWoodType("green_enchanted"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .imbuedLog()
            .leaves((id, family) -> BYGBlocks.createGlowingLeaves(MapColor.COLOR_GREEN, 15, id))
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .strippables((consumer, family) -> consumer.accept(family.get(BYGBlockFamily.BlockVariant.IMBUED_LOG),
                    family.get(BYGBlockFamily.BlockVariant.LOG)))
            .trapdoor()
            .wood()
    );


    public static BYGBlockFamily HOLLY = register(new BYGBlockFamily.OrganicBuilder("holly",
            getOverworldWoodType("holly"), () -> MapColor.TERRACOTTA_GREEN,BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .floweringLeaves((id, family) -> BYGBlocks.createLeaves(MapColor.TERRACOTTA_GREEN, "holly_berry_leaves"))
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily JOSHUA = register(new BYGBlockFamily.OrganicBuilder("joshua",
            getOverworldWoodType("joshua"), ()-> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .fruit("joshua_fruit_block", "joshua_fruit", "ripe_joshua_leaves",
                    (block) -> new Item(new Item.Properties()
                            .food(new FoodProperties.Builder()
                                    .nutrition(2).saturationMod(0.35f).build())))
            .leaves()
            .floweringLeaves((s, family) -> BYGBlocks.createChangingLeaves(MapColor.COLOR_GREEN,
                    () -> (LeavesBlock) family.get(BYGBlockFamily.BlockVariant.FRUIT_LEAVES),
                    0.02F, "flowering_joshua_leaves"))
            .processedFood("cooked_joshua_fruit", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5)
                            .saturationMod(0.4f).build())))
    );

    public static BYGBlockFamily MAPLE = register(new BYGBlockFamily.OrganicBuilder("maple",
            getOverworldWoodType("maple"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily RED_MAPLE = register(new BYGBlockFamily.OrganicBuilder("red_maple",
            getOverworldWoodType("red_maple"), () -> MapColor.COLOR_RED, BuiltinDimensionTypes.OVERWORLD
            ,false)
            .leafParticles(() -> SimpleParticleTypeAccess.byg_create(false), "red_maple_leaves")
            .leaves((id, family) -> BYGBlocks.createLeaves(MapColor.COLOR_RED, () ->
                    (ParticleOptions) family.get(BYGBlockFamily.ParticleVariant.LEAVES), id)
            )
    );

    public static BYGBlockFamily SILVER_MAPLE = register(new BYGBlockFamily.OrganicBuilder("silver_maple",
            getOverworldWoodType("silver_maple"), () -> MapColor.COLOR_LIGHT_GRAY, BuiltinDimensionTypes.OVERWORLD
            ,false)
            .leafParticles(() -> SimpleParticleTypeAccess.byg_create(false), "silver_maple_leaves")
            .leaves((id, family) -> BYGBlocks.createLeaves(MapColor.COLOR_LIGHT_GRAY, () ->
                    (ParticleOptions) family.get(BYGBlockFamily.ParticleVariant.LEAVES), id)
            )
    );

    public static BYGBlockFamily ORCHARD = register(new BYGBlockFamily.OrganicBuilder("orchard",
            getOverworldWoodType("orchard"), ()-> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , false)
            .fruit("apple_fruit_block", "", "ripe_orchard_leaves",
                    null)
            .leaves()
            .floweringLeaves((s, family) -> BYGBlocks.createChangingLeaves(MapColor.COLOR_GREEN,
                    () -> (LeavesBlock) family.get(BYGBlockFamily.BlockVariant.FRUIT_LEAVES),
                    0.02F, "flowering_orchard_leaves"))
    );

    public static BYGBlockFamily PALM = register(new BYGBlockFamily.OrganicBuilder("palm",
            getOverworldWoodType("palm"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily PINE = register(new BYGBlockFamily.OrganicBuilder("pine",
            getOverworldWoodType("pine"), () -> MapColor.TERRACOTTA_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily ARAUCARIA = register(new BYGBlockFamily.OrganicBuilder("araucaria",
            getOverworldWoodType("araucaria"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , false)
            .leaves()
    );

    public static BYGBlockFamily RAINBOW_EUCALYPTUS = register(new BYGBlockFamily.OrganicBuilder("rainbow_eucalyptus",
            getOverworldWoodType("rainbow_eucalyptus"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily REDWOOD = register(new BYGBlockFamily.OrganicBuilder("redwood",
            getOverworldWoodType("redwood"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily SAKURA_CHERRY = register(new BYGBlockFamily.OrganicBuilder("sakura_cherry",
            getOverworldWoodType("sakura_cherry"), () -> MapColor.COLOR_PINK, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily WHITE_SAKURA_CHERRY = register(new BYGBlockFamily.OrganicBuilder("white_cherry",
            getOverworldWoodType("white_cherry"), () -> MapColor.COLOR_PINK, BuiltinDimensionTypes.OVERWORLD
            ,false)
            .leafParticles(() -> SimpleParticleTypeAccess.byg_create(false), "white_cherry_blossom_leaves")
            .leaves((id, family) -> BYGBlocks.createLeaves(MapColor.COLOR_LIGHT_GRAY, () ->
                    (ParticleOptions) family.get(BYGBlockFamily.ParticleVariant.LEAVES), id)
            )
            .foliage()
    );

    public static BYGBlockFamily SKYRIS = register(new BYGBlockFamily.OrganicBuilder("skyris",
            getOverworldWoodType("skyris"), () -> MapColor.COLOR_PINK, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .fruit("green_apple_fruit_block", "green_apple", "green_apple_skyris_leaves",
                    (block) -> new BaobabFruitItem(block,
                            new Item.Properties().food(new FoodProperties.Builder().nutrition(3)
                                    .saturationMod(0.5f).alwaysEat().build())))
            .hangingSign()
            .leaves()
            .floweringLeaves((s, family) -> BYGBlocks.createChangingLeaves(MapColor.COLOR_PINK,
                    () -> (LeavesBlock) family.get(BYGBlockFamily.BlockVariant.FRUIT_LEAVES),
                    0.02F, "flowering_skyris_leaves"))
            .log()
            .processedFood("green_apple_pie", () ->
                    new Item(new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(6)
                                    .saturationMod(0.4f)
                                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 1.0F)
                                    .build())))
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .vine(BYGBlockProperties.BYGSkyrisVine::new, "skyris_vine")
            .wood()
    );

    public static BYGBlockFamily WHITE_MANGROVE = register(new BYGBlockFamily.OrganicBuilder("white_mangrove",
            getOverworldWoodType("white_mangrove"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily ZELKOVA = register(new BYGBlockFamily.OrganicBuilder("zelkova",
            getOverworldWoodType("zelkova"), () -> MapColor.TERRACOTTA_RED, BuiltinDimensionTypes.OVERWORLD
            , true)
            .boat()
            .bookshelf()
            .button()
            .chestBoat()
            .door()
            .fence()
            .fenceGate()
            .hangingSign()
            .leaves()
            .log()
            .pressurePlate()
            .sign()
            .slab()
            .stairs()
            .strippedLog()
            .strippedWood()
            .trapdoor()
            .wood()
    );

    public static BYGBlockFamily BROWN_ZELKOVA = register(new BYGBlockFamily.OrganicBuilder("brown_zelkova",
            getOverworldWoodType("brown_zelkova"), () -> MapColor.COLOR_GREEN, BuiltinDimensionTypes.OVERWORLD
            , false)
            .leaves()
    );


    private static BYGBlockFamily register(BYGBlockFamily.OrganicBuilder builder) {
        BYGBlockFamily bygBlockFamily = builder.build();
        woodFamilyMap.put(bygBlockFamily.getBaseName(), bygBlockFamily);
        return bygBlockFamily;
    }
    private static BYGBlockFamily register(BYGBlockFamily.InorganicBuilder inorganicBuilder) {
        BYGBlockFamily bygBlockFamily = inorganicBuilder.build();
        blockFamilyMap.put(bygBlockFamily.getBaseName(), bygBlockFamily);
        return bygBlockFamily;
    }

    private static @NotNull WoodType getOverworldWoodType(String name){
        String id = BYG.createLocation(name).toString().replace(':', '/');
        WoodType woodType = WoodTypeAccess.byg_invokeRegister(new WoodType(id, new BlockSetType(id)));
        BlockSetTypeAccess.byg_invokeRegister(woodType.setType());
        return woodType;
    }

    private static @NotNull WoodType getNotOverworldWoodType(String name) {
        String id = BYG.createLocation(name).toString().replace(':', '/');
        WoodType woodType = new WoodType(id, new BlockSetType(id, true, SoundType.NETHER_WOOD,
                SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN,
                SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN,
                SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF,
                SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF,
                SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON), SoundType.NETHER_WOOD,
                SoundType.NETHER_WOOD_HANGING_SIGN, SoundEvents.NETHER_WOOD_FENCE_GATE_CLOSE,
                SoundEvents.NETHER_WOOD_FENCE_GATE_OPEN);
        BlockSetTypeAccess.byg_invokeRegister(woodType.setType());
        return woodType;
    }

    private static BlockSetType getBlockSetType(@NotNull Supplier<? extends BlockSetType> supplier) {
        BlockSetType blockSetType = supplier.get();
        BlockSetTypeAccess.byg_invokeRegister(blockSetType);
        return blockSetType;
    }

    @SuppressWarnings("empty")
    public static void register() {

    }
}
