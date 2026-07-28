/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.function.Supplier;

import io.github.krontixz.krontixzsfarming.potion.ShugarRushMobEffect;
import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

public class KrontixzsFarmingModMobEffects {
	public static Holder<MobEffect> SHUGAR_RUSH;

	public static void load() {
		SHUGAR_RUSH = register("shugar_rush", ShugarRushMobEffect::new);
	}

	private static Holder<MobEffect> register(String registryname, Supplier<MobEffect> element) {
		return Holder.direct(Registry.register(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(KrontixzsFarmingMod.MODID, registryname), element.get()));
	}
}