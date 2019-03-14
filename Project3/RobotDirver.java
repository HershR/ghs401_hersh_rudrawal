import java.util.ArrayList;
public class RobotDirver
{
    public static void main() {
        ArrayList<Robot> list = new ArrayList<Robot>();
        
        //R2D2 r1 = new R2D2(100, true);
        //Robot r2 = new C3PO(100, 1023);
        //Robot r3 = new Terminator(100, 80);
        //Robot r4 = new Robot("wall-e", 100);
        Robot r1= new Robot("One",100);
        Robot r2= new Robot();
        Robot r3= new Robot("Three",30);
        Robot r4= new Robot("Four",55);
        list.add(r1);
        list.add(r2);
        list.add(r3);
        list.add(r4);
        
        
        for(Robot curr : list) {
            System.out.println(curr);
        }
        System.out.println("");
        for(Robot curr : list) {
            System.out.println(curr.getTask());
        }
    }
}
