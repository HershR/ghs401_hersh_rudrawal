import  javax.swing.JOptionPane;

public class JacksQuadraticClass
{
    public static void main()
    {
        String aS = JOptionPane.showInputDialog("Enter you a value");
        String bS = JOptionPane.showInputDialog("Enter you b value");
        String cS = JOptionPane.showInputDialog("Enter you c value");
        float a = Float.parseFloat(aS);
        float b = Float.parseFloat(bS);
        float c = Float.parseFloat(cS);
        float NegB = b*-1;
        
        
        //System.out.println(b*b);
        //System.out.println(4*a*c);
        //System.out.println(Math.sqrt((b*b)-(4*a*c)));
        System.out.println(NegB+((Math.sqrt((b*b)-(4*a*c)))/(2*a)));
        System.out.println(NegB-((Math.sqrt((b*b)-(4*a*c)))/(2*a)));
        
    }
}
