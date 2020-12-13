
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            if (text.equals("")) {
                break;

            }

            for (String piece : pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }

        }

    }
}
