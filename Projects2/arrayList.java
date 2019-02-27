import java.util.ArrayList;

public class arrayList
{
    public static void main(){
        ArrayList<String> myList= new ArrayList<String>();
        myList.add("Hersh");
        myList.add("Nadav");
        myList.add("Sri");
        myList.add(1,"Nick");
        myList.set(3,"David");
        myList.remove(3);
        myList.remove("Nadav");
        for(int i =0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}
