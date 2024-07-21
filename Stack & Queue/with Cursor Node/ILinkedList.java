public interface ILinkedList {
    boolean addHead(Node node);
    boolean addTail(Node node);
    boolean addAfterNode(Node after, Node node);
    boolean addBeforeNode(Node before, Node node);
    boolean delete(Node node);
    Node search(Node node);
    boolean update(Node oldNode, Node newNode);
    void show();

}
