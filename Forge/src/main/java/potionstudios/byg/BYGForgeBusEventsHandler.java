package potionstudios.byg;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import potionstudios.byg.common.BYGHoeables;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BYGForgeBusEventsHandler {
    static final Object2IntMap<Item> BURN_TIMES = new Object2IntOpenHashMap<>();

    public static final Set<ResourceLocation> REGISTERED_PROFESSIONS = new HashSet<>();

    @SubscribeEvent
    public static void onBurnTime(final FurnaceFuelBurnTimeEvent event) {
        Item item = event.getItemStack().getItem();
        if (BURN_TIMES.containsKey(item)) {
            event.setBurnTime(BURN_TIMES.getInt(item));
        }
    }

    @SubscribeEvent
    public static void appendBYGHoeTillables(BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction() == ToolActions.HOE_TILL) {
            if (event.getHeldItemStack().getItem() instanceof HoeItem) {
                Pair<Predicate<UseOnContext>, BlockState> pair = BYGHoeables.TILLABLES_FORGE.get(event.getFinalState().getBlock());
                if (pair != null) {
                    if (pair.getFirst().test(event.getContext())) {
                        event.setFinalState(pair.getSecond());
                    }
                }

            }
        }
    }


    @SubscribeEvent
    public static void registerCommands(final RegisterCommandsEvent event) {
        BYG.attachCommands(event.getDispatcher(), event.getCommandSelection());
    }
}