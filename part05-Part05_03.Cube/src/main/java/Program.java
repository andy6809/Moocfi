
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube andrew = new Cube(44);
        System.out.println(andrew.volume());
        System.out.println(andrew);
        
        System.out.println();
        
        Cube salt = new Cube(21);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}
