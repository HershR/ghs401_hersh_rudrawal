
import java.util.List;
import java.util.ArrayList;

public class Family
{
    private List<Relative> family;
    public Family()
    {
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
        List<Relative> tempFamily;
        int index=0;
        for(int i=0;i<family.size();i++){
            for(int c=0; c<family.size();c++){
                if((family.get(i)).getAge()>(family.get(c)).getAge()){
                    if(c==(family.size())-1){
                        tempFamily.add( (family.get(i)));
                        index++;
                        
                    }
                }
            }
        }
        //for(Relative)
    }
}
