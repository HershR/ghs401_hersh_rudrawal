
public class SSSSGridman extends Superhero
{
    private int version;
    public SSSSGridman()
    {
        super();
        version=0;
    }
    public SSSSGridman(boolean canFly,int version){
        super(canFly,"SSSSGridman");
        this.version=version;
    }
    public String getMotto(){
        return "Full Power Gridman!";
    }
    public String toString(){
        return super.toString()+"\tVersion: "+version;
    }
}
