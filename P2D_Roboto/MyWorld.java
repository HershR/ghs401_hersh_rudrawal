import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    
   public int counter = 3;
    public int batteryLife= Mr_Roboto.battery;
    public int getCounter(){
        counter = counter-1;
        if (counter==0 ){
            batteryLife = batteryLife-1;
            counter=3;
            }
        //System.out.println("Counter: " + counter);
        //System.out.println("Battery: " + batteryLife);
        return counter;
    }
     public int getBattery(){
        return batteryLife;
    }
    public MyWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        addObject(new Mr_Roboto(2,500,90),100,100);
        addObject(new Mr_Roboto(2,200,90),200,100);
    }
    }
