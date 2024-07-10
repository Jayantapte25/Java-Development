public class A15 {
    public static void main(String[] args) {
        final int MAX_VALUE = 100; // Declare a final variable

        // MAX_VALUE = 200; // Cannot reassign a value to a final variable (compile-time error)

        final Person person = new Person("John");
        System.out.println("Name: " + person.getName());

        // person = new Person("Alice"); // Cannot reassign a new object to a final reference (compile-time error)

        person.setName("Alice"); // Can modify the state of the object it refers to
        System.out.println("New Name: " + person.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
