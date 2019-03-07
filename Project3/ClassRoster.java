import java.util.ArrayList;
public class ClassRoster
   {
   private String courseName;
   private ArrayList<Student> studentList = new ArrayList<Student>();
   public ClassRoster( String courseName, ArrayList<Student> studentList)
      {
       this.courseName=courseName;
       this.studentList=studentList;
          
      } // end zero-arg constructor
      
   public String studentWithMaxGPA()
      {
      int c=0;
      double g=0;
      String output="";
      for(int i=0;i<studentList.size();i++ ){
        if((studentList.get(i)).calcGPA()>g){
            g=(studentList.get(i)).calcGPA();
            output=(studentList.get(i)).getLastName();
        }
        }
      
      return output;
      
      } // end method studentWithMaxGPA 
       
   public int dropStudent( double minGPA )
      {
    int n=0;
    for(int i=0;i<studentList.size();i++){
          if((studentList.get(i)).calcGPA()<=minGPA){
              studentList.remove(i);
              n++;
        }
    }
        return n;
    }
      
   public void addStudent( Student newStudent )
      {
          studentList.add(newStudent);
      } // end method addStudent
     
      
   public void addStudent(int index, Student newStudent)
      {
         
          studentList.add(index-1,newStudent);
      } // end method addStudent
      
   public String toString()
      {
      String output = new String();
       output += "Class: " + courseName + "\n";
       
       for( int index = 0; index < studentList.size(); index++ )
          {
          output += studentList.get( index ) + "\n";  
          } // end for
      return output;
      } // end method toString
   } // end ClassRoster