import java.io.*;
import java.util.LinkedList;
public class StudentManager
{
    private LinkedList<Student> studentList;
    public StudentManager()
    {
        studentList = new LinkedList<>();
    }
    public void addStudent(Student stu)
    {
        studentList.add(stu); //???
        saveStudent();
    }

    public void displayStudent(Student stu)
    {
        if(studentList.isEmpty())
        {
            System.out.println("No students in this list.");
        }
        else {
            for(Student s : studentList)
            {
                System.out.println(s);
            }
        }
    }
    public Student searchById(String stuID)
    {
        for (int i=0; i<studentList.size();i++)
        {
            Student s =studentList.get(i);
            if(s.getStudentID().equals(stuID))
            {
                return s;
            }
        }
        return null;
    }
    public void displayAll()
    {
        //studentList.traverse();
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
}
