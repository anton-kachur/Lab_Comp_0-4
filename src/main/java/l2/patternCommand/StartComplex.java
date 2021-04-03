package l2.patternCommand;

import l2.ComplexNumber.ComplexNumber;
import l2.patternCommand.Command;

public class StartComplex implements Command {
    private ComplexNumber number;

    public StartComplex(ComplexNumber number){
        this.number = number;
    }

    public void execute(){
        number.start();
    }
}
