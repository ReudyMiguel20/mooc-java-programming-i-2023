
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String firstName = scanner.nextLine();
            
            if (firstName.isEmpty()){
                break;
            }
            
            String lastName = scanner.nextLine();
            String identificationNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }
        
       for (PersonalInformation print : infoCollection){
           System.out.println(print.getFirstName() + " " + print.getLastName());
       }

    }
    
    
}
