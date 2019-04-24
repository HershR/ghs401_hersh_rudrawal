
public class squareArray
{
    public static void main(){
        int[][] array= new int[3][7];
        int num=0;
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[0].length;c++){
                array[r][c]=(r*r+c*c);
            }
        
        }
        
        for(int[] curr:array){
            for(int elm:curr){
                System.out.print(elm+"\t");
            }
            System.out.println("\n");
        }
        
   }
}
