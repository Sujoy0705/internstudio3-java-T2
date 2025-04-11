import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables for each subject
        double math, science, english, history, computer;

        // Prompt user for input
        System.out.print("Enter your Math grade: ");
        math = scanner.nextDouble();

        System.out.print("Enter your Science grade: ");
        science = scanner.nextDouble();

        System.out.print("Enter your English grade: ");
        english = scanner.nextDouble();

        System.out.print("Enter your History grade: ");
        history = scanner.nextDouble();

        System.out.print("Enter your Computer Science grade: ");
        computer = scanner.nextDouble();

        // Calculate the average
        double average = (math + science + english + history + computer) / 5;

        // Display the average
        System.out.printf("Your average grade is: %.2f\n", average);

        // Determine performance
        if (average >= 90) {
            System.out.println("Performance: Excellent");
        } else if (average >= 75) {
            System.out.println("Performance: Good");
        } else if (average >= 60) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Needs Improvement");
        }

        scanner.close();
    }
}
