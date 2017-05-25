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
   
   
    
    public BirdsNCars() {
        MainWindow menu = new MainWindow();
        menu.setVisible(true);
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> new BirdsNCars());
    }

    

}
