
public class Burger extends Food
{
    private boolean lettus;

    public Burger(int c, String n,boolean l)
    {
        super(c,n);
        this.lettus=l;
    }
    public String foodPortions(int portion){
         return "Divide this Burgers into portions "+portion+" each portion is "+super.getCalories()/portion;
     }
    public String toString()
    {
        // put your code here
        return super.toString()+" Lettus: "+this.lettus;
    }
}
