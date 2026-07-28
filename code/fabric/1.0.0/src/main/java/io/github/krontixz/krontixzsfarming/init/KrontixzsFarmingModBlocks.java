/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

import io.github.krontixz.krontixzsfarming.block.StrawberryPlantBlock;
import io.github.krontixz.krontixzsfarming.block.CheeseBlockBlock;
import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

public class KrontixzsFarmingModBlocks {
	public static Block CHEESE_BLOCK;
	public static Block STRAWBERRY_PLANT;

	public static void load() {
		CHEESE_BLOCK = register("cheese_block", CheeseBlockBlock::new);
		STRAWBERRY_PLANT = register("strawberry_plant", StrawberryPlantBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(KrontixzsFarmingMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}