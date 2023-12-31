package Tree;

import java.util.*;

public class printLevelWise {
    public static TreeNode<Integer> takeInput(Scanner s) {
        int n;
        System.out.println("Enter next node data");
        n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter number of children for " + n);
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput(s);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();

        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try {
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter no. of children of " + frontNode.data);
                int nuChildren = s.nextInt();

                for(int i=0; i<nuChildren; i++){
                    System.out.println("Enter " + (i+1) + " th child of " + frontNode.data);
                    int child = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }

            } catch (QueueEmptyException e) {
//                throw new RuntimeException(e);
                return null;
            }
        }
        return root;
    }


    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
    }
}
