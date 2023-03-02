
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scannerFile = new Scanner(Paths.get(file))){
            
            while (scannerFile.hasNextLine()) {
                String lines = scannerFile.nextLine();
                String[] splitText = lines.split(",");
                
                String name = splitText[0];
                
                int age = Integer.valueOf(splitText[1]);
                
                persons.add(new Person(name, age));
            }
            
            
        }
        catch (Exception e) {
            System.out.println("File not found.");
        }
        
        return persons;

    }
}
