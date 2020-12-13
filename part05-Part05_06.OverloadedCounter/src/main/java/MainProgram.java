
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        Counter c = new Counter(12);
        
        counter.increase();
        counter.increase(35);
        counter.decrease(25);
        System.out.println(counter.value());
        
        c.decrease(9);
        c.increase();
        System.out.println(c.value());
        
        
                
                
                
        
    }
}
