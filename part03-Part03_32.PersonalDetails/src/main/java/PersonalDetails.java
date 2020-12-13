
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();

        while (true) {

            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");

            names.add(parts[0]);
            birthYears.add(Integer.valueOf(parts[1]));

        }
        String longest = names.get(0);
        for (String name : names)
            // for(int i = 0; i < names.size(); i++)
            // String name = names.get(i);
            
        {
            if (name.length() > longest.length()) {
                longest = name;
            }

        }
        System.out.println("Longest name: " + longest);
        int sumOfBirthYears = 0;

        for (int years : birthYears) {
            sumOfBirthYears += years;

        }
        System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears / birthYears.size());

    }

}
