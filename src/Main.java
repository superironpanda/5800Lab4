
public class Main {
    public static void main(String[] args){
        //Question 1 Strategy
        System.out.println("Question 1");
        Student student = new Student("studentA");
        student.setAverageStrategy(new AllAverageStrategy());
        student.addAssignmentScore(90.0);
        student.addAssignmentScore(80.0);
        student.addAssignmentScore(70.0);
        student.addExamScore(85.0);
        student.addExamScore(80.0);

        double studentAverage = 0.0;

        studentAverage = student.getAverage();
        //System.out.println(studentAverage);

        student.setAverageStrategy(new DropLowestAverageStrategy());
        studentAverage=student.getAverage();
        //System.out.println(studentAverage);

        //Question 2 Observer
        System.out.println("Question 2");
        String letterGrade = "";
        GradeTracker tracker = student.gradeTracker;
        letterGrade = tracker.getLetterGrade();
        System.out.println(letterGrade);

        student.addExamScore(0.0);

        //Question 3


    }
}
