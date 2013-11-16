package com.shabren.radiocraft;

import java.util.logging.Logger;

import com.shabren.radiocraft.client.ClientPacketHandler;
import com.shabren.radiocraft.client.ClientTickHandler;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod( modid = "RadioCraft", name = "RadioCraft", version = "0.1.0" )
@NetworkMod( clientSideRequired = true, serverSideRequired = true,
	clientPacketHandlerSpec = @NetworkMod.SidedPacketHandler( channels = { "RadioCraft-Test" }, packetHandler = ClientPacketHandler.class ), 
	serverPacketHandlerSpec = @NetworkMod.SidedPacketHandler( channels = { "RadioCraft-Test" }, packetHandler = ServerPacketHandler.class )
)
public class RadioCraft
{
	@Instance( value = "RadioCraft" )
	public static RadioCraft instance;

	@SidedProxy( clientSide = "com.shabren.radiocraft.client.ClientProxy", serverSide = "com.shabren.radiocraft.CommonProxy" )
	public static CommonProxy proxy;

	public static Logger log;

	private static Item handheldRadio;

	@EventHandler
	public void preInit( FMLPreInitializationEvent event )
	{
		log = event.getModLog();

		handheldRadio = new HandheldRadio( 23370 );
	}

	@EventHandler
	public void load( FMLInitializationEvent event )
	{
		proxy.registerRenderers();

		LanguageRegistry.addName( handheldRadio, "Handheld Radio" );

		TickRegistry.registerTickHandler( new ClientTickHandler(), Side.CLIENT );
		TickRegistry.registerTickHandler( new ServerTickHandler(), Side.SERVER );
	}

	@EventHandler
	public void postInit( FMLPostInitializationEvent event )
	{
	}
}