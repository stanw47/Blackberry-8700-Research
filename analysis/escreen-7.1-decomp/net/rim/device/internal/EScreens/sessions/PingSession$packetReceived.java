// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_escreen.cod
// Module version  : 7.1.0.137
// Class ID        : 50
// ########################################################


package net.rim.device.internal.EScreens.sessions;


abstract final class PingSession$packetReceived extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _localPingsSent ; // ofs = 16454 addr = 0)
	private final net.rim.device.internal.EScreens.sessions.PingSession /*net.rim.device.internal.EScreens.sessions.PingSession*/  this$0 ; // ofs = 16458 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.internal.EScreens.sessions.PingSession$packetReceived, net.rim.device.internal.EScreens.sessions.PingSession ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( net.rim.device.internal.EScreens.sessions.PingSession$packetReceived ); // address: 0
	{
	enter 
Label1:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.EScreenSession.getState // pc=1
	iconst_1 
	if_icmpeq Label6
	return 
Label6:
	bipush 4
	newarray 2
	astore_2 
	iconst_0 
	istore_3 
Label11:
	iload_3 
	bipush 8
	if_icmpge Label21
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield tempData   // get_name_1:  tempData   // get_name_2:  tempData   // get_Name:    tempData   // getName->1:  tempData   // getName->2:  tempData   // getName->N:  tempData   // ofs = 16332 ord = 23 addr = 0
	iload_3 
	iconst_0 
	bastore 
	iinc 3 1
	goto Label11
Label21:
	iconst_0 
	newarray 2
	astore_3 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 16296 ord = 14 addr = 0
	aload_3 
	aload_3 
	arraylength 
	invokeinterface interfacemethodref_3 // pc=3 guess=27
	checkcast_lib Object//java.lang.Object java.lang.Object java.lang.Object
	putfield receivedDatagram   // get_name_1:  receivedDatagram   // get_name_2:  receivedDatagram   // get_Name:    receivedDatagram   // getName->1:  receivedDatagram   // getName->2:  receivedDatagram   // getName->N:  receivedDatagram   // ofs = 16320 ord = 20 addr = 0
	sipush 800
	i2l 
	invokestatic_lib sleep( long ) // PingSession$packetReceived
	goto Label40
	astore_4 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.PingSession.stop // pc=1
Label40:
	aload_0 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _pingsSent   // get_name_1:  _pingsSent   // get_name_2:  _pingsSent   // get_Name:    _pingsSent   // getName->1:  _pingsSent   // getName->2:  _pingsSent   // getName->N:  _pingsSent   // ofs = 16268 ord = 7 addr = 0
	putfield _localPingsSent   // get_name_1:  _localPingsSent   // get_name_2:  _localPingsSent   // get_Name:    _localPingsSent   // getName->1:  _localPingsSent   // getName->2:  _localPingsSent   // getName->N:  _localPingsSent   // ofs = 16454 ord = 0 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 16296 ord = 14 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield receivedDatagram   // get_name_1:  receivedDatagram   // get_name_2:  receivedDatagram   // get_Name:    receivedDatagram   // getName->1:  receivedDatagram   // getName->2:  receivedDatagram   // getName->N:  receivedDatagram   // ofs = 16320 ord = 20 addr = 0
	invokeinterface interfacemethodref_9 // pc=2 guess=28
	invokestatic_lib long currentTimeMillis(  ) // System
	l2i 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _curStartTime   // get_name_1:  _curStartTime   // get_name_2:  _curStartTime   // get_Name:    _curStartTime   // getName->1:  _curStartTime   // getName->2:  _curStartTime   // getName->N:  _curStartTime   // ofs = 16260 ord = 5 addr = 0
	isub 
	istore_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield receivedDatagram   // get_name_1:  receivedDatagram   // get_name_2:  receivedDatagram   // get_Name:    receivedDatagram   // getName->1:  receivedDatagram   // getName->2:  receivedDatagram   // getName->N:  receivedDatagram   // ofs = 16320 ord = 20 addr = 0
	invokeinterface interfacemethodref_11 // pc=1 guess=29
	putfield seqNumber   // get_name_1:  seqNumber   // get_name_2:  seqNumber   // get_Name:    seqNumber   // getName->1:  seqNumber   // getName->2:  seqNumber   // getName->N:  seqNumber   // ofs = 16360 ord = 30 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield receivedDatagram   // get_name_1:  receivedDatagram   // get_name_2:  receivedDatagram   // get_Name:    receivedDatagram   // getName->1:  receivedDatagram   // getName->2:  receivedDatagram   // getName->N:  receivedDatagram   // ofs = 16320 ord = 20 addr = 0
	invokeinterface interfacemethodref_18 // pc=1 guess=30
	putfield tempData   // get_name_1:  tempData   // get_name_2:  tempData   // get_Name:    tempData   // getName->1:  tempData   // getName->2:  tempData   // getName->N:  tempData   // ofs = 16332 ord = 23 addr = 0
	iconst_0 
	istore_4 
Label67:
	iload_4 
	bipush 4
	if_icmpge Label81
	aload_2 
	iload_4 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield tempData   // get_name_1:  tempData   // get_name_2:  tempData   // get_Name:    tempData   // getName->1:  tempData   // getName->2:  tempData   // getName->N:  tempData   // ofs = 16332 ord = 23 addr = 0
	iload_4 
	bipush 4
	iadd 
	baload 
	bastore 
	iinc 4 1
	goto Label67
Label81:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield seqNumber   // get_name_1:  seqNumber   // get_name_2:  seqNumber   // get_Name:    seqNumber   // getName->1:  seqNumber   // getName->2:  seqNumber   // getName->N:  seqNumber   // ofs = 16360 ord = 30 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield seqNumbuf   // get_name_1:  seqNumbuf   // get_name_2:  seqNumbuf   // get_Name:    seqNumbuf   // getName->1:  seqNumbuf   // getName->2:  seqNumbuf   // getName->N:  seqNumbuf   // ofs = 16328 ord = 22 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield uniIndex   // get_name_1:  uniIndex   // get_name_2:  uniIndex   // get_Name:    uniIndex   // getName->1:  uniIndex   // getName->2:  uniIndex   // getName->N:  uniIndex   // ofs = 16304 ord = 16 addr = 0
	bipush 20
	irem 
	saload 
	if_icmpne Label143
	aload_2 
	iconst_0 
	baload 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield dataBuf   // get_name_1:  dataBuf   // get_name_2:  dataBuf   // get_Name:    dataBuf   // getName->1:  dataBuf   // getName->2:  dataBuf   // getName->N:  dataBuf   // ofs = 16336 ord = 24 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield uniIndex   // get_name_1:  uniIndex   // get_name_2:  uniIndex   // get_Name:    uniIndex   // getName->1:  uniIndex   // getName->2:  uniIndex   // getName->N:  uniIndex   // ofs = 16304 ord = 16 addr = 0
	bipush 20
	irem 
	aaload 
	iconst_0 
	baload 
	if_icmpne Label128
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic access$900( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _resultHandled   // get_name_1:  _resultHandled   // get_name_2:  _resultHandled   // get_Name:    _resultHandled   // getName->1:  _resultHandled   // getName->2:  _resultHandled   // getName->N:  _resultHandled   // ofs = 16340 ord = 25 addr = 0
	ifne Label124
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _pingsSent   // get_name_1:  _pingsSent   // get_name_2:  _pingsSent   // get_Name:    _pingsSent   // getName->1:  _pingsSent   // getName->2:  _pingsSent   // getName->N:  _pingsSent   // ofs = 16268 ord = 7 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_203:"RX Received "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 2
	invokestatic access$1100( net.rim.device.internal.EScreens.sessions.PingSession, int, java.lang.String, int ) // PingSession
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic int access$308( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	pop 
Label124:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	iload_1 
	invokespecial net.rim.device.internal.EScreens.sessions.PingSession.checkTimeCounters // pc=2
	goto Label157
Label128:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic access$1300( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _resultHandled   // get_name_1:  _resultHandled   // get_name_2:  _resultHandled   // get_Name:    _resultHandled   // getName->1:  _resultHandled   // getName->2:  _resultHandled   // getName->N:  _resultHandled   // ofs = 16340 ord = 25 addr = 0
	ifne Label157
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _pingsSent   // get_name_1:  _pingsSent   // get_name_2:  _pingsSent   // get_Name:    _pingsSent   // getName->1:  _pingsSent   // getName->2:  _pingsSent   // getName->N:  _pingsSent   // ofs = 16268 ord = 7 addr = 0
	ldc literal_204:"Bad payload"
	bipush 3
	invokestatic access$1400( net.rim.device.internal.EScreens.sessions.PingSession, int, java.lang.String, int ) // PingSession
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic int access$308( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	pop 
	goto Label157
Label143:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic access$1500( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _resultHandled   // get_name_1:  _resultHandled   // get_name_2:  _resultHandled   // get_Name:    _resultHandled   // getName->1:  _resultHandled   // getName->2:  _resultHandled   // getName->N:  _resultHandled   // ofs = 16340 ord = 25 addr = 0
	ifne Label157
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _pingsSent   // get_name_1:  _pingsSent   // get_name_2:  _pingsSent   // get_Name:    _pingsSent   // getName->1:  _pingsSent   // getName->2:  _pingsSent   // getName->N:  _pingsSent   // ofs = 16268 ord = 7 addr = 0
	ldc literal_205:"Bad RX seq. Num."
	bipush 3
	invokestatic access$1600( net.rim.device.internal.EScreens.sessions.PingSession, int, java.lang.String, int ) // PingSession
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic int access$308( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	pop 
Label157:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic short access$704( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	pop 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokespecial net.rim.device.internal.EScreens.sessions.PingSession.isDone // pc=1
	ifne Label171
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _doDelay   // get_name_1:  _doDelay   // get_name_2:  _doDelay   // get_Name:    _doDelay   // getName->1:  _doDelay   // getName->2:  _doDelay   // getName->N:  _doDelay   // ofs = 16252 ord = 3 addr = 0
	ifeq Label168
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.PingSession.delay // pc=1
Label168:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.PingSession.sendPing // pc=1
	goto Label174
Label171:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.PingSession.stop // pc=1
	return 
Label174:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokespecial net.rim.device.internal.EScreens.sessions.PingSession.isDone // pc=1
	ifne Label178
	goto_w Label1
Label178:
	return 
	astore_2 
	aload_0_getfield _localPingsSent   // get_name_1:  _localPingsSent   // get_name_2:  _localPingsSent   // get_Name:    _localPingsSent   // getName->1:  _localPingsSent   // getName->2:  _localPingsSent   // getName->N:  _localPingsSent   // ofs = 16454 ord = 0 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _pingsSent   // get_name_1:  _pingsSent   // get_name_2:  _pingsSent   // get_Name:    _pingsSent   // getName->1:  _pingsSent   // getName->2:  _pingsSent   // getName->N:  _pingsSent   // ofs = 16268 ord = 7 addr = 0
	if_icmpeq Label185
	goto_w Label1
Label185:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _resultHandledLock   // get_name_1:  _resultHandledLock   // get_name_2:  _resultHandledLock   // get_Name:    _resultHandledLock   // getName->1:  _resultHandledLock   // getName->2:  _resultHandledLock   // getName->N:  _resultHandledLock   // ofs = 16344 ord = 26 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic access$2000( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _resultHandled   // get_name_1:  _resultHandled   // get_name_2:  _resultHandled   // get_Name:    _resultHandled   // getName->1:  _resultHandled   // getName->2:  _resultHandled   // getName->N:  _resultHandled   // ofs = 16340 ord = 25 addr = 0
	ifne Label201
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _pingsSent   // get_name_1:  _pingsSent   // get_name_2:  _pingsSent   // get_Name:    _pingsSent   // getName->1:  _pingsSent   // getName->2:  _pingsSent   // getName->N:  _pingsSent   // ofs = 16268 ord = 7 addr = 0
	ldc literal_206:"Exception on RX"
	bipush 3
	invokestatic access$2100( net.rim.device.internal.EScreens.sessions.PingSession, int, java.lang.String, int ) // PingSession
Label201:
	aload_3 
	monitorexit 
	goto Label209
	astore_5 
	aload_3 
	monitorexit 
	aload_5 
	athrow 
Label209:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokestatic int access$308( net.rim.device.internal.EScreens.sessions.PingSession ) // PingSession
	pop 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokespecial net.rim.device.internal.EScreens.sessions.PingSession.isDone // pc=1
	ifne Label223
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	getfield _doDelay   // get_name_1:  _doDelay   // get_name_2:  _doDelay   // get_Name:    _doDelay   // getName->1:  _doDelay   // getName->2:  _doDelay   // getName->N:  _doDelay   // ofs = 16252 ord = 3 addr = 0
	ifeq Label220
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.PingSession.delay // pc=1
Label220:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.PingSession.sendPing // pc=1
	goto_w Label1
Label223:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 16458 ord = 1 addr = 0
	invokenonvirtual net.rim.device.internal.EScreens.sessions.PingSession.stop // pc=1
	goto_w Label1
	}

}
