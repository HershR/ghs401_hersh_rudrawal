
public class Terminator extends Robot
{
    private int killCount;
    public Terminator() {
        super();
        this.killCount = 0;
    }
    public Terminator(int battery, int killCount) {
        super("Terminator", battery);
        this.killCount = killCount;
    }
    public String getTask() {
        return "I KILL THINGS!!!!!";
    }
    public String toString() {
        return super.toString() + "\nKill count: " + this.killCount;
    }
}
