package zajecia6.bis;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Canvas szachycanvas;

    @FXML
    TextField input_kodu;

    public void rysujPlansze() {
        GraphicsContext gc = szachycanvas.getGraphicsContext2D();
        gc.setLineWidth(5);
        gc.strokeLine(5,5, 100,200);
        gc.fillRect(50,50, 20, 20);
        gc.fillRect(90,50, 20, 20);
        gc.fillRect(70,70, 20, 20);

        for (int i = 0; i < 10; i++) {
            gc.fillRect(10 + i * 10,170, 5, 5);
        }
    }
}
