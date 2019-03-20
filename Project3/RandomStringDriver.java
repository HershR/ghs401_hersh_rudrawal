import java.util.ArrayList;
public class RandomStringDriver
{
    public static void main(){
        String[] word= {"wheels","on","the","bus"};
        RandomStringChooser sChooser= new RandomStringChooser(word);
      
       for( int k = 0;k < 6; k++ )
         {
         System.out.print( sChooser.getNext() + " " );    
         } // end for
    }
}
