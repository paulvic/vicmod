package com.example.paulvic.vicmod;

import com.example.paulvic.vicmod.help.RegisterHelper;
import com.example.paulvic.vicmod.blocks.VicModBlock;

import net.minecraft.block.Block;

public class ModBlocks {

	public static Block vicBlocky = new VicModBlock().setBlockName("vicBlocky");
	
	public static void init() {
		RegisterHelper.registerBlock(vicBlocky);
	}
}
