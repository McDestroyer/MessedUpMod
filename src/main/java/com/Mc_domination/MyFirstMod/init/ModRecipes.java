package com.Mc_domination.MyFirstMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.JASITE_BLOCK, new ItemStack(ModItems.JASITE_GEM, 1), 1.5F);
		//                                    INPUT                               OUTPUT  COUNT  XP
		//ModBlocks, Blocks, ModItems, and Items are the 4 input and output types.
	}

}
