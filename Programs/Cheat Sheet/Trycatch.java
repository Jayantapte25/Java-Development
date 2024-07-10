import java.util.Scanner;

class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType() {}

    public ItemType(String name, Double deposit, Double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nDeposit:" + deposit + "\nCost Per Day:" + costPerDay;
    }
}

public class Trycatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the Item type details:");
            System.out.println("Enter the name:");
            String name = scanner.nextLine();

            System.out.println("Enter the deposit:");
            String depositStr = scanner.nextLine();
            Double deposit = Double.parseDouble(depositStr);

            System.out.println("Enter the cost per day:");
            String costPerDayStr = scanner.nextLine();
            Double costPerDay = Double.parseDouble(costPerDayStr);

            ItemType item = new ItemType(name, deposit, costPerDay);
            System.out.println("The details of the item type are:");
            System.out.println(item.toString()); // toString() method is called automatically when we print the object

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: " + e.getMessage()); // e.getMessage() returns the error message & not necessary to print java.lang.NumberFormatException as it is, we can print our own message
        } finally {
            scanner.close();
        }
    }
}
