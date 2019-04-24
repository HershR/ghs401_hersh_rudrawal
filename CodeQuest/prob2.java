import java.io.*;
public class prob2
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class prob2
     */
    public static void main() throws Exception
    {
       File file = new File("Prob02.in.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();
        //System.out.println(st);
        while((st=br.readLine())!=null){
            String[] myArray;
            
            myArray=st.split(" ");
            System.out.println(myArray[1]);
        }
       
    }
    
}
