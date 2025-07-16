import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int avg =scanner.nextInt();

        if (avg >= 85) {
            System.out.println("A");
        } else if (avg >= 70) {
            System.out.println("B");

        } else if (avg >= 50) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        scanner.close();
        // ######################################################

    }
}
