import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import snake.gui.SetupScene;

public class Launcher extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        StackPane sp = new StackPane();
        Button snakeButton = new Button("snake");
        snakeButton.setOnAction(event ->
                primaryStage.setScene(new SetupScene(new Group(), primaryStage))
        );
        sp.getChildren().add(snakeButton);
        Scene scene = new Scene(sp, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
