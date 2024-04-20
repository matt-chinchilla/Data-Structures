import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.Scanner;

public class BinaryTreeVisualization extends Application {
    private static int treeSize = 9; // Default size

    public static void main(String[] args) {
        // Check if there are command-line arguments for the tree size
        if (args.length > 0) {
            try {
                treeSize = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Using default size: 9");
            }
        } else {
            // Prompt user for input if no command-line arguments
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the binary tree: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // consume the non-integer input
            }
            treeSize = scanner.nextInt();
            scanner.close();
        }

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BinaryTree tree = BinaryTreeGenerator.createBinaryTree(treeSize);

        Pane pane = new Pane();
        TreeDrawer drawer = new TreeDrawer(pane);
        drawer.drawTree(tree.root, 400.0, 20.0, 200.0, false);

        primaryStage.setScene(new Scene(pane, 800, 400));
        primaryStage.show();
    }
}
