
package atm.system;

public class BankingAdapter {

    private final ExternalBankingAPI externalBankingAPI;


    public BankingAdapter() {
        this.externalBankingAPI = new ExternalBankingAPI();
    }


    public double getBalance(String accountNumber) {
        return externalBankingAPI.fetchBalance(accountNumber);
    }

   
    public void transfer(String fromAccount, String toAccount, double amount) {
        externalBankingAPI.makeTransfer(fromAccount, toAccount, amount);
    }

}
