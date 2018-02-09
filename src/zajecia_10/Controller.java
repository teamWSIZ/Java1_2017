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
    @FXML
    Button nextPlayerButton;

    int[][] b;
    int nextPlayer = 1;

    //Ta funkcja jest uruchamiana zaraz na początku działania okna
    public void initialize() {
        b = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        //początkowa ikona następnego ruchu
        nextPlayerButton.setGraphic(
                new ImageView(new Image(getClass()
                        .getResourceAsStream("kiwi.png"),
                        75, 75, true, true)));

        //to jest kod dodający przyciski tworzące planszę na GUI
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                //to się nazywa "programmatic" gui construction
                Button button = new Button();
                button.setGraphic(
                        new ImageView(new Image(getClass()
                                .getResourceAsStream("blank.png"),
                                75, 75, true, true)));
                board.add(button, c, r ); //tutaj dynamicznie dodajemy przycisk do GridPane

                Integer rr = r;
                Integer cc = c;
                button.setOnAction(event -> {
                    System.out.println("Naciścięto button nr: " + rr + ", " + cc);
                    if (b[rr][cc]!=0) return;   //jeśli pole już zajęte -- nie rób nic

                    b[rr][cc] = nextPlayer;     //update modelu gry

                    //ustawienie odpowiedniej ikony tam, gdzie kliknięto
                    if (nextPlayer==1) {
                        button.setGraphic(new ImageView(new Image(getClass()
                                .getResourceAsStream("kiwi.png"),
                                75, 75, true, true)));
                    } else {
                        button.setGraphic(new ImageView(new Image(getClass()
                                .getResourceAsStream("banana.png"),
                                75, 75, true, true)));
                    }

                    //update numeru następnego gracza
                    if (nextPlayer==1) {
                        nextPlayer = 2;
                    } else {
                        nextPlayer = 1;
                    }

                    //update ikony następnego gracza
                    String nextPlayerIcon = "kiwi.png";
                    if (nextPlayer==2) nextPlayerIcon = "banana.png";
                    nextPlayerButton.setGraphic(new ImageView(new Image(getClass()
                            .getResourceAsStream(nextPlayerIcon),
                            75, 75, true, true)));
                });
                button.setOnMouseClicked(event -> {
                    if (event.getButton()== MouseButton.SECONDARY) {
                        System.out.println("Naciśnięto prawym przyciskiem");
                    }
                });
            }
        }

    }

}
