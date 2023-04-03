
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube cubeOne = new Cube(7);
        cubeOne.volume();
        System.out.println(cubeOne.toString());
    }
}
