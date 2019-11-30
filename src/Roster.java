import java.util.ArrayList;

public class Roster {
    private String courseName;
    private String courseNumber;
    private ArrayList<Student> students;

    public Roster(String name, String number){
        this.courseName = name;
        this.courseNumber = number;
        students = new ArrayList<Student>();
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public AverageDispenser averageIterator(){
        return new AverageIterator();
    }

    private class AverageIterator implements AverageDispenser {
        private int index;

        public AverageIterator(){
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < Roster.this.students.size();
        }

        @Override
        public double nextScore() {
            return Roster.this.students.get(index++).getAverage();
        }

    }
}
