package main;

import main.Command.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Shape> shapeArrayList = new ArrayList<>();
    
    public static void main(String [] args) throws FileNotFoundException {

        Scanner inputFile = new Scanner(new File("/Users/Jacob/git/OOFall2020/a3_nmn777/input.txt"));
        ArrayList<String> CommandList = new ArrayList<String>();

        while (inputFile.hasNextLine()){
            CommandList.add(inputFile.nextLine());
        }
        inputFile.close();

        System.out.println(CommandList);
    }


}
