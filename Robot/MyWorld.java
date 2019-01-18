import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public int counter = 3;
    public int batteryLife= Amb.battery;
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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        //addObject(new Robot(4,400,90),100,100);
        addObject(new Amb(4,400,0),100,100);
    }
}
