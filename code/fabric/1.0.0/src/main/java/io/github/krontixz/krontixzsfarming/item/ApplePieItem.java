package io.github.krontixz.krontixzsfarming.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import io.github.krontixz.krontixzsfarming.procedures.ApplePieEatingLogicProcedure;

public class ApplePieItem extends Item {
	public ApplePieItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(5f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		ApplePieEatingLogicProcedure.execute(entity);
		return retval;
	}
}