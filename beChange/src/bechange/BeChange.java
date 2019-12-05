package bechange;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BeChange extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn= new Button("Click me!");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
