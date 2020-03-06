/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RIHAB
 */
public class ColorController implements Initializable {

    @FXML
    private AnchorPane ColorPane;
    @FXML
    private ComboBox ComboBoxColor;
    @FXML
    private Button Next;
    @FXML
    private Text Color;
    @FXML
    private Label Error;
    @FXML
    private Button Back;
    
    boolean ok;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboBoxColor.getItems().addAll("Color" , "BLACK", "WHITE" , "BLUE");
        ComboBoxColor.getSelectionModel().selectFirst();
    }    

    @FXML
    private void ComboBoxColorAction(ActionEvent event) {
        if(ComboBoxColor.getValue().equals("Color")){
            ok = false;
        }else if(ComboBoxColor.getValue().equals("BLACK")){
            Error.setText("");
            ok = true;
            App.setColor("BLACK");
        }else if(ComboBoxColor.getValue().equals("WHITE")){
            Error.setText("");
            ok = true;
            App.setColor("WHITE");
        }else if(ComboBoxColor.getValue().equals("BLUE")){
            Error.setText("");
            ok = true;
            App.setColor("BLUE");
        }
    }

    @FXML
    private void NextAction(ActionEvent event) throws IOException {
        if(ok == true){
            ListCar list = new ListCar();
            ArrayList<Car> car = list.Initialize();
            for(int i = 0 ; i < car.size() ; i++){
                if(App.getBrand().equals(car.get(i).getBrand()) && App.getModel().equals(car.get(i).getModel()) && App.getColor().equals(car.get(i).getColor())){
                    Parent root = FXMLLoader.load(getClass().getResource("Description.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = (Stage)ColorPane.getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                    return;
                } 
            }
            Parent root = FXMLLoader.load(getClass().getResource("Reservation.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)ColorPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }else{
            Error.setText("Mandatory choice");
        }
    }

    @FXML
    private void BackAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Model.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)ColorPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
