
public class Batman extends Superhero
{
    public Batman()
    {
        super();
    }
    public Batman(boolean canFly){
        super(canFly,"Batman");
    }
    public String getMotto(){
        return "I'm Batman!";
    }
    public String toString(){
        return super.toString();
    }
   
}
