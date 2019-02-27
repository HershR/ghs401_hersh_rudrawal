
public class HorseBarn
{
    private Horse[] spaces;
    //spaces = {"Trigger", null, "Silver", "Lady", null, "Patches", "Duke"};
    public int findHorseSpace(String name){
        for(int i=0;i<spaces.length;i++){
            if(spaces[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void consolidate(){
        Horse[] tempSpaces= new Horse[spaces.length];;
        for(int i=0;i<spaces.length;i++){
            if(spaces[i]!=null){
                tempSpaces[i]=spaces[i];
            }
        
        
        }
    
    } 
    public static void main(){
        //Horse trigger= new Horse;
        //Horse silver = new Horse;
        
    
    }
}
