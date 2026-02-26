import java.util.Scanner;

public class StudentMarksAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of students
        int marks[] = new int[n];

        // input marks
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;

        // processing
        for (int i = 0; i < n; i++) {
            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];

            sum += marks[i];
        }

        int average = sum / n;

        // output
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Average: " + average);
    }
}