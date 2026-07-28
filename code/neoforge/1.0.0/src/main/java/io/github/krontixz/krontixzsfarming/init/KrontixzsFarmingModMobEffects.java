/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import io.github.krontixz.krontixzsfarming.potion.ShugarRushMobEffect;
import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

public class KrontixzsFarmingModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, KrontixzsFarmingMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> SHUGAR_RUSH = REGISTRY.register("shugar_rush", ShugarRushMobEffect::new);
}