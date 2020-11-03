package main.Command;

public class DeleteCommand implements Command {

    Shape theShape;

    public DeleteCommand(Shape shapeToDelete){
        theShape = shapeToDelete;
    }
    @Override
    public void execute(Shape shape) {

    }
}
