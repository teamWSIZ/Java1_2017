package zajecia6.bis;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Controller {

    @FXML
    Canvas szachycanvas;

    @FXML
    TextField input_kodu;

    public void rysujPlansze() {
        GraphicsContext gc = szachycanvas.getGraphicsContext2D();
        gc.setLineWidth(5);
        gc.setStroke(Color.CORNFLOWERBLUE);
        gc.strokeLine(5,5, 100,200);
        gc.fillRect(50,50, 20, 20);
        gc.fillRect(90,50, 20, 20);
        gc.fillRect(70,70, 20, 20);

        gc.setLineWidth(1);
        gc.setStroke(Color.DARKGREY);
        gc.strokeRect(5,5,190,190);

        for (int i = 0; i < 10; i++) {
            gc.fillRect(10 + i * 10,170, 5, 5);
        }

        //ustawienie rodzaju fontu i wielkości
        gc.setFont(new Font("Droid Sans", 40));

        //figurki szachowe są dostępne jako "literki"
        //https://en.wikipedia.org/wiki/Chess_symbols_in_Unicode

        String rook = "\u265C";
        String pawn = "\u265F";
        gc.fillText(rook, 40,40);
        gc.fillText(pawn, 140,40);

    }

}
