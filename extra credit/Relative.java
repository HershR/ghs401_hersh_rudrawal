

public class Relative
{
    private String name;
    private int age;
    public Relative()
    {
        this.name=null;
        this.age=0;
    }
    public Relative(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
