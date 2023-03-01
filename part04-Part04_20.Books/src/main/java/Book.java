public class Book {
    private String bookName;
    private String bookPages;
    private String bookPublicationYear;
    
    public Book(String name, String pages, String publicationYear){
        this.bookName = name;
        this.bookPages = pages;
        this.bookPublicationYear = publicationYear;
    }
    
    public String getBookName(){
        return this.bookName;
    }
    
    @Override
    public String toString(){
        return this.bookName + ", " + this.bookPages + " pages, " + this.bookPublicationYear;
    }
}
