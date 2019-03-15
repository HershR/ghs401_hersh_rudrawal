
public class RandomStringDriver
{
    public static void main(){
        String[] word={"wheels","on","the","bus"};
        RandomStringChooser sChooser=new RandomStringChooser(word);
        System.out.println(sChooser.getArray());
        for(int k=0;k<6;k++)
        {
            System.out.println(sChooser.getNext()+" ");
            System.out.println(sChooser.getArray());
        }
        System.out.println();
        
    }
}
