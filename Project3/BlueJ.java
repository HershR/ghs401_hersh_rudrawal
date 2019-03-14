
public class BlueJ extends Bird
{
    
    private boolean harvest;
    public BlueJ()
    {
        super();
        harvest=false;
    }
    public BlueJ(int legs,boolean alive,boolean canFly,boolean harvest){
        super(legs,alive,canFly);
        this.harvest=harvest;
    }
    public String toString(){
        return super.toString()+"\tHarvest season: "+this.harvest;
    }
}
