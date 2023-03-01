
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        //Adding values to the list 
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        // 
        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int suma = 0;
        for (int number : numbers) {
            suma += number;   
        }
        return suma;
    }
}
