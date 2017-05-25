/*
 * You have 10 different types of figures
 * 1 x bus, size = 4
 * 2 x van, size = 3
 * 3 x car, size = 2
 * 4 x bicycle, size = 1
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
    int shits = 0;
    int [] position = new int[2];
    private Field field;
    
    
    public Figures(int size, int xPosition, int yPosition, int direction, String name){
            this.direction = direction;
            this.name = name;
            this.position [0] = xPosition;
            this.position [1] = yPosition;
            field = new Field(1,1);
            
            
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
    
    public void setShit(boolean hit){
        if(hit){
            this.shits++;
        }
    }
    
    public boolean isDestroyed(){
       boolean destroyed = false;
        if(this.shits==this.size){
            destroyed = true;
        }
        return destroyed;
}
    
}
