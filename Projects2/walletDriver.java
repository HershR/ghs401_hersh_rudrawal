

public class walletDriver
{
    // instance variables - replace the example below with your own
    public static void main(){
        int x=9;
        int y=2;
        double ans=x/y;
        System.out.println(ans);
        money m1= new money(1);
        money m2=new money(5);
        money m3= new money(0.25);
        money[] cash = {m1,m2,m3};
        wallet w1 = new wallet(cash);
        System.out.println(w1.getAvgAmount());
    }
}
