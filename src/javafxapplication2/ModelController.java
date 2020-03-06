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
public class ModelController implements Initializable {

    @FXML
    private AnchorPane ModelPane;
    @FXML
    private ComboBox ComboBoxModel;
    @FXML
    private Text Choosemodel;
    @FXML
    private Button Back;
    @FXML
    private Label Error;

    
    boolean ok;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(App.getBrand().equals("Alfa Romeo")){
            ComboBoxModel.getItems().addAll("Model" , "4c" , "Giulia" , "Giulietta" , "Mito" , "Stelvio");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("Audi")){
           ComboBoxModel.getItems().addAll("Model" , "A7" , "Q7" , "Rs7" , "S7" , "Tts");
           ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("BMW")){
            ComboBoxModel.getItems().addAll("Model" , "Serie4" , "Serie7" , "X4" , "X7" , "I8");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("Citroen")){
            ComboBoxModel.getItems().addAll("Model" , "Berlingo" , "C3" , "C4" , "C5 Aircross" , "Nemo");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("Fiat")){
            ComboBoxModel.getItems().addAll("Model" , "500" , "500 L" , "500 X" , "Punto" , "Doblo");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("Ford")){
            ComboBoxModel.getItems().addAll("Model" , "Fiesta" , "Focus" , "Mondeo" , "Kuga" , "Mustang");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("Hyundai")){
            ComboBoxModel.getItems().addAll("Model" , "I10" , "I30" , "I40" , "Santa Fe" , "Tucson");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("Mercedes-Benz")){
            ComboBoxModel.getItems().addAll("Model" , "Class A" , "Class C" , "Class E" , "Class S" , "Class GLA");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("Renault")){
            ComboBoxModel.getItems().addAll("Model" , "Clio" , "Captur" , "Megane" , "Talisman" , "Koleos");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(App.getBrand().equals("Volkswagen")){
            ComboBoxModel.getItems().addAll("Model" , "Golf" , "Polo" , "Jetta" , "Passat" , "Touareg");
            ComboBoxModel.getSelectionModel().selectFirst();
        }
    }    

    @FXML
    private void NextAction(ActionEvent event) throws IOException {
        if(ok == true){
            Parent root = FXMLLoader.load(getClass().getResource("Color.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)ModelPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }else{
            Error.setText("Mandatory choice");
        }
    }


    @FXML
    private void ComboBoxModelAction(ActionEvent event) {
        if(ComboBoxModel.getValue().equals("Model")){
            ok = false;
        }else if(ComboBoxModel.getValue().equals("4c")){
            Error.setText("");
            ok = true;
            App.setModel("4c");
        }else if(ComboBoxModel.getValue().equals("Giulia")){
            Error.setText("");
            ok = true;
            App.setModel("Giulia");
        }else if(ComboBoxModel.getValue().equals("Giulietta")){
            Error.setText("");
            ok = true;
            App.setModel("Giulietta");
        }else if(ComboBoxModel.getValue().equals("Mito")){
            Error.setText("");
            ok = true;
            App.setModel("Mito");
        }else if(ComboBoxModel.getValue().equals("Stelvio")){
            Error.setText("");
            ok = true;
            App.setModel("Stelvio");
        }else if(ComboBoxModel.getValue().equals("A7")){
            Error.setText("");
            ok = true;
            App.setModel("A7");
        }else if(ComboBoxModel.getValue().equals("Q7")){
            Error.setText("");
            ok = true;
            App.setModel("Q7");
        }else if(ComboBoxModel.getValue().equals("Rs7")){
            Error.setText("");
            ok = true;
            App.setModel("Rs7");
        }else if(ComboBoxModel.getValue().equals("S7")){
            Error.setText("");
            ok = true;
            App.setModel("S7");
        }else if(ComboBoxModel.getValue().equals("Tts")){
            Error.setText("");
            ok = true;
            App.setModel("Tts");
        }else if(ComboBoxModel.getValue().equals("Serie4")){
            Error.setText("");
            ok = true;
            App.setModel("Serie4");
        }else if(ComboBoxModel.getValue().equals("Serie7")){
            Error.setText("");
            ok = true;
            App.setModel("Serie7");
        }else if(ComboBoxModel.getValue().equals("X4")){
            Error.setText("");
            ok = true;
            App.setModel("X4");
        }else if(ComboBoxModel.getValue().equals("X7")){
            Error.setText("");
            ok = true;
            App.setModel("X7");
        }else if(ComboBoxModel.getValue().equals("I8")){
            Error.setText("");
            ok = true;
            App.setModel("I8");
        }else if(ComboBoxModel.getValue().equals("Berlingo")){
            Error.setText("");
            ok = true;
            App.setModel("Berlingo");
        }else if(ComboBoxModel.getValue().equals("C3")){
            Error.setText("");
            ok = true;
            App.setModel("C3");
        }else if(ComboBoxModel.getValue().equals("C4")){
            Error.setText("");
            ok = true;
            App.setModel("C4");
        }else if(ComboBoxModel.getValue().equals("C5 Aircross")){
            Error.setText("");
            ok = true;
            App.setModel("C5 Aircross");
        }else if(ComboBoxModel.getValue().equals("Nemo")){
            Error.setText("");
            ok = true;
            App.setModel("Nemo");
        }else if(ComboBoxModel.getValue().equals("500")){
            Error.setText("");
            ok = true;
            App.setModel("500");
        }else if(ComboBoxModel.getValue().equals("500 L")){
            Error.setText("");
            ok = true;
            App.setModel("500 L");
        }else if(ComboBoxModel.getValue().equals("500 X")){
            Error.setText("");
            ok = true;
            App.setModel("500 X");
        }else if(ComboBoxModel.getValue().equals("Punto")){
            Error.setText("");
            ok = true;
            App.setModel("Punto");
        }else if(ComboBoxModel.getValue().equals("Doblo")){
            Error.setText("");
            ok = true;
            App.setModel("Doblo");
        }else if(ComboBoxModel.getValue().equals("Fiesta")){
            Error.setText("");
            ok = true;
            App.setModel("Fiesta");
        }else if(ComboBoxModel.getValue().equals("Focus")){
            Error.setText("");
            ok = true;
            App.setModel("Focus");
        }else if(ComboBoxModel.getValue().equals("Mondeo")){
            Error.setText("");
            ok = true;
            App.setModel("Mondeo");
        }else if(ComboBoxModel.getValue().equals("Kuga")){
            Error.setText("");
            ok = true;
            App.setModel("Kuga");
        }else if(ComboBoxModel.getValue().equals("Mustang")){
            Error.setText("");
            ok = true;
            App.setModel("Mustang");
        }else if(ComboBoxModel.getValue().equals("I10")){
            Error.setText("");
            ok = true;
            App.setModel("I10");
        }else if(ComboBoxModel.getValue().equals("I30")){
            Error.setText("");
            ok = true;
            App.setModel("I30");
        }else if(ComboBoxModel.getValue().equals("I40")){
            Error.setText("");
            ok = true;
            App.setModel("I40");
        }else if(ComboBoxModel.getValue().equals("Santa Fe")){
            Error.setText("");
            ok = true;
            App.setModel("Santa Fe");
        }else if(ComboBoxModel.getValue().equals("Tucson")){
            Error.setText("");
            ok = true;
            App.setModel("Tucson");
        }else if(ComboBoxModel.getValue().equals("Class A")){
            Error.setText("");
            ok = true;
            App.setModel("Class A");
        }else if(ComboBoxModel.getValue().equals("Class C")){
            Error.setText("");
            ok = true;
            App.setModel("Class C");
        }else if(ComboBoxModel.getValue().equals("Class E")){
            Error.setText("");
            ok = true;
            App.setModel("Class E");
        }else if(ComboBoxModel.getValue().equals("Class S")){
            Error.setText("");
            ok = true;
            App.setModel("Class S");
        }else if(ComboBoxModel.getValue().equals("Class GLA")){
            Error.setText("");
            ok = true;
            App.setModel("Class GLA");
        }else if(ComboBoxModel.getValue().equals("Clio")){
            Error.setText("");
            ok = true;
            App.setModel("Clio");
        }else if(ComboBoxModel.getValue().equals("Captur")){
            Error.setText("");
            ok = true;
            App.setModel("Captur");
        }else if(ComboBoxModel.getValue().equals("Megane")){
            Error.setText("");
            ok = true;
            App.setModel("Megane");
        }else if(ComboBoxModel.getValue().equals("Talisman")){
            Error.setText("");
            ok = true;
            App.setModel("Talisman");
        }else if(ComboBoxModel.getValue().equals("Koleos")){
            Error.setText("");
            ok = true;
            App.setModel("Koleos");
        }else if(ComboBoxModel.getValue().equals("Golf")){
            Error.setText("");
            ok = true;
            App.setModel("Golf");
        }else if(ComboBoxModel.getValue().equals("Polo")){
            Error.setText("");
            ok = true;
            App.setModel("Polo");
        }else if(ComboBoxModel.getValue().equals("Jetta")){
            Error.setText("");
            ok = true;
            App.setModel("Jetta");
        }else if(ComboBoxModel.getValue().equals("Passat")){
            Error.setText("");
            ok = true;
            App.setModel("Passat");
        }else if(ComboBoxModel.getValue().equals("Touareg")){
            Error.setText("");
            ok = true;
            App.setModel("Touareg");
        }
            
    }

    @FXML
    private void BackAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Brand.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)ModelPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
