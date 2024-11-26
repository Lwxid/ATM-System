
package atm.system;


public class CheckBalanceCommand implements Command {

    private ATMModel model;

    public CheckBalanceCommand(ATMModel model) {
        this.model = model;
    }

    @Override
    public void execute() {
        System.out.println("ATM Balance: " + model.getBalance());
    }


}
