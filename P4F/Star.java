import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  javax.swing.JOptionPane;
public class Star extends Actor
{
    private int lum;
    public Star(){
        this.lum=(int)(Math.random()*500+500);;
    }
    public int getlum(){
        return this.lum;
    }
    public void setlum(int x){
        this.lum=x;
    }
    public String toString(){
    
        return "";
    }
    public void act() 
    {
        this.lum--;
        getWorld().showText("Lum: "+this.lum,getX(),getY());
        if(this.lum<=0){
             getWorld().removeObject(this);
             
        }
    }    
}
