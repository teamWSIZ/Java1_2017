package zajecia9;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextArea ekran;

    @FXML
    ComboBox produkty;

    //Ta funkcja jest uruchamiana zaraz na początku działania okna
    public void initialize() {
        //więcej: https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm
        produkty.getItems().addAll("Pomarańcza", "Jabłko", "Kiwi", "Gruszka", "Granat");
        produkty.getSelectionModel().select(0);
    }

    public void kup() {
        System.out.println("do zaimplementwania");
    }

}
