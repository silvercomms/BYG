package potionstudios.byg.mixin.common;

import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import net.minecraft.util.datafix.DataFixers;
import net.minecraft.util.datafix.fixes.BlockRenameFix;
import org.checkerframework.checker.units.qual.A;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

@Mixin(DataFixers.class)
public abstract class DataFixersMixin {
    @Shadow @Final private static BiFunction<Integer, Schema, Schema> SAME_NAMESPACED;

    @Inject(method = "addFixers", at = @At("TAIL"))
    private static void byg$updateCherryWood(DataFixerBuilder $$0, CallbackInfo ci) {
        var schema = $$0.addSchema(3460, SAME_NAMESPACED);
        $$0.addFixer(BlockRenameFix.create(schema, "Convert BYG Cherry to Vanilla Cherry", str -> str.startsWith("byg:cherry") ? str.replace("byg", "minecraft") : str));
    }
}
