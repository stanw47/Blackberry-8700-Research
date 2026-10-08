// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 22
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenRTCRunnableManager$EScreenRTCMenu$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.internal.system.RTCRunnableItemInfo /*net.rim.device.internal.system.RTCRunnableItemInfo*/  val$deleteItem ; // ofs = 14276 addr = 0)
	private final net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu /*net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu*/  this$1 ; // ofs = 14280 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu$2, net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu, net.rim.device.internal.system.RTCRunnableItemInfo ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public run( net.rim.device.internal.EScreens.EScreenRTCRunnableManager$EScreenRTCMenu$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_12 // pc=1 guess=11
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 14170 ord = 1 addr = 0
	getfield _isProxy   // get_name_1:  _isProxy   // get_name_2:  _isProxy   // get_Name:    _isProxy   // getName->1:  _isProxy   // getName->2:  _isProxy   // getName->N:  _isProxy   // ofs = 13988 ord = 12 addr = 0
	invokestatic_lib removeQueuedRTCRunnableItem( java.lang.Runnable, boolean ) // RTCRunnableManager
	return 
	}

}
