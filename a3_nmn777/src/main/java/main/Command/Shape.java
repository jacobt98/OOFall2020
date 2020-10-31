package main.Command;

enum Type {
        CIRCLE,
        RECTANGLE,
        NOSHAPE
    }

public class Shape {


    //default
    Type type =  Type.NOSHAPE;

    @Override
    public String toString() {
        return type.toString();
    }
}

