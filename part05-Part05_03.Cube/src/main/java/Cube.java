public class Cube {
    private int edgeLength;
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }
    
    public int volume(){
        return (edgeLength * edgeLength * edgeLength);
//        this.cubeNumber = edgeLength * edgeLength * edgeLength;
//        return this.cubeNumber;
    }
    
    @Override
    public String toString(){
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
}
