
//code to understand static methods in java

class Student{
    String name;
    static String school;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("School: "+school);
    }
}

public class Static {

    public static int add(int a, int b) {
        return a + b;
    }

    static int result = add(5, 3);

    public static int multiply(int a, int b) {
        return a * b;
    }

    static int product = multiply(5, 3);

    public static void main(String[] args) {
        System.out.println("The sum of 5 and 3 is: " + result);
        System.out.println("The product of 5 and 3 is: " + multiply(5, 3));

        Student.school = "Saraswat Vidyalaya"; // static variable can be accessed without creating an object
        Student a = new Student();
        a.name = "Alice";

        a.display();
    }
}
