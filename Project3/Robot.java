
public class Robot
{
    private int battery;
    private String name;
    public Robot()
    {
        this.name=null;
        this.battery=0;
    }
    public Robot(String name, int battery){
        this.name=name;
        this.battery=battery;
    }
    public String getTask(){
        return "I help people!";
    }
    public String toString() {
        return "Name: " + this.name + "\nBatteryLevel: " + this.battery;
    }
}
