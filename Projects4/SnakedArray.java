
public class SnakedArray
{
   
    private int[] num;
    public SnakedArray(int[]arr)
    {
        num= arr;     
    }
    public int[][] horizontalSnake(int r,int c){
        int[][] array=new int[r][c];  
        int count=0;
        
        for(int r2=0; r2 < array.length; r2++){
            
            if(r2%2!=0){
                for(int c2 = array[0].length-1; c2 > -1; c2--){
                    if(count>num.length-1){
                        
                            array[r2][c2]=0;

                    }else{
                        array[r2][c2]=num[count];
                        count++;
                    }
               }
            }else if(r2%2==0){
                for(int c2 = 0; c2 < array[0].length; c2++){
                    if(count>num.length-1){                        
                            array[r2][c2]=0; 
                    }else{
                        array[r2][c2]=num[count];
                        count++;
                    }
                }
            
             }
        
        }
        return array;
    }
    public int[][] verticalSnake(int r,int c){
        int[][] array=new int[r][c];
        int count=0;
        for(int c2=0; c2 < array[0].length; c2++){
            if(c2%2!=0){
                for(int r2 = array.length-1; r2 > -1; r2--){
                    if(count>num.length-1){   
                        array[r2][c2]=0;
                    }else{
                        array[r2][c2]=num[count];
                        count++;
                    }
                }
            }else if(c2%2==0){
                for(int r2 = 0; r2 < array.length; r2++){
                    if(count>num.length-1){
                        array[r2][c2]=0;
                    }else{
                        array[r2][c2]=num[count];
                        count++;
                    }
                }
            }
            
        }
        return array;
    }
}