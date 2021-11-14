public class Rectangle extends Shape
{
    public double getArea()
    {
        return getHeight() * getWidth();
    }
    
    public static void main(String[] args)
    {
        Shape shape;
        
        Rectangle rect = new Rectangle();
        
        shape = rect;
        shape.setValues(12, 4);
        System.out.println("Area of rectangle : " + shape.getArea());
    }
}
