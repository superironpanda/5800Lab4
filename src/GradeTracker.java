
public class GradeTracker implements Observer{
    private Student student;
    private double grade;

    public GradeTracker(Student s){
        student = s;
        grade = 50.0;
    }
    public String getLetterGrade() {

        if(grade >= 90) {
            return "A";
        }
        else if (grade >= 80) {
            return "B";
        }
        else if (grade >= 70) {
            return "C";
        }
        else if (grade >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }

    @Override
    public void update() {
        grade = student.getAverage();
        System.out.println("GradeTracker: Letter grade changed to " + getLetterGrade());
    }
}
