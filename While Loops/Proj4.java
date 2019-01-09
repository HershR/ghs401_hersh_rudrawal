import  javax.swing.JOptionPane;
public class Proj4
{
    public static void main(){
        String[] mArray = {"Dumb and Dumber","Tommy Boy", "Shawshan Redemption"};
        String[] sArray = {"Rudolph","Jingle Bells","Frosty the Snowman"};
        int num =0;
        for(int i=1;i<11;i++)
        {
           int square = i*i;
           int random = (int)(Math.random()*(square-i+1)+i);
           if ( random == square){
               System.out.println(i+"\t"+(i*i)+"\t"+ random+"\t"+"The random value is equal to the square of the index");          
           }   else if(random==i){
               System.out.println(i+"\t"+(i*i)+"\t"+ random+"\t"+"The random value is equal to the index");            
           }else{
            System.out.println(i+"\t"+(i*i)+"\t"+ random);
            }
        }
        while(num<mArray.length){
            System.out.println(mArray[num]);
            num++;
        }
        System.out.print("\n"+"\n");
        for(int i=0;i<sArray.length;i++){
           if(i<(sArray.length-1)){
            System.out.print(sArray[i]+", ");
            }else{
            System.out.print(sArray[i]);
           }
        }
    }
}