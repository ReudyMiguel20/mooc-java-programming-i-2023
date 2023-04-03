import java.util.ArrayList;

public class Birds {
    private ArrayList<String> birdsNames;
    private String birdName;
    private String birdNameLatin;
    private int counter;
    
//    public Birds(){
//        this.birdName = birdName;
//        this.birdNameLatin = birdNameLatin;
//    }
    
    public Birds(String birdName, String birdNameLatin, int counter){
        this.birdName = birdName;
        this.birdNameLatin = birdNameLatin;
        this.counter = counter;
    }
    
    public String getBirdName(){
        return this.birdName;
    }
    
    public String getBirdNameLatin(){
        return this.birdNameLatin;
    }
    
    public int getBirdCounter(){
        return this.counter;
    }
    
    public int increaseBirdCounter(){
        return this.counter++;
    }
    
    public String toString(){
        return this.birdName + " (" + this.birdNameLatin + "): " + this.counter + " observations";
    }
}
