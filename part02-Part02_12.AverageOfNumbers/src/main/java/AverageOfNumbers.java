
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double count = 0;
        
        while (true){
            System.out.println("Give a number:");
            
            double number = Double.valueOf(scanner.nextLine());
            if (number == 0 ){
                break;
            }
            sum = sum + number;
            count = count + 1;
            
        }
        System.out.println("Average of the numbers: " + sum / count);

    }
}
