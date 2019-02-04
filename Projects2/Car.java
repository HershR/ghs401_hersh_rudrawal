
import javax.swing.JOptionPane;
public class Car
{
    private static int mpg;
    private static String mpgS;
    private static boolean isInStock;
    private static String isInStockS;
    
    public Car(int mpg, boolean isInStock){ 
        this.mpg=mpg;  
        this.isInStock=isInStock;
    }
    public static String getMPG(){
        mpgS = Integer.toString(mpg);
        return mpgS;
    }
    public static String getIsInStock(){
       isInStockS =String.valueOf(isInStock);   
       return isInStockS;     
    }
    public static void main(){


    }
}
