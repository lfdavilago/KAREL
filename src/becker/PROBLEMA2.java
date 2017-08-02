/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author ESTUDIANTE
 */
public class PROBLEMA2 {
    public static void main(String[]args){
        City prague = new City();
      Thing parcel = new Thing(prague, 2, 2);
      Robot karel = new Robot(prague, 1, 2, Direction.SOUTH,5);
      Wall p1= new Wall(prague,2,1 , Direction.SOUTH);
      Wall p3= new Wall(prague,1,1 , Direction.NORTH);
      Wall p4= new Wall(prague,1,2 , Direction.NORTH);
       Wall p5= new Wall(prague,1,2 , Direction.SOUTH);
       Wall p7= new Wall(prague,1,1 , Direction.WEST);
      Wall p8= new Wall(prague,2,1 , Direction.WEST);
        Wall p9= new Wall(prague,1,2 , Direction.EAST);
        
        
        
        
        
    }
}
