
package atm.system;


public class ATMView implements Observer {

    public void displayMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public double getAmountInput(String action) {
        System.out.print("Enter amount to " + action + ": ");
        return new java.util.Scanner(System.in).nextDouble();
    }

    public String getAccountNumberInput() {
        System.out.print("Enter account number: ");
        return new java.util.Scanner(System.in).nextLine();
    }

    @Override
    public void update(double balance) {
        System.out.println("Updated Balance: $" + balance);
    }

}
