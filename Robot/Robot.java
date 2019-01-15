import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Robot extends Actor
{
    private int speed;
    public static int battery;
    private int rotate;
    public Robot(){
        speed=2;
        battery=1;
        rotate=15;
    }
    public Robot(int speed,int battery, int rotate){
        this.speed=speed;
        this.battery=battery;
        this.rotate=rotate;
    }
    public void act() 
    {
        move(this.speed);
        if(isAtEdge()){
            turn(rotate);
            //int rWorld = getWorld().batteryLife;
            System.out.println("Battery: " );
        }
    }    
}
