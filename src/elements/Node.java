package elements;

public class Node {
    private Element element;
    private Node left;
    private Node right;

    public Node(Element element) {
        this.element = element;
    }

    public void insert(Element element, boolean ascending) {
        if (ascending) {
            if (element.getKey().compareTo(this.element.getKey()) < 0) {
                if (this.left == null) {
                    this.left = new Node(element);
                } else {
                    this.left.insert(element, ascending);
                }
            } else {
                if (this.right == null) {
                    this.right = new Node(element);
                } else {
                    this.right.insert(element, ascending);
                }
            }
        } else {
            if (element.getKey().compareTo(this.element.getKey()) > 0) {
                if (this.left == null) {
                    this.left = new Node(element);
                } else {
                    this.left.insert(element, ascending);
                }
            } else {
                if (this.right == null) {
                    this.right = new Node(element);
                } else {
                    this.right.insert(element, ascending);
                }
            }
        }
    }

    public int inOrder(Element[] vector, int index) {
        if (this.left != null) {
            index = this.left.inOrder(vector, index);
        }

        vector[index] = this.element;
        index++;

        if (this.right != null) {
            index = this.right.inOrder(vector, index);
        }

        return index;
    }
}
