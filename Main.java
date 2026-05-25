//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }}
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(min(a));
    }
    private static int size(Node root){//getting size of the tree
        if(root==null) return 0;
        int LeftSize = size(root.left);
        int RightSize = size(root.right);
        return 1 + RightSize + LeftSize;
    }
    private static int sum(Node root){//adding all elements in an tree
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static long product(Node root){//product of elemnets in a tree
 if(root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    private static int max(Node root){//maximum value
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static int min(Node root){//minimum value
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    private static void display(Node root) {//displaying the tree
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}