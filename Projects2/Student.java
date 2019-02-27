import javax.swing.JOptionPane;
public class Student
{
   private String firstname;
   private String lastname;
   private String favsong;
   private String favfood;
   public Student()
   {
     this.firstname = null;
     this.lastname = null;
     this.favsong = null;
     this.favfood = null;
   }
  
   public Student(String FNn , String LNn , String FSs , String FFf)
   {
     this.firstname =FNn;
     this.lastname = LNn;
     this.favsong = FSs;
     this.favfood = FFf;
     System.out.print("Shrek");
   }
   public String toString()
   {
       String output =  "First Name: " + this.firstname + "\nLast Name: " +this.lastname + "\nFavorite Song: " + this.favsong + "\nFavorite Food: " + this.favfood + "\nEnd of Constructor\n";
       return output;
   }
}
