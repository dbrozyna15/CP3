public class Book {
    String title;
    String publishingHouse;
    String author;
    int cost;
    
    public String toString() {
        return this.title + " " + this.author;
    }
    
    public void open() {}
    public void close() {}
}