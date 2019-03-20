
public class FoodDriver
{
   public static void main(){
       Food f1=new Pasta(300,"Spaget","Stringy");
       Food f2=new Pasta(600,"Pasta","Butterfly");
       Food f3 = new Burger(200,"McChicken",true);
       Food f4= new Burger(500,"Big Mac",false);
       //Food f5=new Food(100,"Chips");
       Food[] foodArray={f1,f2,f3,f4};
       for(Food curr:foodArray){
           System.out.println(curr);
       }
        
        
   }
}
