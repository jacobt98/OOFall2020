package main.Command;


public interface Shape {

    public static enum ShapeType{
        NOSHAPE,
        CIRCLE,
        RECTANGLE;
    }

    public static enum Color {
        RED,
        BLUE,
        YELLOW,
        ORANGE,
        GREEN;
    }

    public void color(Color scolor);

    public void move(int x, int y);

    public void draw();

    public void delete();

    public void drawscene();
}


