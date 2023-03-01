
public class AdvancedAstrology {

    public static void printStars(int number) {
        int counter = 1;
        int size = number;
        while (counter <= number) {
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int counter = 1;
        
        while (counter <= number){
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int number = size;
        int counter = 1;
        
        
        while (counter <= number) {
            size--;
            printSpaces(size);
            printStars(counter++);

        }
    }

    public static void christmasTree(int height) {
        
        int counter = 1;
        int starsCounterSum = 0;
        int starsCounter = 1;
        int number = height;
        
        while (counter <= number) {
            height--;
            printSpaces(height);
            printStars(starsCounter);
            counter++;
            starsCounterSum = starsCounter += 2;
        }
        number -= 2;
        printSpaces(number);
        printStars(3);
        printSpaces(number);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely

        christmasTree(5);
    }
}
