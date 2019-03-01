import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("",200,200);
        
        addObject(new Star(), 20,200);
        addObject(new Star(), 300,500);
        addObject(new Star(), 200,200);
        addObject(new Star(), 55,340);
        addObject(new Star(), 120,30);
        addObject(new Star(), 460,200);
        addObject(new Ship(),500,335);
    }
}
