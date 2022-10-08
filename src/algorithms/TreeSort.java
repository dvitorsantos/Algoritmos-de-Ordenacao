package algorithms;

import elements.Element;
import elements.Tree;

public class TreeSort {
    public static Element[] sort(Element[] vector, boolean ascending) {
        Tree tree = new Tree(ascending);

        for (Element element : vector) {
            tree.insert(element);
        }

        return tree.inOrder(vector);
    }
}
