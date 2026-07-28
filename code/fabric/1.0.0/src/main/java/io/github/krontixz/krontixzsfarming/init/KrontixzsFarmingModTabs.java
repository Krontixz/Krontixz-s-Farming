/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.krontixz.krontixzsfarming.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class KrontixzsFarmingModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(tabData -> {
			tabData.accept(KrontixzsFarmingModItems.APPLE_PIE);
			tabData.accept(KrontixzsFarmingModItems.STRAWBERRY);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(tabData -> {
			tabData.accept(KrontixzsFarmingModBlocks.STRAWBERRY_PLANT.asItem());
		});
	}
}