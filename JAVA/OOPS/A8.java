class Outer {
    private int outerField = 10;

    class Inner {
        void display() {
            System.out.println("Inner class method accessing outerField: " + outerField);
        }
    }
}

public class A8 {
    public static void main(String[] args) {
        Outer outerObj = new Outer();

        Outer.Inner innerObj = outerObj.new Inner();

        innerObj.display();
    }
}
