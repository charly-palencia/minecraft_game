package com.koombea.gamemin;

import com.koombea.gamemin.blocks.ModBlock;
import com.koombea.gamemin.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class GameMin {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlock.init();
		
	}
	
	@Mod.EventHandler
	public void init(FMLPreInitializationEvent event)
	{
	
	}
	
	@Mod.EventHandler
	public void postInit(FMLPreInitializationEvent event)
	{
	
	}
}
