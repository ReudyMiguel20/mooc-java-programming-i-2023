
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.stacks == null || this.stacks.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        stacks.add(value);
    }

    public ArrayList<String> values() {
        return this.stacks;
    }

    public String take(){
        String firstChar = this.stacks.get(this.stacks.size() - 1);
        String firstChar2 = firstChar;
        this.stacks.remove(this.stacks.size() - 1);
        return firstChar2;
    }
}
