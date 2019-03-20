import java.util.ArrayList;
public class RandomLetterChooser extends RandomStringChooser
   {
   private String str;
   private String[] list;
   //private ArrayList<String> list;
   public RandomLetterChooser( String str )
      {
          super(getSingleLetters( str ));
          
          
      } // end one-arg constructor
     
   public static String[] getSingleLetters( String str )
      {    
      String[] letters = new String[ str.length() ];
      
      for( int index = 0; index < str.length(); index++ )
         {
         letters[index] = str.substring( index, index+1);    
         }
      
      return letters;  
      } // end method getSingleLetters
   } // end class RandomStringChooser