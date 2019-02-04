
public class P2F2
{
    private String first;
    private String middle;
    private String last;
    public P2F2(){
        this.first="";
        this.middle="";
        this.last="" ;
    }
    //mult-argumet constructor
    public P2F2(String first,String middle,String last){
        this.first=first;//set instance variables to the argument variable
        this.middle=middle;
        this.last=last;
    }
    //toString method
    public String toString(){
        String output=this.first+ " " +this.middle + " "+ this.last;
        return output;
    }
    //String output="first name: " +this.first+ " middle name: " +this.middle + " last name: "+ this.last;
}
