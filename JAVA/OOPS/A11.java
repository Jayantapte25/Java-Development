
class A {
    public void display() {
        System.out.println("A's display method");
    }
}

class B {
    public void display() {
        System.out.println("B's display method");
    }
}

class C extends A {
    @Override
    public void display() {
        super.display(); //super keyword is used to call the parent class method
    }
}

public class A11 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display(); 
    }
}
