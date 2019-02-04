import java.io.*;
public class codeQuest
{
    public static void main()throws Exception
    {
        File file = new File("Prob01.in.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();
        System.out.println(st);
        int quantityOfLines = Integer.parseInt(st);
        String line;
        for(int i=0; i<quantityOfLines;i++){
            line = br.readLine();
            //System.out.println(line);
            int grade= Integer.parseInt(line);
            if(grade<70){
                System.out.println("fail");
            }else{
                System.out.println("pass");
            }
        }
    }
}
