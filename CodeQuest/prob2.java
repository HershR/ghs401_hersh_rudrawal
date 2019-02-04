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
        System.out.println(st);
        int nl = Integer.parseInt(st);
        String line;
        
        for(int i=0; i<nl;i++){
            line = br.readLine();
            int c = 0;
            for (int a=0; a< line.length();a++)
            {
                if (line.substring(a,a+1).equals("a") || line.substring(a,a+1).equals("e")|| line.substring(a,a+1).equals("i") || line.substring(a,a+1).equals("o") || line.substring(a,a+1).equals("u"))
                {
                    c++;
                }
            }
             System.out.println(c);
            //System.out.println(line);
            //String grade= Integer.parseInt(line);
        }
       
    }
    
}
