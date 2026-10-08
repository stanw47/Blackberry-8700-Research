// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 37
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenVMMemStats$RefresherThread extends net.rim.device.internal.ui.component.PleaseWaitWorkerThread

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.internal.EScreens.EScreenVMMemStats /*net.rim.device.internal.EScreens.EScreenVMMemStats*/  this$0 ; // ofs = 15430 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.device.internal.EScreens.EScreenVMMemStats$RefresherThread, net.rim.device.internal.EScreens.EScreenVMMemStats ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.internal.ui.component.PleaseWaitWorkerThread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	return 
	}


<init>( net.rim.device.internal.EScreens.EScreenVMMemStats$RefresherThread, net.rim.device.internal.EScreens.EScreenVMMemStats, net.rim.device.internal.EScreens.EScreenVMMemStats$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.device.internal.EScreens.EScreenVMMemStats$RefresherThread.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected doWork( net.rim.device.internal.EScreens.EScreenVMMemStats$RefresherThread ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _refresher   // get_name_1:  _refresher   // get_name_2:  _refresher   // get_Name:    _refresher   // getName->1:  _refresher   // getName->2:  _refresher   // getName->N:  _refresher   // ofs = 15278 ord = 2 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _stats   // get_name_1:  _stats   // get_name_2:  _stats   // get_Name:    _stats   // getName->1:  _stats   // getName->2:  _stats   // getName->N:  _stats   // ofs = 15270 ord = 0 addr = 0
	invokeinterface interfacemethodref_15 // pc=2 guess=16
	bipush 4
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _fileSystemCleanFailed   // get_name_1:  _fileSystemCleanFailed   // get_name_2:  _fileSystemCleanFailed   // get_Name:    _fileSystemCleanFailed   // getName->1:  _fileSystemCleanFailed   // getName->2:  _fileSystemCleanFailed   // getName->N:  _fileSystemCleanFailed   // ofs = 15282 ord = 3 addr = 0
	ifeq Label12
	bipush 4
	goto Label13
Label12:
	iconst_0 
Label13:
	iadd 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_1 
	aload_1 
	iconst_0 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	ldc literal_126:"Allocated: "
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _stats   // get_name_1:  _stats   // get_name_2:  _stats   // get_Name:    _stats   // getName->1:  _stats   // getName->2:  _stats   // getName->N:  _stats   // ofs = 15270 ord = 0 addr = 0
	invokevirtual int getAllocated( net.rim.device.api.system.MemoryStats ) // pc=1
	invokevirtual java.lang.String fmt( net.rim.device.internal.EScreens.EScreenVMMemStats, java.lang.String, int ) // pc=3
	aastore 
	aload_1 
	iconst_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	ldc literal_127:"Free: "
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _stats   // get_name_1:  _stats   // get_name_2:  _stats   // get_Name:    _stats   // getName->1:  _stats   // getName->2:  _stats   // getName->N:  _stats   // ofs = 15270 ord = 0 addr = 0
	invokevirtual int getFree( net.rim.device.api.system.MemoryStats ) // pc=1
	invokevirtual java.lang.String fmt( net.rim.device.internal.EScreens.EScreenVMMemStats, java.lang.String, int ) // pc=3
	aastore 
	aload_1 
	bipush 2
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	ldc literal_128:"Objects: "
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _stats   // get_name_1:  _stats   // get_name_2:  _stats   // get_Name:    _stats   // getName->1:  _stats   // getName->2:  _stats   // getName->N:  _stats   // ofs = 15270 ord = 0 addr = 0
	invokevirtual int getObjectCount( net.rim.device.api.system.MemoryStats ) // pc=1
	invokevirtual java.lang.String fmt( net.rim.device.internal.EScreens.EScreenVMMemStats, java.lang.String, int ) // pc=3
	aastore 
	aload_1 
	bipush 3
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	ldc literal_129:"Object Size: "
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _stats   // get_name_1:  _stats   // get_name_2:  _stats   // get_Name:    _stats   // getName->1:  _stats   // getName->2:  _stats   // getName->N:  _stats   // ofs = 15270 ord = 0 addr = 0
	invokevirtual int getObjectSize( net.rim.device.api.system.MemoryStats ) // pc=1
	invokevirtual java.lang.String fmt( net.rim.device.internal.EScreens.EScreenVMMemStats, java.lang.String, int ) // pc=3
	aastore 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _fileSystemCleanFailed   // get_name_1:  _fileSystemCleanFailed   // get_name_2:  _fileSystemCleanFailed   // get_Name:    _fileSystemCleanFailed   // getName->1:  _fileSystemCleanFailed   // getName->2:  _fileSystemCleanFailed   // getName->N:  _fileSystemCleanFailed   // ofs = 15282 ord = 3 addr = 0
	ifeq Label71
	aload_1 
	bipush 4
	ldc_nullstr 
	aastore 
	aload_1 
	bipush 5
	ldc literal_130:"File System cleaning failed to"
	aastore 
	aload_1 
	bipush 6
	ldc literal_131:"complete after one minute."
	aastore 
	aload_1 
	bipush 7
	ldc literal_132:"Please run again to complete cleaning."
	aastore 
Label71:
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _list   // get_name_1:  _list   // get_name_2:  _list   // get_Name:    _list   // getName->1:  _list   // getName->2:  _list   // getName->N:  _list   // ofs = 15274 ord = 1 addr = 0
	aload_1 
	invokevirtual set( net.rim.device.api.ui.component.ObjectListField, java.lang.Object[] ) // pc=2
	aload_2 
	monitorexit 
	goto Label87
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label87:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15430 ord = 0 addr = 0
	getfield _list   // get_name_1:  _list   // get_name_2:  _list   // get_Name:    _list   // getName->1:  _list   // getName->2:  _list   // getName->N:  _list   // ofs = 15274 ord = 1 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.component.ObjectListField ) // pc=1
	return 
	}

}
