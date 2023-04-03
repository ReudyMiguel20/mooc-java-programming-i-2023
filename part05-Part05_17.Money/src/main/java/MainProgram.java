
public class MainProgram {

    public static void main(String[] args) {
Money firstMoneyObject = new Money(5, 0);
Money secondMoneyObject = new Money(7, 40);




Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);     // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(firstMinusSecond.euros());

    }
}
