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
    
    public GameServer(String name) throws IOException {
        super(name);
        socket = new DatagramSocket(42069);
        sessionName = name;
    }
    @Override
    public void run() {
        
        while(MultiplayerMenue.getHostActive()) {
            try {
                byte[] buf = new byte[256];
                buf = sessionName.getBytes();
                
                DatagramPacket packet;
                InetAddress address = InetAddress.getByName("255.255.255.255");
                
                packet = new DatagramPacket(buf, buf.length, address, socket.getPort());
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
