public class Main {
    public static void main(String[] args) {
        IBST bst = new BSTImpl();

        bst.insert_UsingRecursive(new Node(10));
        bst.insert_UsingRecursive(new Node(20));
        bst.insert_UsingRecursive(new Node(30));
        bst.insert_UnusingRecursive(new Node(5));
        bst.insert_UnusingRecursive(new Node(2));
        bst.insert_UnusingRecursive(new Node(8));
        bst.insert_UnusingRecursive(new Node(1));
        bst.insert_UnusingRecursive(new Node(3));
        bst.insert_UnusingRecursive(new Node(6));
        bst.insert_UnusingRecursive(new Node(9));
        bst.insert_UsingRecursive(new Node(16));
        bst.insert_UsingRecursive(new Node(45));
        bst.insert_UsingRecursive(new Node(17));
        bst.insert_UsingRecursive(new Node(19));
        bst.insert_UsingRecursive(new Node(16));

        bst.show_LNR();
        bst.show_LNR_UnusingRecursive();
        System.out.println("\n" + bst.dept());

        bst.delete_UsingRecursive(new Node(1));
        bst.show_LNR();
        bst.show_LNR_UnusingRecursive();
        bst.delete_UnusingRecursive(new Node(3));
        bst.show_LNR();
        bst.show_LNR_UnusingRecursive();
        // bst.delete_UnusingRecursive(new Node(30));
        // bst.show_LNR();
        // bst.delete_UnusingRecursive(new Node(45));
        // bst.show_LNR();
        // bst.delete_UnusingRecursive(new Node(8));
        // bst.show_LNR();
        // bst.delete_UnusingRecursive(new Node(2));
        // bst.show_LNR();
        // bst.show_LNR();
        // bst.delete_UnusingRecursive(new Node(19));
        // bst.show_LNR();
        // bst.delete_UnusingRecursive(new Node(20));
        // bst.show_LNR();

        System.out.println("\n" + bst.dept());
        System.out.println(bst.sum());
    }
}
