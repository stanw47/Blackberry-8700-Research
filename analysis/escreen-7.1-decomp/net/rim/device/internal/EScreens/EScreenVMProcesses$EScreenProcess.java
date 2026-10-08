// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 39
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenVMProcesses$EScreenProcess extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _process ; // ofs = 15626 addr = 0)
	private long /*long*/  _time ; // ofs = 15630 addr = 0)
	private int /*int*/  _allocs ; // ofs = 15634 addr = 0)
	private final net.rim.device.internal.EScreens.EScreenVMProcesses /*net.rim.device.internal.EScreens.EScreenVMProcesses*/  this$0 ; // ofs = 15638 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess, net.rim.device.internal.EScreens.EScreenVMProcesses, net.rim.device.api.system.ApplicationProcess ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic _displayType // EScreenVMProcesses
	tableswitch  :
		
		
		
		
		
		
		

Label11:
	aload_0 
	aload_2 
	invokestatic_lib long getRecentCPUTime( net.rim.vm.Process ) // Process
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	goto Label48
Label16:
	aload_0 
	aload_2 
	invokestatic_lib long getTotalCPUTime( net.rim.vm.Process ) // Process
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	goto Label48
Label21:
	aload_0 
	aload_2 
	invokestatic_lib int getRecentAllocations( net.rim.vm.Process ) // Process
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	goto Label48
Label26:
	aload_0 
	aload_2 
	invokestatic_lib int getTotalAllocations( net.rim.vm.Process ) // Process
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	goto Label48
Label31:
	aload_2 
	ifnull Label48
	aload_0 
	aload_2 
	invokevirtual int getHeapSize( net.rim.device.api.system.ApplicationProcess ) // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	goto Label48
Label38:
	aload_0 
	aload_2 
	invokestatic_lib int getHeapHighWater( net.rim.vm.Process ) // Process
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	astore_3 
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label48:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public long getTime( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lreturn 
	}


public setTime( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	lload 1
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public long getAllocs( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	i2l 
	lreturn 
	}


public setAllocs( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess, int ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public int getProcessId( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	bipush -1
	ireturn 
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getProcessId( net.rim.device.api.system.ApplicationProcess ) // pc=1
	ireturn 
	}


public net.rim.device.api.system.ApplicationProcess getApplicationProcess( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public int percent( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess, long, long ); // address: 0
	{
	enter 
	lload 3
	iconst_0 
	i2l 
	lcmp 
	ifne Label8
	iconst_0 
	ireturn 
Label8:
	lload 1
	bipush 100
	i2l 
	lmul 
	lload 3
	ldiv 
	l2i 
	ireturn 
	}


public java.lang.String toString( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label42
	getstatic _displayType // EScreenVMProcesses
	tableswitch  :
		
		
		
		
		
		
		

Label5:
	ldc literal_149:"Utilization"
	astore_1 
	goto Label45
Label8:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_150:"Total (Non-idle "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lgetfield _totalUtilizedTime   // get_name_1:  _totalUtilizedTime   // get_name_2:  _totalUtilizedTime   // get_Name:    _totalUtilizedTime   // getName->1:  _totalUtilizedTime   // getName->2:  _totalUtilizedTime   // getName->N:  _totalUtilizedTime   // ofs = 15516 ord = 1 addr = 0
	sipush 1000
	i2l 
	ldiv 
	l2i 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_151:"s)"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	goto Label45
Label24:
	ldc literal_152:"Allocations"
	astore_1 
	goto Label45
Label27:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_153:"Total ("
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield _totalAllocations   // get_name_1:  _totalAllocations   // get_name_2:  _totalAllocations   // get_Name:    _totalAllocations   // getName->1:  _totalAllocations   // getName->2:  _totalAllocations   // getName->N:  _totalAllocations   // ofs = 15520 ord = 2 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_154:")"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	goto Label45
Label39:
	ldc literal_155:"Processes"
	astore_1 
	goto Label45
Label42:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.String toString( net.rim.device.api.system.ApplicationProcess ) // pc=1
	astore_1 
Label45:
	getstatic _displayType // EScreenVMProcesses
	tableswitch  :
		
		
		
		
		
		
		

Label47:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lgetfield _recentTimeWindow   // get_name_1:  _recentTimeWindow   // get_name_2:  _recentTimeWindow   // get_Name:    _recentTimeWindow   // getName->1:  _recentTimeWindow   // getName->2:  _recentTimeWindow   // getName->N:  _recentTimeWindow   // ofs = 15512 ord = 0 addr = 0
	invokevirtual .virtual_9(  ) // pc=5
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_156:"% "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label64:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	sipush 1000
	i2l 
	ldiv 
	l2i 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_157:"s "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label99
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_158:"("
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lgetfield _totalUtilizedTime   // get_name_1:  _totalUtilizedTime   // get_name_2:  _totalUtilizedTime   // get_Name:    _totalUtilizedTime   // getName->1:  _totalUtilizedTime   // getName->2:  _totalUtilizedTime   // getName->N:  _totalUtilizedTime   // ofs = 15516 ord = 1 addr = 0
	invokevirtual .virtual_9(  ) // pc=5
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_159:"%) "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
Label99:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label108:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	i2l 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield _totalAllocations   // get_name_1:  _totalAllocations   // get_name_2:  _totalAllocations   // get_Name:    _totalAllocations   // getName->1:  _totalAllocations   // getName->2:  _totalAllocations   // getName->N:  _totalAllocations   // ofs = 15520 ord = 2 addr = 0
	i2l 
	invokevirtual .virtual_9(  ) // pc=5
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_156:"% "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label126:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label150
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_158:"("
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	i2l 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield _totalAllocations   // get_name_1:  _totalAllocations   // get_name_2:  _totalAllocations   // get_Name:    _totalAllocations   // getName->1:  _totalAllocations   // getName->2:  _totalAllocations   // getName->N:  _totalAllocations   // ofs = 15520 ord = 2 addr = 0
	i2l 
	invokevirtual .virtual_9(  ) // pc=5
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_159:"%) "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
Label150:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label159:
	aload_1 
	areturn 
	}


public int compareTo( net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess, net.rim.device.internal.EScreens.EScreenVMProcesses$EScreenProcess ); // address: 0
	{
	enter 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label6
	iconst_1 
	ireturn 
Label6:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label10
	bipush -1
	ireturn 
Label10:
	getstatic _displayType // EScreenVMProcesses
	tableswitch  :
		
		
		
		
		

Label12:
	aload_1 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lsub 
	lstore 2
	goto Label25
Label19:
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	isub 
	i2l 
	lstore 2
Label25:
	lload 2
	iconst_0 
	i2l 
	lcmp 
	ifge Label32
	bipush -1
	ireturn 
Label32:
	lload 2
	iconst_0 
	i2l 
	lcmp 
	ifle Label39
	iconst_1 
	ireturn 
Label39:
	iconst_0 
	ireturn 
	}

}
