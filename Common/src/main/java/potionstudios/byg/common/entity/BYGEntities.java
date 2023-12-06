package potionstudios.byg.common.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import potionstudios.byg.BYG;
import potionstudios.byg.common.entity.boat.BYGBoat;
import potionstudios.byg.common.entity.boat.BYGChestBoat;
import potionstudios.byg.mixin.access.SpawnPlacementsAccess;
import potionstudios.byg.reg.RegistrationProvider;
import potionstudios.byg.reg.RegistryObject;

public class BYGEntities {
    public static final RegistrationProvider<EntityType<?>> PROVIDER = RegistrationProvider.get(Registries.ENTITY_TYPE, BYG.MOD_ID);

    public static final RegistryObject<EntityType<BYGBoat>> BOAT = createEntity("boat", EntityType.Builder.<BYGBoat>of(BYGBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F));
    public static final RegistryObject<EntityType<BYGChestBoat>> CHEST_BOAT = createEntity("chest_boat", EntityType.Builder.<BYGChestBoat>of(BYGChestBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10));

    public static <E extends Entity> RegistryObject<EntityType<E>> createEntity(String id, EntityType.Builder<E> entityType) {
        return PROVIDER.register(id, () -> entityType.build(BYG.MOD_ID + ":" + id));
    }

    public static void registerSpawnPlacements(){
    }

    public static void loadClass() {}
}