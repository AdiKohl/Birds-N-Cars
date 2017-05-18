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
    int direction; //1=north, 2=east, 3=south, 4=west
    String name;
    boolean [] hitArray;
    int [] position = new int[2];
    int direction = 1;
    
    public Figures(int size, int xPosition, int yPosition, int direction, String name){
            this.hitArray = new boolean[size];
            this.direction = direction;
            this.name = name;
            this.position [0] = xPosition;
            this.position [1] = yPosition;
            
    }
    
    public int getSize(){
        return this.size;
    }
    
    public int getDirection(){
        return this.direction;
    };
    
    public String getName(){
        return this.name;
    }
    
    public boolean[] getHitArray(){
        return this.hitArray;
    }
    
}
