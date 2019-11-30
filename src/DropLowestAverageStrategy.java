import java.util.ArrayList;

public class DropLowestAverageStrategy implements AverageStrategy {
    @Override
    public double getAverage(Student student) {
        double assignmentAverageDropLowest = student.getAssignmentAvgAndDropLowest();
        double examAverage = student.getExamAverage();

        return assignmentAverageDropLowest * 0.4 + examAverage * 0.6;
    }
}
