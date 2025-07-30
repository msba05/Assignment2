public class GraduateStudent extends Student
{
    private String major="";
    private String thesisTopic="";

    public GraduateStudent()
    {
        super();
    }
    public GraduateStudent(String n, String ID,double gpa,int credits,String major, String thesisTopic) throws InvalidStudentIDException, InvalidStudentNameException
    {
        super(n,ID,gpa,credits);
        this.major = major;
        this.thesisTopic = thesisTopic;
    }
    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }
    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
    public String toString()
    {
        return "Graduate Student: "+getName() +", ID: "+getStudentID()+", Major: "+getMajor()+", GPA: "+getGpa()+", Credits: "+getCredits()+", Thesis Topic: "+getThesisTopic();
    }
}

