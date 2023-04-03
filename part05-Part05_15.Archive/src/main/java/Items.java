
public class Items {

    private String identifier;
    private String item;

    public Items(String identifier, String item) {
        this.identifier = identifier;
        this.item = item;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.item;
    }
    
    @Override
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Items)){
            return false;
        }
        
        Items comparedItem = (Items) compared;
        
        if (this.identifier.equals(comparedItem.identifier)){
            return true;
        }
        return false;
    }
}
