import java.lang.Math;

public class SurfaceArea
{
    public static double circle(double r) {
        return Math.PI * r * r;
    }
    
    public static double rectangle(double width, double height) {
        return width * height;
    }
    
    public static double triangle(double width, double height) {
        return width * height / 2;
    }
    
    public static void main(String[] args) {
        System.out.println(
            "Rectangle: " + SurfaceArea.rectangle(4, 5) +
            "\nCircle: " + SurfaceArea.circle(3) +
            "\nTriangle: " + SurfaceArea.triangle(3, 4) + "\n"
        );
    }
}
