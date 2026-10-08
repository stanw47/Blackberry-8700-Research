// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 55
// ########################################################


package com.rim.resources;


abstract public final class net_rim_escreenRIMResources extends net.rim.device.resources.Resource

{
	// @@@@@@@@@@@@@ Static fields 
	public static java.util.Hashtable /*java.util.Hashtable*/  _resources ; // ofs = 16934 addr = 123)
	public static java.util.Hashtable /*java.util.Hashtable*/  _properties ; // ofs = 16940 addr = 124)
	public static byte[] /*byte[]*/  _appFlags ; // ofs = 16946 addr = 125)
	public static byte[] /*byte[]*/  _appCount ; // ofs = 16952 addr = 126)
	public static byte[] /*byte[]*/  _resourceExtensions ; // ofs = 16958 addr = 127)
	public static byte[] /*byte[]*/  _version ; // ofs = 16964 addr = 128)
	public static byte[] /*byte[]*/  _vendor ; // ofs = 16970 addr = 129)
	public static int[] /*int[]*/  _securityVendorIds ; // ofs = 16976 addr = 130)
	public static byte[] /*byte[]*/  _securityDescriptions ; // ofs = 16982 addr = 131)
	public static byte[] /*byte[]*/  _securityKeys ; // ofs = 16988 addr = 132)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.rim.resources.net_rim_escreenRIMResources ); // address: 0
	{
	enter 
	aload_0 
	getstatic _resources // net_rim_escreenRIMResources
	getstatic _properties // net_rim_escreenRIMResources
	aconst_null 
	invokespecial_lib net.rim.device.resources.Resource.<init> // pc=4
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	synch_static net_rim_escreenRIMResources
	clinit_wait 
	arrayinit [2]
	putstatic _appFlags // net_rim_escreenRIMResources
	arrayinit [0]
	putstatic _appCount // net_rim_escreenRIMResources
	arrayinit []
	putstatic _resourceExtensions // net_rim_escreenRIMResources
	arrayinit [0, 9, 55, 46, 49, 46, 48, 46, 49, 51, 55]
	putstatic _version // net_rim_escreenRIMResources
	arrayinit [0, 23, 82, 101, 115, 101, 97, 114, 99, 104, 32, 73, 110, 32, 77, 111, 116, 105, 111, 110, 32, 76, 116, 100, 46]
	putstatic _vendor // net_rim_escreenRIMResources
	arrayinit [51, 0, 0, 0]
	putstatic _securityVendorIds // net_rim_escreenRIMResources
	arrayinit [0, 0]
	putstatic _securityDescriptions // net_rim_escreenRIMResources
	arrayinit [0, 0]
	putstatic _securityKeys // net_rim_escreenRIMResources
	clinit_return 
	}

}
