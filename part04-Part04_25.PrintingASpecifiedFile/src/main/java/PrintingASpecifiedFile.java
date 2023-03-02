
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();

        try (Scanner scannerTwo = new Scanner(Paths.get(input))) {

            while (scannerTwo.hasNextLine()) {
                String filas = scannerTwo.nextLine();
                System.out.println(filas);
            }
        }
        
        catch (Exception ohNo){
            System.out.println("Error: " + ohNo.getMessage());
        }

    }
}
