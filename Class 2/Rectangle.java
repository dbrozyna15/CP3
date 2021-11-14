public class Rectangle extends Shape
{
    public double getArea() {
        return getHeight() * getWidth();
    }
    
    public double getPerimeter() {
        return (getHeight() + getWidth()) * 2;
    }
    
    public void displayArea() {
        System.out.println("Area: " + getArea());
    }
    
    public void displayPerimeter() {
        System.out.println("Perimeter: " + getPerimeter());
    }
}