public class LinkListImple implements ILinkedList, IQueue{

    private Node head;
    private Node tail;

    public LinkListImple(){
        init();
    }

    private void init(){
        head = tail = null;
    }


    @Override
    public boolean addAfterNode(Node after, Node node) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addBeforeNode(Node before, Node node) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addHead(Node node) {
        if(head == null){
            head = tail = node;
            return true;
        }

        node.setNext(head);
        head = node;
        return true;
    }

    @Override
    public boolean addTail(Node node) {
        if(head == null){
            head = tail = node;
            return true;
        }

        tail.setNext(node);
        tail = node;
        return true;
    }

    @Override
    public boolean delete(Node node) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Node search(Node node) {
        if(head == null) return head;
        
        if(head.is(node)) return head;
        if(tail.is(node)) return tail;

        for(Node p = head; p != null; p = p.getNext()){
            if(p.is(node)) return p;
        }

        return null;
    }

    @Override
    public void show() {
        System.out.println();
        for(Node p = head; p != null; p = p.getNext()){
            System.out.printf("%d -> ", p.getValue());
        }
        System.out.printf("%s", "NULL");
    }

    @Override
    public boolean update(Node oldNode, Node newNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean clear() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Node pop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean push(Node node) {
        // TODO Auto-generated method stub
        return false;
    }    
}
