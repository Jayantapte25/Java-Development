public class A9 
{
    public static void main(String[] args)
    {
        String a = "study";
        String b = "easy";
        String c = a + b;
        System.out.println(c);

        if (c.equals("studyeasy")) //we can't use == operator to compare strings
            System.out.println("studyeasy");
        else 
            System.out.println("Studyhard");
    }
}
