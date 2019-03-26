
import java.util.ArrayList;
public class InventoryDriver
{
    public static void main(){
        ArrayList<InventoryItem> iArray= new ArrayList<InventoryItem>();
        InventoryItem i1= new LampShade(true,10.00);
        InventoryItem i2= new LampShade(true,20.00);
        
        InventoryItem i4= new GorillaTape(true,15.00,false);
        iArray.add(i1);
        iArray.add(i2);
        //iArray.add(i3);
        iArray.add(i4);
        for(InventoryItem curr: iArray){
            System.out.println(curr.shipped());
        }
    }
}
