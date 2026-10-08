// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 20
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenRTCRunnableManager$EScreenRTCMenu extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _type ; // ofs = 14166 addr = 0)
	private final net.rim.device.internal.EScreens.EScreenRTCRunnableManager /*net.rim.device.internal.EScreens.EScreenRTCRunnableManager*/  this$0 ; // ofs = 14170 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu, net.rim.device.internal.EScreens.EScreenRTCRunnableManager, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.system.Branding//net.rim.device.api.system.Branding net.rim.device.api.system.Branding net.rim.device.api.system.Branding
	dup 
	aload_2 
	invokespecial_lib net.rim.device.api.util.StringProvider.<init> // pc=2
	iconst_0 
	bipush 100
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=4
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14170 ord = 1 addr = 0
	aload_0 
	iload_3 
	putfield _type   // get_name_1:  _type   // get_name_2:  _type   // get_Name:    _type   // getName->1:  _type   // getName->2:  _type   // getName->N:  _type   // ofs = 14166 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public run( net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu ); // address: 0
	{
	enter 
	aload_0_getfield _type   // get_name_1:  _type   // get_name_2:  _type   // get_Name:    _type   // getName->1:  _type   // getName->2:  _type   // getName->N:  _type   // ofs = 14166 ord = 0 addr = 0
	tableswitch  :
		
		
		

Label3:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14170 ord = 1 addr = 0
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager.getSelectedItem // pc=1
	astore_1 
	aload_1 
	ifnull Label30
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14170 ord = 1 addr = 0
	new EScreenRTCRunnableManager$EScreenRTCMenu$1
	dup 
	aload_0 
	aload_1 
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu$1.<init> // pc=3
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager.executeOnProcess // pc=2
	pop 
	return 
Label17:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14170 ord = 1 addr = 0
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager.getSelectedItem // pc=1
	astore_2 
	aload_2 
	ifnull Label30
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14170 ord = 1 addr = 0
	new EScreenRTCRunnableManager$EScreenRTCMenu$2
	dup 
	aload_0 
	aload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu$2.<init> // pc=3
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager.executeOnProcess // pc=2
	pop 
Label30:
	return 
	}

}
