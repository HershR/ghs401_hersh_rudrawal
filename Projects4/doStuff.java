
public class doStuff
{
      public static void main(){
       doStuff(12345);
   }
    public static void doStuff(int n){
       System.out.println(n%10);
       if(n/10!=0){
           doStuff(n/10);
       }
       System.out.println(n%10);
   }

}
