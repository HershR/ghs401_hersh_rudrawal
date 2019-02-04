import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Destination extends Actor
{
    private static int xDestination;
    public static int yDestination;
    public Destination(){
  
    }
    public void act() 
    {
      xDestination=getX();
      yDestination=getY();
      //System.out.println("X: "+xDestination+" Y: "+yDestination);
    }    
    public static int getXDestination(){
        return xDestination;
    }
}
