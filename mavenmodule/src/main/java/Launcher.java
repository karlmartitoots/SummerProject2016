import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Launcher extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("AppCenter");

        VBox base = new VBox();

        MenuBar menuBar = new MenuBar();

        ScrollPane menuScrollpane = new ScrollPane();
        menuScrollpane.setFitToHeight(true);
        menuScrollpane.setFitToWidth(true);
        menuScrollpane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        menuScrollpane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        Menu file = new Menu("File");
        Stage appStage = new Stage();

        MenuButton snakeButton = new MenuButton(new Image("snakegraphic.jpg"));
        snakeButton.setOnAction(event -> appStage.setScene(new snake.gui.SetupScene(new Group(), appStage)));
        List<MenuButton> gamesMenuButtons = new ArrayList<>();
        gamesMenuButtons.add(snakeButton);
        MenuVBox gamesMenu = new MenuVBox(gamesMenuButtons);

        MenuVBox appsMenu = new MenuVBox();

        MenuButton valuutaCalcButton = new MenuButton(new Image("javafxcalcgraphic.jpg"));
        valuutaCalcButton.setOnAction(event -> appStage.setScene(new javaFXCalculator.SetupScene(new Group(), appStage)));
        List<MenuButton> toolsMenuButtons = new ArrayList<>();
        toolsMenuButtons.add(valuutaCalcButton);
        MenuVBox toolsMenu = new MenuVBox(toolsMenuButtons);

        MenuItem games = new MenuItem("Games");
        games.setOnAction(event -> menuScrollpane.setContent(gamesMenu));
        MenuItem apps = new MenuItem("Applications");
        apps.setOnAction(event -> menuScrollpane.setContent(appsMenu));
        MenuItem tools = new MenuItem("Tools");
        tools.setOnAction(event -> menuScrollpane.setContent(toolsMenu));
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(event -> System.exit(0));
        file.getItems().addAll(games, apps, tools, new SeparatorMenuItem(), exit);

        menuBar.getMenus().addAll(file);
        base.getChildren().addAll(menuBar, menuScrollpane);
        menuScrollpane.setContent(gamesMenu);

        Scene scene = new Scene(base, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
