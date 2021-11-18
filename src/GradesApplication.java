import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student justin = new Student("Justin", new ArrayList<>());
        justin.addGrade(80);
        justin.addGrade(90);
        justin.addGrade(100);
        students.put("justInTyme@github", justin);

        Student rod = new Student("Rodriques", new ArrayList<>());
        rod.addGrade(100);
        rod.addGrade(95);
        rod.addGrade(90);
        students.put("ironRod@github", rod);

        Student zane = new Student("Zane", new ArrayList<>());
        zane.addGrade(99);
        zane.addGrade(88);
        zane.addGrade(90);
        students.put("zanethebrain@github", zane);

        Student romero = new Student("Romero", new ArrayList<>());
        romero.addGrade(90);
        romero.addGrade(90);
        romero.addGrade(100);
        students.put("tooFly@github", romero);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the Github usernames of our students: ");
        System.out.println();
        System.out.println("|justInTyme@github| |ironRod@github| |zanethebrain@github| |tooFly@github|");
        System.out.println();

        String choice;

        do {

            System.out.println("Which student would you like to see more information about?");

            String studentSelect = scanner.nextLine();

            if (students.containsKey(studentSelect)) {
                System.out.println("Name: " + students.get(studentSelect).getName() +
                        "\ngrades: " + students.get(studentSelect).getStudentGrades() +
                        "\nCurrent Average: " + students.get(studentSelect).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + studentSelect);
            }

            System.out.println("would you like to see another student? [y/n]");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));




    }
}
