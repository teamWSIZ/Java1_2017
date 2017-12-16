package zajecia8;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;


public class Controller {

    @FXML
    Canvas mycanvas;

    @FXML
    DatePicker data_przyjazdu;

    @FXML
    DatePicker data_wyjazdu;

    @FXML
    TextArea konsola;

    public void initialize() {

    }


    public void getIt() {
        String a = data_przyjazdu.getValue().toString();
        konsola.appendText("Wybrano date przyjazdu: " + a);
    }




}
