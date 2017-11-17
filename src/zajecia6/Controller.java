package zajecia6;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    Canvas codecanvas;


    public void rysujKod() {
        GraphicsContext gc = codecanvas.getGraphicsContext2D();
        gc.strokeRect(0,0,580, 290);
        gc.setFill(Color.BLACK);
        String  kod = "4544310755427";


        for (int i = 0; i < kod.length(); i++) {
            int liczba = kod.charAt(i) - '0';
            gc.fillRect(50 + i * 30, 10, 5 + liczba * 2, 280);
        }

    }

}
