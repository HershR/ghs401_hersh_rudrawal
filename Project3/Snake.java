
public class Snake extends Animal
{
    private boolean poison;
    
    public Snake()
    {
        super(); //calls superclass
                 //sets legs to 0, and alive to false
        this.poison=false;
    }
    public Snake(int legs, boolean alive, boolean poison){
        super(legs,alive);
        this.poison=poison;
    }
    public String slither(){
        return "I am Slithering";
    }  
    public String toString(){
        return super.toString()+"\tPoison: "+this.poison;
    }
}
