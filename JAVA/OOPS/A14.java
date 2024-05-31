public class A14 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This line will always execute, regardless of exceptions.");
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
