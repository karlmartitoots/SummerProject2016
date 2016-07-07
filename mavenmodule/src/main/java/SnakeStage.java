import javafx.scene.Group;
import javafx.stage.Stage;
import snake.gui.SetupScene;

public class SnakeStage {
    SnakeStage(){
        Stage snakeStage = new Stage();
        snakeStage.setScene(new SetupScene(new Group(), snakeStage));

    }
}
