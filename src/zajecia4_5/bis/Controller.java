package zajecia4_5.bis;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Controller {

    @FXML
    TextField lewy;

    @FXML
    TextField prawy;

    @FXML
    TextField wynik;

    @FXML
    Canvas ourCanvas;

    @FXML
    BorderPane bp;

    public void initialize() {
    }

    public void napiszX() {
    }

    public void rysowanie() {
        GraphicsContext gc = ourCanvas.getGraphicsContext2D();

        gc.setStroke(Color.CORNFLOWERBLUE);
        gc.strokeLine(10,10,250,100);
        gc.setLineWidth(5);
        gc.strokeOval(100,100,250,200);
        gc.strokeRect(100, 300, 50, 50);

        Image image = new Image(
                getClass().getResourceAsStream("Diana_1.jpg"),
                300, 200, true, false);
        gc.drawImage(image, 50, 50);


    }

    public void liczSume() {
        double xx = Double.valueOf(lewy.getText()); //zamiana napisu na liczbe ułamkową
        double y = Double.valueOf(prawy.getText());
        wynik.setText("" + (xx+y));
    }

    public void liczRoznice() {
        //todo
    }
}
