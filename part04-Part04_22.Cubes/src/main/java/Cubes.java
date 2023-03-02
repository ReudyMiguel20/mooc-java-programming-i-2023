
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String inputCube = scanner.nextLine();
            
            if (inputCube.equals("end")){
                break;
            }
            
            int numberCube = Integer.valueOf(inputCube);
            System.out.println(numberCube * numberCube * numberCube);
        }
    }
}
