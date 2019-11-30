
public class Main {
    public static void main(String[] args){
        //Question 1 Strategy
        System.out.println("Question 1");
        Student student = new Student("student0");
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
        System.out.println("Question 3");
        Student student1 = new Student("student1");
        student1.setAverageStrategy(new AllAverageStrategy());
        student1.addAssignmentScore(80.0);
        student1.addExamScore(100.0);

        Roster roster = new Roster("Advanced Software Engineer", "5800");
        roster.addStudent(student);
        roster.addStudent(student1);

        AverageDispenser iterator = roster.averageIterator();
        while (iterator.hasNext()){
            System.out.println("Average score is: " + iterator.nextScore());
        }

    }
}
