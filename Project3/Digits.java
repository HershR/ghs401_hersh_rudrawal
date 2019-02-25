
import java.util.ArrayList;
public class Digits
{
    private ArrayList<Integer> digitList;
    public Digits(int num)
    {
        digitList= new ArrayList<Integer>();
        /**String nums=num+"";
        for(int i=0;i<nums.length();i++){
            String c= nums.substring(i,i++);
            digitList.add(Integer.parseInt(c));
        }
        */
        if(num==0){
            digitList.add(0); 
        }
        while(num>0){
                digitList.add(0,num%10);
                num/=10;
            }
        
    }
    public boolean isStrictlyIncreasing(){
        for(int i=0;i<digitList.size()-1;i++){
            if(digitList.get(i)>=digitList.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public String toString(){
        String r=""; 
        for(Integer curr: digitList){
            r+=curr;
        }
        return r;
    }
}
