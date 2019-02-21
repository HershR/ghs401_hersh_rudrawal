
import java.util.List;
import java.util.ArrayList;

public class Family
{
    private Relative[] family;
    public Family()
    {
      family= new Relative[5];
      family[0]=(new Relative("Joe",23));
      family[1]=(new Relative("Moe",2));
      family[2]=(new Relative("Boe",6));
      family[3]=(new Relative("Soe",15));
      family[4]=(new Relative("Zoe",17));
    }
    public Family(String name, int age)
    {
        int index=family.length;
        family[index]=(new Relative(name,age));
    }
    public void sortByAge(){
        Relative[] tempFamily= new Relative[(family.length)];
        int i=0;
        for(Relative curr:family){
            for(int num=0;num<family.length;num++){
                if(family[num].getAge()<curr.getAge()|| num==((family.length)-1)){
                   tempFamily[i]=curr; 
                   i++;
                }else if(family[num].getAge()>curr.getAge()|| num==((family.length)-1)){
                   tempFamily[i]=family[num];
                   i++;
                }
            }
        }
        family=tempFamily;
    }
    public String toString(){
        String result=new String();
        for(int i=0;i<family.length;i++){
            if(family[i]!=null){
                result+=("Name: " +family[i].getName()+" Age: "+family[i].getAge()+"\n");
            }
        }
        return result;
    }
}
