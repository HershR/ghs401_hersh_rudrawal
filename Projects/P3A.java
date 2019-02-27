import javax.swing.JOptionPane;
public class P3A
{
    // instance variables - replace the example below with your own
    public static void main(){
        int um= 0;
        int butter=0;
        
        String[] myArray1 = new String[3];
        String[] myArray2 = new String[3];
        
        myArray1[0] = JOptionPane.showInputDialog("Enter your first name");
        myArray1[1] = JOptionPane.showInputDialog("Enter your middle name");
        myArray1[2] = JOptionPane.showInputDialog("Enter your last name");
        
        myArray2[0] = JOptionPane.showInputDialog("Enter your first name");
        myArray2[1] = JOptionPane.showInputDialog("Enter your middle name");
        myArray2[2] = JOptionPane.showInputDialog("Enter your last name");
        for(int i =0;i<myArray1.length;i++){
           // System.out.println(myArray1[i]);
           // System.out.println(myArray2[i]);
           um=um+myArray1[i].length();
           butter=butter+myArray2[i].length();      
        }
        if (um>butter){
            System.out.println("Name 1 is Bigger");
        }
        else if (um<butter){
            System.out.println("Name 2 is Way Bigger");
        }
        else {
           System.out.println("Both the same");
        }
    }
}
