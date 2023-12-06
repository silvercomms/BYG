package potionstudios.byg.asm;

import com.chocohead.mm.api.ClassTinkerers;
import com.google.errorprone.annotations.Var;
import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class BygEarlyRiser implements Runnable {
    @Override
    public void run() {
        var mappingResolver = FabricLoader.getInstance().getMappingResolver();
        String dataFixersName = mappingResolver.mapClassName("intermediary", "net.minecraft.class_3551").replace('.', '/');
        String blockRenameFixName = mappingResolver.mapClassName("intermediary", "net.minecraft.class_3579").replace('.', '/');
        String addFixersName = mappingResolver.mapMethodName("intermediary", "net.minecraft.class_3551", "method_15451", "(Lcom/mojang/datafixers/DataFixerBuilder;)V");
        String createRenamerName = mappingResolver.mapMethodName("intermediary", "net.minecraft.class_3551", "method_30070", "(Ljava/util/Map;)Ljava/util/function/UnaryOperator;");
        String blockRenameFixCreateName = mappingResolver.mapMethodName("intermediary", "net.minecraft.class_3579", "method_15589", "(Lcom/mojang/datafixers/schemas/Schema;Ljava/lang/String;Ljava/util/function/Function;)Lcom/mojang/datafixers/DataFix;");
        ClassTinkerers.addTransformation(dataFixersName, classNode -> {
            for (var method : classNode.methods) {
                if (method.name.equals(addFixersName)) {
                    var iter = method.instructions.iterator(method.instructions.size() - 1);
                    var insn = iter.next();
                    while (insn.getOpcode() != Opcodes.RETURN) {
                        if (!iter.hasPrevious()) {
                            throw new IllegalStateException("Found no return in addFixers!");
                        }
                        insn = iter.previous();
                    }
                    iter.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    iter.add(new VarInsnNode(Opcodes.ALOAD, 198));
                    iter.add(new LdcInsnNode("Replace BYG cherry stuff with vanilla cherry stuff"));
                    iter.add(new FieldInsnNode(Opcodes.GETSTATIC, "potionstudios/byg/asm/BygDatafixer", "RENAMINGS", "Ljava/util/Map;"));
                    iter.add(new MethodInsnNode(Opcodes.INVOKESTATIC, dataFixersName, createRenamerName, "(Ljava/util/Map;)Ljava/util/function/UnaryOperator;"));
                    iter.add(new MethodInsnNode(Opcodes.INVOKESTATIC, blockRenameFixName, blockRenameFixCreateName, "(Lcom/mojang/datafixers/schemas/Schema;Ljava/lang/String;Ljava/util/function/Function;)Lcom/mojang/datafixers/DataFix;"));
                    iter.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "com/mojang/datafixers/DataFixerBuilder", "addFixer", "(Lcom/mojang/datafixers/DataFix;)V"));
                }
            }
        });
    }
}
