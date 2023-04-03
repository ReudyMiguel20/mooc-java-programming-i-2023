import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    private int sumOfWeightSuitcases;
    
    public Hold(int maximumWeight){
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
        
    }
    
    public void addSuitcase(Suitcase suitcase){
        //that adds the specified luggage to the hold
        
        
        if (sumOfWeightSuitcases < this.maximumWeight){
            this.suitcases.add(suitcase);
            sumOfWeightSuitcases += suitcase.totalWeight();
        } if (sumOfWeightSuitcases > this.maximumWeight){
            this.suitcases.remove(suitcase);
            sumOfWeightSuitcases -= suitcase.totalWeight();
        }
    }
    
//    public int sumOfWeightSuitcases(){
//        int weight = 0;
//        
//        for (Item it: suitcases){
//            weight += it.getWeight();
//        }
//        return weight;
//        
//    }
    
    public void printItems(){
        for (Suitcase element : suitcases){
            element.printItems();
        }
    }
    
    public String toString(){
        //returns the string "x suitcases (y kg)"
        return this.suitcases.size() + " suitcases " + "(" + sumOfWeightSuitcases + " kg)";
    }
}
