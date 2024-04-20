import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class BinaryTreeVisualization extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox inputLayout = new VBox(10); // Vertical layout with spacing
        TextField inputField = new TextField();
        inputField.setPromptText("Enter the size of the binary tree");
        Button submitButton = new Button("Submit");

        submitButton.setOnAction(event -> {
            int treeSize = Integer.parseInt(inputField.getText()); // Parse the input
            displayTree(primaryStage, treeSize); // Method to setup and display the tree
        });

        inputLayout.getChildren().addAll(inputField, submitButton);
        Scene inputScene = new Scene(inputLayout, 300, 100);
        
        primaryStage.setTitle("Enter Tree Size");
        primaryStage.setScene(inputScene);
        primaryStage.show();
    }

    private void displayTree(Stage primaryStage, int treeSize) {
        BinaryTree tree = BinaryTreeGenerator.createBinaryTree(treeSize);
        Pane pane = new Pane();
        TreeDrawer drawer = new TreeDrawer(pane);
        drawer.drawTree(tree.root, 400.0, 20.0, 200.0, false);

        Scene scene = new Scene(pane, 800, 400);
        primaryStage.setTitle("Binary Tree Visualization");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
