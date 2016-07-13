package chess;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SetupScene extends Scene{
    public SetupScene(Group rootGroup, Stage stage) {
        super(rootGroup);
        stage.setTitle("Setup");
        //TODO: add options to setup: choose chessboard color, choose timecontrol,
        stage.setMaxHeight(300);
        stage.setMinHeight(300);
        stage.setMaxWidth(400);
        stage.setMinWidth(400);
        stage.show();
    }
}
