
package atm.system;


public class WithdrawCommand implements Command {

    private ATMModel model;
    private double amount;

    public WithdrawCommand(ATMModel model, double amount) {
        this.model = model;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (model.getBalance() >= amount) {
            model.setBalance(model.getBalance() - amount);
            System.out.println("Withdrew " + amount + ". New ATM Balance: " + model.getBalance());
        } else {
            System.out.println("Insufficient funds in ATM.");
        }
    }

}


