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
    List<Star> starList; 
    public Ship(){
        List<Star> starList=new ArrayList<Star>();
        starList.add(new Star());
        starList.add(new Star());
        starList.add(new Star());
        starList.add(new Star());
        starList.add(new Star());
        starList.add(new Star());
    }
    public double calcAverageLuminosity(){
        double av=0;
        for(Star curr: starData){
            
        }
        return av;
    }
    public void act() 
    {
        move(5);
        if(isAtEdge()){
            move(-1);
            turn(43);
        }
        starData=getWorld().getObjects(Star.class);
    }    
}
