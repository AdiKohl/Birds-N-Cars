/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.awt.CardLayout;
import java.net.*;
import java.io.*;
import javax.swing.JPanel;

/**
 *
 * @author BlackBox
 */
public class Receiver implements Runnable{
    JPanel p;
    
    DatagramPacket packet;
    DatagramSocket socket;
    
    ParkingLot p1;
    ParkingLot p2;
    ParkingLot px;
    
    int port;
    boolean invitationPending = false;    
    boolean initDone = false;   //used to determine which ParkingLot object is used. Switches after the first transmission is received.
    
    
    /**
     *
     * @param portNumber the port this socket is listening to
     * @param p1
     * @param p2
     * @param panel
     */
    public Receiver(int portNumber, ParkingLot p1, ParkingLot p2, JPanel panel) {
        p = panel;
        port = portNumber;
        this.p1 = p1;
        this.p2 = p2;
        
        try {
            socket = new DatagramSocket(portNumber);                    
        } catch(SocketException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void run() { //very gud programming incoming
        while (true) {            
                
                if(initDone) {  //replaces ParkingLot object with modified version of it self
                    px = p2;
                } else {
                    px = p1;                    
                }
                
                byte[] arrayData;
                
            try {    //TODO rework connection procedure logic thingy
                packet = new DatagramPacket(arrayData = new byte[1024], arrayData.length);
                socket.receive(packet);
                if (!initDone && invitationPending) {
                    gotoPlayField();
                    initDone = true;
                    invitationPending = false;
                    continue;                    
                } else if (!initDone) {
                    int response = MainWindow.connectDialog(packet.getAddress().getCanonicalHostName() + " (" + packet.getAddress().getHostAddress() + ")");
                    if (response == 0) {
                        Sender s = new Sender(port);
                        ParkingLot dummy = new ParkingLot();
                        s.sendData(packet.getAddress().getHostAddress(), dummy);
                        gotoPlayField();
                        initDone = true;
                        
                    } else { // if user declines -> response == 1
                        continue;
                    }
                }
                System.out.println("packet received"); //debug
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(arrayData));
                px.readExternal(objectInputStream);                
                
                px.printField(); //debug
            } catch(IOException | ClassNotFoundException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
    
    public void setInvitationPendingFlag() {
        invitationPending = true;
    }
    
    private void gotoPlayField() {
        CardLayout card = (CardLayout)p.getLayout();
        card.show(p, "singleplayerCard");
    }
}
    
    
    
