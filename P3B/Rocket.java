import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rocket extends Actor
{
   private int speed;
   public int x;
   public int y;
   public Rocket(int speed){
       this.speed=speed;
   }
   public double calcTripDistance(){
       double dist;
       int destX=Destination.getXDestination();
       int destY=Destination.yDestination;
       dist= Math.sqrt(Math.pow((destY-getY()),2)+Math.pow((destX-getX()),2));
       //dist= Math.sqrt(((destY-getX()*(destY-getX())+((destY-getX()*(destY-getX()));
       String toString=("X= "+destX+" Y: "+destY);
       return dist;
       
    }
   public double calcTripTravelTime(){
       double dist=calcTripDistance();
       int speed = this.speed;
       double time=(calcTripDistance()/speed);
       return time;
    }
   public void act (){
       move(this.speed);
       x=getX();
       y=getY(); 
       if(isAtEdge()){
           move(-1);
           turn(30);
        }
        System.out.println(x+" "+y+"\t"+Destination.getXDestination()+" "+Destination.yDestination);
        getWorld().showText("Distance to Destination: "+calcTripDistance()+" km"+"\nTime: "+calcTripTravelTime()+" hours",200,200);
    }
}
