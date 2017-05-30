/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.io.*;
import java.net.*;

/**
 *
 * @author BlackBox
 */
public class Sender {
    int portNumber;    
    
    /**
     *
     * 
     * @param portNumber the port this socket is sending to
     */
    public Sender(int portNumber) {
        this.portNumber = portNumber;        
    }
    
    /**
     *
     * @param address host address to send to
     * @param content the ParkingLot object that is to be sent
     */
    public void sendData(String address, ParkingLot content) {
        
        byte[] arrayData = null;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteStream);
            content.writeExternal(objectOutputStream);
            arrayData = byteStream.toByteArray(); 

            objectOutputStream.flush();
            byteStream.close();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }        
 
        try(DatagramSocket socket = new DatagramSocket()) {
            InetAddress iAddr = InetAddress.getByName(address);           
            DatagramPacket packet = new DatagramPacket(arrayData, arrayData.length, iAddr, portNumber);
            socket.send(packet);
            
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}