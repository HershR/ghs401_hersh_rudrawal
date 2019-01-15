import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    
    public int batteryLife;
    public int batteryLife(){
        batteryLife = ((Mr_Roboto)(getWorld().getObjects(Mr_Roboto.class).get(0)).battery);//(World) getObjects(Mr_Roboto.class).get(0).battery();//Mr_Roboto.battery; //
        System.out.println("Battery"+batteryLife);
        return batteryLife;
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        addObject(new Mr_Roboto(5,5,5),200,300);
    }
}
