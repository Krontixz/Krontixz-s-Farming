/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.DefaultAttributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import io.github.krontixz.krontixzsfarming.mixin.AttributeSupplierAccessor;
import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

public class KrontixzsFarmingModAttributes {
	public static Holder<Attribute> BLOOD_SHUGAR;

	public static void load() {
		BLOOD_SHUGAR = register("blood_shugar", new RangedAttribute("attribute.krontixzs_farming.blood_shugar", 100d, 0d, 300d).setSyncable(true).setSentiment(Attribute.Sentiment.NEGATIVE));
		FabricDefaultAttributeRegistry.register(EntityType.PLAYER, addAttributeToEntity(DefaultAttributes.getSupplier(EntityType.PLAYER), EntityType.PLAYER, KrontixzsFarmingModAttributes.BLOOD_SHUGAR));
	}

	private static AttributeSupplier addAttributeToEntity(AttributeSupplier existingSupplier, EntityType<? extends LivingEntity> entityType, Holder<Attribute> newAttribute) {
		AttributeSupplier.Builder builder = AttributeSupplier.builder();
		AttributeSupplierAccessor accessor = (AttributeSupplierAccessor) existingSupplier;
		accessor.getInstances().forEach((attribute, instance) -> {
			builder.add(attribute, instance.getBaseValue());
		});
		return builder.add(newAttribute).build();
	}

	private static Holder<Attribute> register(String registryname, Attribute element) {
		return Registry.registerForHolder(BuiltInRegistries.ATTRIBUTE, Identifier.fromNamespaceAndPath(KrontixzsFarmingMod.MODID, registryname), element);
	}
}