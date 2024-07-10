//code to demonstrate polymorphism in java (inheritance)

class beem {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends beem {
    public void speak() {
        System.out.println("Woof!"); // Override speak method for Dog
    }
}

class Cat extends beem {
    public void speak() {
        System.out.println("Meow!"); // Override speak method for Cat
    }
}

public class inheritance
{
    public static void main(String[] args)
    {
        Dog animal1 = new Dog(); // Create a Dog object as an Animal
        beem animal2 = new Cat(); // Create a Cat object as an Animal
        beem animal3 = new beem(); // Create a Animal object as an Animal

        animal1.speak(); // This will print "Woof!"
        animal2.speak(); // This will print "Meow!"
        animal3.speak(); // This will print "Animal speaks"
    }
}
