package com.example.paulvic.vicmod.blocks;

import com.example.paulvic.vicmod.VicMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class VicModBlock extends Block {

	public VicModBlock() {
		super(Material.grass);
		this.setCreativeTab(VicMod.vicModTab);
	}
}


