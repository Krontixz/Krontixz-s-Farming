package io.github.krontixz.krontixzsfarming.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.Identifier;

import io.github.krontixz.krontixzsfarming.init.KrontixzsFarmingModAttributes;

public class ApplePieEatingLogicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(Identifier.parse("krontixzs_farming:applepie_modifier"), 35, AttributeModifier.Operation.ADD_VALUE);
			if (!_entity.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR).hasModifier(modifier.id())) {
				_entity.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR).addPermanentModifier(modifier);
			}
		}
	}
}