
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.println("");
        
        
        System.out.print("Search for? ");
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (number == list.get(i)) {
                int index = i;
                System.out.println(number + " is at index " + index);
            }
        }

        // implement here finding the indices of a number
    }
}
