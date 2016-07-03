import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Launcher extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        //a new enum has to be made and added to this list to run another app
        App[] apps = {App.SNAKE};
        Pane appPane = new Pane();
        Scene appScene = new Scene(appPane);
        for (App app : apps) {
            Button appButton = new Button(app.toString());
            appPane.getChildren().add(appButton);
            appButton.setOnAction(event -> App.launchApp(app, primaryStage));
        }

        primaryStage.setTitle("Menu");
        primaryStage.setScene(appScene);
        primaryStage.show();
    }
}
