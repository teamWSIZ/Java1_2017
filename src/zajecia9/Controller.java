package zajecia9;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    TextArea ekran;

    @FXML
    ComboBox produkty;

    @FXML
    Label wplataLabel;

    @FXML
    Label cenaLabel;

    @FXML
    Button appleButton;
    @FXML
    Button kiwiButton;
    @FXML
    Button pearButton;
    @FXML
    Button bananaButton;

    int wrzuconaKwota = 0;
    int cenaProduktu = 0;

    //Ta funkcja jest uruchamiana zaraz na początku działania okna
    public void initialize() {
        //więcej: https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm
        produkty.getItems().addAll(
                "Banan", "Pomarańcza", "Jabłko", "Kiwi", "Gruszka",
                "Granat");
        produkty.getSelectionModel().select(0);

        //układanie ikon pod przyciski produktów
        Image icon = new Image(getClass().getResourceAsStream("kiwi.png"),
                75, 75, true, true);
        kiwiButton.setGraphic(new ImageView(icon));
        pearButton.setGraphic(
                new ImageView(new Image(getClass().getResourceAsStream("pear.png"),
                75, 75, true, true))
        );
        bananaButton.setGraphic(
                new ImageView(new Image(getClass().getResourceAsStream("banana.png"),
                        75, 75, true, true))
        );
        appleButton.setGraphic(
                new ImageView(new Image(getClass().getResourceAsStream("apple.png"),
                        75, 75, true, true))
        );
        //inne:http://www.iconarchive.com/search?q=fruits


    }

    public void wybierz() {
        //tu dostajemy nazwę (napis) wybranego produktu
        String wybrane = (String)produkty.getSelectionModel()
                .getSelectedItem();
        ekran.appendText("Wybrano: " + wybrane + "\n");

        if (wybrane=="Pomarańcza") {
            cenaProduktu = 10;
        } else if (wybrane=="Jabłko") {
            cenaProduktu = 7;
        } else if (wybrane=="Kiwi") {
            cenaProduktu = 15;
        } else if (wybrane=="Gruszka") {
            cenaProduktu = 16;
        } else if (wybrane=="Banan") {
            cenaProduktu = 6;
        } else if (wybrane=="Granat") {
            cenaProduktu = 17;
        }

        ekran.appendText("Cena:" + cenaProduktu + "\n");
        cenaLabel.setText(" " + cenaProduktu);
    }


    public void selectPear() {
       selectFruit("Gruszka");
    }
    public void selectKiwi() {
        selectFruit("Kiwi");
    }
    public void selectBanana() {
        selectFruit("Banan");
    }
    public void selectApple() {
        selectFruit("Jabłko");
    }


    private void selectFruit(String name) {
        produkty.getSelectionModel().select(name);
        wybierz();
    }


    public void kup() {
        if (wrzuconaKwota < cenaProduktu) {
            ekran.appendText("Niewystarczająca kwota wpłacona; proszę" +
                    " dodać " + (cenaProduktu - wrzuconaKwota) + "!\n");
        }

        /// kupowanie!!
        int doWydania = wrzuconaKwota - cenaProduktu;

        for (int i = 0; i < 100; i++) {
            if (doWydania>=10) {
                doWydania -= 10;
                ekran.appendText("wydaję 10\n");
            }
            else if (doWydania>=5) {
                doWydania -= 5;
                ekran.appendText("wydaję 5\n");
            }
            else if (doWydania>=2) {
                doWydania -= 2;
                ekran.appendText("wydaję 2\n");
            }
            else if (doWydania>=1) {
                doWydania -= 1;
                ekran.appendText("wydaję 1\n");
            }
        }
        ekran.appendText("Odbierz produkt!\n");
    }

    public void czysc() {
        ekran.setText("");
    }

    public void insertFive() {
        wrzuconaKwota += 5;
        ekran.appendText("Wrzucono 5; łącznie:" + wrzuconaKwota + "\n");
        wplataLabel.setText(" " + wrzuconaKwota);
    }
    public void insertTen() {
        wrzuconaKwota += 10;
        ekran.appendText("Wrzucono 10; łącznie:" + wrzuconaKwota + "\n");
        wplataLabel.setText(" " + wrzuconaKwota);
    }

}
