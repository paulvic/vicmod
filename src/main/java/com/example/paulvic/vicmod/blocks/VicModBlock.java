package com.example.paulvic.vicmod.blocks;

import com.example.paulvic.vicmod.VicMod;
import com.example.paulvic.vicmod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class VicModBlock extends Block {

	public VicModBlock() {
		super(Material.glass);
		this.setCreativeTab(VicMod.vicModTab);
		this.setHardness(0.3f);
		this.setLightLevel(50.0f);
		this.setBlockTextureName(Reference.MODID + ":" + "vic_texture");
	}
}


