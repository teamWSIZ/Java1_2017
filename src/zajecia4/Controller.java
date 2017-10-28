package zajecia4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField innX;

    @FXML
    TextField outA;

    @FXML
    TextField wynik;

    public void napiszX() {
        System.out.println("XXXX" + outA.getText());
        innX.setText("WWW" + outA.getText());

        String xs = "-1234";

        long i = Integer.valueOf(xs);
        System.out.println(i);
    }

    public void naszaAkcja() {
        System.out.println(2 * 17);
        innX.setText("" + (2 * 17));
    }

}
