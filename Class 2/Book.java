public class Book
{
    String name;
    String author;
    int pages;
    boolean isCoverHard;
    
    
    public boolean isLong() {
        return pages > 400;
    }
    
    public void printAboutBook() {
        String res = String.format(
            "%s by %s%n%s pages.",
            name,
            author,
            pages
        );
        System.out.println(res);
    }
}
