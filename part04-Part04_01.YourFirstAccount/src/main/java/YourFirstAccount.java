
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account mikeAccount = new Account("Mike's account", 100.00);
        
        System.out.println(mikeAccount);
        
        mikeAccount.deposit(20.00);
        
        System.out.println(mikeAccount);
        
        
    }
}
