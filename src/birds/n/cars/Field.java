/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Felix
 */
public class Field extends JButton {
    
    private final int posX;
    private final int posY;

    /**
     * Represent a tile at the given X and Y coordinate.
     *
     * @param posX
     * @param posY
     */
    public Field(int posX, int posY) {
        super("");
        this.posX = posX;
        this.posY = posY;
        super.setBackground(Color.LIGHT_GRAY);

    }

    public int getPosY() {
        return posY;
    }

    public int getPosX() {
        return posX;
    }
}
