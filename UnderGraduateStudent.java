/*
 * This program a undergrad subclass
 * Written by Mariam Barry
 * Written on 7/22/25
 */
public class UnderGraduateStudent extends Student
{
        private String major="";
        public UnderGraduateStudent()
        {

        }
        public UnderGraduateStudent(String n, String ID,double gpa, int credits,String major) throws InvalidStudentIDException, InvalidStudentNameException {
            super(n,ID,gpa,credits);
            this.major=major;
        }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public String toString()
    {
        return "[Undergraduate Student: "+getName() +", ID: "+getStudentID()+", Major: "+getMajor()+", GPA: "+getGpa()+", Credits: "+getCredits()+"]";
    }
}
