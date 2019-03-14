

public class Bird extends Animal
{
    private boolean canFly;
    public Bird()
    {
        super();
        canFly=false;
    }
    public Bird(int legs, boolean alive,boolean canFly){
        super(legs,alive);
        this.canFly=canFly;
    }
    public String flying(){
        return "I am Flying";
    }
    public String toString(){
        return super.toString()+"\tCan Fly: "+this.canFly;
    }
}
