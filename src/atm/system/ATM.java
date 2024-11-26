
package atm.system;

public class ATM {
   private static ATM instance;
    private final ATMController controller;
    private final ATMView view;


    private ATM(ATMModel model, ATMView view, BankingAdapter bankingAdapter) {
        this.controller = new ATMController(model, view, bankingAdapter);
        this.view = view; // Save the view reference
    }

 
    public static ATM getInstance(ATMModel model, ATMView view, BankingAdapter bankingAdapter) {
        if (instance == null) {
            instance = new ATM(model, view, bankingAdapter);
        }
        return instance;
    }

    public void start() {
        int choice;
        do {
            view.displayMenu(); // Directly use the view instance
            System.out.print("Enter your choice: ");
            choice = new java.util.Scanner(System.in).nextInt();
            controller.processUserChoice(choice);
        } while (choice != 4);
    }
}
