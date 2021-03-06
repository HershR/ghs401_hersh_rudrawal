import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
public class Robot extends Actor
    {
    public static int speed;
    public static int battery;
    public static int rotate;
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
        }
        int myWorldVar= ((MyWorld) getWorld()).getBattery();
        int myWorldVar2= ((MyWorld) getWorld()).getCounter();
        //System.out.println("Battery: " + myWorldVar);
        //System.out.println("Counter: " + myWorldVar2);
        if(myWorldVar<=0){
            speed=0;
            rotate=0;
            System.out.println("Battery empty");
        }
    }    
}
