
public class recursion
{
   public static void main(){
       System.out.println(go("world"));
   }
   public static String go(String word){
       if(word.length()==0){
           return "*****"; 
       }
       return go(word.substring(1))+word.substring(0,1);
   }
}
