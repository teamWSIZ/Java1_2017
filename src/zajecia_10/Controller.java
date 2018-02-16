package zajecia_10;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    GridPane gridPane;
    @FXML
    Button nextPlayerButton;

    int[][] b;  //ta tablica zawiera informacje o stanie gry w postaci liczb całkowitych 0,1,2
    int nextPlayer = 1;
    boolean gameOver;

    //Ta funkcja jest uruchamiana zaraz na początku działania okna
    public void initialize() {
        b = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        //początkowa ikona następnego ruchu
        drawNextPlayerButton("kiwi.png");
        gameOver = false;   //gra trwa

        //to jest kod dodający przyciski tworzące planszę na GUI
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button();
                drawIconOnButton(button, "blank.png");
                gridPane.add(button, col, row );   //tutaj dynamicznie dodajemy przycisk do GridPane

                Integer rr = row;
                Integer cc = col;
                //tutaj doczepiamy akcje (normalnie "onAction" w fxml-u)
                button.setOnAction(event -> {
                    if (gameOver) return;
                    if (b[rr][cc]!=0) return;   //jeśli pole już zajęte -- nie rób nic
                    b[rr][cc] = nextPlayer;     //update modelu gry

                    //ustawienie odpowiedniej ikony tam, gdzie kliknięto
                    String filename = getIconFilename(nextPlayer);
                    drawIconOnButton(button, filename);

                    nextPlayer = 3 - nextPlayer; //jeśli było 2 to teraz 1; jeśli było 1 to teraz 2

                    //update ikony następnego gracza
                    filename = getIconFilename(nextPlayer);
                    drawNextPlayerButton(filename);

                    checkGameOver();
                });
            }
        }
    }

    //Sprawdza warunki zakończenia gry: albo zwycięzcę, albo zapełnienie planszy
    private void checkGameOver() {
        int winner = getWinner(b);
        if (winner != 0) {
            gameOver = true;
            showGameWonDialog(winner);
            return;
        }
        if (areAllFieldsFilled(b)) {
            gameOver = true;
            showEndOfGameDialog();
        }
    }


    //Rysuje podaną ikonę na podanym buttonie
    private void drawIconOnButton(Button button, String filename) {
        Image image = new Image(getClass().getResourceAsStream(filename), 75, 75, true, true);
        button.setGraphic(new ImageView(image));
    }

    //definicja lokalnej funkcji
    private void drawNextPlayerButton(String filename) {
        Image image = new Image(getClass().getResourceAsStream(filename), 95, 95, true, true);
        nextPlayerButton.setGraphic(new ImageView(image));
    }

    //http://code.makery.ch/blog/javafx-dialogs-official/
    private void showEndOfGameDialog() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Game over");
        alert.setHeaderText("Current game came to an end");
        alert.setContentText("All fields are filled; no winner; game is a draw!");
        alert.showAndWait();
    }

    private void showGameWonDialog(int winner) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String thewinner;
        if (winner==1) {
            thewinner = "Kiwi";
        } else {
            thewinner = "Banana";
        }
        alert.setTitle("Game over");
        alert.setHeaderText("Current game came to an end");
        alert.setContentText(thewinner  + " is the winner! Congratulations!");

        alert.showAndWait();
    }

    private void clearAllBoardButtons() {
        gridPane.getChildren().forEach(n ->{
            Button b = (Button)n;
            drawIconOnButton(b, "blank.png");
        });
    }

    //Funkcja wykonywana do restartu gry; czyści buttony, tablicę danych "b", ustawia gracza, i rozpoczyna grę
    public void restart() {
        clearAllBoardButtons();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                b[row][col] = 0;
            }
        }
        nextPlayer = 1;
        gameOver = false;
        //+ narysować nową ikonkę...
    }

    private String getIconFilename(int player) {
        if (player==1) {
            return "kiwi.png";
        } else {
            return "banana.png";
        }
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

    //Podaje kto wygrał (1 lub 2); jeśli nie ma zwycięzcy, zwraca 0
    public int getWinner(int[][] b) {

        for (int typ = 1; typ <=2 ; typ++) {
            //sprawdzamy rzędy
            for (int r = 0; r < 3; r++) {
                int x = 0;
                for (int c = 0; c < 3; c++) {
                    if (b[r][c]==typ) x++;
                }
                if (x==3) return typ;
            }
            //sprawdzamy kolumny
            for (int c = 0; c < 3; c++) {
                int x = 0;
                for (int r = 0; r < 3; r++) {
                    if (b[r][c]==typ) x++;
                }
                if (x==3) return typ;
            }
            //sprawdzamy diagonalę
            if (b[0][0]==b[1][1] && b[1][1]==b[2][2]) {
                if (b[1][1]==typ) return typ;
            }
            //sprawdzamy anty-diagonalę
            if (b[0][2]==b[1][1] && b[1][1]==b[2][0]) {
                if (b[1][1]==typ) return typ;
            }
        }

        return 0;
    }
}