// The method 1 needs to return a double value that represents the area of a circle.
// The method 2 needs to return an area of a rectangle

public class AreaCalculator {
    
    public static double area(double radius) {
        
        if(radius<0) {
            return -1;
        }
        return Math.PI*radius*radius;
    }
    
    public static double area(double x, double y) {
        if(x<0 || y<0) {
            return -1;
        }
        return x*y;
    }

}