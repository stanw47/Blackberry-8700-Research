// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 25
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenRTCRunnableManager$ProcessDiedChecker extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  _stop ; // ofs = 14458 addr = 0)
	private final net.rim.device.internal.EScreens.EScreenRTCRunnableManager /*net.rim.device.internal.EScreens.EScreenRTCRunnableManager*/  this$0 ; // ofs = 14462 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.EScreenRTCRunnableManager$ProcessDiedChecker, net.rim.device.internal.EScreens.EScreenRTCRunnableManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14462 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private boolean shouldStop( net.rim.device.internal.EScreens.EScreenRTCRunnableManager$ProcessDiedChecker ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield _stop   // get_name_1:  _stop   // get_name_2:  _stop   // get_Name:    _stop   // getName->1:  _stop   // getName->2:  _stop   // getName->N:  _stop   // ofs = 14458 ord = 0 addr = 0
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public run( net.rim.device.internal.EScreens.EScreenRTCRunnableManager$ProcessDiedChecker ); // address: 0
	{
	enter 
Label1:
	aload_0 
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager$ProcessDiedChecker.shouldStop // pc=1
	ifne Label28
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14462 ord = 1 addr = 0
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager.isProcessAlive // pc=1
	ifne Label10
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14462 ord = 1 addr = 0
	invokespecial net.rim.device.internal.EScreens.EScreenRTCRunnableManager.handleProcessOrApplicationNotFound // pc=1
	return 
Label10:
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
	aload_0 
	sipush 30000
	i2l 
	invokenonvirtual_lib java.lang.Object.wait // pc=3
	goto Label20
	astore_2 
Label20:
	aload_1 
	monitorexit 
	goto Label1
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
Label28:
	return 
	}


public stopChecking( net.rim.device.internal.EScreens.EScreenRTCRunnableManager$ProcessDiedChecker ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	iconst_1 
	putfield _stop   // get_name_1:  _stop   // get_name_2:  _stop   // get_Name:    _stop   // getName->1:  _stop   // getName->2:  _stop   // getName->N:  _stop   // ofs = 14458 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib java.lang.Object.notify // pc=1
	return 
	}

}
