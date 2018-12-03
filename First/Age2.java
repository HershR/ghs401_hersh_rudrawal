import  javax.swing.JOptionPane;

public class Age2
{
    public static void main(){
        String age = JOptionPane.showInputDialog("Enter Age:");
        int x =Integer.parseInt(age);
        if(x>=16){
            System.out.println("You can drive");
        }else{
        System.out.println("you can't drive");
        }
    
}
}