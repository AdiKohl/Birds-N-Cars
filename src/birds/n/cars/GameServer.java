/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JOptionPane;

/**
 *
 * @author CvU
 */
public class GameServer extends Thread {
    
    protected DatagramSocket socket = null;
    private final String sessionName;
    boolean placeholder = true; //placeholder for loop condition
    
    public GameServer(String name) throws IOException {
        super(name);
        socket = new DatagramSocket(42069);
        sessionName = name;
    }
    @Override
    public void run() {
        
        byte[] buf;
        while(placeholder) {
            try {                
                buf = new byte[256];
                buf = sessionName.getBytes();
                
                DatagramPacket packet;
                InetAddress group = InetAddress.getByName("224.0.0.0.1");
                
                packet = new DatagramPacket(buf, buf.length, group, socket.getPort());
                socket.send(packet);

                try {
                    sleep(2000);
                }
                catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
        socket.close();
    }
}
