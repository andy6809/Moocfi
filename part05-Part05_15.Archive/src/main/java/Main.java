
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figure> items = new ArrayList<>();
        

        while (true) {
            System.out.println("Identifier? (empty will stop)");

            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Figure item = new Figure(identifier, name);
            if(!items.contains(item)){
                items.add(item);
            }

           

        }
         System.out.println("==Items==");
         
         for (Figure item:items){
             System.out.println(item);
         }
    }
}
