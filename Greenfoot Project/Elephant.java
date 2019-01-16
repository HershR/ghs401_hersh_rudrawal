import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{   
    private int speed;
    private int turn;
    public Elephant(){
        this.speed=1;
        this.turn=1;
    }
    public Elephant(int speed, int turn){
       this.speed=speed;
       this.turn=turn;
      
    }
    public void act(){
        move(speed);        
        if(isAtEdge()){
            turn(32);
        }
        getWorld().showText("Location is: " + this.getX(),300,300);
    }
}
