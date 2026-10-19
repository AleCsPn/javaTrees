public class App {
    public static void main(String[] args) throws Exception {
        
        BinarySearchTree<Integer> binaryTree = new BinarySearchTree<>();

        binaryTree.add(40);
        binaryTree.add(50);
        binaryTree.add(70);
        binaryTree.add(80);
        binaryTree.add(20);
        binaryTree.add(60);
        binaryTree.add(30);

        System.out.println("Percurso preOrder:");
        binaryTree.preOrder();
    }
}
