/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

/**
 *
 * @author Lucien
 */
public class Figures {
    int size;
    int direction;
    String name;
    boolean [] hitsArray;
    int [] location = new int[2];
    
    public Figures(int size, int xPosition, int yPosition, int direction, String name){
            this.hitsArray = new boolean[size];
            this.direction = direction;
            this.name = name;
            this.location [0] = xPosition;
            this.location [1] = yPosition;
            
    }
    
}
