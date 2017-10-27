package zajecia4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField in;

    @FXML
    TextField out;

    public void napiszX() {
        System.out.println("XXXX" + out.getText());
        in.setText("WWW" + out.getText());
    }

}
