import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VAGETA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VAGETA extends Actor
{
    private int age;
    public VAGETA(){
        this.age = (int)(Math.random()*200000);
        
    }
    public VAGETA(int age){
        this.age = age;
        
    }
    public int getAge(){
        return age;
    }
    public void setAge(int setter){
        age = setter;
    }
    public void act() 
    {
        age = age + 500;
        getWorld().showText("Age: "+age, getX(), getY());
    }    
    public String toString(){
        return "";
    }
}
