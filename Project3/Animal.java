
public class Animal
{
    private int legs;
    private boolean alive;
    public Animal()
    {
        this.legs=0;
        this.alive=false;
    }
    public Animal(int legs,boolean alive){
        this.legs=legs;
        this.alive=alive;
    }
    public String toString(){
        return "Legs: "+this.legs+"\t Alive: "+this.alive;
    }
}
