package Methods;

public class M1
{
    public static void main(String[] args)
    {
        loop();
        System.out.println("***");
        loop1(10, 20);
        System.out.println("The result of loop2(10, 20) is: " + loop2(10, 20));
        loop1(20, 30, 1);
        System.out.println("The elements are:");
        loop1(2.1, 2.5, 0.1);
    }
    
    public static void loop()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }
    }
    
    public static void loop1(int start, int end)
    {
        for (int i = start; i < end; i++)
        {
            System.out.println(i);
        }
    }
    
    public static int loop2(int start, int end)
    {
        return start * end;
    }
    
    public static void loop1(int start, int end, int step)
    {
        for (int i = start; i < end; i += step)
        {
            System.out.println(i);
        }
    }
    
    public static void loop1(double start, double end, double step)
    {
        for (double i = start; i < end; i += step)
        {
            System.out.println(i);
        }
    }
}
