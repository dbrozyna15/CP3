public abstract class Shape
{
   private double height;
   private double width;

   public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }

   public double getHeight() 
   {
       return height;
   }
     
   public double getWidth() 
   {
       return width;
   } 

   public abstract double getArea();
}