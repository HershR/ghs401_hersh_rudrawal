import  javax.swing.JOptionPane;
public class GPA
{
    // instance variables - replace the example below with your own
  public static void main(){
    String gpa = JOptionPane.showInputDialog("Enter GPA:");
    float gpaFl = Float.parseFloat(gpa); 
    if(gpaFl>=4.0){
    System.out.println("You must take honors");
    }else if(gpaFl>0.0){
    System.out.println("Thank You");
    }else{
    System.out.println("That's Impossible");
}
}
}
