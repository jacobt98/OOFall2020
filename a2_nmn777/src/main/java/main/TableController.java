package main;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class TableController {

    @FXML
    private TextArea gameOutput;

    @FXML
    private Button playWar;


    public TableController() {
    }

    @FXML
    void playWar(ActionEvent event) {
        System.out.println("Hey, you pressed a button!");
        // TODO: play a game of War (i.e., until someone wins or there is a tie)
    }

    @FXML
    public void initialize() {
        // TODO: if you need to do some GUI init, do it here
    }
}