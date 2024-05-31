public class staticvariable {

    int a=7; //instance
    static int b=8;
    
    public static void main(String[] args)
    {
        staticvariable obj = new staticvariable();
        int a=9; //local
        System.out.println(a);
        System.out.println(obj.a);
        System.out.println(b);
    }
}
