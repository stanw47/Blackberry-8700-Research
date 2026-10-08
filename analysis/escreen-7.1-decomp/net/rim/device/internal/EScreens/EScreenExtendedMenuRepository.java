// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 8
// ########################################################


package net.rim.device.internal.EScreens;


public class EScreenExtendedMenuRepository extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.EScreenExtendedMenuRepository ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public net.rim.device.internal.EScreens.EScreenExtendedMenuRepository getInstance(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.device.api.system.ApplicationRegistry getApplicationRegistry(  ) // ApplicationRegistry
	lipush -8538258899775408506
	invokevirtual java.lang.Object get( net.rim.device.api.system.ApplicationRegistry, long ) // pc=3
	checkcast EScreenExtendedMenuRepository
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

abstract public net.rim.device.api.ui.MenuItem[] getExtendedMenu( net.rim.device.internal.EScreens.EScreenExtendedMenuRepository ); // address: 0
	{
	halt 
	}

}
