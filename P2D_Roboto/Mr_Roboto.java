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
        
        this.speed=speed;
        this.battery=battery;
        this.turnA=turnA;
    }
    public void act() 
    {
        move(this.speed);
        counter = counter - 1;
        if(isAtEdge()){
            move(-1);
            turn(turnA);
        }
        int myWorldVar= ((MyWorld) getWorld()).getBattery();
        int myWorldVar2= ((MyWorld) getWorld()).getCounter();
        if(myWorldVar>0){
            System.out.println("Speed:"+this.speed+"\tBattery: "+myWorldVar+"\tRotation: "+this.turnA);
        }else if(myWorldVar<=0){
            speed=0;
            turnA=0;
            System.out.println("Battery empty");
        }
        
    }    
}    
