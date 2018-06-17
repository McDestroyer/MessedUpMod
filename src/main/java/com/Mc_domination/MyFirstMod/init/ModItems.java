package com.Mc_domination.MyFirstMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Mc_domination.MyFirstMod.items.ItemBase;
import com.Mc_domination.MyFirstMod.items.tools.ToolAxe;
import com.Mc_domination.MyFirstMod.items.tools.ToolHoe;
import com.Mc_domination.MyFirstMod.items.tools.ToolPickaxe;
import com.Mc_domination.MyFirstMod.items.tools.ToolSpade;
import com.Mc_domination.MyFirstMod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_JASITE_GEM = EnumHelper.addToolMaterial("material_jasite_gem", 4, 2250, 18.0F, 8.0F, 30);
	
	//Items
	public static final Item JASITE_GEM = new ItemBase("jasite_gem");
	
	//Tools
	public static final ItemSword JASITE_SWORD = new ToolSword("jasite_sword", MATERIAL_JASITE_GEM);
	public static final ItemSpade JASITE_SHOVEL = new ToolSpade("jasite_shovel", MATERIAL_JASITE_GEM);
	public static final ItemPickaxe JASITE_PICKAXE = new ToolPickaxe("jasite_pickaxe", MATERIAL_JASITE_GEM);
	public static final ItemAxe JASITE_AXE = new ToolAxe("jasite_axe", MATERIAL_JASITE_GEM);
	public static final ItemHoe JASITE_HOE = new ToolHoe("jasite_hoe", MATERIAL_JASITE_GEM);
}
