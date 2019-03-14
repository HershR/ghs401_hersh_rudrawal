

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class GOKU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GOKU extends Actor
{
    List<VAGETA> myPlanet = new ArrayList<VAGETA>();
    public void act() 
    {
        move(5);
        myPlanet=getWorld().getObjects(VAGETA.class);
        if(Greenfoot.isKeyDown("right")){
            turn(5);
        }
        else if(Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if(isTouching(VAGETA.class)){
            removeVageta(200000);
        }
        
    }    
    public int removeVageta(int maxAge){
        int n = 0;
        for(int i = 0; i<myPlanet.size();i++ ){
            if(myPlanet.get(i).getAge() > maxAge){
                getWorld().removeObject(myPlanet.get(i));
               myPlanet.remove(i);
               i--;
                n++;
                
            }
          
        }
        return n;
        
    }
}
