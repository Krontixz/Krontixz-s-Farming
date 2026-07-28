package io.github.krontixz.krontixzsfarming.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.core.Holder;

import java.util.Map;

@Mixin(AttributeSupplier.class)
public interface AttributeSupplierAccessor {
	@Accessor("instances")
	@Mutable
	Map<Holder<Attribute>, AttributeInstance> getInstances();
}