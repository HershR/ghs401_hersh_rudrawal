import java.util.ArrayList;
public class watson
{
   public static void main(){
       ArrayList<String> elementList= new ArrayList<String>();
       elementList.add("argon");
       elementList.add("boron");
       elementList.add("carbon");
       elementList.add("flourine");
       elementList.add("gold");
       elementList.add("iron");
       elementList.add("livermorium");
       System.out.println("The element are: ");
       for(int i =0;i<elementList.size();i++){
           System.out.println(elementList.get(i)); 
       }
       System.out.println("The elements containg 'on' are: ");
       for(int i =0;i<elementList.size();i++){
           if(elementList.get(i).contains("on")){
               System.out.println(elementList.get(i));
           }
       }
       System.out.println("Remove all elements alphabetically after 'd': ");
       for(int i =0;i<elementList.size();i++){
           int result=0;
           if(result==0){
               System.out.println(elementList.get(i));
           }
       }
   }
}
