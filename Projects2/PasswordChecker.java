import javax.swing.JOptionPane;

public class PasswordChecker
{
    private static String school = new String("granada");
    private static String mascot = new String("matadors");
    private static String state = new String("california");
    private static boolean length=false;
    
    public static void main()
    {
        
        
        String thing = JOptionPane.showInputDialog("Which school do you go to?");
        if(thing.toLowerCase().equals(school.toLowerCase()))
        {
            String thing2 = JOptionPane.showInputDialog("Cool. What's your school's mascot?");
            if(thing2.toLowerCase().compareTo(mascot.toLowerCase())==0)
            {
                String thing3 = JOptionPane.showInputDialog("AwEsOmE. Lastly, what state do you live in?");
                if(thing3.toLowerCase().compareTo(state.toLowerCase())==0){
                    System.out.println("Welcome");
               
                }else if(thing3.compareTo(state.toLowerCase())<0){
                    System.out.println("Too early in the alphabet");
                }else if(thing3.compareTo(state.toLowerCase())>0){
                    System.out.println("Too late in the alphabet");
                }
            }else{
                System.out.println("Wrong mascot idiot...");
            }          
        }
        else{
            System.out.println("Wrong school idiot...");
            System.out.println(thing);
        }
        
        while(!length){
            String pass =JOptionPane.showInputDialog("Enter Password:");
            if(pass.length()>5){
                if(pass.contains("+")|| pass.contains("-") || pass.contains("*")|| pass.contains("@")){
                      System.out.println("You have a good password");
                      length=true;      
                }else{
                    System.out.println("Create a password with symbols");
                }
            }else{
                    System.out.println("Create a password with six letters or more!");
                }
        }
        
        
        //String pass =JOptionPane.showInputDialog("Enter password:");
        //while(pass.length()<6 || pass.contains("+")|| pass.contains("-") || pass.contains("*")|| pass.contains("@")){
        //    pass =JOptionPane.showInputDialog("Enter stronger password:");
        //    
        //}
        //System.out.println("ok");
    }
    
    
}
