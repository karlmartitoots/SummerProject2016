import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MenuButton extends Button{

    public MenuButton(Image buttonImage){
        this.setPrefSize(290,100);
        this.setMaxSize(290,100);
        this.setMinSize(290,100);
        this.setGraphic(new ImageView(buttonImage));
    }
}
