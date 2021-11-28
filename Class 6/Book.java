public class Book
{
    String publishingHouse = "The Best Books";
    String title;
    String author;
    String genre;
    int pages;
    boolean isOpened;
    String content;
    String tableOfContent;
    
    public String toString() {
        return "Title: " + this.title + 
        "\nAuthor: " + this.author +
        "\nGenre: " + this.genre + 
        "\nNumber of pages: " + this.pages;
    }
    
    public void open() {
        this.isOpened = true;
    }
    
    public void close() {
        this.isOpened = false;
    }
    
    
}
