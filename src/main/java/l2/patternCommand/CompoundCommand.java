package l2.patternCommand;
import l2.patternCommand.Command;

import java.util.ArrayList;
import java.util.List;

public class CompoundCommand implements Command {
    private List<Command> commands = new ArrayList();

    public CompoundCommand(List commands){
        this.commands = commands;
    }

    public void execute(){
        for(Command command : commands){
            command.execute();
        }
    }
}