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
        
        super(600, 400, 1); 
        addObject(new GOKU(),300,300);
        addObject(new VAGETA(),400,200);
        addObject(new VAGETA(),500,300);
        addObject(new VAGETA(),600,200);
        addObject(new VAGETA(),300,400);
        addObject(new VAGETA(),300,350);
        addObject(new VAGETA(),600,700);
        addObject(new VAGETA(),200,100);
       
        
        
    }
}
