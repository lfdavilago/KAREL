package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Thing parcel = new Thing(prague, 1, 2);
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
      Wall p1= new Wall(prague,2,1 , Direction.SOUTH);
      Wall p2= new Wall(prague,2,2 , Direction.SOUTH);
      Wall p3= new Wall(prague,1,1 , Direction.NORTH);
      Wall p4= new Wall(prague,1,2 , Direction.NORTH);
       Wall p5= new Wall(prague,1,2 , Direction.EAST);
      Wall p6= new Wall(prague,2,2 , Direction.EAST);
       Wall p7= new Wall(prague,1,1 , Direction.WEST);
      Wall p8= new Wall(prague,2,1 , Direction.WEST);
      // Direct the robot to the final situation
      int a=1;
      int cont=0;
      for (int i=0;i<=a;i++){
          karel.move();
          if(i==a){
             karel.turnLeft();
             cont+=1;
             if(cont!=4){
            i=0;
            a=3;
          }else{
               karel.move();
             }
      }
      }
      
      System.out.println(karel.countThingsInBackpack());
   }
}
