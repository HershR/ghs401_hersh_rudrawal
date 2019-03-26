import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
        for(int i =50;i<getWidth();i=i+getWidth()/12){
            addObject(new Brick(),i,50);
        }
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("q")){
            addObject(new LightHouse(),50,300);
        }
        if(Greenfoot.isKeyDown("w")){
            addObject(new LightHouse(),100,300);
        }
        if(Greenfoot.isKeyDown("e")){
            addObject(new LightHouse(),200,300);
        }
        if(Greenfoot.isKeyDown("r")){
            addObject(new LightHouse(),300,300);
        }
        if(Greenfoot.isKeyDown("t")){
            addObject(new LightHouse(),400,300);
        }
        if(Greenfoot.isKeyDown("y")){
            addObject(new LightHouse(),500,300);
        }
    }
}
