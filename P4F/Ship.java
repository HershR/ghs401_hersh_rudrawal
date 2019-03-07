import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
public class Ship extends Actor
{
    public List<Star> starData;
    public List<Star> starList; 
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
        for(int i=0;i<starList.size();i++){
            av+=(starList.get(i)).getlum();
        }
        return av/starList.size();
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
