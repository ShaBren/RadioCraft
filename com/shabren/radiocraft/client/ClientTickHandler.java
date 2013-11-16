package com.shabren.radiocraft.client;

import java.util.EnumSet;

import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.network.PacketDispatcher;

public class ClientTickHandler implements ITickHandler
{

	public ClientTickHandler()
	{
	}

	@Override
	public void tickStart( EnumSet< TickType > type, Object... tickData )
	{
	}

	@Override
	public void tickEnd( EnumSet< TickType > type, Object... tickData )
	{
		/*Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = "RadioCraft-Test";
		packet.length = 0;

		PacketDispatcher.sendPacketToServer( packet );*/
	}

	@Override
	public EnumSet< TickType > ticks()
	{
		return EnumSet.of( TickType.PLAYER );
	}

	@Override
	public String getLabel()
	{
		return "ClientTickHandler";
	}

}
