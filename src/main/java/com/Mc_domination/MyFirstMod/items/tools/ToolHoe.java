package com.Mc_domination.MyFirstMod.items.tools;

import com.Mc_domination.MyFirstMod.Main;
import com.Mc_domination.MyFirstMod.init.ModItems;
import com.Mc_domination.MyFirstMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolHoe extends ItemHoe implements IHasModel {
	
	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

} 