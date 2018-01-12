package zajecia9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass()
                .getResource("sample.fxml"));
        stage.setTitle("BuildMeApp");
        stage.setScene(new Scene(root, 700, 700));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
