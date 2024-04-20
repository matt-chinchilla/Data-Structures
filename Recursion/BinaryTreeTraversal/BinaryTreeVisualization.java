import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class BinaryTreeVisualization extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a tree
        BinaryTree tree = new BinaryTree();
        // Add the nodes, I like 7
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);

        // Draw the tree, make the class later
        Pane pane = new Pane();
        drawTree(tree.root, pane, 400.0, 20.0, 200.0, false);

        primaryStage.setScene(new Scene(pane, 800, 400)); // Set the scene which is the pane a.k.a. the window
        primaryStage.show();
    }

    private void drawTree(Node node, Pane pane, double x, double y, double hGap, boolean isLeft) {
        if (node != null) {
            if (node.left != null) {
                pane.getChildren().add(new Line(x - hGap, y + 60, x, y));
                drawTree(node.left, pane, x - hGap, y + 60, hGap / 2, true);
            }
    
            if (node.right != null) {
                pane.getChildren().add(new Line(x + hGap, y + 60, x, y));
                drawTree(node.right, pane, x + hGap, y + 60, hGap / 2, false);
            }
    
            Text text = new Text(x - (isLeft ? 20 : -5), y, Integer.toString(node.data));
            text.setOnMouseClicked(event -> {
                // Diagnostic output
                System.out.println("Node " + node.data + " clicked.");
        
                // Translate coordinates relative to the pane
                double clickX = event.getX();
                double clickY = event.getY();
                
                // Draw the dot using the TracePath class
                TracePath.drawDot(pane, clickX + text.getLayoutX(), clickY + text.getLayoutY());
            });
            pane.getChildren().add(text);
        }
    }    

    public static void main(String[] args) {
        launch(args);
    }
}
