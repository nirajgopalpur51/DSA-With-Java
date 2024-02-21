

import java.util.Scanner;

public class findNodes {
    public static int findNode(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int ans = 0;
        ans += findNode(root.left);
        ans += findNode(root.right);

        return ans+1;
    }
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front;
            try {
                front = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }
            System.out.println("Enter left child of " + front.data);
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(findNode(root));
    }
}
