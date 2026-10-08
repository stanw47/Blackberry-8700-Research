// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 33
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenUI$MyMenuItem extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _id ; // ofs = 15200 addr = 0)
	private Object /*java.lang.Object*/  _context ; // ofs = 15204 addr = 0)
	private final net.rim.device.internal.EScreens.EScreenUI /*net.rim.device.internal.EScreens.EScreenUI*/  this$0 ; // ofs = 15208 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.internal.EScreens.EScreenUI$MyMenuItem, net.rim.device.internal.EScreens.EScreenUI, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenUI.getMenuString // pc=2
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenUI.getMenuOrdinal // pc=2
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenUI.getMenuPriority // pc=2
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=4
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15208 ord = 2 addr = 0
	aload_0 
	iload_2 
	putfield _id   // get_name_1:  _id   // get_name_2:  _id   // get_Name:    _id   // getName->1:  _id   // getName->2:  _id   // getName->N:  _id   // ofs = 15200 ord = 0 addr = 0
	return 
	}


<init>( net.rim.device.internal.EScreens.EScreenUI$MyMenuItem, net.rim.device.internal.EScreens.EScreenUI, int, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenUI.getMenuString // pc=2
	aload_3 
	invokespecial net.rim.device.internal.EScreens.EScreenUI$MyMenuItem.<init> // pc=5
	return 
	}


<init>( net.rim.device.internal.EScreens.EScreenUI$MyMenuItem, net.rim.device.internal.EScreens.EScreenUI, int, java.lang.String, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	aload_3 
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenUI.getMenuOrdinal // pc=2
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenUI.getMenuPriority // pc=2
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=4
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15208 ord = 2 addr = 0
	aload_0 
	iload_2 
	putfield _id   // get_name_1:  _id   // get_name_2:  _id   // get_Name:    _id   // getName->1:  _id   // getName->2:  _id   // getName->N:  _id   // ofs = 15200 ord = 0 addr = 0
	aload_0 
	aload_4 
	putfield _context   // get_name_1:  _context   // get_name_2:  _context   // get_Name:    _context   // getName->1:  _context   // getName->2:  _context   // getName->N:  _context   // ofs = 15204 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public run( net.rim.device.internal.EScreens.EScreenUI$MyMenuItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _id   // get_name_1:  _id   // get_name_2:  _id   // get_Name:    _id   // getName->1:  _id   // getName->2:  _id   // getName->N:  _id   // ofs = 15200 ord = 0 addr = 0
	tableswitch  :
		
		
		
		
		

Label3:
	aload_0_getfield _context   // get_name_1:  _context   // get_name_2:  _context   // get_Name:    _context   // getName->1:  _context   // getName->2:  _context   // getName->N:  _context   // ofs = 15204 ord = 1 addr = 0
	checkcast EScreenItemInfo
	astore_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15208 ord = 2 addr = 0
	getfield _controller   // get_name_1:  _controller   // get_name_2:  _controller   // get_Name:    _controller   // getName->1:  _controller   // getName->2:  _controller   // getName->N:  _controller   // ofs = 15114 ord = 1 addr = 0
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual pushScreen( net.rim.device.internal.EScreens.EScreenController, int, int ) // pc=3
	return 
Label14:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15208 ord = 2 addr = 0
	getfield _controller   // get_name_1:  _controller   // get_name_2:  _controller   // get_Name:    _controller   // getName->1:  _controller   // getName->2:  _controller   // getName->N:  _controller   // ofs = 15114 ord = 1 addr = 0
	iconst_0 
	invokevirtual refresh( net.rim.device.internal.EScreens.EScreenController, boolean ) // pc=2
	return 
Label19:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15208 ord = 2 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.EScreenUI.copyScreen // pc=1
	return 
Label22:
	aload_0_getfield _context   // get_name_1:  _context   // get_name_2:  _context   // get_Name:    _context   // getName->1:  _context   // getName->2:  _context   // getName->N:  _context   // ofs = 15204 ord = 1 addr = 0
	checkcast EScreenItemInfo
	astore_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15208 ord = 2 addr = 0
	aload_1 
	invokespecial net.rim.device.internal.EScreens.EScreenUI.doAction // pc=2
Label28:
	return 
	}

}
