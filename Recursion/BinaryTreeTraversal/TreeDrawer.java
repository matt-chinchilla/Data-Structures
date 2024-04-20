import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class TreeDrawer {
    private Pane pane;
    private DotAdder dotAdder;

    public TreeDrawer(Pane pane) {
        this.pane = pane;
        this.dotAdder = new DotAdder(pane);
    }

    public void drawTree(Node node, double x, double y, double hGap, boolean isLeft) {
        if (node != null) {
            if (node.left != null) {
                pane.getChildren().add(new Line(x - hGap, y + 60, x, y));
                drawTree(node.left, x - hGap, y + 60, hGap / 2, true);
            }

            if (node.right != null) {
                pane.getChildren().add(new Line(x + hGap, y + 60, x, y));
                drawTree(node.right, x + hGap, y + 60, hGap / 2, false);
            }

            Text text = new Text(x - (isLeft ? 20 : -5), y, Integer.toString(node.data));
            double centerX = x;
            double centerY = y;

            dotAdder.attachDotHandler(text, node, centerX, centerY);
            pane.getChildren().add(text);
        }
    }
    
}
