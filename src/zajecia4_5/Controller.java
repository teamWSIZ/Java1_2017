package zajecia4_5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.ArcType;


public class Controller {

    @FXML
    TextField lewy;

    @FXML
    TextField prawy;

    @FXML
    TextField wynik;

    @FXML
    Canvas ourCanvas;

    public void napiszX() {
        System.out.println("XXXX" + prawy.getText());
        lewy.setText("WWW" + prawy.getText());

        String xs = "-1234";

        long i = Integer.valueOf(xs);
        System.out.println(i);
    }

    public void rysowanie() {
        GraphicsContext gc = ourCanvas.getGraphicsContext2D();

        gc.setStroke(Color.CORNFLOWERBLUE);
        gc.strokeRect(0, 0, 15, 35);

        gc.strokeLine(5, 5, 300, 295);

        int mx = 400;
        for (int i = 0; i < mx; i += 4) {
            gc.setStroke(new Color(1.0 * (mx-i)/mx, 0, 1.0 * i / mx, 1.0));
            gc.strokeLine(200, 0, i, 400);
        }


        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);

        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);

    }

    public void liczSume() {
        double xx = Double.valueOf(lewy.getText());
        double y = Double.valueOf(prawy.getText());
        wynik.setText("" + (xx+y));
    }

    public void liczRoznice() {
        //todo
    }
}
