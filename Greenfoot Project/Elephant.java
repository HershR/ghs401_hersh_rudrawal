import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{   
    private int speed;
    public Elephant(){
        this.speed=1;
    }
    public Elephant(int speed){
       this.speed=speed;
      
    }
    public void act(){
        move(speed);        
        if(isAtEdge()){
            turn(32);
        }
        getWorld().showText("Location is: " + this.getX(),300,300);
    }
}
