
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int factor = 1;

        for (int i = 1; i <= number; ++i) {
            factor = factor * i;
        }
        System.out.println("Factorial: " + factor);

    }
}
