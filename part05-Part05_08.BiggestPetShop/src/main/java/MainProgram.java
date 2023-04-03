
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo);
        
        Pet terry = new Pet("Terry", "Turtle");
        Person mike = new Person("Mike", terry);
        
        System.out.println(mike);
        
        Person p1 = new Person("Odin");
        
        System.out.println(p1);
        
        Person p2 = new Person();
        
        System.out.println(p2);
    }
}
