// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 5
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenController$PingSelfAction$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.internal.EScreens.EScreenController$PingSelfAction /*net.rim.device.internal.EScreens.EScreenController$PingSelfAction*/  this$0 ; // ofs = 13126 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.internal.EScreens.EScreenController$PingSelfAction$1, net.rim.device.internal.EScreens.EScreenController$PingSelfAction ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public run( net.rim.device.internal.EScreens.EScreenController$PingSelfAction$1 ); // address: 0
	{
	enter_narrow 
	getstatic d // EScreenController$PingSelfAction
	invokevirtual show( net.rim.device.api.ui.component.Dialog ) // pc=1
	return 
	}

}
