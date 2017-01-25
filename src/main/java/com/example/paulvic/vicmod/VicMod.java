package com.example.paulvic.vicmod;

import com.example.paulvic.vicmod.help.Reference;
import com.example.paulvic.vicmod.tabs.VicModTab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class VicMod {
	
	public static CreativeTabs vicModTab = new VicModTab("vicModTab");
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
