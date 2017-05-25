/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;
import javax.swing.JButton;

/**
 *
 * @author Felix
 */
public class Field extends JButton{
    // A random number generator for providing random locations.
    
 
   
    private int posX;
    private int posY;        

    /**
     * Represent a field of the given dimensions.
     * @param depth The depth of the field.
     * @param width The width of the field.
     */
    public Field(int posX,int posY)
    {  super();
    this.posX=posX;
     this.posY=posY;
       
    }
    
    /**
     * Empty the field.
     */
    public int getPosY()
    {   
        return posY;
    }
    public int getPosX()
    {   
        return posX;
    }
  
    
     
}
