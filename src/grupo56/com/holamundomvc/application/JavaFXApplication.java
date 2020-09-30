/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.application;

import grupo56.com.holamundomvc.view.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Application class that uses JavaFX to create windows.
 * @author Martin Angulo
 */
public class JavaFXApplication extends Application implements View {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * Entry point of all JavaFX applications.
     * @param primaryStage Root Stage.
     */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World! - MVC");
        
        Text text = new Text();
        text.setText("Hello World!");
        
        StackPane root = new StackPane();
        root.getChildren().add(text);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    @Override
    public void showGreeting(String greeting) {
        launch();
    }
}
