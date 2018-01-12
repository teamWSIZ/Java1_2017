package zajecia9;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextArea ekran;

    @FXML
    ComboBox produkty;

    int wrzuconaKwota = 0;

    //Ta funkcja jest uruchamiana zaraz na początku działania okna
    public void initialize() {
        //więcej: https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm
        produkty.getItems().addAll("Pomarańcza", "Jabłko", "Kiwi", "Gruszka", "Granat");
        produkty.getSelectionModel().select(0);
    }

    public void kup() {

        String wybrane = (String)produkty.getSelectionModel().getSelectedItem();
        ekran.appendText("Wybrano: " + wybrane + "\n");

        int cena = 0;
        if (wybrane=="Pomarańcza") {
            cena = 10;
        } else if (wybrane=="Jabłko") {
            cena = 7;
        } else if (wybrane=="Kiwi") {
            cena = 15;
        }

        ekran.appendText("Cena:" + cena + "\n");

    }

    public void insterFive() {
        wrzuconaKwota += 5;
        ekran.appendText("Wrzucono 5; łącznie:" + wrzuconaKwota + "\n");
    }

}
