
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int i = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                number = Integer.valueOf(fileReader.nextLine());

                if (number >= lowerBound && number <= upperBound) {
                    i++;
                }

            }
            System.out.println("Numbers: " + i);

        } catch (Exception e) {
            System.out.println("The file " + file + " does not exist.");
        }

    }

}
