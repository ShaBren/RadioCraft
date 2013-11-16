package com.shabren.radiocraft.client;

import com.shabren.radiocraft.RadioCraft;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ClientPacketHandler implements IPacketHandler
{

	public ClientPacketHandler()
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
		RadioCraft.log.info( "Client got a test packet!" );
	}

}
