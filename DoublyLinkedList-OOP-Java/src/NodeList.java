public interface NodeList {

    ListItem getRoot();
    boolean addItem(Node item);
    boolean removeItem(Node item);
    void traverse(ListItem root);

}
