import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LogInScene extends Scene{
    public LogInScene(Group parentGroup, Stage primaryStage) {
        super(parentGroup);
//
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Label usernameBoxLabel = new Label("Username:");
        TextField usernameTextfield = new TextField();
        Label passwordBoxLabel = new Label("Password:");
        TextField passwordTextfield = new TextField();
        Button submitButton = new Button("Login");
        //TODO:login logic

        grid.add(usernameBoxLabel, 0, 0);
        grid.add(usernameTextfield, 1, 0);
        grid.add(passwordBoxLabel, 0, 1);
        grid.add(passwordTextfield, 1, 1);
        grid.add(submitButton, 1, 2);

        parentGroup.getChildren().add(grid);

        //Image loginsceneicon = new Image("loginsceneicon.jpg");
        //primaryStage.getIcons().add(loginsceneicon);
        //TODO: get icon to load from resources properly
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(200);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }
}
