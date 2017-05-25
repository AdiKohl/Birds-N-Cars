/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Team8
 */

public class BirdsNCars {
   
    ParkingLot parking1;
    ParkingLot parking2;
    MainWindow menu;
   
    
    public BirdsNCars() {
        this.menu = new MainWindow();
        menu.setVisible(true);
        
        this.parking1 = new ParkingLot();
        this.parking2 = new ParkingLot();
        
        
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> new BirdsNCars());
    }

    

}
