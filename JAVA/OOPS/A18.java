    import java.util.Scanner;

    abstract class FundTransfer {
        private String accountNumber;
        private Double balance;

        public FundTransfer(String accountNumber, Double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public abstract boolean transfer(Double transfer);

        public boolean validate(Double transfer) {
            return accountNumber.length() == 10 && transfer >= 0 && transfer < balance;
        }

        public Double getBalance() {
            return balance;
        }

        public void setBalance(Double balance) {
            this.balance = balance;
        }
    }

    class NEFTTransfer extends FundTransfer {
        public NEFTTransfer(String accountNumber, Double balance) {
            super(accountNumber, balance);
        }

        @Override
        public boolean transfer(Double transfer) {
            if (validate(transfer)) {
                double serviceCharge = transfer * 0.05;
                if (getBalance() >= (transfer + serviceCharge)) {
                    setBalance(getBalance() - (transfer + serviceCharge));
                    return true;
                }
            }
            return false;
        }
    }

    public class A18 {
        public static void main(String[] args) {

            while(true)
            {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter your account number:");
                String accountNumber = scanner.nextLine();

                System.out.println("Enter the balance of the account:");
                Double balance = scanner.nextDouble();

                System.out.println("Enter the amount to be transferred:");
                Double transferAmount = scanner.nextDouble();

                NEFTTransfer transfer = new NEFTTransfer(accountNumber, balance);

                if (transfer.transfer(transferAmount)) {
                    System.out.println("Transfer occurred successfully");
                    System.out.println("Remaining balance is " + transfer.getBalance());
                } else {
                    System.out.println("Transfer could not be made");
                }
            }
        }
    }
