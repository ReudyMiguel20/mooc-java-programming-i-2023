
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int counter = 1;
        int size = number;
        while (counter <= number) {
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int number = size;
        int counter = 1;

        while (number == size && counter <= size) {
            printStars(number);
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 1;
        int number = width;
        
        while (counter <= height){
            printStars(number);
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        int number = size;
        
        while (counter <= number) {
            printStars(counter);
            counter++;
        }
    }
}
