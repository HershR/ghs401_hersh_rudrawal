
public class R2D2 extends Robot
{
    private boolean hasTazer;
    public R2D2()
    {
        super();
        this.hasTazer=false;
    }
    public R2D2(int battery, boolean hasTazer){
        super("R2D2", battery);
        this.hasTazer=hasTazer;
    }
   
    public String getTask(){
        return "I help with navigation!";
    }
    public String toString() {
        return super.toString() + "\nTazer status: " + this.hasTazer;
    }
}
