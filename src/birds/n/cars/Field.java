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
    
    // The depth and width of the field.
    private int depth, width;
    // Storage for the animals.
    private Object[][] field;
    private int posX;
    private int posY;        

    /**
     * Represent a field of the given dimensions.
     * @param depth The depth of the field.
     * @param width The width of the field.
     */
    public Field(int posX, int posY)
    {  super();
     width=60;
       
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
    public void clear(Location location)
    {
        field[location.getRow()][location.getCol()] = null;
    }
    /**
     * Return the depth of the field.
     * @return The depth of the field.
     */
    public int getDepth()
    {
        return depth;
    }
        /**
     * Return the width of the field.
     * @return The width of the field.
     */
    public int getWidth()
    {
        return 10;
    }
    
      /**
     * Return the animal at the given location, if any.
     * @param row The desired row.
     * @param col The desired column.
     * @return The animal at the given location, or null if there is none.
     */
    public Object getObjectAt(int row, int col)
    {
        return field[row][col];
    }
}
