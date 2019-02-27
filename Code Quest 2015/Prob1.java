
import java.io.*;
public class Prob1
{
    public static void main() throws Exception{
        File file = new File("Prob03.in.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st= br.readLine();
        int cases=Integer.parseInt(st);
         for(int i=0;i<cases;i++){
            String str=br.readLine();
            int linesPerCase= Integer.parseInt(str);
            for(int x=0;x<linesPerCase;x++){
                String line=br.readLine();
                int year = Integer.parseInt(line);
                if (year < 1582) {
                    System.out.println("No");
                }
                else if(year % 4 != 0) {
                    System.out.println("No");
                }
                else if (year % 4 == 0) {
                    System.out.println("Yes");
                }
               
                //String[] tokens=line.split(" ");
                //String in =tokens[0].substring(0,1)+tokens[2].substring(0,1)+tokens[1].substring(0,1);
                //System.out.println(in);
                
            }
        }
    }
}