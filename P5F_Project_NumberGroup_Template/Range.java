import java.util.ArrayList;
public class Range implements NumberGroup
{
    private ArrayList<Integer> num;
    private int min;
    private int max;
    public Range(int min,int max)
    {
        this.min=min;
        this.max=max;
        
        num= new ArrayList<Integer>();
        for(int i=min;i<=max;i++){
            num.add(i);
        }
    }
    public boolean contains(int a)
    {   
        //return a>min && a<max;
        for(Integer curr:num){
            if(curr==a){
                return true;
            }
        }
        return false;
    }
   } // end class Range