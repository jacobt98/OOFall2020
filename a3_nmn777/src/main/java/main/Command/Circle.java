package main.Command;

public class Circle implements Shape{

    private Color myColor = Color.BLUE;
    private ShapeType myShape = ShapeType.CIRCLE;

    private double radius;
    private int xpos;
    private int ypos;


    @Override
    public void color(Color scolor) {
        this.myColor = scolor;
    }

    @Override
    public void move(int x, int y) {
        this.xpos = x;
        this.ypos = y;
    }

    @Override
    public void draw() {
        System.out.println("CIRCLE, Color:" + this.myColor);
    }

    @Override
    public void delete() {
        this.myShape = ShapeType.NOSHAPE;
    }

    @Override
    public void drawscene() {

        System.out.println("Pooop");
    }
}
