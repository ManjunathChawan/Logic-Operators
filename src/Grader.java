import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student's grade (0-10): ");
        int grade = scanner.nextInt();

        String result = calculateGrade(grade);
        System.out.println("Result: " + result);

        scanner.close();
    }

    private static String calculateGrade(int grade) {
        if (grade < 0 || grade > 10) {
            return "Invalid input. Grade must be between 0 and 10.";
        } else if (grade <= 3) {
            return "Failed";
        } else if (grade <= 5) {
            return "Insufficient";
        } else if (grade <= 8) {
            return "Good";
        } else if (grade == 10) {
            return "Excellent";
        } else {
            return "Invalid input. Please enter a valid grade.";
        }
    }
}
