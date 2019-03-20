

public abstract class Food
{
   private int calories;
   private String name;
   private int serialNumber;
   private static int foodCounter=0;
   public Food(int c, String n)
    {
        this.calories=c;
        this.name=n;
        foodCounter++;
        this.serialNumber=this.foodCounter;
    }
   public double getCalories(){
        return this.calories;
    }
   public abstract String foodPortions(int portion);
   public String toString(){
        return this.name+" has "+this.calories+" calories."+ "Serial number:"+this.serialNumber;
   }
}
