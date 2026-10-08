// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 6
// ########################################################


package net.rim.device.internal.EScreens;


abstract final class EScreenController$PingSelfAction$IcmpPingEchoReceiver extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.internal.EScreens.EScreenController$PingSelfAction /*net.rim.device.internal.EScreens.EScreenController$PingSelfAction*/  this$0 ; // ofs = 13180 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.device.internal.EScreens.EScreenController$PingSelfAction$IcmpPingEchoReceiver, net.rim.device.internal.EScreens.EScreenController$PingSelfAction ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	return 
	}


<init>( net.rim.device.internal.EScreens.EScreenController$PingSelfAction$IcmpPingEchoReceiver, net.rim.device.internal.EScreens.EScreenController$PingSelfAction, net.rim.device.internal.EScreens.EScreenController$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.device.internal.EScreens.EScreenController$PingSelfAction$IcmpPingEchoReceiver.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( net.rim.device.internal.EScreens.EScreenController$PingSelfAction$IcmpPingEchoReceiver ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	sipush 128
	invokeinterface interfacemethodref_8 // pc=2 guess=6
	checkcast_lib Object//java.lang.Object java.lang.Object java.lang.Object
	astore_1 
Label7:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokeinterface interfacemethodref_9 // pc=2 guess=7
	getstatic _timerID // EScreenController$PingSelfAction
	bipush -1
	if_icmpne Label15
	goto Label54
Label15:
	aload_1 
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	istore_2 
	aload_1 
	invokeinterface interfacemethodref_11 // pc=1 guess=9
	istore_3 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_2 
	if_icmpne Label7
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	if_icmpne Label7
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.EScreenController$PingSelfAction.stopTimer // pc=1
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lsub 
	lstore 4
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_28:"ICMP Ping received in "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	lload 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_29:"ms!"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.internal.EScreens.EScreenController$PingSelfAction.done // pc=2
	goto Label54
	astore_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.EScreenController$PingSelfAction.stopTimer // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 13180 ord = 0 addr = 0
	ldc literal_30:"Failed in receving ICMP Ping echo!"
	invokespecial net.rim.device.internal.EScreens.EScreenController$PingSelfAction.done // pc=2
Label54:
	return 
	}

}
