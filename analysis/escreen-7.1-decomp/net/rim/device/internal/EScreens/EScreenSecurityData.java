// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 26
// ########################################################


package net.rim.device.internal.EScreens;


class EScreenSecurityData extends Object
implements net.rim.vm.Persistable

{

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  _unlockTime ; // ofs = 14518 addr = 0)
	private long /*long*/  _unlockLength ; // ofs = 14522 addr = 0)
	private boolean /*boolean*/  _allowAccess ; // ofs = 14526 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.internal.EScreens.EScreenSecurityData ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static net.rim.device.internal.EScreens.EScreenSecurityData get( int ); // address: 0
	{
	enter 
	lipush 2418345044197243008
	iload_0 
	i2l 
	ladd 
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // RIMPersistentStore
	astore_2 
	aload_2 
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	astore_3 
	aload_3 
	checkcastbranch 
	astore_1 
	aload_1 
	areturn 
Label15:
	new EScreenSecurityData
	dup 
	invokespecial net.rim.device.internal.EScreens.EScreenSecurityData.<init> // pc=1
	astore_1 
	aload_2 
	aload_1 
	bipush 51
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object, int ) // pc=3
	aload_2 
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	aload_1 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

boolean isAccessAllowed( net.rim.device.internal.EScreens.EScreenSecurityData ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual checkForExpiry( net.rim.device.internal.EScreens.EScreenSecurityData ) // pc=1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ireturn 
	}


checkForExpiry( net.rim.device.internal.EScreens.EScreenSecurityData ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label23
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 1
	lload 1
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lcmp 
	iflt Label18
	lload 1
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ladd 
	lcmp 
	ifle Label23
Label18:
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	invokestatic_lib commit( java.lang.Object ) // PersistentObject
Label23:
	return 
	}


allowAccess( net.rim.device.internal.EScreens.EScreenSecurityData, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lload 1
	lputfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	invokestatic_lib commit( java.lang.Object ) // PersistentObject
	return 
	}

}
