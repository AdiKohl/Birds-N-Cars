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
   
    
    public BirdsNCars(){

        
        this.parking1 = new ParkingLot();
        this.parking2 = new ParkingLot();
        parking1.placeSplash(1,1);
        
        this.menu = new MainWindow(parking1, parking2);
        menu.setVisible(true);
        
        parking1.printField();
        
        
        
//        parking1.shot(5,5);
//        parking1.placeWreck(1,1);
//        
//        for(int i=0; i<=9; i++){
//            for(int j=0;j<=9;j++){
//                System.out.print(parking1.field[i][j]);                
//            }
//            System.out.println("");
//        }
//        
//        System.out.println("");
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> new BirdsNCars());
        

    }
    
    
    public void shot(int xpos, int ypos){
        
    }

    

}
