import java.util.ArrayList;
public class superheroDriver
{
    public static void main(){
        ArrayList <Superhero> sup=new ArrayList<Superhero>();
        SSSSGridman g1= new SSSSGridman(false,2);
        Batman b1= new Batman(false);
        Spiderman s1= new Spiderman(false,true);
        
        sup.add(new Superhero());
        sup.add(g1);
        sup.add(b1);
        sup.add(s1);
        
        for(Superhero curr:sup){
            System.out.println(curr.toString()+"\t"+curr.getMotto());
        }
        System.out.println(s1.getWebFuel());
    }
}
