
public class HolidayCharacter
{
    private String character;
    private boolean cheer;
    private int presents;
    
    public HolidayCharacter(){
        this.character=null;
        this.cheer=false;
        this.presents=0;
        }
    public HolidayCharacter(String character, boolean cheer, int presents){
        this.character=character;
        this.cheer=cheer;
        this.presents=presents;
    }
    public String toString(){
        String output="Character: "+this.character + "\nHas a cheer:"+this.cheer+"\nNumber of presents:"+this.presents;
        return output;
    }
        
   
}
