    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    
    public class Amb extends Actor
    {
    
    public static int speed;
    public static int battery;
    public static int rotate;
    public int edge = 0;
    public Amb(){
        speed=2;
        battery=1;
        rotate=15;
     }
    public Amb(int speed,int battery, int rotate){
        this.speed=speed;
        this.battery=battery;
        this.rotate=rotate;
    }
    public void act() 
    {
        move(this.speed);
        if(isAtEdge()){
            edge=edge+1;
            //if(edge==0){
                turn(90);
                System.out.println("Edge: "+ edge);
                //setImage("ambulance.png");
            //}
        }//else if(isAtEdge()==false){
           // edge=1;
        //}
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
