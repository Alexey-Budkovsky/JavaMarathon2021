package day18;

public class Task3 {
    public static Node ROOT = new Node(20);

    public static void main(String[] args) {
        Node tree = ROOT;
        System.out.println(nodeInsert(tree, 14));
        System.out.println(nodeInsert(tree, 23));
        System.out.println(nodeInsert(tree, 22));
        System.out.println(nodeInsert(tree, 27));
        System.out.println(nodeInsert(tree, 24));
        System.out.println(nodeInsert(tree, 150));
        System.out.println(nodeInsert(tree, 11));
        System.out.println(nodeInsert(tree, 16));
        System.out.println(nodeInsert(tree, 15));
        System.out.println(nodeInsert(tree, 18));
        System.out.println(nodeInsert(tree, 5));
        System.out.println(nodeInsert(tree, 8));
        System.out.println();

        dfs(tree);

    }

    public static Node nodeInsert(Node node, int num) {
        if (node == null) {
            return new Node(num);
        }
        if (num < node.getValue()) {
            node.setLeft(nodeInsert(node.getLeft(), num));
        } else if (num > node.getValue()) {
            node.setRight(nodeInsert(node.getRight(), num));
        }
        return node;
    }

    public static void dfs(Node node) {
        if (node != null) {
//            dfs(node.getLeft());
            System.out.print(node.getValue() + " ");
//            dfs(node.getRight());
        }



    }

}