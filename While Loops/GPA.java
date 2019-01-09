import javax.swing.JOptionPane;
public class GPA
{
  public static void main(){
    float percent= Float.parseFloat(JOptionPane.showInputDialog("Enter Percentage")); 
    while(percent<0 || percent>=100){
            percent = Float.parseFloat(JOptionPane.showInputDialog("Enter proper Percentage")); 
        }
    if(percent<60){
         System.out.println("You have an F");
      }else if(percent<70){
         System.out.println("You have an D");            
      }else if(percent<80){
         System.out.println("You have an C");
      }else if(percent<90){
         System.out.println("You have an B");
      }else{
         System.out.println("You have an A");
    }
  }
}
