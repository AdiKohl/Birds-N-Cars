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
public class Figure {
    int size;
    Block block;

    public Figure(int length) {
        size = length;
    }
    
    public void assignBlock(Block b) {
        block = b;
    }
    
    public void clearBlock() {
        block = null;
    }
    
    public boolean hasAssigned() {
        return block != null;
    }
    
    public int getProgress() {
        if(hasAssigned()) {
            return block.getLength();
        } else {
            return 0;
        }
    }
    
    public boolean isReady() {
       return getProgress() == getLength();
    }
    
    public int getLength() {
        return size;
    }
    
}
