import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;

public class DotAdder {

    private Pane pane;

    public DotAdder(Pane pane) {
        this.pane = pane;
    }

    public void attachDotHandler(Text text, Node node) {
        text.setOnMouseClicked(event -> {
            // Diagnostic output
            System.out.println("Node " + node.data + " clicked.");

            // Translate coordinates relative to the pane
            double clickX = event.getX();
            double clickY = event.getY();

            // Draw the dot using the TracePath class
            TracePath.drawDot(pane, clickX + text.getLayoutX(), clickY + text.getLayoutY());
        });
    }
}
