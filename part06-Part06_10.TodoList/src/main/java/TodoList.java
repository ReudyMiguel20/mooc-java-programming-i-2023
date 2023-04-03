
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> thingsToDo;

    public TodoList() {
        this.thingsToDo = new ArrayList<>();
    }

    public void add(String task) {
        this.thingsToDo.add(task);
    }

    public void print() {
        int secondIndex = 1;
        for (int i = 0; i < thingsToDo.size(); i++) {
            System.out.println(secondIndex + ": " + thingsToDo.get(i));
            secondIndex++;
        }
    }

    public void remove(int number) {
        this.thingsToDo.remove(number - 1);
    }
}
