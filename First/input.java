import  javax.swing.JOptionPane;

public class input
{
  public static void main(){
   
      String username = JOptionPane.showInputDialog("Enter Username:");
      String password = JOptionPane.showInputDialog("Please enter password:");
     
     
        
      if(password.equals("mango")&& username.equals("ghs"))
      {
          System.out.println("Access Granted");
      }
      else if(password.equals("mango")&& username!=("ghs"))
      {
          System.out.println("Please enter the correct username");
      }
      else if(password!=("mango")&& username.equals("ghs"))
      {
          System.out.println("Please enter the correct password");
      }
      else
      {
          System.out.println("Access Denied");
      }
        
   
    
    }  // instance variables - replace the example below with your own
  
}
