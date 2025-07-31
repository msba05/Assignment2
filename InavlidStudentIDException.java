
 /*
     * This program creates an exception for invalid student ID
     * Written by Mariam Barry
     * Written on 7/22/25
     */

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
