import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mr_Roboto extends Actor
{
    private int speed;
    public static int battery;
    private int turnA;
    private int counter = 3;
    public Mr_Roboto(){
        turn(90);
        this.speed=1;
        this.battery=1;
        this.turnA=22;
    }
    public Mr_Roboto(int speed, int battery, int turnA){
        turn(90);
        this.speed=speed;
        this.battery=battery;
        this.turnA=turnA;
    }
    public void act() 
    {
        move(speed);
        counter = counter - 1;
        if(isAtEdge()){
            turn(turnA);
            int myworld=((MyWorld)getWorld()).batteryLife;
            System.out.println("Battery Life: "+ myworld);
        }
        
        
        
    }    
}
