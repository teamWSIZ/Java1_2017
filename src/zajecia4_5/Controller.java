package zajecia4_5;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;


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
        System.out.println("init");
        String url = getClass().getResource("rex/Diana_1.jpg").toExternalForm();
        BackgroundImage myBI= new BackgroundImage(
                new Image(url,320,320,false,true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        System.out.println(myBI.getSize().getHeight());
        bp.setBackground(new Background(myBI));

//        bp.setStyle("-fx-background-image: url('" + url + "'); " +
//                "-fx-background-position: center center; " +
//                "-fx-background-repeat: stretch;");
    }

    public void napiszX() {
        System.out.println("XXXX" + prawy.getText());
        lewy.setText("WWW" + prawy.getText());

        String xs = "-1234";

        long i = Integer.valueOf(xs);
        System.out.println(i);
    }

    public void rysowanie() {
        GraphicsContext gc = ourCanvas.getGraphicsContext2D();

        //rysowanie obrazka z pliku w pakiecie zajecia4_5/rex
        Image image = new Image(getClass().getResourceAsStream("rex/Diana_1.jpg"));
        gc.drawImage(image, 50, 50, 300, 200);


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

        //czyszczenie obszaru canvas-a
        gc.clearRect(0, 200, 100, 20);



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
