package Generics;

class resh<T1> {
    int val;
    T1 obj;

    public resh(T1 obj, int val) {
        this.obj = obj;
        this.val = val;
    }

    public int getval() {
        return val;
    }

    public T1 getobj() {
        return obj;
    }
}

public class G1 {
    public static void main(String[] args) {
        resh<String> r = new resh<>("Jayant", 234);
        System.out.println(r.getval());
        System.out.println(r.getobj());
    }
}
