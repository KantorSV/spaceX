UDP - быстро, но не гарантирует доставку данных. В Java DatagramSocket (UDP socket)
он пересылает byte[] , которые называются DatagramPacket



DatagramSockett socket = new DatagramSocket(port);
DatagramPacket packet = new DatagramPacket(byte[]);
socket.send(packet); 



----------------------------------

TCP - более медленный, чем UDP, но гарантирует доставку всех данных
RMI - основан на TCP