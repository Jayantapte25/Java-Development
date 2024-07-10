//code in Java to demonstrate the concept of Encapsulation in OOps 

class Jayant {
    private int money = 20;

    public int getMoney() {
        return money;
    }
}

class Cayman {
    private int money = 30;

    public int getMoney() {
        return money;
    }
}

public class Encapsulation {
    public static void rohit(Jayant obj1, Cayman obj2) {
        System.out.println(obj1.getMoney() + obj2.getMoney());
    }

    public static void main(String[] args) {
        Jayant obj1 = new Jayant();
        Cayman obj2 = new Cayman();

        // Calling rohit method to access obj1 and obj2
        rohit(obj1, obj2);
    }
}
