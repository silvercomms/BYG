package potionstudios.byg.datagen.providers.loot;

import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import potionstudios.byg.common.registration.BYGBlockFamilies;
import potionstudios.byg.common.registration.BYGBlockFamily;
import potionstudios.byg.common.entity.boat.BYGBoat;

import java.util.function.BiConsumer;

import static net.minecraft.world.level.storage.loot.entries.LootItem.lootTableItem;
import static net.minecraft.world.level.storage.loot.providers.number.ConstantValue.exactly;

public class BYGEntityLootProvider extends EntityLootSubProvider {

    protected BYGEntityLootProvider(FeatureFlagSet pEnabledFeatures) {
        super(pEnabledFeatures);
    }

    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
        for (final BYGBlockFamily type : BYGBlockFamilies.woodFamilyMap.values()) {
            for (boolean isChest : new Boolean[]{true, false}) {
                var item = isChest ? type.get(BYGBlockFamily.ItemVariant.CHEST_BOAT)
                        : type.get(BYGBlockFamily.ItemVariant.BOAT);
                if (item == null) {
                    return;
                }
                consumer.accept(BYGBoat.getLootLocation(type, isChest, false), LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(item))));
                var loot = LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(exactly(2))
                                .add(lootTableItem(Items.STICK)))
                        .withPool(LootPool.lootPool().setRolls(exactly(3))
                                .add(lootTableItem(type.get(BYGBlockFamily.BlockVariant.PLANKS))));
                if (isChest) {
                    loot.withPool(LootPool.lootPool().setRolls(exactly(1))
                            .add(lootTableItem(Items.CHEST)));
                }

                consumer.accept(BYGBoat.getLootLocation(type, isChest, true), loot);
            }
        }
    }

    @Override
    public void generate() {

    }
}
