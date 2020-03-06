/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RIHAB
 */
public class ThanksController implements Initializable {

    @FXML
    private AnchorPane ThanksPane;
    @FXML
    private Button Cancel;
    @FXML
    private Button Alldone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CancelAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Brand.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)ThanksPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void AlldoneAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)ThanksPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
