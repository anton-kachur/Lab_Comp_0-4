package l2.patternCommand;

import l2.ComplexNumberExponential.ComplexNumberExponential;
import l2.patternCommand.Command;

public class StartExponential implements Command {
    private ComplexNumberExponential ex;

    public StartExponential(ComplexNumberExponential ex){
        this.ex = ex;
    }

    public void execute(){
        ex.start();
    }
}
