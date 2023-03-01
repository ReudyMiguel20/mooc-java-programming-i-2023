
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        double finalTax;

        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            finalTax = (100 + (giftValue - 5000) * 0.08);
            System.out.println("Tax: " + finalTax);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            finalTax = (1700 + (giftValue - 25000) * 0.10);
            System.out.println("Tax: " + finalTax);
        } else if (giftValue >= 55000 && giftValue < 200000) {
            finalTax = (4700 + (giftValue - 55000) * 0.12);
            System.out.println("Tax: " + finalTax);
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            finalTax = (22100 + (giftValue - 200000) * 0.15);
            System.out.println("Tax: " + finalTax);
        } else if (giftValue >= 1000000) {
            finalTax = (142100 + (giftValue - 1000000) * 0.17);
            System.out.println("Tax: " + finalTax);
        }
    }

}
