
package atm.system;


public class DepositCommand implements Command {

    private ATMModel model;
    private double amount;

    public DepositCommand(ATMModel model, double amount) {
        this.model = model;
        this.amount = amount;
    }

    @Override
    public void execute() {
        model.setBalance(model.getBalance() + amount);
        System.out.println("Deposited " + amount + ". New ATM Balance: " + model.getBalance());
    }


}

