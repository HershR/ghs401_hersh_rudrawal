
public class DuckTape
{
    private boolean isInStock;
    
    private double price;
    
    public DuckTape(boolean i, double p){
        this.isInStock=i;
        this.price=p;
        
    }
    public String rollLenght(){
        return price+" meters";
    }
    public String shipped(){
        return "DuckTape has been shipped.";
    }
    public boolean isInStock(){
        return isInStock;
    }
}
