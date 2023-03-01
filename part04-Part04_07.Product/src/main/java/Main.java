
public class Main {

    public static void main(String[] args) {
        Product banana = new Product("banana", 1.1, 13);
        Product soda = new Product("Soda 20 oz.", 6.45, 31);
        
        soda.printProduct();
        banana.printProduct();
    }
}
