import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeGenerator {
    public static BinaryTree createBinaryTree(int size) {
        BinaryTree tree = new BinaryTree();
        if (size == 0) return tree; // No nodes to add

        tree.root = new Node(1);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(tree.root);

        // Create the tree nodes
        int currentNode = 1;
        while (currentNode < size) {
            Node parent = queue.poll();
            
            // Create the left child
            if (++currentNode <= size) {
                parent.left = new Node(currentNode);
                queue.offer(parent.left);
            }

            // Create the right child
            if (++currentNode <= size) {
                parent.right = new Node(currentNode);
                queue.offer(parent.right);
            }
        }
        return tree;
    }
}
