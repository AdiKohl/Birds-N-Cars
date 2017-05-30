/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

import java.util.Arrays;

/**
 *
 * @author BlackBox
 */
public class Block {
    int[] x = new int[18];
    int[] y = new int[18];
    
    int a = 0;
    
    public Block() {
        Arrays.fill(x, -1);
        Arrays.fill(y, -1);
    }

    void add(int i, int j) {
        x[a] = i;
        y[a] = j;
        a++;
    }
    
    public int[] getXcoords() {
        return x;
    }
    
    public int[] getYcoords() {
        return y;
    }
    
    public boolean isValid() {
        boolean isHorizontal = true;
        boolean isVertical = true;
        for(int i : x) {
            if(i != x[0] && i != -1) {
                isHorizontal = false;
            }
        }
        for(int i : y) {
            if(i != y[0] && i != -1) {
                isVertical = false;
            }
        }
        return x[5] == -1 && y[5] == -1 && (isHorizontal || isVertical);
    }
    
    public int getLength() {
        int counter = 0;
        for(int i : x) {
            if(i != -1) {
                counter++;
            }
        }
        return counter;
    }
}
