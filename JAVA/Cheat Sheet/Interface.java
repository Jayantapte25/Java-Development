// Interface definition
interface Shape {
    // Interface method (does not have a body)
    double getArea(); // All methods in an interface are public and abstract by default
    
    // Java 8+: Interface can have default and static methods with implementation
    default void display() {
        System.out.println("This is a shape.");
    }
    
    static void printInfo() {
        System.out.println("This is a Shape interface.");
    }
}

// Implementing an interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

// Main class to test the interface and its implementations
public class Interface {
    public static void main(String[] args) {
        // Creating objects of classes implementing the Shape interface
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 10);
        
        // Calling interface methods
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        
        // Calling default method of the interface
        circle.display();
        
        // Calling static method of the interface
        Shape.printInfo();
    }
}
