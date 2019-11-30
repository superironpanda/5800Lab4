import java.util.ArrayList;

public class AllAverageStrategy implements AverageStrategy {
    @Override
    public double getAverage(Student student) {
        double assignmentAverage = student.getAssignmentAvg();
        double examAverage = student.getExamAverage();

        return assignmentAverage * 0.4 + examAverage * 0.6;
    }
}
