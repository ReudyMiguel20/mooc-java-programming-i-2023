
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item) {

        if (totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }

        //this was the idea i came with, it works but it was a bad idea anyway, the exercise should be more clearer on part 2.
//        if (maximumWeight < 5 && item.getWeight() + maximumWeight < 5) {
//            maximumWeight += item.getWeight();
//            items.add(item);
//        }
    }

    public int totalWeight() {
        int weight = 0;

        for (Item it : items) {
            weight += it.getWeight();
        }
        return weight;
    }
    
    public void printItems(){
        for (int i = 0; i < this.items.size(); i++){
            System.out.println(this.items.get(i));
        }
        
    }
    
    public Item heaviestItem(){
        Item newItem = new Item("sample", 0);
        
        if (this.items.isEmpty()){
            return null;
        }
        
        for (Item it : items){
            if (it.getWeight() > newItem.getWeight()){
                newItem = it;
            }
        }
        return newItem;
    }

    @Override
    public String toString() {
        int itemsCount = items.size();
        String itemsString = " items ";
        
        if (itemsCount == 0){
            itemsString = "no items ";
            return itemsString + "(" + totalWeight() + " kg)";
        }
        
        if (itemsCount == 1) {
            itemsString = " item ";
            return itemsCount + itemsString + "(" + totalWeight() + " kg)";
        }
       

        return itemsCount + itemsString + "(" + totalWeight() + " kg)";

    }
    
    
}
