abstract class Shape {
    public abstract double area(); 

    public void display() { // Concrete method means it has a body and is not abstract so it can be inherited
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class A12 {
    public static void main(String[] args) {
        // Cannot instantiate Shape directly (it's abstract)
        // Shape shape = new Shape(); // This will cause compilation error

        // Create an instance of Circle (subclass of Shape)
        Circle circle = new Circle(5.0);
        circle.display(); // Call inherited concrete method
        System.out.println("Area of circle: " + circle.area()); // Call overridden abstract method
    }
}
