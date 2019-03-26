import java.util.ArrayList;
public class MultipleGroups implements NumberGroup 
{
    // instance variables - replace the example below with your own
    private ArrayList<NumberGroup> groupList; 

    public MultipleGroups()
    {
       groupList = new ArrayList<NumberGroup>();
       groupList.add(new Range(-3,0));
       groupList.add(new Range(7,100));
       groupList.add(new Range(4,8));
    }
    public boolean contains(int a){
        for(NumberGroup curr: groupList){
            if(curr.contains(a)){
                return true;
            }
        }
        return false;
    }
}
