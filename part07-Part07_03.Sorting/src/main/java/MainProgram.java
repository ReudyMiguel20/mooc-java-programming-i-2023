
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallestNumber > array[i]) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestNumber = array[0];
        int indexOfSmallNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallestNumber > array[i]) {
                smallestNumber = array[i];
                indexOfSmallNumber = i;
            }
        }
        return indexOfSmallNumber;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNumber = table[startIndex];
        int index = 0;

        for (int i = startIndex; i < table.length; i++) {

            if (table[i] <= smallestNumber) {
                smallestNumber = table[i];
                index = i;
            }

        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int numberSwap = array[index1];
        array[index1] = array[index2];
        array[index2] = numberSwap;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));

            swap(array, i, indexOfSmallestFrom(array, i));
            
            System.out.println(Arrays.toString(array));
        }

    }
}
