/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;
import net.minecraft.core.registries.BuiltInRegistries;

import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

@EventBusSubscriber
public class KrontixzsFarmingModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, KrontixzsFarmingMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> BLOOD_SHUGAR = REGISTRY.register("blood_shugar",
			() -> new RangedAttribute("attribute.krontixzs_farming.blood_shugar", 100d, 0d, 300d).setSyncable(true).setSentiment(Attribute.Sentiment.NEGATIVE));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, BLOOD_SHUGAR);
	}
}