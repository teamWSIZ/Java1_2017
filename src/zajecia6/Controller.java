package zajecia6;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.Arrays;
import java.util.List;

public class Controller {

    @FXML
    Canvas codecanvas;

    @FXML
    TextField input_kodu;

    List<String> kodyCyfr = Arrays.asList("123122", "123221", "223211", "221132",
            "221231", "213212", "223112", "312131", "311222", "321122");

    String startSymbol = "211232";
    String stopSymbol = "233111";
    String stopPattern = "2331112";


    public void rysujKod() {
        GraphicsContext gc = codecanvas.getGraphicsContext2D();
        gc.clearRect(0,0,600,600);
        gc.strokeRect(0,0,580, 290);
        gc.setFill(Color.BLACK);
        String napis = input_kodu.getText();

        String zakodowany = startSymbol;
        for (int i = 0; i < napis.length(); i++) {
            int liczba = napis.charAt(i) - '0';
            zakodowany += kodyCyfr.get(liczba);
        }
        zakodowany += stopPattern;

        System.out.println(napis);
        System.out.println(zakodowany);

        double x = 10;
        for (int i = 0; i < zakodowany.length(); i++) {
            int liczba = zakodowany.charAt(i) - '0';
            if (i%2==0) {
                gc.fillRect(x, 10, liczba, 280);
            }
            x += 1 + liczba;
        }

    }

}
