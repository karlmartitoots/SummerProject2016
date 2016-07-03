import javafx.scene.Group;
import javafx.stage.Stage;
import snake.gui.SetupScene;

public enum App {
    SNAKE;

    public static void launchApp(App app, Stage primaryStage){
        switch(app){
            case SNAKE:
                primaryStage.setScene(new SetupScene(new Group(), primaryStage));

        }
    }
}
