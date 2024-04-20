import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class DotAdder {

    private Pane pane;
    private Circle currentDot;

    public DotAdder(Pane pane) {
        this.pane = pane;
    }

    public void drawDot(double x, double y) {
        if (currentDot != null) {
            pane.getChildren().remove(currentDot);
        }
        currentDot = new Circle(x, y, 5, Color.RED);
        pane.getChildren().add(currentDot);
    }

    public void attachDotHandler(Text text, Node node, double x, double y) {
        text.setOnMouseClicked(event -> {
            // Diagnostic output
            System.out.println("Node " + node.data + " clicked.");

            // If there's already a dot, remove it
            if (currentDot != null) {
                pane.getChildren().remove(currentDot);
            }

            // Create a new dot at the center of the node and add it to the pane
            currentDot = new Circle(x, y, 5, Color.RED);
            pane.getChildren().add(currentDot);
        });
    }
}
