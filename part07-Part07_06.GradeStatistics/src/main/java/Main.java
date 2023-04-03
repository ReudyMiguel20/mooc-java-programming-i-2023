import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberManager numberList = new NumberManager();

        UserInterface UI = new UserInterface(scanner, numberList);

        System.out.println("Enter point totals, -1 stops:");
        UI.start();

    }
}
