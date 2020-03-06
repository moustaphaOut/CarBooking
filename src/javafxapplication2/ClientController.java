/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RIHAB
 */
public class ClientController implements Initializable {

    @FXML
    private AnchorPane ClientPane;
    @FXML
    private Button Confirm;
    @FXML
    private DatePicker DatePicker;
    @FXML
    private Button Cancel;
    @FXML
    private Text TextCode;
    @FXML
    private TextField TextID;
    @FXML
    private TextField TextAdress;
    @FXML
    private TextField TextPhoneNumber;
    @FXML
    private TextField TextCardCode;
    @FXML
    private TextField TextCountry;
    @FXML
    private TextField TextName;
    @FXML
    private Label ErrorName;
    @FXML
    private Label ErrorId;
    @FXML
    private Label ErrorAdress;
    @FXML
    private Label ErrorPhoneNumber;
    @FXML
    private Label ErrorCardCode;
    @FXML
    private Label ErrorCountry;
    @FXML
    private Label ErrorDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ListOurClient list = new ListOurClient();
        try {
            ArrayList<OurClient> client = list.read();
            int x = client.size()+1;
            TextCode.setText("00"+x);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void ConfirmAction(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        if(TextName.getText().equals("") || TextID.getText().equals("") || TextAdress.getText().equals("") || TextPhoneNumber.getText().equals("") || TextCardCode.getText().equals("") || DatePicker.getValue() == null || TextCountry.getText().equals("")){
            if(TextName.getText().equals("")){
                ErrorName.setText("Required Field");
            }else{
                ErrorName.setText("");
            }
            if(TextID.getText().equals("")){
                ErrorId.setText("Required Field");
            }else{      
                ErrorId.setText("");
            }
            if(TextAdress.getText().equals("")){
                ErrorAdress.setText("Required Field");
            }else{
                ErrorAdress.setText("");
            }
            if(TextPhoneNumber.getText().equals("")){
                ErrorPhoneNumber.setText("Required Field");
            }else{
                ErrorPhoneNumber.setText("");
            }
            if(TextCardCode.getText().equals("")){
                ErrorCardCode.setText("Required Field");
            }else{
                ErrorCardCode.setText("");
            }
            if(TextCountry.getText().equals("")){
                ErrorCountry.setText("Required Field");
            }else{
                ErrorCountry.setText("");
            }
            if(DatePicker.getValue() == null){
                ErrorDate.setText("Required Field");
            }else{
                ErrorDate.setText("");
            }
        }else{
            ListCar listcar = new ListCar();
            ArrayList<Car> car = listcar.read();
            for(int i = 0 ; i < car.size() ; i++){
                if(App.getModel().equals(car.get(i).getModel()) && App.getBrand().equals(car.get(i).getBrand()) && App.getColor().equals(car.get(i).getColor())){
                    car.get(i).setNumber(car.get(i).getNumber() -1);
                }
            }
            listcar.Save(car);
            ListOurClient list = new ListOurClient();
            ArrayList<OurClient> client = list.read();
            String Date =  DatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            int x = 0;
            for(int i = 0 ; i < client.size() ; i++){
                x = i;
            }
            x++;
            client.add(new OurClient( TextName.getText(), TextID.getText(), TextAdress.getText(), TextPhoneNumber.getText(),  Date , TextCountry.getText(), App.getBrand() , App.getModel() , App.getColor()));
            list.Save(client);
            Parent root = FXMLLoader.load(getClass().getResource("Thanks.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)ClientPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    private void CancelAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Brand.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)ClientPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
