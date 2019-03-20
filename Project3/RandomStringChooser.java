import java.util.ArrayList;
public class RandomStringChooser
{
    private ArrayList<String> array;
    private int index;
    public RandomStringChooser(String[] word)
    {
        array= new ArrayList<String>();
        for(String curr:word){
            this.array.add(curr);
        }
        
    }
    public String getNext(){
        String output="";
        
        if(this.array.size()>0){
            index=(int)(Math.random()*this.array.size());
            
            return this.array.remove(index);
        }else{
            return "NONE";
        }
    }
    public String getArray(){
        String output="";
        for(int i=0;i<array.size();i++){
            output+=array.get(i )+"\t";
        }
        return output;
    }
    
}
