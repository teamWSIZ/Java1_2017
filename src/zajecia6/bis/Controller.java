package zajecia6.bis;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Canvas codecanvas;

    @FXML
    TextField input_kodu;

    public void rysujPlansze() {
        GraphicsContext gc = codecanvas.getGraphicsContext2D();
        gc.setLineWidth(5);
        gc.strokeLine(5,5, 100,200);
    }
}
