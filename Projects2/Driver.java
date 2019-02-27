import javax.swing.JOptionPane;
public class Driver
{
   public static void main()
   {
       
  
       //String firstname = JOptionPane.showInputDialog("Whats your first name?");
       //String lastname = JOptionPane.showInputDialog("Whats your last name?");
       //String favsong = JOptionPane.showInputDialog("Whats your favorite song?");
       //String favfood = JOptionPane.showInputDialog("Whats your favorite food");
   
       
       Songs song2 = new Songs(12, "AC DC", "Highway to Hell", true,301);
       //Student student0 = new Student();
       //Student student1 = new Student(firstname,lastname,favsong,favfood);
       //Student student2 = new Student(firstname,lastname,favsong,favfood);
       //System.out.println(song1 + "\n" + song2 + "\n" + student0 + "\n" + student1);
       System.out.println(song2.toString());
       System.out.println(song2.getLengthInSec());
       System.out.println(song2.convertToMinSec());
       song2.setLengthInSec(345);
       System.out.println(song2.getLengthInSec());
       System.out.println(song2.convertToMinSec());
    }
}
