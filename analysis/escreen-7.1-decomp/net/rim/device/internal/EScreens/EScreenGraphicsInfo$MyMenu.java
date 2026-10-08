// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 10
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenGraphicsInfo$MyMenu extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.EScreenGraphicsInfo$MyMenu, net.rim.device.internal.EScreens.EScreenGraphicsInfo, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iconst_0 
	bipush 100
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=4
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13448 ord = 1 addr = 0
	aload_0 
	iload_3 
	putfield _type   // get_name_1:  _type   // get_name_2:  _type   // get_Name:    _type   // getName->1:  _type   // getName->2:  _type   // getName->N:  _type   // ofs = 13444 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public run( net.rim.device.internal.EScreens.EScreenGraphicsInfo$MyMenu ); // address: 0
	{
	enter_narrow 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13448 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.EScreenGraphicsInfo.refreshData // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13448 ord = 1 addr = 0
	getfield _list   // get_name_1:  _list   // get_name_2:  _list   // get_Name:    _list   // getName->1:  _list   // getName->2:  _list   // getName->N:  _list   // ofs = 13378 ord = 7 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	return 
	}

}
