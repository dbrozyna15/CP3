public class BankAccount
{
    int id;
    int ownerId;
    int budget;
    String ownerName;
    String ownerSurname;
    String currency = "USD";
    int maxWithdrawalAmount = 500;
    private String email;
    private String password;
    private String phoneNumber;
    
    public void deposit(int amount) {
        this.budget += amount;
    }
    public void displayBalance() {
        System.out.println(this.budget + " " + this.currency);
    }
    public boolean withdraw(int amount) {
        if (amount > this.maxWithdrawalAmount) {
            System.out.println(
            "The amount is greater than a maximum withdrawal amount " 
            + "(" + this.maxWithdrawalAmount + " " + this.currency + ")");
            return false;
        }
        
        if (this.budget - amount >= 0) {
            this.budget -= amount;
            System.out.println(amount + " " + this.currency + " have been withdrawn.");
            return true;
            
        }
        
        System.out.println("Not enough money in your account.");
        return false;
    }
}