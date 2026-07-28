package io.github.krontixz.krontixzsfarming.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BakedAppleItem extends Item {
	public BakedAppleItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(1f).build()));
	}
}