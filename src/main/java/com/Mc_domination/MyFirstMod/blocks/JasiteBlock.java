package com.Mc_domination.MyFirstMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class JasiteBlock extends BlockBase {
	public JasiteBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(8.0F); //ores = 3, blocks = 5(not gold)
		setResistance(50.0F); //  https://minecraft.gamepedia.com/Explosion#Blast_resistance
		setHarvestLevel("pickaxe", 2); //0 = wooden, 1 = stone, 2 = iron, and 3 = diamond
		//setLightLevel(1.0F);
		//setLightOpacity(1); //All light goes through. I won't be using it.
		//setBlockUnbreakable(1); //Unused.
	}
}
