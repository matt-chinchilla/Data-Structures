import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BinaryTreeVisualization extends Application {
    @Override
    public void start(Stage primaryStage) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);

        Pane pane = new Pane();
        TreeDrawer drawer = new TreeDrawer(pane);
        drawer.drawTree(tree.root, 400.0, 20.0, 200.0, false);

        primaryStage.setScene(new Scene(pane, 800, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
