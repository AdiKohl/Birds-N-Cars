/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/**
 *
 * @author Adi
 */
public class ParkingLot implements Externalizable{

    int[][] field = new int[10][10];

    /* States:
        0 = empty field
        1 = splash
        2 = figure
        3 = wreck            
     */

    public ParkingLot() {

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                field[i][j] = 0;
            }
        }
    }
    
    public int getState(int xpos, int ypos) {
        return field[xpos][ypos];
    }

    public void shot(int xpos, int ypos) {
        field[xpos][ypos] += 1;
    }

    public void placeEmpty(int xpos, int ypos) {
        field[xpos][ypos] = 0;
    }

    public void placeSplash(int xpos, int ypos) {
        field[xpos][ypos] = 1;
    }

    public void placeFigure(int xpos, int ypos) {
        field[xpos][ypos] = 2;
    }

    public void placeWreck(int xpos, int ypos) {
        field[xpos][ypos] = 3;
    }

    public void printField() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(field);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        field =(int[][])in.readObject();
    }
}
