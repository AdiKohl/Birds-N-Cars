/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author CvU
 */
public class NetworkDiscovery {
 
        MulticastSocket socket = new MulticastSocket(42069);
        InetAddress address = InetAddress.getByName("255.255.255.255");
        socket.joinGroup(address);
 
        DatagramPacket packet;
     
public NetworkDiscovery(){
    while(isSearching) {
 
        byte[] buf = new byte[256];
            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
 
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Quote of the Moment: " + received);
    }
 
    socket.leaveGroup(address);
    socket.close();
    }
}