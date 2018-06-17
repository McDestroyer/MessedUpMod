package com.Mc_domination.MyFirstMod.items;

import com.Mc_domination.MyFirstMod.Main;
import com.Mc_domination.MyFirstMod.init.ModItems;
import com.Mc_domination.MyFirstMod.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
