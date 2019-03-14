import java.util.ArrayList;
public class changeStuff
{
    public static void main(){
        String name="Athul";
        int age=16;
        String[] fam={"Larry","Curly","Moe"};
        ArrayList<String> myList=new ArrayList<String>();
        myList.add("Larry");
        myList.add("Curly");
        myList.add("Moe");
        System.out.println(name+" "+age);
        for(String curr:fam){
            System.out.println(curr);
        }
        for(String curr:myList){
            System.out.println(curr);
        }
        System.out.println("---------------");
        Changer(name,age,fam,myList);
        System.out.println(name+" "+age);
        for(String curr:fam){
            System.out.println(curr);
        }
        for(String curr:myList){
            System.out.println(curr);
        }
    }
    public static void Changer(String n, int a, String[] f, ArrayList<String> m){
        n="Screw-Driver";
        a=100;
        for(int i=0;i<f.length;i++){
            f[i]="Micky Mouse";
        }
        for(int i=0;i<m.size();i++){
            m.set(i,"Donald Duck");
        }
    }
}
