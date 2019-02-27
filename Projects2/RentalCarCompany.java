
public class RentalCarCompany
{
    private static String [] myArray= {Car.getMPG(),Car.getIsInStock()};
    
    public RentalCarCompany()
    {
        
    }
    public static void main(){
        System.out.println(myArray[0]+"\n"+myArray[1]);
    }
}
