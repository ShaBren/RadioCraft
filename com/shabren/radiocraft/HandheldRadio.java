package com.shabren.radiocraft;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

public class HandheldRadio extends Item
{
	public HandheldRadio( int id )
	{
		super( id );

		setMaxStackSize( 64 );
		setCreativeTab( CreativeTabs.tabMisc );
		setUnlocalizedName( "handheldRadio" );
		setTextureName( "radiocraft:handheldRadio" );
		setHasSubtypes( true );
		setMaxDamage( 0 );

	}

	@Override
	public ItemStack onItemRightClick( ItemStack itemStack, World world, EntityPlayer player )
	{
		if ( itemStack.getItemDamage() == 1 )
		{
			RadioCraft.log.info( "Turned radio off" );

			itemStack.setItemDamage( 0 );

			world.playSoundAtEntity( player, "fireworks.launch", 1.0F, 1.0F );
		}
		else
		{
			RadioCraft.log.info( "Turned radio on" );

			itemStack.setItemDamage( 1 );

			world.playSoundAtEntity( player, "random.fuse", 1.0F, 1.0F );
		}

		return itemStack;
	}

	/*
	 * @Override public boolean onItemUse( ItemStack itemStack, EntityPlayer
	 * player, World world, int bx, int by, int bz, int side, float px, float
	 * py, float pz ) { return true; }
	 */
}
