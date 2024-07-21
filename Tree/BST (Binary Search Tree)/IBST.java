public interface IBST {
    boolean insert_UsingRecursive(Node node);
    boolean insert_UnusingRecursive(Node node);
    boolean delete_UsingRecursive(Node node);
    boolean delete_UnusingRecursive(Node node);
    Node search_UsingRecursive(Node node);
    Node search_UnusingRecursive(Node node);
    boolean update_UsingRecursive(Node oldNode, Node newNode);
    boolean update_UnusingRecursive(Node oldNode, Node newNode);
    void show_NLR();
    void show_LNR();
    void show_LRN();
    void show_NLR_UnusingRecursive();
    void show_LNR_UnusingRecursive();
    void show_LRN_UnusingRecursive();
    int dept();
    int sum();
}
