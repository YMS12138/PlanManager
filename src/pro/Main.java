package pro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage page;
    private BorderPane root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("view/main.fxml"));

        page = primaryStage;

        page.setResizable(false);

        page.setTitle("智能制造协同共享平台");
        page.setScene(new Scene(root));

        requirement();

        showYears();

        page.show();
    }

    private void requirement() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/requirement.fxml"));
        GridPane requirement = loader.load();

        root.setCenter(requirement);
    }

    private void showYears() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/years.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
