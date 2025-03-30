import java.util.Scanner;

public class Scanner_MyPII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        scanner.nextLine();

        System.out.print("Enter you age: ");
        scanner.nextInt();

        System.out.print("Enter you gpa: ");
        scanner.nextFloat();

        scanner.close();

    }
}
