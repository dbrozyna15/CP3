public abstract class Shape
{
    private double width;
    private double height;

    public void setValues(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void displayDimentions() {
        System.out.println(String.format(
            "Width %f%nHeight: %f",
            width,
            height
        ));
    }
}
