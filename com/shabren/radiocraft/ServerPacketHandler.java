package com.shabren.radiocraft;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ServerPacketHandler implements IPacketHandler
{

	public ServerPacketHandler()
	{
	}

	@Override
	public void onPacketData( INetworkManager manager,
			Packet250CustomPayload packet, Player player )
	{
		if ( packet.channel.equals( "RadioCraft-Test" ) )
		{
			handleTestPacket( packet, player );
		}
	}
	
	protected void handleTestPacket( Packet250CustomPayload packet, Player player )
	{
		RadioCraft.log.info( "Server got a test packet!" );
	}

}
