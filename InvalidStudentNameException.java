public class InvalidStudentNameException extends Exception
{
    public InvalidStudentNameException()
    {
        super("That is not a valid Student name");
    }
    public InvalidStudentNameException(String msg)
    {
        super(msg);
    }
}
