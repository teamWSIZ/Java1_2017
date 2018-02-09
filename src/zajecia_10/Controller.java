package zajecia_10;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;

import java.util.Arrays;

public class Controller {

    @FXML
    GridPane board;

    int[][] b;

    //Ta funkcja jest uruchamiana zaraz na początku działania okna
    public void initialize() {
        b = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};


        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                Button button = new Button();
                button.setGraphic(
                        new ImageView(new Image(getClass()
                                .getResourceAsStream("banana.png"),
                                75, 75, true, true)));
                board.add(button, c, r );
                Integer rr = r;
                Integer cc = c;
                button.setOnAction(event -> {
                    System.out.println("Naciścięto button nr: " + rr + ", " + cc);
                    button.setGraphic(new ImageView(new Image(getClass()
                            .getResourceAsStream("kiwi.png"),
                            75, 75, true, true)));
                    b[rr][cc] = 1;
                    for (int i = 0; i < 3; i++) {
                        System.out.println(Arrays.toString(b[i]));
                    }
                    System.out.println("----------");
                });
                button.setOnMouseClicked(event -> {
                    if (event.getButton()== MouseButton.SECONDARY) {
                        System.out.println("Naciśnięto prawym przyciskiem");
                    }
                });
            }
        }

//        button.setOnAction();


    }

}
