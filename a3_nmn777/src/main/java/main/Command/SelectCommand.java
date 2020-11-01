package main.Command;

/**
 * Selects a shape to use with future commands MOVE, DRAW, COLOR, DELETE
 * n is the total number of shapes
 * Currently selected shape defaults to a "no shape" value
 * Calling SELECT on a shape that does not exist in the list will produce the following error message
 * "ERROR: invalid shape for SELECT"
 */
public class SelectCommand implements Command {

    @Override
    public void execute(Shape shape) {

    }
}
