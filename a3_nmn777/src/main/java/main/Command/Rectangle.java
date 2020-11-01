package main.Command;

public class Rectangle implements Shape{

    private int origin_x = 0;
    private int origin_y = 0;

    private int width;
    private int height;

    private Color myColor = Color.RED;
    private ShapeType myShape = ShapeType.RECTANGLE;

    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }

    @Override
    public void color(Color scolor) {
        this.myColor = scolor;
    }

    @Override
    public void move(int x, int y) {
        this.origin_x = x;
        this.origin_y = y;
    }

    @Override
    public void draw() {
        System.out.println("RECTANGLE, Color: " + this.myColor
                + " (" + this.origin_x + "," + this.origin_y
                + "), Width: " + this.width
                + ", Height: " + this.height);
    }

    @Override
    public void delete() {

    }

    @Override
    public void drawscene() {

    }
}
