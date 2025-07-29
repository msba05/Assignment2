import java.io.Serial;
import java.io.Serializable;

public abstract class Student implements Serializable
{
   private String name ="";
   private String studentID ="";
   private double gpa =0.0;
   private int credits=0;
   @Serial       //so when deserializing old files can still work with an updated class
   private static final long serialVersionUID = 1L;

   public Student ()
   {

   }
    public Student (String name, String ID, double gpa, int credits) throws InvalidStudentNameException, InvalidStudentIDException
   {
       setName(name);                 //this calls the setName method to do input validation and when super is called in the subclasses
       setStudentID(ID);//this will call teh setStudentID method and when super is calls in subclasses allow for the method to work there as well
       this.gpa=gpa;
       this.credits=credits;
   }
   public void setName(String name) throws InvalidStudentNameException
   {
       if(name.isEmpty())
       {
           throw new InvalidStudentNameException("Name cannot be empty.");
       }
       this.name =name;
   }
   public void setStudentID(String ID) throws InvalidStudentIDException
   {
       if(ID.isEmpty())
       {
           throw new InvalidStudentIDException("Student ID cannot be empty.");
       }
       if(!ID.matches("^[A-Z]\\d+$"))    //One capital letter at least one number and end of string
       {
           throw new InvalidStudentIDException("ID must include only one capital letter and at least one numeric digit.");
       }
       this.studentID=ID;
   }
   public void setCredits(int credits)
   {
       if(credits < 0.0)
       {
           throw new IllegalArgumentException("Credits must be zero or greater");
       }
       this.credits = credits;
   }
   public void setGpa(double gpa)
   {
       if(gpa <0.0 || gpa >4.0)
       {
           throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
       }
       this.gpa = gpa;
   }

   public String getName()
   {
       return name;
   }
   public  String getStudentID()
   {
       return studentID;
   }
   public double getGpa()
   {
       return gpa;
   }

   public int getCredits()
   {
       return credits;
   }
   public abstract String toString();
}
