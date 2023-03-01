public class Song {
    //Attributes of the class
    private String name;
    private int length;
    
    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }
    
    public String name(){
        return this.name;
    }
    
    public int length(){
        return this.length;
    }
}
