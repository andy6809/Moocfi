
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String name = ("");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;

            }
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);

            if (age > oldest) {

                name = parts[0];
                oldest = age;

            }

        }
        System.out.println("Name of the oldest: " + name);

    }
}
