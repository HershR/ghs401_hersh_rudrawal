import  javax.swing.JOptionPane;
public class whileLoops
{
    public static void main(){
       
        int age =Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        
        while(age<0 || age>=120){
            System.out.println("Please enter a resonable age.");
            age =Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        }
        System.out.println("Thank you!");
         }  
}
