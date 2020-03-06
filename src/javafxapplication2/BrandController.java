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
public class BrandController implements Initializable {

    @FXML
    private AnchorPane BrandPane;
    @FXML
    private Text Brand;
    @FXML
    private ComboBox ComboBoxBrand;
    @FXML
    private Button Back;
    @FXML
    private Label Error;
    @FXML
    private ComboBox ComboBoxModel;
    @FXML
    private Label Error1;
    @FXML
    private Button Next;
    boolean ok;
    boolean ok1; 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboBoxBrand.getItems().addAll("Brand" , "Audi" , "BMW" , "Mercedes-Benz" , "Volkswagen");
        ComboBoxBrand.getSelectionModel().selectFirst();
        ComboBoxModel.getItems().addAll("Model");
        ComboBoxModel.getSelectionModel().selectFirst();
    }    

    @FXML
    private void NextAction(ActionEvent event) throws IOException {
        if(ok == true && ok1 == true){
            Parent root = FXMLLoader.load(getClass().getResource("Color.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)BrandPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }else{
            if(ok == false)
            Error.setText("Mandatory choice");
            if(ok1 == false)
            Error1.setText("Mandatory choice");
        }
    }


    @FXML
    private void ComboBoxBrandAction(ActionEvent event) {
        ComboBoxModel.getItems().clear();
        if(ComboBoxBrand.getValue().equals("Brand")){
            ok = false;
            ComboBoxModel.getItems().addAll("Model");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(ComboBoxBrand.getValue().equals("Audi")){
            Error.setText("");
            ok = true;
            App.setBrand("Audi");
            ComboBoxModel.getItems().addAll("Model" , "A7" , "Q7" , "Rs7" , "R8" , "Tts");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(ComboBoxBrand.getValue().equals("BMW")){
            Error.setText("");
            ok = true;
            App.setBrand("BMW");
            ComboBoxModel.getItems().addAll("Model" , "Serie4" , "Serie7" , "X4" , "X7" , "I8");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(ComboBoxBrand.getValue().equals("Mercedes-Benz")){
            Error.setText("");
            ok = true;
            App.setBrand("Mercedes-Benz");
            ComboBoxModel.getItems().addAll("Model" , "Class A" , "Class C" , "Class E" , "Class S" , "Class GLA");
            ComboBoxModel.getSelectionModel().selectFirst();
        }else if(ComboBoxBrand.getValue().equals("Volkswagen")){
            Error.setText("");
            ok = true;
            App.setBrand("Volkswagen");
            ComboBoxModel.getItems().addAll("Model" , "Golf" , "Polo" , "Jetta" , "Passat" , "Touareg");
            ComboBoxModel.getSelectionModel().selectFirst();
        }
    }

    @FXML
    private void BackAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)BrandPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ComboBoxModelAction(ActionEvent event) {
        if(ComboBoxModel.getValue() != null){
            if(ComboBoxModel.getValue().equals("Model")){
                ok1 = false;
            }else if(ComboBoxModel.getValue().equals("A7")){
                Error.setText("");
                ok1 = true;
                App.setModel("A7");
            }else if(ComboBoxModel.getValue().equals("Q7")){
                Error.setText("");
                ok1 = true;
                App.setModel("Q7");
            }else if(ComboBoxModel.getValue().equals("Rs7")){
                Error.setText("");
                ok1 = true;
                App.setModel("Rs7");
            }else if(ComboBoxModel.getValue().equals("R8")){
                Error.setText("");
                ok1 = true;
                App.setModel("S7");
            }else if(ComboBoxModel.getValue().equals("Tts")){
                Error.setText("");
                ok1 = true;
                App.setModel("Tts");
            }else if(ComboBoxModel.getValue().equals("Serie4")){
                Error.setText("");
                ok1 = true;
                App.setModel("Serie4");
            }else if(ComboBoxModel.getValue().equals("Serie7")){
                Error.setText("");
                ok1 = true;
                App.setModel("Serie7");
            }else if(ComboBoxModel.getValue().equals("X4")){
                Error.setText("");
                ok1 = true;
                App.setModel("X4");
            }else if(ComboBoxModel.getValue().equals("X7")){
                Error.setText("");
                ok1 = true;
                App.setModel("X7");
            }else if(ComboBoxModel.getValue().equals("I8")){
                Error.setText("");
                ok1 = true;
                App.setModel("I8");
            }else if(ComboBoxModel.getValue().equals("Class A")){
                Error.setText("");
                ok1 = true;
                App.setModel("Class A");
            }else if(ComboBoxModel.getValue().equals("Class C")){
                Error.setText("");
                ok1 = true;
                App.setModel("Class C");
            }else if(ComboBoxModel.getValue().equals("Class E")){
                Error.setText("");
                ok1 = true;
                App.setModel("Class E");
            }else if(ComboBoxModel.getValue().equals("Class S")){
                Error.setText("");
                ok1 = true;
                App.setModel("Class S");
            }else if(ComboBoxModel.getValue().equals("Class GLA")){
                Error.setText("");
                ok1 = true;
                App.setModel("Class GLA");
            }else if(ComboBoxModel.getValue().equals("Golf")){
                Error.setText("");
                ok1 = true;
                App.setModel("Golf");
            }else if(ComboBoxModel.getValue().equals("Polo")){
                Error.setText("");
                ok1 = true;
                App.setModel("Polo");
            }else if(ComboBoxModel.getValue().equals("Jetta")){
                Error.setText("");
                ok1 = true;
                App.setModel("Jetta");
            }else if(ComboBoxModel.getValue().equals("Passat")){
                Error.setText("");
                ok1 = true;
                App.setModel("Passat");
            }else if(ComboBoxModel.getValue().equals("Touareg")){
                Error.setText("");
                ok1 = true;
                App.setModel("Touareg");
            }
        }
    }
    
}
