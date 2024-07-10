import java.util.*;

class Leave {
    Integer employeeId;
    Integer noOfDays;
    String date;
    Integer availableSickLeaves = 15;
    Integer availableCasualLeaves = 10;
    String reason;

    // Constructor corrected for parameter order and field assignment
    public Leave(Integer employeeId, String date, Integer noOfDays, String reason) {
        this.employeeId = employeeId;
        this.date = date;
        this.noOfDays = noOfDays;
        this.reason = reason;
    }

    // Getters and Setters for fields
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAvailableSickLeaves() {
        return availableSickLeaves;
    }

    public void setAvailableSickLeaves(Integer availableSickLeaves) {
        this.availableSickLeaves = availableSickLeaves;
    }

    public Integer getAvailableCasualLeaves() {
        return availableCasualLeaves;
    }

    public void setAvailableCasualLeaves(Integer availableCasualLeaves) {
        this.availableCasualLeaves = availableCasualLeaves;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Leave> leaveList = new ArrayList<>();

        while (true) {
            System.out.println("Enter employee details (employeeId,date,noOfDays,reason):");
            String[] employeeDetails = sc.nextLine().split(",");
            Leave lv = new Leave(Integer.parseInt(employeeDetails[0]), 
                                 employeeDetails[1], 
                                 Integer.parseInt(employeeDetails[2]), 
                                 employeeDetails[3]);

            leaveList.add(lv);
            System.out.println("Do you want to add another? (Yes/No)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }

        // Adjusting available leaves based on leave type ('S' or 'C')
        for (Leave lv : leaveList) {
            if (lv.getReason().equals("S")) {
                lv.setAvailableSickLeaves(lv.getAvailableSickLeaves() - lv.getNoOfDays());
            } else if (lv.getReason().equals("C")) {
                lv.setAvailableCasualLeaves(lv.getAvailableCasualLeaves() - lv.getNoOfDays());
            }
        }

        // Outputting the formatted leave details
        for (Leave lv : leaveList) {
            if (lv.getReason().equals("S")) {
                System.out.println("Sick Leave : " + lv.getEmployeeId() + "," +
                                   lv.getDate() + "," +
                                   lv.getReason() + "," +
                                   lv.getAvailableSickLeaves() + " sick leaves available");
            } else if (lv.getReason().equals("C")) {
                System.out.println("Casual Leave : " + lv.getEmployeeId() + "," +
                                   lv.getDate() + "," +
                                   lv.getReason() + "," +
                                   lv.getAvailableCasualLeaves() + " casual leaves available");
            }
        }
    }
}
