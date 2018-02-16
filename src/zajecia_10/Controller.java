package zajecia_10;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    GridPane board;
    @FXML
    Button nextPlayerButton;

    int[][] b;  //ta tablica zawiera informacje o stanie gry w postaci liczb całkowitych 0,1,2
    int nextPlayer = 1;

    //Ta funkcja jest uruchamiana zaraz na początku działania okna
    public void initialize() {
        b = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        //początkowa ikona następnego ruchu
        drawNextPlayerButton("kiwi.png");

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
                    //todo: kod poniżej trzeba zrefaktorować
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
                    String nextPlayerIconFilename;
                    if (nextPlayer==2) {
                        nextPlayerIconFilename = "banana.png";
                    } else {
                        nextPlayerIconFilename = "kiwi.png";
                    }

                    //rysowanie ikony następnego gracza
                    drawNextPlayerButton(nextPlayerIconFilename);
                    if (areAllFieldsFilled(b)) {
                        showEndOfGameDialog();
                    }
                });
                button.setOnMouseClicked(event -> {
                    if (event.getButton()== MouseButton.SECONDARY) {
                        System.out.println("Naciśnięto prawym przyciskiem");
                        //showEndOfGameDialog();
                        clearAllBoardButtons();
                    }
                });
            }
        }

    }

    //definicja lokalnej funkcji
    private void drawNextPlayerButton(String filename) {
        nextPlayerButton.setGraphic(
                new ImageView(new Image(getClass()
                        .getResourceAsStream(filename), 95, 95, true, true)));
    }

    //http://code.makery.ch/blog/javafx-dialogs-official/
    private void showEndOfGameDialog() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Koniec gry");
        alert.setHeaderText("Obecna rozgrywka została zakończona");
        alert.setContentText("Wszystkie pola planszy są zajęte");

        alert.showAndWait();
    }

    private void clearAllBoardButtons() {
        board.getChildren().forEach(n ->{
            Button b = (Button)n;
            b.setGraphic(
                    new ImageView(new Image(getClass()
                            .getResourceAsStream("blank.png"),
                            75, 75, true, true)));
        });
    }

    public void restart() {
        clearAllBoardButtons();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                b[row][col] = 0;
            }
        }
        nextPlayer = 1;
        //+ narysować nową ikonkę...
    }

    //Sprawdza czy wszystkie elementy tablicy "g" są != 0
    private boolean areAllFieldsFilled(int[][] g) {
        for (int row = 0; row < g.length; row++) {
            for (int col = 0; col < g[row].length; col++) {
                if (g[row][col]==0) {
                    return false;
                }
            }
        }
        return true;
    }
}