package elements;

public class Tree {
    private Node root;
    private boolean ascending;

    public Tree(boolean ascending) {
        this.ascending = ascending;
    }

    public void insert(Element element) {
        if (this.root == null) {
            this.root = new Node(element);
        } else {
            this.root.insert(element, this.ascending);
        }
    }

    public Element[] inOrder(Element[] vector) {
        if (this.root != null) {
            this.root.inOrder(vector, 0);
        }

        return vector;
    }
}
