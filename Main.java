
//Java Program to Find the Area of Square, Rectangle and Circle using Method Overloading
public class Main 
{
    //Driver Code
    public static void main(String[] args)
    {
        Triangle obj = new Triangle();
        // Calling function
        obj.Area(12.5, 4.5);
        Circle obj1 = new Circle();
        // Calling function
        obj1.Area(5.5);
        Square obj2 = new Square();
        // Calling function
        obj2.Area(5.2);
        
    }
}
class Square 
{
    // Overloaded function to
    // calculate the area of the square
    // It takes one double parameter
    void Area(double side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
    // Overloaded function to
    // calculate the area of the square
    // It takes one float parameter
}
class Circle 
{
    static final double PI = Math.PI;
  
    // Overloaded function to
    // calculate the area of the circle.
    // It takes one double parameter
    void Area(double r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
  
    // Overloaded function to
    // calculate the area of the circle.
    // It takes one float parameter
}
class Triangle 
{
     // Overloaded function to
    // calculate the area of the rectangle
    // It takes two double parameters
    void Area(double l, double b)
    {
        System.out.println("Area of the triangle: " + l * b);
    }
    // Overloaded function to
    // calculate the area of the rectangle.
    // It takes two float parameters

//Java Program to Find the area of Square, Rectangle and Circle using Method Overloading.
    //Driver Code
    public static void main(String[] args)
    {
       CalculateArea ob = new CalculateArea();
	   ob.area(4);
	   ob.area(10,12);
	   ob.area(5.5);
    }
}
class CalculateArea
{
    void area(float x)
    {
        System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the triangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
}
