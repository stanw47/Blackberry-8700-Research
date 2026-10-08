// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 36
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenVMMemStats$MyMenu extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.EScreenVMMemStats$MyMenu, net.rim.device.internal.EScreens.EScreenVMMemStats, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iconst_0 
	bipush 100
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=4
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15378 ord = 1 addr = 0
	aload_0 
	iload_3 
	putfield _type   // get_name_1:  _type   // get_name_2:  _type   // get_Name:    _type   // getName->1:  _type   // getName->2:  _type   // getName->N:  _type   // ofs = 15374 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public run( net.rim.device.internal.EScreens.EScreenVMMemStats$MyMenu ); // address: 0
	{
	enter_narrow 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15378 ord = 1 addr = 0
	iconst_0 
	putfield _fileSystemCleanFailed   // get_name_1:  _fileSystemCleanFailed   // get_name_2:  _fileSystemCleanFailed   // get_Name:    _fileSystemCleanFailed   // getName->1:  _fileSystemCleanFailed   // getName->2:  _fileSystemCleanFailed   // getName->N:  _fileSystemCleanFailed   // ofs = 15282 ord = 3 addr = 0
	aload_0_getfield _type   // get_name_1:  _type   // get_name_2:  _type   // get_Name:    _type   // getName->1:  _type   // getName->2:  _type   // getName->N:  _type   // ofs = 15374 ord = 0 addr = 0
	tableswitch  :
		
		
		
		
		
		

Label6:
	invokestatic_lib quickGC(  ) // Memory
	goto Label20
Label8:
	invokestatic_lib fullGC(  ) // Memory
	goto Label20
Label10:
	invokestatic_lib veryExpensiveThoroughGC(  ) // Memory
	goto Label20
Label12:
	invokestatic_lib expensiveFileSystemClean(  ) // Memory
	goto Label20
	astore_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15378 ord = 1 addr = 0
	iconst_1 
	putfield _fileSystemCleanFailed   // get_name_1:  _fileSystemCleanFailed   // get_name_2:  _fileSystemCleanFailed   // get_Name:    _fileSystemCleanFailed   // getName->1:  _fileSystemCleanFailed   // getName->2:  _fileSystemCleanFailed   // getName->N:  _fileSystemCleanFailed   // ofs = 15282 ord = 3 addr = 0
	goto Label20
Label19:
	invokestatic_lib checkPasswordWriteSnapshot(  ) // Memory
Label20:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 15378 ord = 1 addr = 0
	invokevirtual refresh( net.rim.device.internal.EScreens.EScreenVMMemStats ) // pc=1
	return 
	}

}
