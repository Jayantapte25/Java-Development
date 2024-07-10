public class CopyConstructor {
    int money;

    // Constructor to initialize 'money'
    public CopyConstructor(int m) {
        money = m;
    }

    // Copy constructor to create a new object copying the state of another object
    public CopyConstructor(CopyConstructor obj) {
        money = obj.money;
    }

    void display() {
        System.out.println("Money = " + money);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(100);
        CopyConstructor obj2 = new CopyConstructor(obj1); // Creating a new object by copying obj1's state
        obj1.display();
        obj2.display();
    }
}
