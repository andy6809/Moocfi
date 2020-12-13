
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);

        // Try your method in here
    }

    public static void removeLast(ArrayList<String> strings) {
       
        if (strings.isEmpty()) {
            return;
        }
        
        strings.remove(strings.size() - 1);
    }

}
