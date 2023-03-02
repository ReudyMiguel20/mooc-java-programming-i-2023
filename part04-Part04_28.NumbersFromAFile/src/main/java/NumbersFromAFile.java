import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int counter = 0;
        
        try (Scanner scannerFile = new Scanner(Paths.get(file))){
            
            while (scannerFile.hasNextLine()) {
                int scannerFileNumber = Integer.valueOf(scannerFile.nextLine());
                numberList.add(scannerFileNumber);
            }
            
            
            
            for (int i = 0; i < numberList.size(); i++){
                if (numberList.get(i) >= lowerBound && numberList.get(i) <= upperBound) {
                    counter++;
                }
            }
            
        }
        
        catch (Exception e){
            System.out.println("File not found.");
        }
        
        System.out.println("Numbers: " + counter);

    }

}
