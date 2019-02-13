
public class wallet
{
    private money[] moneyArray;
    public wallet(money[] mA)
    {
        this.moneyArray=mA;
    }
    public double getAvgAmount(){
        double total=0.0;
        for(int i =0;i<moneyArray.length;i++){
            
            total=total+(double)moneyArray[i].getMoney();
        }
        double output=((double)total/moneyArray.length);
        return output;
    }
}
