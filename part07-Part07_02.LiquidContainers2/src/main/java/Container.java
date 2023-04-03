
public class Container {

    private int firstContainer;

    public Container() {

    }

    public int contains() {
        return firstContainer;
    }

    public void add(int amount) {

        if (amount < 0) {
            firstContainer = firstContainer;
        } else if (firstContainer + amount > 100) {
            firstContainer = 100;
        } else if (firstContainer + amount < 100) {
            firstContainer += amount;
        }

    }

    public void remove(int amount) {
        if (firstContainer - amount < 0) {
            firstContainer = 0;
        } else if (firstContainer - amount > 0) {
            firstContainer -= amount;
        }

    }

    public String toString() {
        return firstContainer + "/100";
    }
}
