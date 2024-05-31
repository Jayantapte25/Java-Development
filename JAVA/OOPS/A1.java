class test1 {
    String name;
    int age;

    public void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Student {
    String name;
    int age;

    public void printname()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    Student(Student s1)
    {
        this.name = s1.name;
        this.age = s1.age;
    }
    Student(){}
}

public class A1 {
    public static void main(String[] args) {
        test1 obj = new test1();
        obj.name = "Jayant";
        obj.age = 22;
        obj.printinfo();

        System.out.println("");

        Student s2 = new Student("Harsh", 23);
        s2.printname();

        System.out.println("");

        Student s1 = new Student();
        s1.name = "Caymann";
        s1.age = 89;

        Student s3 = new Student(s1);
        s3.printname();       
    }
}
