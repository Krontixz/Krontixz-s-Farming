package io.github.krontixz.krontixzsfarming.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

import io.github.krontixz.krontixzsfarming.init.KrontixzsFarmingModAttributes;

@EventBusSubscriber
public class BloodShugarLogicProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isSprinting()) {
			if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR))
				_livingEntity2.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR)
								? _livingEntity1.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR).getValue()
								: 0) - 0.015));
		} else {
			if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR))
				_livingEntity4.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR)
								? _livingEntity3.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR).getValue()
								: 0) - 0.005));
		}
		if ((entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR) ? _livingEntity5.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR).getValue() : 0) < 50
				&& !(entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(MobEffects.BLINDNESS))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 60, 3, false, false));
		} else if ((entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR)
				? _livingEntity9.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR).getValue()
				: 0) < 75 && !(entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(MobEffects.HUNGER))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 60, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MINING_FATIGUE, 60, 2, false, false));
		} else if ((entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR)
				? _livingEntity13.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR).getValue()
				: 0) < 240 && !(entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(MobEffects.NAUSEA))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 60, 3, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 60, 5, false, false));
		} else if ((entity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR)
				? _livingEntity17.getAttribute(KrontixzsFarmingModAttributes.BLOOD_SHUGAR).getValue()
				: 0) > 240 && !(entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(MobEffects.NAUSEA))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 60, 3, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 60, 5, false, false));
			{
				Entity _ent = entity;
				if (_ent.level() instanceof ServerLevel _serverLevel) {
					_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 3);
				}
			}
		}
	}
}