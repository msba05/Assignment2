import java.io.Serializable;

public class InvalidStudentIDException extends Exception
{
    public InvalidStudentIDException()
    {
        super("That is an invalid Student ID");
    }
    public InvalidStudentIDException(String msg)
    {
        super(msg);
    }
}
