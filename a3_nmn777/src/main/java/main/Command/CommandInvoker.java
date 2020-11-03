package main.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {

    private List<Command> commandHistory;

    private Shape shape;

    public CommandInvoker(Shape shape) {
        this.shape = shape;
        commandHistory = new ArrayList<Command>();
    }

    public void storeAndExecute(Command command){
        commandHistory.add(command);
        command.execute(shape);
    }

    public void printHistory(){
        System.out.println(commandHistory);
    }
}
