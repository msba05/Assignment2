public class Predictor
{
    public String studentPredictor(Student s)
    {
        if (s.getGpa() >= 3.5 && s.getCredits() >= 30){
            return "Honor Roll";
        }
        else if (s.getGpa()< 2.0){
            return "High Risk";
        }
        else
            return "On Track";
    }
}
