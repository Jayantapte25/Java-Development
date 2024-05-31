class shape
{
    int length;
    int breadth;
    int height;
    int radius;
}

class circle extends shape
{
    circle(int r)
    {
        radius = r;
    }
    void area()
    {
        System.out.println("Area of circle is: "+(3.14*radius*radius));
    }
}

class rectangle extends shape
{
    rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    void area()
    {
        System.out.println("Area of rectangle is: "+(length*breadth));
    }
    void perimeter()
    {
        System.out.println("Perimeter of rectangle is: "+(2*(length+breadth)));
    }
}

class triangle extends shape
{
    triangle(int b, int h)
    {
        breadth = b;
        height = h;
    }
    void area()
    {
        System.out.println("Area of triangle is: "+(0.5*breadth*height));
    }
    void perimeter()
    {
        System.out.println("Perimeter of triangle is: "+(3*breadth));
    }
}

public class A3 {

    public static void main(String[] args) {
        circle c = new circle(5);
        c.area();
        rectangle r = new rectangle(5, 6);
        r.area();
        r.perimeter();
        triangle t = new triangle(5, 6);
        t.area();
        t.perimeter();
    }    
}

