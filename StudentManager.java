/**
 * This is a Student Manager class that implenest File I/O
 * @author Mariam Barry
 */

import java.io.*;
import java.util.LinkedList;
public class StudentManager
{
    private LinkedList<Student> studentList;
    private final String FILE_NAME = "students.dat";
    public StudentManager()
    {
        studentList = new LinkedList<>();
    }

    public void loadStudentData()
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat")))
        {
           studentList = (LinkedList<Student>) ois.readObject();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No data found, begininng with a blank student list.");
            studentList = new LinkedList<>();
        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println("Error Loading Data: " + e.getMessage());
            studentList = new LinkedList<>();
        }
    }
    public void saveStudent()
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat")))
        {
            oos.writeObject(studentList);
            System.out.println("Student data saved successfully.");
        }
        catch(IOException e)
        {
            System.out.println("Error saving student data:" +e.getMessage());
        }
    }
    public LinkedList<Student> getStudentList()
    {
        return studentList;
    }
    public void addStudent(Student student)
    {
        studentList.add(student);
    }
    public void displayAll()
    {
        for (Student s : studentList)
        {
            System.out.println(s);
        }
    }
}
