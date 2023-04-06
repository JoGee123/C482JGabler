package gabler.c482jgabler;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ModifyPartsController implements Initializable {

    public Label machineID;
    public RadioButton modifyInHouse;
    public RadioButton modifyOutSourced;



    /**
     * radio buttons to show different views of the same Modify parts form
     * @param actionEvent
     */

    public void onInHouse(ActionEvent actionEvent) {
        machineID.setText("MachineID");
    }

    public void onOutSourced(ActionEvent actionEvent) {
        
        machineID.setText("Company Name");
    }
    /**
     * cancel button to Main Menu
     * @param actionEvent
     * @throws IOException
     */
    public void cancelToMain (ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) ((Button)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am Initialized ");
    }

}
