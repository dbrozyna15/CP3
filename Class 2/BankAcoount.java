public class BankAcoount {
    String owner;
    String accNumber;
    float balance;
    String currency;
    boolean blocked;

    public void displayBalance() {
        System.out.println(balance);
    }

    public void changeStatus() {
        blocked = !blocked;
    }

    public void displayInfo() {
        System.out.println(owner);
        System.out.println(accNumber);
    }

}
