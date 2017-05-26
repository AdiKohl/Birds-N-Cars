/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;

/**
 *
 * @author Adi
 */
public class ParkingLot {
    
    int [][] field = new int [10][10];
    /* Zustände:
        0 = empty field
        1 = splash
        2 = figure
        3 = wreck
            
    */
    
    public ParkingLot(){

    for(int i=0;i<=9;i++){
        for(int j=0;j<=9;j++){
           field[i][j] = 0;
        }
    }
    }
    
    public void shot(int xpos, int ypos){
        field[xpos][ypos]+=1;
    }
    
    public void placeEmpty(int xpos, int ypos){
        field[xpos][ypos] = 0;
    }
    
    public void placeSplash(int xpos, int ypos){
        field[xpos][ypos] = 1;
    }
    
    public void placeFigure(int xpos, int ypos){
        field[xpos][ypos] = 2;
    }
    
    public void placeWreck(int xpos, int ypos){
        field[xpos][ypos] = 3;
    }
    
    public void printField(){
        for(int i=0; i<=9; i++){
            for(int j=0;j<=9;j++){
                System.out.print(field[i][j]);                
            }
            System.out.println("");
        }
        
        System.out.println("");
    }


}


