public class Rectangle {
    int a;
    int b;

    public void displayDimensions() {
        System.out.println(a+"x"+b);
    }

    public void displayPerimeter() {
        System.out.println(2*(a+b));
    }

    public void displaySurfaceArea() {
        System.out.println(a*b);
    }
}
