import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Expenses> expenseList = new ArrayList<>();

        // List of expense types
        String[] expenseTypes = {"food", "rent", "shopping", "groceries", "electricity"};

        // Get expense details from the user
        for (String expenseType : expenseTypes) {
            System.out.println("Enter expense for " + expenseType);
            double cost = sc.nextDouble();
            expenseList.add(new Expenses(expenseType, cost));
        }

        // Get the salary from the user
        System.out.println("Enter salary");
        double salary = sc.nextDouble();

        // Calculate the sum of all expenses
        double totalExpenses = expenseList.stream()
                                          .map(Expenses::getCost)
                                          .reduce(0.0, Double::sum);

        // Check if expenses exceed salary or calculate savings
        if (totalExpenses > salary) {
            System.out.println("Expenses exceeds Salary");
        } else {
            double savings = salary - totalExpenses;
            System.out.println("Savings amount will be Rs." + savings);
        }

        sc.close();
    }
}
