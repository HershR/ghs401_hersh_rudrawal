import java.util.Scanner;

public class AlphaRunner
{
    public static void main()
    {
        MagpieAlpha maggie = new MagpieAlpha();
        System.out.println (maggie.start());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}
