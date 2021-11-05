import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades ) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeAvg = 0;
        for (Integer grade : grades) {
            gradeAvg += grade;

        }
        System.out.println("gradeAvg = " + gradeAvg);
        return gradeAvg/grades.size();
    }

    public static void main(String[] args) {
       Student rocky = new Student("Rocky", new ArrayList<>());
        System.out.println("rocky.getName() = " + rocky.getName());
        rocky.addGrade(90);
        rocky.addGrade(90);
        System.out.println("rocky.getGradeAverage() = " + rocky.getGradeAverage());

    }
}
