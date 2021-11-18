import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;

        }
        return sum/grades.size();
    }

    public ArrayList<Integer> getStudentGrades() {
        return this.grades;
    }

//    public ArrayList<Integer> getAllGrades() {
//
//    }

    public static void main(String[] args) {
        Student rocky = new Student("Rocky", new ArrayList<>());
        System.out.println("rocky.getName() = " + rocky.getName());
        rocky.addGrade(100);
        rocky.addGrade(90);
        System.out.println("rocky.getGradeAverage() = " + rocky.getGradeAverage());
        System.out.println(rocky.grades);

        Student ricky = new Student("Ricky", new ArrayList<>());
        System.out.println("ricky.getName() = " + ricky.getName());
        ricky.addGrade(80);
        ricky.addGrade(80);
        System.out.println("ricky.getGradeAverage() = " + ricky.getGradeAverage());
        System.out.println(ricky.grades);

        Student steven = new Student("Steven", new ArrayList<>());
        System.out.println("steven.getName() = " + steven.getName());
        steven.addGrade(80);
        steven.addGrade(90);
        System.out.println("steven.getGradeAverage() = " + steven.getGradeAverage());


    }
}
