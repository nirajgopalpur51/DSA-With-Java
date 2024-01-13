package BinaryTree;
public class RootEqualsSumofChildren {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static boolean checkTree(Node root) {
        return root.data == root.right.data + root.left.data;
    }

    public static void main(String[] args) {
        Node root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
//        root.right.right = new Node(6);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);

        System.out.println(checkTree(root));



    }
}
