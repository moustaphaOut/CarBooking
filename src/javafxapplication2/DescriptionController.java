/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.File;
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
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RIHAB
 */
public class DescriptionController implements Initializable {

    @FXML
    private AnchorPane DescriptionPane;
    @FXML
    private Button Buy;
    @FXML
    private Text Selected;
    @FXML
    private TextArea Description;
    @FXML
    private Text Stock;
    @FXML
    private Button Back;
    @FXML
    private ImageView Image;
 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Description.setText("Brand: "+App.getBrand()+'\n'+"Model: "+App.getModel()+'\n'+"Color: "+App.getColor());
         if(App.getBrand().equals("Audi") && App.getModel().equals("A7") && App.getColor().equals("BLACK")){
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("A7") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/A7blue.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("A7") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/A7white.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Q7") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Q7black.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Q7") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Q7blue.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Q7") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Q7white.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Rs7") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Rs7black.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Rs7") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Rs7blue.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Rs7") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Rs7white.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("R8") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/R8black.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("R8") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/R8blue.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("R8") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/R8white.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Tts") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Ttsblack.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Tts") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Ttsblue.jpg"));
        }else if(App.getBrand().equals("Audi") && App.getModel().equals("Tts") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Ttswhite.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("Serie4") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Serie4black.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("Serie4") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Serie4blue.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("Serie4") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Serie7white.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("Serie7") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Serie7black.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("Serie7") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Serie4blue.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("Serie7") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Serie7white.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("X4") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/X4black.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("X4") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/X4blue.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("X4") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/X4white.png"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("X7") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/X7black.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("X7") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/X7blue.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("X7") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/X7white.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("I8") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/I8black.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("I8") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/I8blue.jpg"));
        }else if(App.getBrand().equals("BMW") && App.getModel().equals("I8") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/I8white.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class A") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/ClassAblack.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class A") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassAblue.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class A") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassAwhite.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class C") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/ClassCblack.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class C") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassCblue.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class C") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("ClassCwhite.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class E") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/ClassEblack.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class E") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassEblue.png"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class E") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassEwhite.png"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class S") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/ClassSblack.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class S") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassSblue.png"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class S") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassSwhite.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class GLA") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/ClassGLAblack.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class GLA") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassGLAblue.jpg"));
        }else if(App.getBrand().equals("Mercedes-Benz") && App.getModel().equals("Class GLA") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/ClassGLAwhite.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Golf") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Golf4black.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Golf") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Golfblue.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Golf") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Golfwhite.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Polo") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Poloblack.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Polo") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Poloblue.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Polo") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Polowhite.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Jetta") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Jettablack.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Jetta") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Jettablue.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Jetta") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Jettawhite.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Passat") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Passatblack.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Passat") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Passatblue.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Passat") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Passatwhite.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Touareg") && App.getColor().equals("BLACK")){
            Image.setImage(new Image("/javafxapplication2/images/Touaregblack.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Touareg") && App.getColor().equals("BLUE")){
            Image.setImage(new Image("/javafxapplication2/images/Touaregblue.jpg"));
        }else if(App.getBrand().equals("Volkswagen") && App.getModel().equals("Touareg") && App.getColor().equals("WHITE")){
            Image.setImage(new Image("/javafxapplication2/images/Touaregwhite.jpg"));
        }
    }    

    @FXML
    private void BuyAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Client.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)DescriptionPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void BackAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Color.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)DescriptionPane.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
