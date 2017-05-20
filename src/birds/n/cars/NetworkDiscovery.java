/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author CvU
 */
public class NetworkDiscovery {
 
    private String ip = "224.0.0.1";
    private final int port = 42069;
    private InetAddress group;
    private MulticastSocket socket;
    DatagramPacket packet;
    Set<String> hosts;
    
    boolean placeholder = true; //to be replaced with isSearching state or something
    
        public NetworkDiscovery() {
            try{
                byte[] buf;
                socket = new MulticastSocket(port);
                group = InetAddress.getByName(ip);
                socket.joinGroup(group);

                        while(placeholder) {
                            String receivedPacket;
                            buf = new byte[256];
                            packet = new DatagramPacket(buf, buf.length);
                            socket.receive(packet);                       
                            receivedPacket = new String(packet.getData(), 0, packet.getLength());

                            hosts.add(receivedPacket);
                        } 
                        socket.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
}