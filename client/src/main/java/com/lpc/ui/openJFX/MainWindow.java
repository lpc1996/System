package com.lpc.ui.openJFX;

import com.lpc.config.Current;
import com.lpc.config.impl.CurrentImpl;
import com.lpc.util.SpringUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author 濃霧-遠方
 * @date 2021/11/16
 */
public class MainWindow implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ApplicationContext context = SpringUtil.getApplicationContext();
        System.out.println(((CurrentImpl)context.getBean("currentImpl")).getUser());

    }

    @FXML
    private Menu person;

    @FXML
    private MenuItem myInfo;

    @FXML
    private MenuBar MenuBar;

    @FXML
    private AnchorPane contentPane;

    @FXML
    void myInfoAction(ActionEvent event) {

        try {
            GridPane myInfo = (GridPane) FXMLLoader.load(this.getClass().getResource("/fxml/MyInfo.fxml"));

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
