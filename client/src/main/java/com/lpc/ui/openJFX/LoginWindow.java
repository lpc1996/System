package com.lpc.ui.openJFX;

import com.lpc.client.impl.UserClientImpl;
import com.lpc.config.impl.CurrentImpl;
import com.lpc.model.User;
import com.lpc.util.SpringUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author 濃霧-遠方
 * @date 2021/11/12
 */
public class LoginWindow implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private Text actionTarget;

    @FXML
    private PasswordField passField;

    @FXML
    private Button registerBtn;

    @FXML
    private TextField userNameField;

    @FXML
    private Button submitBtn;

    @FXML
    void login(ActionEvent event) {
        ApplicationContext context = SpringUtil.getApplicationContext();
        try {
            UserClientImpl userClient = (UserClientImpl) context.getBean("userClientImpl");
            String userName = userNameField.getText();
            String pass = passField.getText();
            if(userClient.checkPass(userName,pass)){
                actionTarget.setText("登陆成功");

                CurrentImpl current = (CurrentImpl) context.getBean("currentImpl");
                current.setUser(userClient.getUser(userName));

                Stage stage = (Stage)submitBtn.getScene().getWindow();
                createMainWindow();
                stage.close();

            }else {
                actionTarget.setText("登陆失败");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void register(ActionEvent event) {

    }

    private void createMainWindow(){
        URL fxmlUrl = getClass().getResource("/fxml/MainWindow.fxml");
        if(fxmlUrl == null){
            System.out.println("无法读取fxml文件");
            System.exit(0);
        }
        Parent root = null;
        try {
            root = FXMLLoader.load(fxmlUrl);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        Scene scene = new Scene(root);
        URL cssUrl = getClass().getResource("/css/Login.css");
        if(cssUrl == null){
            System.out.println("无法读取css文件");
            System.exit(0);
        }
        scene.getStylesheets().add(cssUrl.toExternalForm());
        Stage primaryStage = new Stage();
        primaryStage.setTitle("校园管理系统");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
