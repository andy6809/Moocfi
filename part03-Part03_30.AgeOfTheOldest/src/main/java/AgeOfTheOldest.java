
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int age = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            count = Integer.valueOf(parts[1]);
            if (count > age) {
                age = count;
            }

        }
        System.out.println("Age of the oldest: " + age);

    }
}
