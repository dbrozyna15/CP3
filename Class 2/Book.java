public class Book {
    String title;
    String author;
    int pages;
    String genere;

    public void displayInfo() {
        System.out.println(title +"\n"+ author +"\n"+ genere);
    }

    public void displayPagesInfo(){
        System.out.println(pages);
    }

}
