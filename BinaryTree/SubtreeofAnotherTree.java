public class SubtreeofAnotherTree {

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

    public static boolean isIdentical(Node node,Node subRoot){
        if(node == null && subRoot==null){
            return true;
        }
        if(node ==null || subRoot==null || node.data != subRoot.data){
            return false;
        }
        if( !isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public static void main(String[] args) {

        Node root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node subroot =new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);

        System.out.println(isSubtree(root,subroot));

    }
}
