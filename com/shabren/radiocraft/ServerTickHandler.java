package com.shabren.radiocraft;

import java.util.EnumSet;

import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.network.PacketDispatcher;

public class ServerTickHandler implements ITickHandler
{

	public ServerTickHandler()
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

		PacketDispatcher.sendPacketToAllPlayers( packet );*/
	}

	@Override
	public EnumSet< TickType > ticks()
	{
		return EnumSet.of( TickType.WORLD );
	}

	@Override
	public String getLabel()
	{
		return "ServerTickHandler";
	}

}
