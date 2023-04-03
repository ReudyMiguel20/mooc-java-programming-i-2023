
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter();
        Counter cTwo = new Counter(900);
        
        System.out.println(c.value());
        System.out.println(cTwo.value());
        
        c.increase(30);
        cTwo.decrease(-55);
        
        System.out.println(c.value());
        System.out.println(cTwo.value());
        
        c.increase(-2);
        
        System.out.println(c.value());
        System.out.println(cTwo.value());
    }
}
