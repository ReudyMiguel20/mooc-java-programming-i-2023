
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        Money comparedMoney = (Money) compared;

        if (this.euros < comparedMoney.euros && this.cents <= comparedMoney.cents) {
            return true;
        } else if (this.euros <= comparedMoney.euros && this.cents < comparedMoney.cents) {
            return true;
        } else if (this.euros < comparedMoney.euros && comparedMoney.cents < this.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int newEuros = euros - decreaser.euros();
        int newCents = cents - decreaser.cents();
        
        if (newCents < 0){
            newCents = newCents + 100;
            newEuros = newEuros - 1;
        }
        
        if (newEuros < 0){
            newCents = 0;
            newEuros = 0;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
