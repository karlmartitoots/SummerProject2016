import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class MenuVBox extends VBox {

    private List<MenuButton> menuButtons;

    MenuVBox(List<MenuButton> buttons){
        menuButtons = buttons;
        this.getChildren().addAll(buttons);
    }

    MenuVBox(){
        menuButtons = new ArrayList<>();
    }
}
