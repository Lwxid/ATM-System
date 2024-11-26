package atm.system;

public class ATMSystem {

    public static void main(String[] args) {
         ATMModel model = new ATMModel();
        ATMView view = new ATMView();

     
        BankingAdapter adapter = new BankingAdapter();

       
        ATM atm = ATM.getInstance(model, view, adapter);

      
        atm.start();
    }
}
