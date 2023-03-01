
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        
        
        
        // Try your method in here
        removeLast(strings);
        System.out.println(strings.get(1));
    }
    
    public static void removeLast(ArrayList<String> strings){
        if (strings.isEmpty()) {
            return;
        }
        int sizeList = strings.size() - 1;
        strings.remove(sizeList);
    }

}
