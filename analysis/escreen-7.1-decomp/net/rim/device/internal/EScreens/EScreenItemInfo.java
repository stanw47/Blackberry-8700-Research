// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 13
// ########################################################


package net.rim.device.internal.EScreens;


abstract public final class EScreenItemInfo extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public int /*int*/  flags ; // ofs = 13648 addr = 0)
	public int /*int*/  id ; // ofs = 13652 addr = 0)
	public int /*int*/  idCookie ; // ofs = 13656 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.EScreenItemInfo ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


public <init>( net.rim.device.internal.EScreens.EScreenItemInfo, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

}
