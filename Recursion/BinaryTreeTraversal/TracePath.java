import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class TracePath {
    public static void drawDot(Pane pane, double x, double y) {
        Circle dot = new Circle(x, y, 5, Color.RED);
        pane.getChildren().add(dot);
    }
}
