
public class C3PO extends Robot
{
    private int numberLanguages;
    public C3PO() {
        super();
        this.numberLanguages = 0;
    }
    public C3PO(int battery, int numberLanguages) {
        super("C3PO", battery);
        this.numberLanguages = numberLanguages;
    }
    public String getTask() {
        return "I translate!";
    }
    public String toString() {
        return super.toString() + "\nNumber of Languages spoken: " + this.numberLanguages;
    }
}
