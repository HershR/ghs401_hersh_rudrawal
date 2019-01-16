import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //addObject(new Elephant(5),100,100);
        addObject(new Elephant(10,90), 100, 200);
        //addObject(new Elephant(),100,300);
        showText("Hello",getWidth()/2,100);
    }
}
