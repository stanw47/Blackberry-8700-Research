// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 54
// ########################################################


package net.rim.device.internal.EScreens.sessions;


abstract public final class UDPBlasterSession extends net.rim.device.internal.EScreens.EScreenSession

{
	// @@@@@@@@@@@@@ Static fields 
	private final static String /*java.lang.String[]*/  COUNTER_HEADERS ; // ofs = 16872 addr = 120)

	// @@@@@@@@@@@@@ Fields 
	private int[] /*int[]*/  _packetIds ; // ofs = 16832 addr = 0)
	private byte[] /*byte[]*/  _payload ; // ofs = 16836 addr = 0)
	private int /*int*/  _windowSize ; // ofs = 16840 addr = 0)
	private int /*int*/  _payloadSize ; // ofs = 16844 addr = 0)
	private int /*int*/  _port ; // ofs = 16848 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  _portField ; // ofs = 16852 addr = 0)
	private net.rim.device.api.ui.component.NumericChoiceField /*net.rim.device.api.ui.component.NumericChoiceField*/  _windowSizeField ; // ofs = 16856 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  _packetSizeField ; // ofs = 16860 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  _wifiOrRadio ; // ofs = 16864 addr = 0)
	private String /*java.lang.String*/  _apnName ; // ofs = 16868 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.internal.EScreens.sessions.UDPBlasterSession ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.device.internal.EScreens.EScreenSession.<init> // pc=1
	op01xx 
	stringarrayinit [RADIO, WIFI]
	astore_1 
	aload_0 
	new_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	ldc literal_229:"Connection method: "
	aload_1 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield _wifiOrRadio   // get_name_1:  _wifiOrRadio   // get_name_2:  _wifiOrRadio   // get_Name:    _wifiOrRadio   // getName->1:  _wifiOrRadio   // getName->2:  _wifiOrRadio   // getName->N:  _wifiOrRadio   // ofs = 16864 ord = 8 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.component.ListField//net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField
	dup 
	ldc literal_230:"Destination Port: "
	ldc literal_231:"56026"
	iipush 2147483647
	iipush 16777216
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	putfield _portField   // get_name_1:  _portField   // get_name_2:  _portField   // get_Name:    _portField   // getName->1:  _portField   // getName->2:  _portField   // getName->N:  _portField   // ofs = 16852 ord = 5 addr = 0
	aload_0 
	new_lib net.rim.device.internal.system.ICMPPacketHeader//net.rim.device.internal.system.ICMPPacketHeader net.rim.device.internal.system.ICMPPacketHeader net.rim.device.internal.system.ICMPPacketHeader
	dup 
	ldc literal_232:"Window Size: "
	iconst_1 
	bipush 5
	iconst_1 
	bipush 4
	invokespecial_lib net.rim.device.api.ui.component.NumericChoiceField.<init> // pc=6
	putfield _windowSizeField   // get_name_1:  _windowSizeField   // get_name_2:  _windowSizeField   // get_Name:    _windowSizeField   // getName->1:  _windowSizeField   // getName->2:  _windowSizeField   // getName->N:  _windowSizeField   // ofs = 16856 ord = 6 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.component.ListField//net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField
	dup 
	ldc literal_233:"Packet size: "
	ldc literal_234:"256"
	iipush 2147483647
	iipush 16777216
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	putfield _packetSizeField   // get_name_1:  _packetSizeField   // get_name_2:  _packetSizeField   // get_Name:    _packetSizeField   // getName->1:  _packetSizeField   // getName->2:  _packetSizeField   // getName->N:  _packetSizeField   // ofs = 16860 ord = 7 addr = 0
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit EScreenSession
	synch_static UDPBlasterSession
	clinit_wait 
	op01xx 
	stringarrayinit [Tx Attempts: , Tx Succeeded: , Tx Failed: ]
	putstatic COUNTER_HEADERS // UDPBlasterSession
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final sendPackets( net.rim.device.internal.EScreens.sessions.UDPBlasterSession ); // address: 0
	{
	enter 
	synch 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	bipush 25
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_1 
	aload_1 
	ldc literal_225:"udpsocket://"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	aload_0_getfield _ipField   // get_name_1:  _ipField   // get_name_2:  _ipField   // get_Name:    _ipField   // getName->1:  _ipField   // getName->2:  _ipField   // getName->N:  _ipField   // ofs = 14708 ord = 13 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.internal.ui.component.IPEditField ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	aload_0_getfield _port   // get_name_1:  _port   // get_name_2:  _port   // get_Name:    _port   // getName->1:  _port   // getName->2:  _port   // getName->N:  _port   // ofs = 16848 ord = 4 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_0_getfield _wifiOrRadio   // get_name_1:  _wifiOrRadio   // get_name_2:  _wifiOrRadio   // get_Name:    _wifiOrRadio   // getName->1:  _wifiOrRadio   // getName->2:  _wifiOrRadio   // getName->N:  _wifiOrRadio   // ofs = 16864 ord = 8 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ObjectChoiceField ) // pc=1
	iconst_1 
	if_icmpne Label33
	aload_1 
	ldc literal_226:";interface=wifi"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label47
Label33:
	aload_0_getfield _apnName   // get_name_1:  _apnName   // get_name_2:  _apnName   // get_Name:    _apnName   // getName->1:  _apnName   // getName->2:  _apnName   // getName->N:  _apnName   // ofs = 16868 ord = 9 addr = 0
	ifnull Label47
	aload_0_getfield _apnName   // get_name_1:  _apnName   // get_name_2:  _apnName   // get_Name:    _apnName   // getName->1:  _apnName   // getName->2:  _apnName   // getName->N:  _apnName   // ofs = 16868 ord = 9 addr = 0
	ldc_nullstr 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label47
	aload_1 
	ldc literal_23:";apn="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	aload_0_getfield _apnName   // get_name_1:  _apnName   // get_name_2:  _apnName   // get_Name:    _apnName   // getName->1:  _apnName   // getName->2:  _apnName   // getName->N:  _apnName   // ofs = 16868 ord = 9 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label47:
	aconst_null 
	astore_2 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.DatagramConnection//javax.microedition.io.DatagramConnection javax.microedition.io.DatagramConnection javax.microedition.io.DatagramConnection
	astore_2 
	goto Label63
	astore_3 
	aload_0 
	iconst_0 
	aload_3 
	invokevirtual java.lang.String getMessage( java.io.IOException ) // pc=1
	bipush -1
	invokenonvirtual net.rim.device.internal.EScreens.EScreenSession.setResult // pc=4
	return 
Label63:
	aload_0_getfield _packetIds   // get_name_1:  _packetIds   // get_name_2:  _packetIds   // get_Name:    _packetIds   // getName->1:  _packetIds   // getName->2:  _packetIds   // getName->N:  _packetIds   // ofs = 16832 ord = 0 addr = 0
	arraylength 
	iconst_1 
	isub 
	istore_3 
Label68:
	iload_3 
	iflt Label87
	aload_2 
	aload_0_getfield _payload   // get_name_1:  _payload   // get_name_2:  _payload   // get_Name:    _payload   // getName->1:  _payload   // getName->2:  _payload   // getName->N:  _payload   // ofs = 16836 ord = 1 addr = 0
	aload_0_getfield _payload   // get_name_1:  _payload   // get_name_2:  _payload   // get_Name:    _payload   // getName->1:  _payload   // getName->2:  _payload   // getName->N:  _payload   // ofs = 16836 ord = 1 addr = 0
	arraylength 
	invokeinterface interfacemethodref_3 // pc=3 guess=41
	astore_4 
	aload_0 
	iconst_0 
	invokenonvirtual net.rim.device.internal.EScreens.EScreenSession.incrementCounter // pc=2
	aload_2 
	aload_4 
	invokeinterface interfacemethodref_6 // pc=2 guess=42
	aload_0 
	iconst_1 
	invokenonvirtual net.rim.device.internal.EScreens.EScreenSession.incrementCounter // pc=2
	iinc 3 -1
	goto Label68
Label87:
	aload_2 
	ifnull Label117
	aload_2 
	invokeinterface interfacemethodref_7 // pc=1 guess=43
	return 
	astore_3 
	return 
	astore_3 
	aload_0 
	iconst_0 
	aload_3 
	invokevirtual java.lang.String getMessage( java.io.IOException ) // pc=1
	bipush -1
	invokenonvirtual net.rim.device.internal.EScreens.EScreenSession.setResult // pc=4
	aload_2 
	ifnull Label107
	aload_2 
	invokeinterface interfacemethodref_7 // pc=1 guess=43
	return 
	astore_4 
Label107:
	return 
	astore_5 
	aload_2 
	ifnull Label115
	aload_2 
	invokeinterface interfacemethodref_7 // pc=1 guess=43
	goto Label115
	astore_6 
Label115:
	aload_5 
	athrow 
Label117:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final init( net.rim.device.internal.EScreens.sessions.UDPBlasterSession, net.rim.device.internal.EScreens.EScreenSessionManager, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.device.internal.EScreens.EScreenSession.init // pc=3
	aload_0 
	getstatic COUNTER_HEADERS // UDPBlasterSession
	invokenonvirtual net.rim.device.internal.EScreens.EScreenSession.setCounterHeaders // pc=2
	return 
	}


public final addParameterFields( net.rim.device.internal.EScreens.sessions.UDPBlasterSession, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield _wifiOrRadio   // get_name_1:  _wifiOrRadio   // get_name_2:  _wifiOrRadio   // get_Name:    _wifiOrRadio   // getName->1:  _wifiOrRadio   // getName->2:  _wifiOrRadio   // getName->N:  _wifiOrRadio   // ofs = 16864 ord = 8 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	aload_0_getfield _portField   // get_name_1:  _portField   // get_name_2:  _portField   // get_Name:    _portField   // getName->1:  _portField   // getName->2:  _portField   // getName->N:  _portField   // ofs = 16852 ord = 5 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	aload_0_getfield _windowSizeField   // get_name_1:  _windowSizeField   // get_name_2:  _windowSizeField   // get_Name:    _windowSizeField   // getName->1:  _windowSizeField   // getName->2:  _windowSizeField   // getName->N:  _windowSizeField   // ofs = 16856 ord = 6 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	aload_0_getfield _packetSizeField   // get_name_1:  _packetSizeField   // get_name_2:  _packetSizeField   // get_Name:    _packetSizeField   // getName->1:  _packetSizeField   // getName->2:  _packetSizeField   // getName->N:  _packetSizeField   // ofs = 16860 ord = 7 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final boolean verifyParameters( net.rim.device.internal.EScreens.sessions.UDPBlasterSession ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield _portField   // get_name_1:  _portField   // get_name_2:  _portField   // get_Name:    _portField   // getName->1:  _portField   // getName->2:  _portField   // getName->N:  _portField   // ofs = 16852 ord = 5 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.EditField ) // pc=1
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield _port   // get_name_1:  _port   // get_name_2:  _port   // get_Name:    _port   // getName->1:  _port   // getName->2:  _port   // getName->N:  _port   // ofs = 16848 ord = 4 addr = 0
	goto Label12
	astore_1 
	ldc literal_220:"Destination Port must be a number"
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label12:
	aload_0 
	aload_0_getfield _windowSizeField   // get_name_1:  _windowSizeField   // get_name_2:  _windowSizeField   // get_Name:    _windowSizeField   // getName->1:  _windowSizeField   // getName->2:  _windowSizeField   // getName->N:  _windowSizeField   // ofs = 16856 ord = 6 addr = 0
	invokevirtual int getSelectedValue( net.rim.device.api.ui.component.NumericChoiceField ) // pc=1
	putfield _windowSize   // get_name_1:  _windowSize   // get_name_2:  _windowSize   // get_Name:    _windowSize   // getName->1:  _windowSize   // getName->2:  _windowSize   // getName->N:  _windowSize   // ofs = 16840 ord = 2 addr = 0
	aload_0 
	aload_0_getfield _packetSizeField   // get_name_1:  _packetSizeField   // get_name_2:  _packetSizeField   // get_Name:    _packetSizeField   // getName->1:  _packetSizeField   // getName->2:  _packetSizeField   // getName->N:  _packetSizeField   // ofs = 16860 ord = 7 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.EditField ) // pc=1
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield _payloadSize   // get_name_1:  _payloadSize   // get_name_2:  _payloadSize   // get_Name:    _payloadSize   // getName->1:  _payloadSize   // getName->2:  _payloadSize   // getName->N:  _payloadSize   // ofs = 16844 ord = 3 addr = 0
	goto Label27
	astore_1 
	ldc literal_221:"Packet size must be a number"
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label27:
	aload_0_getfield _payloadSize   // get_name_1:  _payloadSize   // get_name_2:  _payloadSize   // get_Name:    _payloadSize   // getName->1:  _payloadSize   // getName->2:  _payloadSize   // getName->N:  _payloadSize   // ofs = 16844 ord = 3 addr = 0
	iconst_1 
	if_icmpge Label34
	ldc literal_222:"Packet must be at least 1 byte"
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label34:
	aload_0_getfield _payloadSize   // get_name_1:  _payloadSize   // get_name_2:  _payloadSize   // get_Name:    _payloadSize   // getName->1:  _payloadSize   // getName->2:  _payloadSize   // getName->N:  _payloadSize   // ofs = 16844 ord = 3 addr = 0
	invokestatic_lib int getMaxPacketSize(  ) // UDPPacketHeader
	if_icmple Label41
	ldc literal_223:"Packet is too big"
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label41:
	aload_0_getfield _windowSize   // get_name_1:  _windowSize   // get_name_2:  _windowSize   // get_Name:    _windowSize   // getName->1:  _windowSize   // getName->2:  _windowSize   // getName->N:  _windowSize   // ofs = 16840 ord = 2 addr = 0
	ifgt Label47
	ldc literal_224:"Must have a positive window size"
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label47:
	aload_0 
	aload_0_getfield _apnField   // get_name_1:  _apnField   // get_name_2:  _apnField   // get_Name:    _apnField   // getName->1:  _apnField   // getName->2:  _apnField   // getName->N:  _apnField   // ofs = 14712 ord = 14 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.EditField ) // pc=1
	putfield _apnName   // get_name_1:  _apnName   // get_name_2:  _apnName   // get_Name:    _apnName   // getName->1:  _apnName   // getName->2:  _apnName   // getName->N:  _apnName   // ofs = 16868 ord = 9 addr = 0
	aload_0 
	invokespecial net.rim.device.internal.EScreens.EScreenSession.verifyParameters // pc=1
	ireturn 
	}


public final stop( net.rim.device.internal.EScreens.sessions.UDPBlasterSession ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial net.rim.device.internal.EScreens.EScreenSession.stop // pc=1
	return 
	}


public final start( net.rim.device.internal.EScreens.sessions.UDPBlasterSession ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	invokenonvirtual net.rim.device.internal.EScreens.EScreenSession.setNumResults // pc=2
	aload_0 
	invokenonvirtual net.rim.device.internal.EScreens.EScreenSession.resetStats // pc=1
	aload_0 
	aload_0_getfield _payloadSize   // get_name_1:  _payloadSize   // get_name_2:  _payloadSize   // get_Name:    _payloadSize   // getName->1:  _payloadSize   // getName->2:  _payloadSize   // getName->N:  _payloadSize   // ofs = 16844 ord = 3 addr = 0
	newarray 2
	putfield _payload   // get_name_1:  _payload   // get_name_2:  _payload   // get_Name:    _payload   // getName->1:  _payload   // getName->2:  _payload   // getName->N:  _payload   // ofs = 16836 ord = 1 addr = 0
	aload_0_getfield _payload   // get_name_1:  _payload   // get_name_2:  _payload   // get_Name:    _payload   // getName->1:  _payload   // getName->2:  _payload   // getName->N:  _payload   // ofs = 16836 ord = 1 addr = 0
	bipush 112
	invokestatic_lib fill( byte[], byte ) // Arrays
	aload_0 
	aload_0_getfield _windowSize   // get_name_1:  _windowSize   // get_name_2:  _windowSize   // get_Name:    _windowSize   // getName->1:  _windowSize   // getName->2:  _windowSize   // getName->N:  _windowSize   // ofs = 16840 ord = 2 addr = 0
	newarray 5
	putfield _packetIds   // get_name_1:  _packetIds   // get_name_2:  _packetIds   // get_Name:    _packetIds   // getName->1:  _packetIds   // getName->2:  _packetIds   // getName->N:  _packetIds   // ofs = 16832 ord = 0 addr = 0
	aload_0_getfield _packetIds   // get_name_1:  _packetIds   // get_name_2:  _packetIds   // get_Name:    _packetIds   // getName->1:  _packetIds   // getName->2:  _packetIds   // getName->N:  _packetIds   // ofs = 16832 ord = 0 addr = 0
	bipush -1
	invokestatic_lib fill( int[], int ) // Arrays
	aload_0 
	invokespecial net.rim.device.internal.EScreens.sessions.UDPBlasterSession.sendPackets // pc=1
	aload_0 
	invokenonvirtual net.rim.device.internal.EScreens.sessions.UDPBlasterSession.stop // pc=1
	return 
	}


public final java.lang.String getSessionType( net.rim.device.internal.EScreens.sessions.UDPBlasterSession ); // address: 0
	{
	enter_narrow 
	ldc literal_85:"UDP Blaster"
	areturn 
	}


public final handleTimeout( net.rim.device.internal.EScreens.sessions.UDPBlasterSession ); // address: 0
	{
	noenter_return 
	}

}
