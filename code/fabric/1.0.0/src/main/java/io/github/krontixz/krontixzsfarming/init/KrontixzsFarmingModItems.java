/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

import io.github.krontixz.krontixzsfarming.item.StrawberryItem;
import io.github.krontixz.krontixzsfarming.item.ButterItem;
import io.github.krontixz.krontixzsfarming.item.BakedAppleItem;
import io.github.krontixz.krontixzsfarming.item.ApplePieItem;
import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

public class KrontixzsFarmingModItems {
	public static Item APPLE_PIE;
	public static Item BAKED_APPLE;
	public static Item BUTTER;
	public static Item CHEESE_BLOCK;
	public static Item STRAWBERRY;
	public static Item STRAWBERRY_PLANT;

	public static void load() {
		APPLE_PIE = register("apple_pie", ApplePieItem::new);
		BAKED_APPLE = register("baked_apple", BakedAppleItem::new);
		BUTTER = register("butter", ButterItem::new);
		CHEESE_BLOCK = block(KrontixzsFarmingModBlocks.CHEESE_BLOCK, "cheese_block");
		STRAWBERRY = register("strawberry", StrawberryItem::new);
		STRAWBERRY_PLANT = block(KrontixzsFarmingModBlocks.STRAWBERRY_PLANT, "strawberry_plant");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(KrontixzsFarmingMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(KrontixzsFarmingMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}