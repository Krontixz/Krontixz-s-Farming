package io.github.krontixz.krontixzsfarming.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class StrawberryPlantBlock extends SugarCaneBlock implements BonemealableBlock {
	public StrawberryPlantBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollision().ignitedByLava().pushReaction(PushReaction.DESTROY));
		FlammableBlockRegistry.getDefaultInstance().add(this, 100, 60);
	}

	private boolean canPlantTypeSurvive(BlockState state, LevelReader world, BlockPos pos) {
		return state.is(Blocks.FARMLAND);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader world, BlockPos pos) {
		BlockPos posbelow = pos.below();
		BlockState statebelow = world.getBlockState(posbelow);
		if (this.canPlantTypeSurvive(statebelow, world, posbelow))
			return true;
		return super.canSurvive(blockstate, world, pos);
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		if (world.isEmptyBlock(pos.above())) {
			int i = 1;
			for (; world.getBlockState(pos.below(i)).is(this); ++i);
			if (i < 3) {
				int j = blockstate.getValue(AGE);
				if (j == 15) {
					world.setBlockAndUpdate(pos.above(), defaultBlockState());
					world.setBlock(pos, blockstate.setValue(AGE, 0), 4);
				} else {
					world.setBlock(pos, blockstate.setValue(AGE, j + 1), 4);
				}
			}
		}
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
	}
}