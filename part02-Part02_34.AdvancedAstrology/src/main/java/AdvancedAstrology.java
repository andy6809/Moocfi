
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;

        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 0;
        int z = size - 1;
        while (i < size) {
            printSpaces(z);
            printStars(i + 1);
            i++;
            z--;

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 0;
        int z = height - 1;
        int aa = height - 2;
        while (i < height) {
            printSpaces(z);
            printStars(i * 2 + 1);
            i++;
            z--;

        }
        
            printSpaces(aa);
            printStars(3);
            printSpaces(aa);
            printStars(3);
        

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
