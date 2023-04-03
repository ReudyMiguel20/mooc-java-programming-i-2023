import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private NumberManager numbers;
    
    public UserInterface(Scanner scanner, NumberManager numbers){
        this.scanner = scanner;
        this.numbers = numbers;
    }
    
    public void start(){
        while (true) {

            String input = this.scanner.nextLine();

            if (input.equals("-1")) {
                break;
            }

            int inputNumber = Integer.valueOf(input);
            if (inputNumber > 0 && inputNumber < 100) {
                numbers.add(inputNumber);
            } else if (inputNumber < 0 || inputNumber > 100) {
                continue;
            }
        }
        
        System.out.println(numbers.toString());
        numbers.printGrades();
        
    }
    
    
}
