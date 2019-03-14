

public class Superhero
{
    private boolean canFly;
    private String name;
    public Superhero()
    {
        canFly=false;
        name=null;
    }
    public Superhero(boolean canfly,String name){
        this.canFly=canFly;
        this.name=name;
    }
    public String getMotto(){
        return "I am here";
    }
    public String toString(){
        return "Name: "+name+"\tCan Fly: "+canFly;
    }
}
