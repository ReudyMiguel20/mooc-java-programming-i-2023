import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        String[] arrayString = {"Two", "Alphabet", "Howl", "King"};
        System.out.println(Arrays.toString(arrayString));
        sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
        System.out.println();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(14);
        numbers.add(65);
        numbers.add(34);
        System.out.println(numbers);
        sortIntegers(numbers);
        System.out.println(numbers);
        
        ArrayList<String> randomText = new ArrayList<>();
        randomText.add("random");
        randomText.add("explicit");
        randomText.add("test");
        System.out.println(randomText);
        sortStrings(randomText);
        System.out.println(randomText);
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
