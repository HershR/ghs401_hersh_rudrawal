import java.util.ArrayList;
public class RandomStringChooser
{
    private ArrayList<String> array;
    private int index;
    public RandomStringChooser(ArrayList<String> word)
    {
       array=word;
    }
    public String getNext(){
        String output="";
        index=(int)(Math.random()*this.array.size());
        if(this.array.size()>0){
            output=this.array.get(index);
            this.array.remove(index);
            
            return output;
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
