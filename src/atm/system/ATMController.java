
package atm.system;

public class ATMController {

     private final ATMModel model;
    private final ATMView view;
    private final CommandInvoker invoker;
    private final BankingAdapter bankingAdapter;

    public ATMController(ATMModel model, ATMView view, BankingAdapter bankingAdapter) {
        this.model = model;
        this.view = view;
        this.bankingAdapter = bankingAdapter;
        this.invoker = new CommandInvoker();

     
        model.addObserver(view);
    }

    public void processUserChoice(int choice) {
        switch (choice) {
            case 1: // Check Balance
                invoker.executeCommand(new CheckBalanceCommand(model));
                break;
            case 2: // Deposit
                double depositAmount = view.getAmountInput("deposit");
                invoker.executeCommand(new DepositCommand(model, depositAmount));
                break;
            case 3: // Withdraw
                double withdrawAmount = view.getAmountInput("withdraw");
                invoker.executeCommand(new WithdrawCommand(model, withdrawAmount));
                break;
            case 4: // Exit
                view.showMessage("Thank you for using the ATM!");
                break;
            default:
                view.showMessage("Invalid choice!");
        }
    }
}
