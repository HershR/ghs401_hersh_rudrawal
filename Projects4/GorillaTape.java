
public class GorillaTape extends DuckTape implements InventoryItem
{
    private boolean extraStick;
    
    public GorillaTape(boolean i,double p, boolean e)
    {
        super(i,p);
        this.extraStick=e;
    }
    public String shipped(){
        return "Gorilla Tape has been shipped.";
    }
    
}
