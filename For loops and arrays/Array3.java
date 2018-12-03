
public class Array3
{
    // instance variables - replace the example below with your own
 public static void main(){
    int[] myArray = new int[100];
    
    for (int i=0; i<myArray.length;i++){
    
        myArray[i] = i*5;
      
    }
    for(int i=0;i<myArray.length; i++){
       
        System.out.println("Item "+ (i) +" is: " +myArray[i]);
    
    }
    }
}
