import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Brick extends Actor
{
    
    public void act() 
    {
        if(isTouching(LightHouse.class)){
            getWorld().removeObject(this);
        }
    }    
}
