import javax.swing.JOptionPane;
public class P1E
{
    // instance variables - replace the example below with your own
   public static void main(){
    int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Array length"));   
    while(num<10 || num>20){
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter Value between 10-20"));
    
    }
    int[] myArray= new int[num];
    for(int i=0;i<num;i++){
        int range = 100-10;
        int ran = (int)(Math.random()*range+10);
        myArray[i] =ran ;
    }
    for(int i=0;i<num;i++){
    
        System.out.print(myArray[i]+" ");
    
    }
    }
}