
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.henkei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.henkei.HenkeiMod;

public class HenkeiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HenkeiMod.MODID);
	public static final RegistryObject<Item> SAKURA_LEAVES = block(HenkeiModBlocks.SAKURA_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAKURA_LOG = block(HenkeiModBlocks.SAKURA_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
