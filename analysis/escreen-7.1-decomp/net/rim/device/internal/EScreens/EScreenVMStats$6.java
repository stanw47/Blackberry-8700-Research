// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 47
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenVMStats$6 extends Object
implements net.rim.device.internal.EScreens.EScreenMemStatsRefresher

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.internal.EScreens.EScreenVMStats /*net.rim.device.internal.EScreens.EScreenVMStats*/  this$0 ; // ofs = 16072 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.internal.EScreens.EScreenVMStats$6, net.rim.device.internal.EScreens.EScreenVMStats ); // address: 0
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

public refresh( net.rim.device.internal.EScreens.EScreenVMStats$6, net.rim.device.api.system.MemoryStats ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokestatic_lib getExpensivePersistentStats( net.rim.vm.MemStats ) // Memory
	return 
	}

}
