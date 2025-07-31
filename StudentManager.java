/**
 * This is a Student Manager class that implements File I/O
 * @author Mariam Barry
 * date 7/25/2025
 */

import java.io.*;
public class StudentManager
{
    private LinkedList<Student> studentList;
    private final String FILE_NAME = "students.dat";
    public StudentManager()
    {
        studentList = new LinkedList<>();
    }

    public void loadStudentData(String fileName)
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat")))
        {
           studentList = (LinkedList<Student>) ois.readObject();
            System.out.println("Student data loaded successfully.");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No data found, beginning with a blank student list.");
            studentList = new LinkedList<>();
        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println("Error Loading Data: " + e.getMessage());
            studentList = new LinkedList<>();
        }
    }
    public void saveStudent(String fileName)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat")))
        {
            oos.writeObject(studentList);
            System.out.println("Student data saved to " + fileName +" successfully.");
        }
        catch(IOException e)
        {
            System.out.println("Error saving student data:" +e.getMessage());
        }
    }

    public LinkedList<Student> getStudents() {
        return studentList;
    }
    public void addStudent(Student student)
    {
        studentList.insertAtTail(student);
    }
    public void displayAll()
    {
        studentList.display();
    }
}
