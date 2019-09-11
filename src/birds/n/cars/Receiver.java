/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.awt.CardLayout;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    String targetAddress;
    String receivedAddress;
    String Adress;
    int port;
    boolean invitationPending = false;
    boolean inGame = false;
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
                
                if(initDone) {  //replaces a ParkingLot object with received version of it self depending on whether the intial ParkingLot instances have already been exchanged or not using initDone
                    px = p2;
                } else {
                    px = p1;                    
                }
                
                byte[] arrayData;
                
            try {    //TODO rework connection procedure logic thingy
                packet = new DatagramPacket(arrayData = new byte[1024], arrayData.length);
                socket.receive(packet);
                
                if (invitationPending && compareIP(Adress, packet.getAddress().getHostAddress())) { //reception of answer
                    Adress = packet.getAddress().getHostAddress();
                    gotoPlayField();
                    inGame = true;
                    invitationPending = false;
                    continue;                    
                }
                if (!inGame) {  //reception of invite and user response
                    int response = MainWindow.connectDialog(packet.getAddress().getCanonicalHostName() + " (" + packet.getAddress().getHostAddress() + ")");
                    if (response == 0) {
                        Sender s = new Sender(port);
                        ParkingLot dummy = new ParkingLot();
                        s.sendData(packet.getAddress().getHostAddress(), dummy);
                        Adress = packet.getAddress().getHostAddress();
                        inGame = true;
                        gotoPlayField();
                        continue;
                    } else { // if user declines -> response == 1
                        continue;
                    }
                }
                System.out.println("packet received"); //debug
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(arrayData));
                px.readExternal(objectInputStream);
                
                initDone = true;
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
    
    private boolean compareIP(String ip1, String ip2) {
        try {
            return InetAddress.getByName(ip1).equals(InetAddress.getByName(ip2));
        } catch (UnknownHostException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return false;
    }

    public void setTargetIP(String address) {
        Adress = address;
    }
    
    public String getReceivedAddress() {
        return Adress;
    }
}
    
    
    
