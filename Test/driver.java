
public class driver
{
    
    public static void main(){
        RightTriangle triangle1 = new RightTriangle();
        System.out.println(triangle1.toString());
        RightTriangle triangle2 = new RightTriangle(10,4);
        System.out.println(triangle2.toString());
        triangle2.setBase(1);
        System.out.println(triangle2.toString());
        
    }
    
}
