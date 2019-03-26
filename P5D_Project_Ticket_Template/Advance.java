public class Advance extends Ticket 
   {
       private int day;
       private double cost;
       public Advance(int d){
           super();
           this.day=d;
           this.cost=getPrice();
       }
       public double getPrice(){
           if(this.day>9){
               this.cost=30;
           }else if(this.day>0){
               this.cost=40;
           }else{
               this.cost=50;
           }
           return this.cost;
       }
       
       
   } // end class Advance