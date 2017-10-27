package zajecia4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField innX;

    @FXML
    TextField out;

    public void napiszX() {
        System.out.println("XXXX" + out.getText());
        innX.setText("WWW" + out.getText());

        String xs = "-1234";

        long i = Integer.valueOf(xs);
        System.out.println(i);

    }

}
