/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import io.github.krontixz.krontixzsfarming.item.StrawberryItem;
import io.github.krontixz.krontixzsfarming.item.ButterItem;
import io.github.krontixz.krontixzsfarming.item.BakedAppleItem;
import io.github.krontixz.krontixzsfarming.item.ApplePieItem;
import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

public class KrontixzsFarmingModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(KrontixzsFarmingMod.MODID);
	public static final DeferredItem<Item> APPLE_PIE;
	public static final DeferredItem<Item> BAKED_APPLE;
	public static final DeferredItem<Item> BUTTER;
	public static final DeferredItem<Item> CHEESE_BLOCK;
	public static final DeferredItem<Item> STRAWBERRY;
	public static final DeferredItem<Item> STRAWBERRY_PLANT;
	static {
		APPLE_PIE = register("apple_pie", ApplePieItem::new);
		BAKED_APPLE = register("baked_apple", BakedAppleItem::new);
		BUTTER = register("butter", ButterItem::new);
		CHEESE_BLOCK = block(KrontixzsFarmingModBlocks.CHEESE_BLOCK);
		STRAWBERRY = register("strawberry", StrawberryItem::new);
		STRAWBERRY_PLANT = block(KrontixzsFarmingModBlocks.STRAWBERRY_PLANT);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}