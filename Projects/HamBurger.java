import javax.swing.JOptionPane;

public class HamBurger
{
    //This is a Class called Hamburger.
    //From this class we can make as many hamburger instances(objects) as we want.
    //instance variables.
    private boolean hasLettus;
    private int numPatties;
    private String cheeseType;
    
    //the zero argument constructor
    // this runs every time a zero argument HamBurger is made.
    //The constuctor name is always named- public "className"
    public HamBurger(){
        this.hasLettus=false;//sets all instance variables...
        this.numPatties=0;//...to generic values
        this.cheeseType=null;
    }
    //mult-argumet constructor
    public HamBurger(boolean hasLettus,int numPatties,String cheeseType){
        this.hasLettus=hasLettus;//set instance variables to the argument variable
        this.numPatties=numPatties;
        this.cheeseType=cheeseType;
    }
    //toString method
    public String toString(){
        String output="Has Lettus: "+this.hasLettus+"\nPatties: "+ this.numPatties+"\nCheese: "+this.cheeseType;
        return output;
    }
    
}
