/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import io.github.krontixz.krontixzsfarming.block.StrawberryPlantBlock;
import io.github.krontixz.krontixzsfarming.block.CheeseBlockBlock;
import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

public class KrontixzsFarmingModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(KrontixzsFarmingMod.MODID);
	public static final DeferredBlock<Block> CHEESE_BLOCK;
	public static final DeferredBlock<Block> STRAWBERRY_PLANT;
	static {
		CHEESE_BLOCK = register("cheese_block", CheeseBlockBlock::new);
		STRAWBERRY_PLANT = register("strawberry_plant", StrawberryPlantBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}