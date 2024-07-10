//code to demonstrate classes & objects creation in java

public class classobjects {
    String color;
    int year;
    String model;
    int price;

    // Constructor
    public classobjects(String color, int yaar) {
        this.color = color; // this keyword is used to refer to the current object
        year = yaar;
    }

    public void start() {
        System.out.println("Car started!");
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args)
    {
        // Creating an instance of A7
        classobjects myCar = new classobjects("Red", 2020);
        myCar.model = "Blue";
        myCar.price = 2024;

        // Calling the start method on the instance
        myCar.start();
    }
}
