package zajecia6;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Controller {

    @FXML
    Canvas codecanvas;


    public void rysujKod() {
        GraphicsContext gc = codecanvas.getGraphicsContext2D();

        gc.strokeLine(5,5, 250,350);
    }

}
