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
      String output="";
      /*for(Student stud: studentList ){
          System.out.println(studentList.get(2));
          System.out.println(Student.calcGPA());
        if(studentList.calcGPA(i)==4){
            output= ((studentList[i]).getLastName()+(studentList[i]).calcGPA);
            return output;
        }
        }
      output=studentLife;**/
      return output;
      } // end method studentWithMaxGPA 
       
   public int dropStudent( double minGradeLevel )
      {
      studentList.calcGPA();//.remove(minGradeLevel);
      return 0;
      } // end method dropStudent
      
   public void addStudent( Student newStudent )
      {
          studentList.add(newStudent);
      } // end method addStudent
     
      
   public void addStudent(int index, Student newStudent)
      {
         studentList.add(index,newStudent);
      } // end method addStudent
      
   public String toString()
      {
      String output = new String();
      // output += "Class: " + courseName + "\n";
       
      // for( int index = 0; index < studentList.size(); index++ )
      //    {
      //    output += studentList.get( index ) + "\n";  
      //    } // end for
      return output;
      } // end method toString
   } // end ClassRoster