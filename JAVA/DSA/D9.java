package DSA;

public class D9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String result = sb.toString();
        System.out.println("Result after appending: " + result);

        sb.insert(5, " Java");
        System.out.println("After inserting ' Java': " + sb.toString());

        sb.delete(5, 10);
        System.out.println("After deleting 'Java': " + sb.toString());

        sb.replace(6, 11, "Java");
        System.out.println("After replacing 'World' with 'Java': " + sb.toString());

        sb.reverse();
        System.out.println("After reversing: " + sb.toString());

        System.out.println("Length of StringBuilder: " + sb.length());

        sb.setLength(5);
        System.out.println("After setting length to 5: " + sb.toString());

        StringBuilder RB = new StringBuilder("Chained ");

        RB.append("methods ").append("are ").append("powerful");
        System.out.println("Chained StringBuilder: " + RB.toString());
    }
}
