// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 1
// ########################################################


package net.rim.device.internal.EScreens;


abstract public final class EScreenAccess extends Object

{


	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.device.internal.EScreens.EScreenAccess ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final int getAccessLevel(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isDeviceSecure(  ) // InternalServices
	ifeq Label5
	invokestatic_lib boolean isDeviceFakeSecure(  ) // InternalServices
	ifeq Label7
Label5:
	iconst_0 
	ireturn 
Label7:
	bipush 16
	invokestatic_lib byte[] getData( int ) // Branding
	ifnull Label12
	iconst_0 
	ireturn 
Label12:
	iconst_0 
	invokestatic net.rim.device.internal.EScreens.EScreenSecurityData get( int ) // EScreenSecurityData
	invokevirtual boolean isAccessAllowed( net.rim.device.internal.EScreens.EScreenSecurityData ) // pc=1
	ifeq Label18
	iconst_1 
	ireturn 
Label18:
	bipush -1
	ireturn 
	}


static public final boolean isAllowed(  ); // address: 0
	{
	enter_narrow 
	invokestatic int getAccessLevel(  ) // EScreenAccess
	bipush -1
	if_icmpeq Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}

}
