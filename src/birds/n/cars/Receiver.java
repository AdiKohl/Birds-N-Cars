/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.net.*;
import java.io.*;

/**
 *
 * @author BlackBox
 */
public class Receiver implements Runnable{
    DatagramPacket packet;
    DatagramSocket socket;
    
    ParkingLot p1;
    ParkingLot p2;
    ParkingLot px;
    
    boolean initDone = false;   //used to determine which ParkingLot object is used. Switches after the first transmission is received.
    
    
    /**
     *
     * @param portNumber the port this socket is listening to
     * @param p1
     * @param p2
     */
    public Receiver(int portNumber, ParkingLot p1, ParkingLot p2) {
        this.p1 = p1;
        this.p2 = p2;
        
        try {
            socket = new DatagramSocket(portNumber);                    
        } catch(SocketException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void run() {
        while (true) {
            
                if(initDone) {
                    px = p2;
                } else {
                    px = p1;
                    initDone = true;
                }
                px = new ParkingLot();
                byte[] arrayData;
                
            try {    
                packet = new DatagramPacket(arrayData = new byte[1024], arrayData.length);
                socket.receive(packet);
                System.out.println("packet received"); //debug
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(arrayData));
                px.readExternal(objectInputStream);
            } catch(IOException | ClassNotFoundException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
    
    
    
