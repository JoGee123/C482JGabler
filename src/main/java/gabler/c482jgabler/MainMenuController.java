package gabler.c482jgabler;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am Initialized ");
    }

    public void exitButton(ActionEvent actionEvent) {
        System.out.println("Exited Program");
        System.exit(0);

    }
}