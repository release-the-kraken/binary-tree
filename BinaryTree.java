public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(current.value < value){
            current.left = addRecursive(current.left, value);
        }else if(current.value > value){
            current.right = addRecursive(current.right, value);
        }else{
            return current;
        }
        return current;
    }

    void add(int value){
        root = addRecursive(root, value);
    }
    
    private boolean findNodeRecursive(Node current, int value){
        if(current == null){
            return false;
        }

        if(current.value == value){
            return true;
        }

        return current.value < value 
            ? findNodeRecursive(current.left, value) 
            : findNodeRecursive(current.right, value);
    }

    boolean containsNode(int value){
        return findNodeRecursive(root, value);
    }

    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.right);
            System.out.println(node.value);
            traverseInOrder(node.left);
        }
    }
}
