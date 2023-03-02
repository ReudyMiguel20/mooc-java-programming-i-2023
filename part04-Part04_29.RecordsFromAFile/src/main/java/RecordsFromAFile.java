
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scannerFile = new Scanner(Paths.get(file))) {

            while (scannerFile.hasNextLine()) {

                String info = scannerFile.nextLine();
                String[] split = info.split(",");

                String name = split[0];
                int age = Integer.valueOf(split[1]);
                
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
                

            }
            
            

        } catch (Exception e) {
            System.out.println("Error: " + file + " not found.");
        }
    }
}
