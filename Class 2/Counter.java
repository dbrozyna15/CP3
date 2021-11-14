public class Counter
{
    int myCount;
    int initial = 0;
    
    public Counter()  {
        myCount = initial;
    }
    
    public void increment() {
        myCount += 1;
    }
    
    public void decrement() {
        myCount -= 1;
    }
    
    public void addTen() {
        myCount += 10;
    }
    
    public void subtractTen() {
        myCount -= 10;
    }
    
    public void reset() {
        myCount = initial;
    }
    
    public void printCount() {
        System.out.println(myCount);
    }
}