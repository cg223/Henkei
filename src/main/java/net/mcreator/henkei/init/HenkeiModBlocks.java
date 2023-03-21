
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.henkei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.henkei.block.SakuraLogBlock;
import net.mcreator.henkei.block.SakuraLeavesBlock;
import net.mcreator.henkei.HenkeiMod;

public class HenkeiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HenkeiMod.MODID);
	public static final RegistryObject<Block> SAKURA_LEAVES = REGISTRY.register("sakura_leaves", () -> new SakuraLeavesBlock());
	public static final RegistryObject<Block> SAKURA_LOG = REGISTRY.register("sakura_log", () -> new SakuraLogBlock());
}
