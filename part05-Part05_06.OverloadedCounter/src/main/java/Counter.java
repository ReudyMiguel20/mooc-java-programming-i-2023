
public class Counter {

    private int counter;

    public Counter(int startValue) {
        this.counter = startValue;
    }

    public Counter() {
        this.counter = 0;
    }

    public int value() {
        return this.counter;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.counter = this.counter + increaseBy;
        }
        this.counter = this.counter;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.counter = this.counter - decreaseBy;
        }
        this.counter = this.counter;
    }

    public void increase() {
        this.counter += 1;
    }

    public void decrease() {
        this.counter -= 1;
    }

}
