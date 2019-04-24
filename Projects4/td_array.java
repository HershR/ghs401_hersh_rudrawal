
public class td_array
{
    public static void main(){
        int[][] grid=new int[3][5];
        int count =1;
        for(int c=0;c<grid[0].length;c++){
            for(int r=0;r<grid.length;r++){
                grid[r][c]=count;
                count++;
                //System.out.println(grid[r][c]);
            }
        }
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                
                System.out.print(grid[r][c]+"\t");
            }
            System.out.println("\n");
        }
        for(int r=0;r<grid.length;r++){
            int sum=0;
            for(int c=0;c<grid[0].length;c++){
                
                sum+=grid[r][c];
                
            }
            System.out.println("Row "+r+" is: "+sum);
            
        }
        for(int c=0;c<grid[0].length;c++){
            int sum=0;
            for(int r=0;r<grid.length;r++){
                
                sum+=grid[r][c];
                
            }
            System.out.println("Colmum "+c+" is: "+sum);
            
        }
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=i*2;
            System.out.println("Index "+i+" is: "+array[i]);
        }
        int[][] chart=new int[3][5];
        int index=0;
        for(int r=0;r<chart.length;r++){
            for(int c=0;c<chart[0].length;c++){
                if(index<array.length){
                    chart[r][c]=array[index];
                    index++;
               }
               else{
                   chart[r][c]=-1;
                }
            }
        }
        for(int r=0;r<chart.length;r++){
            for(int c=0;c<chart[0].length;c++){
                
                System.out.print(chart[r][c]+"\t");
            }
            System.out.println("\n");
        }
    }
    }

