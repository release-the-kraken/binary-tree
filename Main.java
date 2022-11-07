class Main {
    
    public static void main(String[] args){
        BinaryTree tree1 = createTree();
        System.out.println(tree1.containsNode(7));
        tree1.traverseInOrder(tree1.root);

    }
    private static BinaryTree createTree(){
        BinaryTree tree = new BinaryTree();

        tree.add(4);
        tree.add(1);
        tree.add(6);
        tree.add(8);
        tree.add(12);
        tree.add(3);
        tree.add(5);
        tree.add(7);

        return tree;
    }
}