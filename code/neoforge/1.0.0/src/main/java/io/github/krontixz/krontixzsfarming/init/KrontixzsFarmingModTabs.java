/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import io.github.krontixz.krontixzsfarming.KrontixzsFarmingMod;

@EventBusSubscriber
public class KrontixzsFarmingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KrontixzsFarmingMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(KrontixzsFarmingModItems.APPLE_PIE.get());
			tabData.accept(KrontixzsFarmingModItems.STRAWBERRY.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(KrontixzsFarmingModBlocks.STRAWBERRY_PLANT.get().asItem());
		}
	}
}