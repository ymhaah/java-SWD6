import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // 2. Create an array to store the marks
        int[] marks = new int[numberOfStudents];

        // Variables for calculations
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int passed = 0;
        int failed = 0;

        // 3. Input marks for each student and perform calculations
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();

            sum += marks[i];

            if (marks[i] > max) {
                max = marks[i];
            }

            if (marks[i] < min) {
                min = marks[i];
            }

            if (marks[i] >= 50) {
                passed++;
            } else {
                failed++;
            }
        }

        // 4. Calculate the average
        double average = (double) sum / numberOfStudents;

        // 5. Print all student marks with their index
        System.out.println("\nStudent Marks:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // 6. Print summary results
        System.out.printf("\nAverage Mark: %.2f\n", average);
        System.out.println("Highest Mark: " + max);
        System.out.println("Lowest Mark: " + min);
        System.out.println("Number of Passed Students: " + passed);
        System.out.println("Number of Failed Students: " + failed);

        input.close();
    }
}

