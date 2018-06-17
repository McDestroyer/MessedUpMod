package com.Mc_domination.MyFirstMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Mc_domination.MyFirstMod.blocks.BlockBase;
import com.Mc_domination.MyFirstMod.blocks.JasiteBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS  = new ArrayList<Block>();
	
	//Blocks
	public static final Block JASITE_BLOCK = new JasiteBlock("jasite_block", Material.IRON);

}
