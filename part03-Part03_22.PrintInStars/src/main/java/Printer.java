
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        int indexTwo = 1;
        char stars = '*';
        while (true) {
            //This should end the program when the array size is equal to the index
            // in this case that number would be 5.
            if (array.length == index) {
                break;
            }
            //The print here should not execute when index is the same number as
            //the array length. 
            System.out.print(stars);
            
            //this should print the stars required as input in the array, when
            //it reach the number on the array then it stops and the loop begins
            //again.
            if (indexTwo == array[index]) {
                index++;
                System.out.println("");
                indexTwo = 1;
                continue;
            }

            indexTwo++;
        }
    }
}

