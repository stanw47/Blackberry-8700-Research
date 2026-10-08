// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 0
// ########################################################


package net.rim.device.internal.EScreens;


abstract public final class EScreen extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.EScreen ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final setActive( boolean ); // address: 0
	{
	invokenative setActive( boolean )
	}


static public final getScreenInfo( net.rim.device.internal.EScreens.EScreenInfo, boolean ); // address: 0
	{
	invokenative getScreenInfo( net.rim.device.internal.EScreens.EScreenInfo, boolean )
	}


static public final getItemInfo( net.rim.device.internal.EScreens.EScreenItem, net.rim.device.internal.EScreens.EScreenItemInfo ); // address: 0
	{
	invokenative getItemInfo( net.rim.device.internal.EScreens.EScreenItem, net.rim.device.internal.EScreens.EScreenItemInfo )
	}


static public final int getItemData( net.rim.device.internal.EScreens.EScreenItem, byte[] ); // address: 0
	{
	iinvokenative int getItemData( net.rim.device.internal.EScreens.EScreenItem, byte[] )
	}


static public final getMenuInfo( net.rim.device.internal.EScreens.EScreenItem, net.rim.device.internal.EScreens.EScreenMenuInfo ); // address: 0
	{
	invokenative getMenuInfo( net.rim.device.internal.EScreens.EScreenItem, net.rim.device.internal.EScreens.EScreenMenuInfo )
	}


static public final doAction( int, int, byte[] ); // address: 0
	{
	invokenative doAction( int, int, byte[] )
	}


static public final keyPressed( net.rim.device.internal.EScreens.EScreenItem, int ); // address: 0
	{
	invokenative keyPressed( net.rim.device.internal.EScreens.EScreenItem, int )
	}


static public final byte[] getBugDispLog( int ); // address: 0
	{
	iinvokenative byte[] getBugDispLog( int )
	}


static public final byte[] getBugDispLog( int, boolean ); // address: 0
	{
	iinvokenative byte[] getBugDispLog( int, boolean )
	}


static public final boolean bugDispLogAvailable( int ); // address: 0
	{
	iinvokenative boolean bugDispLogAvailable( int )
	}


static public final boolean getLogWorthyInfo( net.rim.device.internal.EScreens.LogWorthyInfo ); // address: 0
	{
	iinvokenative boolean getLogWorthyInfo( net.rim.device.internal.EScreens.LogWorthyInfo )
	}

}
