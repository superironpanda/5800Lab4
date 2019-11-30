import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Double> assignments;
	private ArrayList<Double> exams;
	private AverageStrategy averageStrategy;
	public GradeTracker gradeTracker;

	public Student(String name){
		this.name = name;
		assignments = new ArrayList<Double>();
		exams = new ArrayList<Double>();
		gradeTracker = new GradeTracker(this);
	}

	public void setAverageStrategy(AverageStrategy averageStrategy) {
		this.averageStrategy = averageStrategy;
	}

	public double getAverage(){
		try {
			double average = averageStrategy.getAverage(this);
			return average;
		}
		catch (Exception e){
			return 0.0;
		}
	}

	public String getName(){
		return name;
	}

	public void addAssignmentScore(double as) {
		assignments.add(as);
		gradeTracker.update();
	}
	
	public void addExamScore(double es) {
		exams.add(es);
		gradeTracker.update();
	}

	public double getAssignmentAvgAndDropLowest(){
		double sum = getAssignmentSum();
		double lowest = getLowestAssignment();
		return (sum- lowest)/(assignments.size() - 1);
	}

	public double getLowestAssignment(){
		double lowest = 100.0;
		for(double score : assignments){
			if (score < lowest){
				lowest = score;
			}
		}
		return lowest;
	}

	public double getAssignmentAvg(){
		double sum = getAssignmentSum();
		return sum/assignments.size() ;
	}

	private double getAssignmentSum(){
		double sum = 0.0;
		for(double score : assignments){
			sum += score;
		}
		return sum;
	}

	public double getExamAverage(){
		double sum = 0.0;
		for (double a : exams){
			sum += a;
		}
		return sum/exams.size();
	}
}
