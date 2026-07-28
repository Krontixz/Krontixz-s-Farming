package io.github.krontixz.krontixzsfarming.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CheeseBlockBlock extends Block {
	public CheeseBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SLIME_BLOCK).strength(3f, 10f).friction(0.3f).speedFactor(0.5f).jumpFactor(0.4f));
	}
}