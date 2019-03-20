
public class Pasta extends Food
{
    private String type;
    
    public Pasta(int c,String n, String t)
    {
        super(c,n);
        this.type=t;
    }
    public String foodPortions(int portion){
        return "Divide this Pasta into portions "+portion+" each portion is "+super.getCalories()/portion;
    }
    public String toString()
    {
        // put your code here
        return super.toString()+" Is "+this.type+" type.";
    }
}
