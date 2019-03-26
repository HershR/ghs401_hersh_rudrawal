public class StudentAdvance extends Advance
   {
       //private int id;
       private double cost;
       public StudentAdvance(int d){
           super(d);
           //this.id=id;
           this.cost=(super.getPrice()/2);
       }
       public double getPrice(){
           return this.cost; 
       }
       public String toString(){
           return super.toString()+"\n(Student ID required)";
       }
   } // end class StudentAdvance
