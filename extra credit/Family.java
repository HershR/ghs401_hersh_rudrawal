
import java.util.List;
import java.util.ArrayList;

public class Family
{
    private ArrayList<Relative> family;
    public Family()
    {
      family= new ArrayList<Relative>();
      family.add(new Relative("Joe",23));
      family.add(new Relative("Moe",2));
      family.add(new Relative("Boe",6));
      family.add(new Relative("Soe",15));
      family.add(new Relative("Zoe",17));
    }
    public Family(String name, int age)
    {
        
        family.add(new Relative(name,age));
    }
    public void sortByAge(){
        ArrayList <Relative> tempFamily= new ArrayList<Relative>();
        int in=0;
        for(int c=0;c<(family.size());c++){
            for(int i=0;i<(family.size());i++){
            if((family.get(c)).getAge()<=(family.get(i)).getAge()){
                if(i==(family.size()-1)){
                    tempFamily.add(in,(family.get(c)));
                    in++;
                }
            }else if(i==(family.size()-1)){
                    tempFamily.add(((tempFamily.size())),(family.get(c)));
                }
          }
        }
        family=tempFamily;
    }
    public String toString(){
        String result=new String();
        for(int i=0;i<family.size();i++){
            if(family.get(i)!=null){
                result+=("Name: " +(family.get(i)).getName()+" Age: "+(family.get(i)).getAge()+"\n");
            }
        }
        return result;
    }
}
