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
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                //to się nazywa "programmatic" gui construction
                Button button = new Button();
                button.setGraphic(
                        new ImageView(new Image(getClass()
                                .getResourceAsStream("blank.png"),
                                75, 75, true, true)));
                board.add(button, column, row ); //tutaj dynamicznie dodajemy przycisk do GridPane

                Integer rr = row;
                Integer cc = column;
                //tutaj doczepiamy akcje (normalnie "onAction" w fxml-u)
                button.setOnAction(event -> {
                    System.out.println("Naciścięto button nr: " + rr + ", " + cc);
                    if (b[rr][cc]!=0) return;   //jeśli pole już zajęte -- nie rób nic

                    b[rr][cc] = nextPlayer;     //update modelu gry

                    //ustawienie odpowiedniej ikony tam, gdzie kliknięto
                    String filename;
                    if (nextPlayer==1) {
                        filename = "kiwi.png";
                        nextPlayer = 2;
                    } else {
                        filename = "banana.png";
                        nextPlayer = 1;
                    }

                    //ustawienie obrazka na planszy
                    button.setGraphic(new ImageView(new Image(getClass()
                            .getResourceAsStream(filename),75, 75, true, true)));

                    //update ikony następnego gracza
                    String nextPlayerIcon;
                    if (nextPlayer==2) {
                        nextPlayerIcon = "banana.png";
                    } else {
                        nextPlayerIcon = "kiwi.png";
                    }

                    //rysowanie ikony następnego gracza
                    nextPlayerButton.setGraphic(new ImageView(new Image(getClass()
                            .getResourceAsStream(nextPlayerIcon),75, 75, true, true)));
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
