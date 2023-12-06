package potionstudios.byg.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import potionstudios.byg.BYGFabric;
import potionstudios.byg.client.textures.renders.BYGRenderTypes;
import potionstudios.byg.mixin.access.client.ItemBlockRenderTypeAccess;
import potionstudios.byg.mixin.client.access.AccessEntityRenderers;

public class BYGFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BYGClient.load();
        BYGClient.threadSafeLoad();
        BYGRenderTypes.renderTypes(blockRenderTypeMap -> ItemBlockRenderTypeAccess.byg_getTYPE_BY_BLOCK().putAll(blockRenderTypeMap));

        BYGEntityRenderers.register(AccessEntityRenderers::byg_register);

        BYGClient.registerParticles(new BYGClient.ParticleStrategy() {
            @Override
            public <T extends ParticleOptions> void register(ParticleType<T> particle, ParticleEngine.SpriteParticleRegistration<T> provider) {
                ParticleFactoryRegistry.getInstance().register(particle, provider::create);
            }
        });
        BYGFabric.afterRegistriesFreeze();
    }
}