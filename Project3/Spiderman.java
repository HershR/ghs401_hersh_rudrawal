
public class Spiderman extends Superhero
{
    private boolean wallClimb;
    private int web=5;
    public Spiderman()
    {
        super();
        wallClimb=false;
    }
    public Spiderman(boolean canFly,boolean wallClimb)
    {
        super(canFly,"Spiderman");
        this.wallClimb=wallClimb;
    }
    public void useWeb(){
        web--;
    }
    public String getWebFuel(){
        return "Fuel: "+web;
    }
    public String getMotto(){
        return "Just your friendly neighbourhood Spiderman!";
    }
    public String toString(){
        return super.toString()+"\tCan Wall Climb: "+wallClimb;
    }
}
