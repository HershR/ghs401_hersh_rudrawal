
public class AnimalDriver
{
    public static void main(){
        Animal[] a=new Animal[6];
        
        Snake a1=new Snake(1,true,false);
        Snake a2= new Snake(4,true,true);
        Bird a3=new Bird();
        Bird a4=new Bird(2,true,true);
        BlueJ a5=new BlueJ(2,true,false,false);
        BlueJ a6=new BlueJ();
        a[0]=a1;
        a[1]=a2;
        a[2]=a3;
        a[3]=a4;
        a[4]=a5;
        a[5]=a6;
        //System.out.println(a1.slither());
        //System.out.println(a2.toString());
        //System.out.println(a3.flying());
        //System.out.println(a4.toString());
        for(Animal curr:a){
            System.out.println(curr.toString());
        }
    }
}
