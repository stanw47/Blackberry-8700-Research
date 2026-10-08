// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 29
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenSession$MyMenuItem extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _id ; // ofs = 14848 addr = 0)
	private final net.rim.device.internal.EScreens.EScreenSession /*net.rim.device.internal.EScreens.EScreenSession*/  this$0 ; // ofs = 14852 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.internal.EScreens.EScreenSession$MyMenuItem, net.rim.device.internal.EScreens.EScreenSession, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenSession.getMenuString // pc=2
	iconst_0 
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenSession.getMenuPriority // pc=2
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=4
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14852 ord = 1 addr = 0
	aload_0 
	iload_2 
	putfield _id   // get_name_1:  _id   // get_name_2:  _id   // get_Name:    _id   // getName->1:  _id   // getName->2:  _id   // getName->N:  _id   // ofs = 14848 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public run( net.rim.device.internal.EScreens.EScreenSession$MyMenuItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _id   // get_name_1:  _id   // get_name_2:  _id   // get_Name:    _id   // getName->1:  _id   // getName->2:  _id   // getName->N:  _id   // ofs = 14848 ord = 0 addr = 0
	tableswitch  :
		
		
		
		
		

Label3:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14852 ord = 1 addr = 0
	getfield _listField   // get_name_1:  _listField   // get_name_2:  _listField   // get_Name:    _listField   // getName->1:  _listField   // getName->2:  _listField   // getName->N:  _listField   // ofs = 14716 ord = 15 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	return 
Label7:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14852 ord = 1 addr = 0
	invokevirtual resetStats( net.rim.device.internal.EScreens.EScreenSession ) // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14852 ord = 1 addr = 0
	invokevirtual boolean verifyParameters( net.rim.device.internal.EScreens.EScreenSession ) // pc=1
	ifeq Label20
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14852 ord = 1 addr = 0
	iconst_1 
	invokevirtual setState( net.rim.device.internal.EScreens.EScreenSession, int ) // pc=2
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14852 ord = 1 addr = 0
	invokevirtual start( net.rim.device.internal.EScreens.EScreenSession ) // pc=1
	return 
Label18:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14852 ord = 1 addr = 0
	invokevirtual stop( net.rim.device.internal.EScreens.EScreenSession ) // pc=1
Label20:
	return 
	}

}
