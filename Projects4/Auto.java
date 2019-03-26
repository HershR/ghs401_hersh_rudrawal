
public class Auto
{
    private int wheels;
    public Auto(){
        this.wheels=0;
    }
    public Auto(int w){
        this.wheels=w;
    
    }
    public void flatTire(){
        go();
        System.out.print("super flatTire");
        this.wheels-=1;
        
    }
    public String go(){
        System.out.print("super go");
        return "Vroom";
    }
}
