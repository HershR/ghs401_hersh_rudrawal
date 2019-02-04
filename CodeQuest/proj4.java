import java.io.*;
public class proj4
{
   
    public static void main() throws Exception 
    {
       File file = new File("Prob04.in.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();
        System.out.println(st);
        int nl = Integer.parseInt(st);
        for (int i = 0; i <nl; i++)
        {
            
        }
    }

    
}
