public class Book {
    private String author;
    private String title;
    private int pages;
    
    public Book(String bookAuthor, String bookTitle, int bookPages){
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = bookPages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public String toString(){
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }
}
