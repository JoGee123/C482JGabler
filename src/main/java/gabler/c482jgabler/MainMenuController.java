package gabler.c482jgabler;


import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * this is the MainMenuController Class for the main form
 */
public class MainMenuController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am Initialized ");
    }

    /** button click to add parts form
     *
     * @param actionEvent
     * @throws IOException
     */
    public void addpartButton(ActionEvent actionEvent ) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddPartsForm.fxml"));
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Add Parts Form");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * button click to modify parts form
     */
    public void modifypartsButton(ActionEvent actionEvent) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ModifyPartsForm.fxml"));
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Modify Parts Form");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * button click to add Product form
     */
    public void addproductsButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddProductForm.fxml"));
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Add Product Form");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * button to modify product form
     */
    public void modifyproductButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ModifyProductsForm.fxml"));
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Modify Products Form");
        stage.setScene(scene);
        stage.show();

    }



    /**
     * button to exit program
     * @param actionEvent
     */
    public void exitButton(ActionEvent actionEvent) {

        System.out.println("Exited Program");
        System.exit(0);

    }



}