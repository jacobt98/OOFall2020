package main.Command;

/**
 * Outputs the currently selected shape information to the console E.g.,
 * Rectangle, Color: Red, Origin: (5,5), Width: 10, Height: 7
 * Circle, Color: Blue, Origin: (10,9), Radius: 12
 */

public class DrawCommand implements Command {

    Shape theShape;

    public DrawCommand(Shape newShape){
        theShape = newShape;
    }

    @Override
    public void execute(Shape shape) {
        theShape.draw();
    }
}
