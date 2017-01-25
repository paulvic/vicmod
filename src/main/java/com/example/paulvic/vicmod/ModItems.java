package com.example.paulvic.vicmod;

import com.example.paulvic.vicmod.help.RegisterHelper;
import com.example.paulvic.vicmod.items.VicModItem;

import net.minecraft.item.Item;

public class ModItems {
	
	public static Item vicIngot = new VicModItem().setUnlocalizedName("vicIngot");
	
	public static void init() {
		RegisterHelper.registerItem(vicIngot);
	}
	
}
