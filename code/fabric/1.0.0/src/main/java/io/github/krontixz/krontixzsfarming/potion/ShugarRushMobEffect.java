package io.github.krontixz.krontixzsfarming.potion;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;

import io.github.krontixz.krontixzsfarming.init.KrontixzsFarmingModAttributes;
import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

public class ShugarRushMobEffect extends MobEffect {
	public ShugarRushMobEffect() {
		super(MobEffectCategory.NEUTRAL, -5959150, ParticleTypes.CRIMSON_SPORE);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.splash_potion.break")));
		this.addAttributeModifier(KrontixzsFarmingModAttributes.BLOOD_SHUGAR, Identifier.fromNamespaceAndPath(KrontixzsFarmingMod.MODID, "effect.shugar_rush_0"), 15, AttributeModifier.Operation.ADD_VALUE);
	}
}