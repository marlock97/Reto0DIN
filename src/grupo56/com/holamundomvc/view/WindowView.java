/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * View specification for GUI.
 * @author Martin Angulo
 */
public class WindowView extends Application implements View {

    /**
     * Entry point of all JavaFX applications.
     * @param primaryStage Root Stage
     */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World! - MVC");
        
        StackPane root = new StackPane();
        
        Text text_ = new Text();
        //Get greeting from parameters.
        String greeting = getParameters().getRaw().toString();
        //Cleanup greeting string.
        greeting = greeting.replace("[", "");
        greeting = greeting.replace("]", "");
        text_.setText(greeting);
        root.getChildren().add(text_);
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    
    /**
     * Shows the provided message in a window.
     * @param greeting String containing the message to view.
     */
    @Override
    public void showGreeting(String greeting) {
        launch(greeting);
    }   
}
