import java.util.*;

public class Area {
    // Method to calculate the area of a square
    public double Area(double s) {
        double area_square = s * s;
        return area_square;
    }

    // Method to calculate the area of a rectangle
    public double Area(double l, double b) {
        double area_rectangle = l * b;
        return area_rectangle;
    }
}

public class question {
    public static void main(String[] args) {
        Area a = new Area();

        // Storing and printing the results
        double squareArea = a.Area(5);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = a.Area(10, 4);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}
