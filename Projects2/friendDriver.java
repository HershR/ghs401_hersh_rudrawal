import java.util.ArrayList;
import java.util.List;
public class friendDriver
{
    public static void main(){
        List<String> frenList= new ArrayList<String>();
        frenList.add("Hersh");
        frenList.add("Paimon");
        frenList.add("Jack");
        frenList.add("Athool");
        for(int i =0;i<frenList.size();i++){
            //frenList.remove(i);
            //i-=1;
            System.out.println(frenList.get(i));
        }
        for(String currFren:frenList){
            System.out.println(currFren);
            
        }
    }
}
