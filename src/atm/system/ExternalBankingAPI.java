
package atm.system;


public class ExternalBankingAPI {

    public double fetchBalance(String accountNumber) {

        return 1000.00; // Example default balance
    }

    public void makeTransfer(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferred $" + amount + " from " + fromAccount + " to " + toAccount);
    }

}
