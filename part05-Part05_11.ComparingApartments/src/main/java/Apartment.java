
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        price = this.squares * this.princePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        if (this.price < compared.price) {
            int restaPrecio = compared.price - this.price;
            return restaPrecio;
        }
        int restaPrecio = this.price - compared.price;
        return restaPrecio;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if (this.price < compared.price) {
            return false;
        }
        return true;
    }

}
