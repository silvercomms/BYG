package potionstudios.byg.common.block;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FungusBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class BYGFungusBlock extends FungusBlock {

    private final TagKey<Block> groundTag;

    public BYGFungusBlock(Properties $$0, TagKey<Block> groundTag) {
        super($$0, null, null);
        this.groundTag = groundTag;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return state.is(this.groundTag);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader blockGetter, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel serverLevel, RandomSource random, BlockPos pos, BlockState state) {
    }

}
