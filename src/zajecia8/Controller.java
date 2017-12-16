package zajecia8;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Controller {

    @FXML
    Canvas mycanvas;

    @FXML
    DatePicker data_przyjazdu;

    @FXML
    DatePicker data_wyjazdu;

    @FXML
    TextArea konsola;

    public void initialize() {
        data_przyjazdu.setValue(LocalDate.now());
        data_wyjazdu.setPromptText("data wyjazdu");
    }


    public void getIt() {
        String a = data_przyjazdu.getValue().toString();

        LocalDate date = data_przyjazdu.getValue();
        konsola.appendText("Wybrano date przyjazdu: " + a);
    }

    public void showDaysBetween() {
        LocalDate date1 = data_przyjazdu.getValue();
        LocalDate date2 = data_wyjazdu.getValue();

        if (date1==null) {
            konsola.appendText("Uwaga -- data przyjazdu nie jest wybrana");
        }

        LocalDateTime datetime1 = date1.atStartOfDay();
        LocalDateTime datetime2 = date2.atStartOfDay();

        long daysBetween = Duration.between(datetime1, datetime2).toDays();
        konsola.appendText("Dni pobytu: " + daysBetween);

    }




}
