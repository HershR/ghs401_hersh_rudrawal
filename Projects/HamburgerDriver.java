import javax.swing.JOptionPane;
public class HamburgerDriver
{
    public static void main(){
        //Make one instance(object) of hte hamburger class
        HamBurger humburger1 = new HamBurger();
        HamBurger humburger2 = new HamBurger();
        //print the tostring of the object
        System.out.println(humburger1.toString());
        System.out.println();
        System.out.println(humburger2.toString());
        HamBurger humburger3 = new HamBurger(true,3,"Chedder");
        System.out.println();
        System.out.println(humburger3.toString());
        HamBurger humburger4 = new HamBurger(true,2,"No Chesse");
        System.out.println();
        System.out.println(humburger4.toString());
    }
}
