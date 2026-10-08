// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 53
// ########################################################


package net.rim.device.internal.EScreens.sessions;


abstract final class TraceRouteSession$packetReceived extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.internal.EScreens.sessions.TraceRouteSession /*net.rim.device.internal.EScreens.sessions.TraceRouteSession*/  this$0 ; // ofs = 16766 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.internal.EScreens.sessions.TraceRouteSession$packetReceived, net.rim.device.internal.EScreens.sessions.TraceRouteSession ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( net.rim.device.internal.EScreens.sessions.TraceRouteSession$packetReceived ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
Label3:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	iconst_0 
	putfield sessionID   // get_name_1:  sessionID   // get_name_2:  sessionID   // get_Name:    sessionID   // getName->1:  sessionID   // getName->2:  sessionID   // getName->N:  sessionID   // ofs = 16686 ord = 19 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	iconst_0 
	putfield seqNumber   // get_name_1:  seqNumber   // get_name_2:  seqNumber   // get_Name:    seqNumber   // getName->1:  seqNumber   // getName->2:  seqNumber   // getName->N:  seqNumber   // ofs = 16690 ord = 20 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield _hopID   // get_name_1:  _hopID   // get_name_2:  _hopID   // get_Name:    _hopID   // getName->1:  _hopID   // getName->2:  _hopID   // getName->N:  _hopID   // ofs = 16614 ord = 1 addr = 0
	bipush 5
	if_icmplt Label14
	goto_w Label153
Label14:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 16630 ord = 5 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield receivedDatagram   // get_name_1:  receivedDatagram   // get_name_2:  receivedDatagram   // get_Name:    receivedDatagram   // getName->1:  receivedDatagram   // getName->2:  receivedDatagram   // getName->N:  receivedDatagram   // ofs = 16658 ord = 12 addr = 0
	invokeinterface interfacemethodref_9 // pc=2 guess=37
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield receivedDatagram   // get_name_1:  receivedDatagram   // get_name_2:  receivedDatagram   // get_Name:    receivedDatagram   // getName->1:  receivedDatagram   // getName->2:  receivedDatagram   // getName->N:  receivedDatagram   // ofs = 16658 ord = 12 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=38
	putfield sessionID   // get_name_1:  sessionID   // get_name_2:  sessionID   // get_Name:    sessionID   // getName->1:  sessionID   // getName->2:  sessionID   // getName->N:  sessionID   // ofs = 16686 ord = 19 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield receivedDatagram   // get_name_1:  receivedDatagram   // get_name_2:  receivedDatagram   // get_Name:    receivedDatagram   // getName->1:  receivedDatagram   // getName->2:  receivedDatagram   // getName->N:  receivedDatagram   // ofs = 16658 ord = 12 addr = 0
	invokeinterface interfacemethodref_11 // pc=1 guess=39
	putfield seqNumber   // get_name_1:  seqNumber   // get_name_2:  seqNumber   // get_Name:    seqNumber   // getName->1:  seqNumber   // getName->2:  seqNumber   // getName->N:  seqNumber   // ofs = 16690 ord = 20 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield receivedDatagram   // get_name_1:  receivedDatagram   // get_name_2:  receivedDatagram   // get_Name:    receivedDatagram   // getName->1:  receivedDatagram   // getName->2:  receivedDatagram   // getName->N:  receivedDatagram   // ofs = 16658 ord = 12 addr = 0
	invokeinterface interfacemethodref_18 // pc=1 guess=40
	astore_2 
	iconst_0 
	istore_3 
Label35:
	iload_3 
	bipush 4
	if_icmpge Label49
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataRecByte   // get_name_1:  dataRecByte   // get_name_2:  dataRecByte   // get_Name:    dataRecByte   // getName->1:  dataRecByte   // getName->2:  dataRecByte   // getName->N:  dataRecByte   // ofs = 16682 ord = 18 addr = 0
	iload_3 
	aload_2 
	iload_3 
	bipush 4
	iadd 
	baload 
	bastore 
	iinc 3 1
	goto Label35
Label49:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield sessionID   // get_name_1:  sessionID   // get_name_2:  sessionID   // get_Name:    sessionID   // getName->1:  sessionID   // getName->2:  sessionID   // getName->N:  sessionID   // ofs = 16686 ord = 19 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield sessionIDbuf   // get_name_1:  sessionIDbuf   // get_name_2:  sessionIDbuf   // get_Name:    sessionIDbuf   // getName->1:  sessionIDbuf   // getName->2:  sessionIDbuf   // getName->N:  sessionIDbuf   // ofs = 16670 ord = 15 addr = 0
	iload_1 
	bipush 20
	irem 
	saload 
	if_icmpne Label3
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield seqNumber   // get_name_1:  seqNumber   // get_name_2:  seqNumber   // get_Name:    seqNumber   // getName->1:  seqNumber   // getName->2:  seqNumber   // getName->N:  seqNumber   // ofs = 16690 ord = 20 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield seqNumbuf   // get_name_1:  seqNumbuf   // get_name_2:  seqNumbuf   // get_Name:    seqNumbuf   // getName->1:  seqNumbuf   // getName->2:  seqNumbuf   // getName->N:  seqNumbuf   // ofs = 16674 ord = 16 addr = 0
	iload_1 
	bipush 20
	irem 
	saload 
	if_icmpne Label3
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataRecByte   // get_name_1:  dataRecByte   // get_name_2:  dataRecByte   // get_Name:    dataRecByte   // getName->1:  dataRecByte   // getName->2:  dataRecByte   // getName->N:  dataRecByte   // ofs = 16682 ord = 18 addr = 0
	iconst_0 
	baload 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataBuf   // get_name_1:  dataBuf   // get_name_2:  dataBuf   // get_Name:    dataBuf   // getName->1:  dataBuf   // getName->2:  dataBuf   // getName->N:  dataBuf   // ofs = 16678 ord = 17 addr = 0
	iload_1 
	bipush 20
	irem 
	aaload 
	iconst_0 
	baload 
	if_icmpne Label130
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataRecByte   // get_name_1:  dataRecByte   // get_name_2:  dataRecByte   // get_Name:    dataRecByte   // getName->1:  dataRecByte   // getName->2:  dataRecByte   // getName->N:  dataRecByte   // ofs = 16682 ord = 18 addr = 0
	iconst_1 
	baload 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataBuf   // get_name_1:  dataBuf   // get_name_2:  dataBuf   // get_Name:    dataBuf   // getName->1:  dataBuf   // getName->2:  dataBuf   // getName->N:  dataBuf   // ofs = 16678 ord = 17 addr = 0
	iload_1 
	bipush 20
	irem 
	aaload 
	iconst_1 
	baload 
	if_icmpne Label130
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataRecByte   // get_name_1:  dataRecByte   // get_name_2:  dataRecByte   // get_Name:    dataRecByte   // getName->1:  dataRecByte   // getName->2:  dataRecByte   // getName->N:  dataRecByte   // ofs = 16682 ord = 18 addr = 0
	bipush 2
	baload 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataBuf   // get_name_1:  dataBuf   // get_name_2:  dataBuf   // get_Name:    dataBuf   // getName->1:  dataBuf   // getName->2:  dataBuf   // getName->N:  dataBuf   // ofs = 16678 ord = 17 addr = 0
	iload_1 
	bipush 20
	irem 
	aaload 
	bipush 2
	baload 
	if_icmpne Label130
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataRecByte   // get_name_1:  dataRecByte   // get_name_2:  dataRecByte   // get_Name:    dataRecByte   // getName->1:  dataRecByte   // getName->2:  dataRecByte   // getName->N:  dataRecByte   // ofs = 16682 ord = 18 addr = 0
	bipush 3
	baload 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield dataBuf   // get_name_1:  dataBuf   // get_name_2:  dataBuf   // get_Name:    dataBuf   // getName->1:  dataBuf   // getName->2:  dataBuf   // getName->N:  dataBuf   // ofs = 16678 ord = 17 addr = 0
	iload_1 
	bipush 20
	irem 
	aaload 
	bipush 3
	baload 
	if_icmpne Label130
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield _hopID   // get_name_1:  _hopID   // get_name_2:  _hopID   // get_Name:    _hopID   // getName->1:  _hopID   // getName->2:  _hopID   // getName->N:  _hopID   // ofs = 16614 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	invokestatic byte[] access$900( net.rim.device.internal.EScreens.sessions.TraceRouteSession ) // TraceRouteSession
	invokestatic_lib java.lang.String composeIpv4Address( byte[] ) // IPAddress
	bipush 2
	invokestatic access$1000( net.rim.device.internal.EScreens.sessions.TraceRouteSession, int, java.lang.String, int ) // TraceRouteSession
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.TraceRouteSession.dnsEvent // pc=1
	goto Label136
Label130:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield _hopID   // get_name_1:  _hopID   // get_name_2:  _hopID   // get_Name:    _hopID   // getName->1:  _hopID   // getName->2:  _hopID   // getName->N:  _hopID   // ofs = 16614 ord = 1 addr = 0
	ldc literal_218:"Received Incorrectly"
	bipush 3
	invokestatic access$1100( net.rim.device.internal.EScreens.sessions.TraceRouteSession, int, java.lang.String, int ) // TraceRouteSession
Label136:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	invokestatic int access$208( net.rim.device.internal.EScreens.sessions.TraceRouteSession ) // TraceRouteSession
	pop 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	invokestatic short access$1204( net.rim.device.internal.EScreens.sessions.TraceRouteSession ) // TraceRouteSession
	pop 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	getfield uniIndex   // get_name_1:  uniIndex   // get_name_2:  uniIndex   // get_Name:    uniIndex   // getName->1:  uniIndex   // getName->2:  uniIndex   // getName->N:  uniIndex   // ofs = 16642 ord = 8 addr = 0
	istore_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.TraceRouteSession.sendPacket // pc=1
	goto_w Label3
	astore_2 
	ldc literal_219:"Can't receive datagram"
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16766 ord = 0 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.TraceRouteSession.stop // pc=1
Label153:
	return 
	}

}
