public class Counter {
    int counter = 0;

    public void increaseByOne() {
        counter+=1;
        System.out.println(counter);
    }

    public void decreaseByOne() {
        counter-=1;
        System.out.println(counter);
    }

    public void increaseByTen() {
        counter+=10;
        System.out.println(counter);
    }

    public void decreaseByTen() {
        counter-=10;
        System.out.println(counter);
    }

    public void resetCounter() {
        counter = 0;
        System.out.println(counter);
    }

}
