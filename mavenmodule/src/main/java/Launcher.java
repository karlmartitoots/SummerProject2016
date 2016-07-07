import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Launcher extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("AppCenter");
        VBox base = new VBox();
        MenuBar mb = new MenuBar();
        ScrollPane sp = new ScrollPane();
        sp.setFitToHeight(true);
        sp.setFitToWidth(true);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        VBox gamesMenu = new VBox();
        Button snake = new Button();
        snake.setPrefSize(290, 100);
        snake.setMaxSize(290, 100);
        snake.setMinSize(290, 100);
        Image imageSnake = new Image("snakegraphic.jpg");
        snake.setGraphic(new ImageView(imageSnake));
        snake.setOnAction(event -> new SnakeStage());
        gamesMenu.getChildren().add(snake);
        sp.setContent(gamesMenu);

        Menu file = new Menu("File");


        MenuItem games = new MenuItem("Games");
        MenuItem apps = new MenuItem("Applications");
        MenuItem tools = new MenuItem("Tools");
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(event ->
            System.exit(0)
        );

        file.getItems().addAll(games, apps, tools, new SeparatorMenuItem(), exit);
        mb.getMenus().addAll(file);
        base.getChildren().addAll(mb, sp);

        Scene scene = new Scene(base, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
