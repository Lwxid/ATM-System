
package atm.system;

import java.util.Stack;


public class CommandInvoker {



    public void executeCommand(Command command) {
        command.execute();
    }



}
