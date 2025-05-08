
// Buffered Reader Class is the classical method to take input, Introduced in JDK 1.0.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args)
            throws IOException {

        // 1. Scenario 1 - using BufferReader

        // Enter data using BufferReader
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
            String s = r.readLine();
            System.out.println(s);
        }

        // 2. Scenario 2 - using Scanner

        // Using Scanner for Getting Input from User
        try (Scanner m = new Scanner(System.in)) {
            String s1 = m.nextLine();
            System.out.println("You entered string " + s1);

            int a = m.nextInt();
            System.out.println("You entered integer " + a);

            float b = m.nextFloat();
            System.out.println("You entered float " + b);
        }

        // 3. Scenario 3 - console class

        // Using Scanner for Getting Input from User
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter a string:");
            String s = scanner.nextLine();

            System.out.println("You entered string " + s);
        }

    }
}
