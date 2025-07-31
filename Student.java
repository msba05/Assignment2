/**
 * Student superclass
 * @author Mariam Barry4
 * date 7/23/2025
 */

import java.io.Serial;
import java.io.Serializable;

public  class Student implements Serializable
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
       if(name==null || name.trim().isEmpty())
       {
           throw new InvalidStudentNameException("Name cannot be empty.");
       }
       if(ID.isEmpty())
       {
           throw new InvalidStudentIDException("Student ID cannot be empty.");
       }
       if(!ID.matches("^[A-Z]\\d+$"))    //One capital letter at least one number and end of string
       {
           throw new InvalidStudentIDException("ID must include only one capital letter and at least one numeric digit.");
       }
       this.studentID=ID;
       this.name=name;                 
       this.gpa=gpa;
       this.credits=credits;
   }
   public void setName(String name)
   {
       this.name =name;
   }
   public void setStudentID(String ID) 
   {
       this.studentID=ID;
   }
   public void setCredits(int credits)
   {
       if(credits < 0)
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
   public  String toString()
   {
       return "[Student: "+getName() +", ID: "+getStudentID()+", GPA: "+getGpa()+", Credits: "+getCredits()+"]";
   }
}
