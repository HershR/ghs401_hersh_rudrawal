import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    List<Star> starData;
    //ArrayList<Star> starList; 
    public Ship(){
       starData=new ArrayList<Star>();
        
    }
    public double calcAverageLuminosity(){
        double av=0;
        for(Star curr: starData){
            av+=(double)curr.getlum();
        }
        return av/starData.size();
    }
    public int calcMaxLuminosity()
    {
        int max = 0;
        for (Star currStar: starData)
        {
            if (currStar.getlum() > max){
                max = currStar.getlum();
            }
        }
        return max;
    }
    public void act() 
    {
        move(5);
        if(isAtEdge()){
            move(-1);
            turn(43);
        }
        starData=getWorld().getObjects(Star.class);
        getWorld().showText("Average: "+((int)(calcAverageLuminosity())),80,60);
        getWorld().showText("Max: "+((int)(calcMaxLuminosity())),80,80);
    }    
}
