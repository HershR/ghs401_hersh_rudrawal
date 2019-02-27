import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        addObject(new Rocket(5),100,100);
        addObject(new Destination(),500,300);
        showText("",500,500);
    } 
}
