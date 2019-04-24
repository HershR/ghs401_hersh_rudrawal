 

public class Crossword
   {
   private Square[][] puzzle;
   
   public Crossword()
      {
      puzzle = new Square[5][5];  
      for(int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            puzzle[row][col] = new Square( true, 0 );    
            } // end inner for
         } // end outer for
         
         
      } // end zero-arg constructor
   
   public Crossword( boolean[][] blackSquares )
      {
       puzzle= new Square[blackSquares.length][blackSquares[0].length];
       int labled=1;
       for(int r=0;r<puzzle.length;r++){
            for(int c=0;c<puzzle[0].length;c++){
                /*if(blackSquares[r][c]){
                    labled=0;
                }else    
                if(r==0&&c==0){
                    labled=2;
                }else
                if((r!=0 && blackSquares[r-1][c])||(c!=0 && blackSquares[r][c-1])){
                    labled=2;
                }
                */
               if(toBeLabeled(r,c,blackSquares)==true){
                   puzzle[r][c]=new Square(blackSquares[r][c],labled);   
                   labled++;
               }else{
                puzzle[r][c]=new Square(blackSquares[r][c],0);
                }
               
                
                
            }
            }    
       }
    
       
        
        
       
      // to be completed in Part (b)
      
      
      
       // end one-arg constructor 
       
   private boolean toBeLabeled( int r, int c, boolean[][] blackSquares )
      {
      if(blackSquares[r][c]){
          return false;
      }    
      if(r<blackSquares.length&&c==0){
          return true;
      }
      if((r!=0 && blackSquares[r-1][c])||(c!=0 && blackSquares[r][c-1])){
        return true;
      }
      
      return false;    
      } // end method toBeLabeled
      
   public String toString()
      {
      String output = new String();
      
      for( int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            if( puzzle[row][col].getIsBlack() == true )
               {
               output += (char)(9608) + "\t";   // 9608 adds a black square
               } 
            else
               {
                   output += puzzle[row][col].getNum() + "\t"; //prints number of square
               
               } // end else 
            } // end inner for
         output += "\n";      
         } // end outer for
      return output;  
      } // end method toString()
   } // end class Crossword
   