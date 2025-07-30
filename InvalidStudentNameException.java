/*
     * This program creates an exception for invalid student names
     * Written by Mariam Barry
     * Written on 7/22/25
     */
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

