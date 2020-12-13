
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);

        }
        System.out.println("");

        int small = list.get(0);
        int i = 0;
        while (i < list.size()) {
            int number = list.get(i);
            i++;

            if (small > number) {
                small = number;

            }

        }
        System.out.println("Smallest number: " + small);
        for (int z = 0; z < list.size(); z++) {
            if (small == list.get(z)) {
                int index = z;
                System.out.println("Found at index " + index);

            }
        }

    }
}
