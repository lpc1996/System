package com.lpc;

import com.lpc.ui.swing.impl.LoginWindowImpl;
import com.lpc.util.SpringUtil;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.springframework.context.ApplicationContext;

import java.net.URL;

/**
 * Hello world!
 *
 */
public class App extends Application {
    public static void main( String[] args ) {
        System.out.println(args);
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlUrl = getClass().getResource("/fxml/LoginWindow.fxml");
        if(fxmlUrl == null){
            System.out.println("无法读取fxml文件");
            System.exit(0);
        }
        Parent root = FXMLLoader.load(fxmlUrl);

        Scene scene = new Scene(root);
        URL cssUrl = getClass().getResource("/css/Login.css");
        if(cssUrl == null){
            System.out.println("无法读取css文件");
            System.exit(0);
        }
        scene.getStylesheets().add(cssUrl.toExternalForm());
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
            }
        });
        primaryStage.setTitle("JavaFX and Gradle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
