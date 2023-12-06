package potionstudios.byg.core;

import potionstudios.byg.client.textures.renders.BYGParticleTypes;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.entity.BYGEntities;
import potionstudios.byg.common.item.BYGCreativeModeTabs;
import potionstudios.byg.common.item.BYGItems;
import potionstudios.byg.common.registration.BYGBlockFamilies;
import potionstudios.byg.common.sound.BYGSounds;
import potionstudios.byg.common.world.BYGDamageTypes;

public class BYGRegistry {
    public static void loadClasses() {
        BYGBlocks.loadClass();
        BYGItems.loadClass();
        BYGBlockFamilies.register();
        BYGCreativeModeTabs.loadClass();
        BYGEntities.loadClass();
        BYGParticleTypes.loadClass();
        BYGSounds.loadClass();
        BYGDamageTypes.loadClass();
    }
}
