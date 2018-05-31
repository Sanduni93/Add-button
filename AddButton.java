
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application{
    
    
       
    public static void main(String[] args) {
       launch(args);
      
       
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       primaryStage.show();
       Button btn = new Button("Cick Me");
       StackPane root = new StackPane();
       root.getChildren().add(btn);
       Scene scene = new Scene(root,300,300);
       primaryStage.setScene(scene);
    }
    
}
