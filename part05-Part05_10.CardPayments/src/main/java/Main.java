
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

//        PaymentCard mikeCard = new PaymentCard(10);
//
//        System.out.println("money " + mikeCard.balance());
//        boolean wasSuccessful = mikeCard.takeMoney(8);
//        System.out.println("Successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + mikeCard.balance());
//
//        wasSuccessful = mikeCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + mikeCard.balance());
//          PaymentTerminal cafeteriaPrincipal = new PaymentTerminal();
//          
//          double change = cafeteriaPrincipal.eatAffordably(10);
//          System.out.println("remaining change " + change);
//          
//          change = cafeteriaPrincipal.eatAffordably(1.5);
//          System.out.println("remaining change " + change);
//          
//          change = cafeteriaPrincipal.eatHeartily(4.3);
//          System.out.println("remaining change " + change);
//          
//          System.out.println(cafeteriaPrincipal);
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(10);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
