import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BSTImpl implements IBST {
    
    private Node root;
    private int SIZE;

    public BSTImpl(){
        root = null;
        SIZE = 0;
    }

    @Override
    public boolean delete_UnusingRecursive(Node node) {
        if(node == null || root == null) return false;
        
        if(root.compareTo(node) == 0){
            root = null;
            SIZE--;
            return root == null;
        }

        Node curNode = root;
        Node nodeIsNode = null;
        Node L = null;
        Node R = null;
        while(curNode != null){
            if(node.compareTo(curNode) > 0){
                if(curNode.getRight() == null) return false;

                if(curNode.getRight().compareTo(node) == 0){
                    nodeIsNode = curNode.getRight();
                    L = nodeIsNode.getLeft();
                    R = nodeIsNode.getRight();
                    curNode.setRight(null);
                    break;
                }
                else curNode = curNode.getRight();
            }
            else if(node.compareTo(curNode) < 0){
                if(curNode.getLeft() == null) return false;

                if(curNode.getLeft().compareTo(node) == 0){
                    nodeIsNode = curNode.getLeft();
                    L = nodeIsNode.getLeft();
                    R = nodeIsNode.getRight();
                    curNode.setLeft(null);
                    break;
                }
                else curNode = curNode.getLeft();
            }
            else{
                L = root.getLeft();
                R = root.getRight();
                root = null;
                break;
            }
        }

        Set<Node> st = new HashSet<>();

        if(L != null) nodeIntoSet(st, L);
        if(R != null) nodeIntoSet(st, R);

        for(Node n : st) insert_UnusingRecursive(n);

        SIZE--;

        return true;
    }

    @Override
    public boolean delete_UsingRecursive(Node node) {
        if(root == null || node == null) return false;

        return delete_UsingRecursive(root, node);
    }

    private boolean delete_UsingRecursive(Node root, Node node){
        
        Node nodeIsNode;
        Node L = null;
        Node R = null;
        
        if(node.compareTo(root) < 0){
            nodeIsNode = root.getLeft();
            if(nodeIsNode == null) return false;

            if(root.getLeft().compareTo(node) == 0){    
                L = nodeIsNode.getLeft();
                R = nodeIsNode.getRight();
                root.setLeft(null);
            }
            else return delete_UsingRecursive(root.getLeft(), node);
        }
        else if (node.compareTo(root) > 0){
            nodeIsNode = root.getRight();
            if(nodeIsNode == null) return false;

            if(root.getRight().compareTo(node) == 0){
                L = nodeIsNode.getLeft();
                R = nodeIsNode.getRight();
                root.setRight(null);
            }
            else return delete_UsingRecursive(root.getRight(), node);
        }
        else{
            L = root.getLeft();
            R = root.getRight();
            root = null;
        }

        Set<Node> st = new HashSet<>();

        if(L != null) nodeIntoSet(st, L);
        if(R != null) nodeIntoSet(st, R);

        for(Node n : st) insert_UnusingRecursive(n);

        SIZE--;

        return true;

    }

    

    @Override
    public int dept() {
        return dept(root);
    }

    private int dept(Node root){
        if(root == null) return 0;

        int dLeft = dept(root.getLeft());
        int dRight = dept(root.getRight());

        return (dLeft > dRight ? dLeft : dRight) + 1;
    }

    

    @Override
    public int sum() {

        return sum(root);
    }

    private int sum(Node root){
        if(root == null) return 0;

        int sLeft = sum(root.getLeft());
        int sRight = sum(root.getRight());

        return sLeft + sRight + root.getValue();
    }

    private void nodeIntoSet(Set<Node> st, Node node){
        if(node == null) return;

        st.add(node);
        SIZE--;
        nodeIntoSet(st, node.getLeft());
        nodeIntoSet(st, node.getRight());
        node.setLeft(null);
        node.setRight(null);
    }

    @Override
    public boolean insert_UnusingRecursive(Node node) {
        if(node == null) return false;

        if(root == null){
            root = node;
            return root == node;
        }

        Node curNode = root;

        while(!node.equals(curNode)){
         
            if(node.compareTo(curNode) == 0) return false;

            if(node.compareTo(curNode) == 1){
                if(curNode.getRight() == null){
                    curNode.setRight(node);
                    SIZE++;
                }
                curNode = curNode.getRight();
            }
            else {
                if(curNode.getLeft() == null){
                    curNode.setLeft(node);
                    SIZE++;
                }
                curNode = curNode.getLeft(); 
            }
        }

        return node.equals(curNode);
    }

    
    @Override
    public boolean insert_UsingRecursive(Node node) {
        if(node == null) return false;

        if(root == null){
            root = node;
            SIZE++;
            return root.equals(node);
        }

        return insert_UsingRecursive(root, node);
    }

    private boolean insert_UsingRecursive(Node root, Node node){
        

        if(root.compareTo(node) == 0) return false;

        if(node.compareTo(root) == 1){
            if(root.getRight() == null){
                root.setRight(node);
                SIZE++;
                return root.getRight().equals(node);
            }
            else return insert_UsingRecursive(root.getRight(), node);
        }

        if(root.getLeft() == null){
            root.setLeft(node);
            SIZE++;
            return root.getLeft().equals(node);
        }
        return insert_UsingRecursive(root.getLeft(), node);
    }

    @Override
    public Node search_UnusingRecursive(Node node) {
        Node curNode = root;
        while(node.compareTo(curNode) != 0){
            if(curNode == null) break;

            if(node.compareTo(curNode) == 0) break;

            if(node.compareTo(curNode) == 1) curNode = curNode.getRight();

            if(node.compareTo(curNode) == -1) curNode = curNode.getLeft();
        }
        return curNode;
    }

    @Override
    public Node search_UsingRecursive(Node node) {
        if(node == null) return node;

        return search_UsingRecursive(root, node);
    }
   
    private Node search_UsingRecursive(Node root, Node node) {
        if(root == null) return root;
        if(node.compareTo(root) == 0) return root;

        if(node.compareTo(root) == 1)
            return search_UsingRecursive(root.getRight(), node);

        return search_UsingRecursive(root.getLeft(), node);
    }

    @Override
    public void show_LNR_UnusingRecursive() {

        if(root == null) return;

        List<Node> isPop = new ArrayList<>();
        IStack stack = new StackImpl(SIZE);
        
        stack.push(root);
        while(stack.SIZE() > 0){
            Node nodePeek = stack.peek();
            if(nodePeek.getLeft() != null && !isPop.contains(nodePeek.getLeft())){
                stack.push(nodePeek.getLeft());
                continue;
            }
            
            Node nodePop = stack.pop();
            System.out.print(nodePop);
            isPop.add(nodePop);

            if(nodePop.getRight() != null) 
                stack.push(nodePop.getRight());
        }
        
    }

    @Override
    public void show_LRN_UnusingRecursive() {

        if(root == null) return;

        List<Node> isPop = new ArrayList<>();
        IStack stack = new StackImpl(SIZE);

        stack.push(root);
        while(stack.SIZE() > 0){
            Node nodePeek = stack.peek();
            if(nodePeek.getLeft() != null && !isPop.contains(nodePeek.getLeft())){
                stack.push(nodePeek.getLeft());
                continue;
            }

            if(nodePeek.getRight() != null && !isPop.contains(nodePeek.getRight())){
                stack.push(nodePeek.getRight());
                continue;
            }

            Node nodePop = stack.pop();
            System.out.print(nodePop);
            isPop.add(nodePop);
        }
    }

    @Override
    public void show_NLR_UnusingRecursive() {

        if(root == null) return;

        IStack stack = new StackImpl(SIZE);

        stack.push(root);
        while(stack.SIZE() > 0){
            Node nodePop = stack.pop();
            System.out.print(nodePop);

            if(nodePop.getLeft() != null){
                stack.push(nodePop.getLeft());
            }

            if(nodePop.getRight() != null){
                stack.push(nodePop.getRight());
            }
        }
        
    }

    @Override
    public void show_NLR() {
        System.out.println();
        show_NLR(root);
        System.out.print("NULL");
    }

    private void show_NLR(Node root) {
        if(root == null) return;
        System.out.print(root);
        show_NLR(root.getLeft());
        show_NLR(root.getRight());
    }

    @Override
    public void show_LNR() {
        System.out.println();
        show_LNR(root);
        System.out.print("NULL");
    }

    private void show_LNR(Node root) {
        if(root == null) return;
        show_LNR(root.getLeft());
        System.out.print(root);
        show_LNR(root.getRight());
    }

    @Override
    public void show_LRN() {
        System.out.println();
        show_LRN(root);
        System.out.print("NULL");
    }

    private void show_LRN(Node root) {
        if(root == null) return;
        show_LRN(root.getLeft());
        show_LRN(root.getRight());
        System.out.print(root);
    }

    @Override
    public boolean update_UnusingRecursive(Node oldNode, Node newNode) {
        if(newNode == null) return false;

        Node findNode = search_UnusingRecursive(oldNode);

        if(findNode == null) return false;

        findNode.setValue(newNode.getValue());
        return findNode.compareTo(newNode) == 0;
    }

    @Override
    public boolean update_UsingRecursive(Node oldNode, Node newNode) {
        if(newNode == null) return false;

        Node findNode = search_UsingRecursive(oldNode);

        if(findNode == null) return false;

        findNode.setValue(newNode.getValue());
        return findNode.compareTo(newNode) == 0;
    }
    
}
