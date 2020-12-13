
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int numberOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");

            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == 0) {
                break;
            }
            
            numberOfNumbers = numberOfNumbers + 1;
            sumOfNumbers = numberFromUser + sumOfNumbers;
            
        }
        System.out.println("Number of numbers: " +numberOfNumbers);
        System.out.println("Sum of the numbers: " +sumOfNumbers);

    }
}
