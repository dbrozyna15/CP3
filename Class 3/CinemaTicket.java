public class CinemaTicket
{
    static String cinemaName = "The Morning Star Cinema";
    
    String filmTitle;
    int row;
    int seat;
    float price;
    
    public CinemaTicket(String title, int row, int seat) {
        if (row == 1 || row == 2) {
            this.price = 10;
        }
        else {
            this.price = 25;
        }
        this.filmTitle = title;
        this.seat = seat;
        this.row = row;
    }
    
    public void displayData() {
        System.out.println(
            cinemaName + "\n" +
            "----------------" + "\n" +
            "Title: " + filmTitle + "\n" +
            "Row: " + row + " | Seat: " + seat + "\n" +
            "Price: " + price + "$\n"
        );
    }
    
    public static void main(String[] args) {
        CinemaTicket ct1 = new CinemaTicket("Gladiator", 2, 10);
        CinemaTicket ct2 = new CinemaTicket("Gladiator", 7, 4);
        
        ct1.displayData();
        ct2.displayData();
    }

}
