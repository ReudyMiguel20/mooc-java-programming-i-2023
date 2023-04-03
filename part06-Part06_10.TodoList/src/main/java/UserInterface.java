import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while (true){
            
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            
            if (input.equals("stop")){
                break;
            } else if (input.equals("add")){
                System.out.println("To add:");
                input = this.scanner.nextLine();
                this.list.add(input);
            } else if (input.equals("list")){
                list.print();
            } else if (input.equals("remove")){
                System.out.println("Which one is removed?");
                int inputNumber = Integer.valueOf(this.scanner.nextLine());
                list.remove(inputNumber);
            } else{
                continue;
            }
            
        }
    }
}
