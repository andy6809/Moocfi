
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {

        int numberToPrint = 1;

        while (numberToPrint <= number) {

            System.out.println(numberToPrint);

            numberToPrint +=  1;

        }

    }

}
