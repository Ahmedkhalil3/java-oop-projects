public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(Node item) {
        if(root == null) {
            root = item;
            return true;
        }

        // Looping through LinkedList
        ListItem current = root;
        while(current != null) {
            int comparison = current.compareTo(item);
            if(comparison < 0) {
                // Move to the next Node as current < new
                if (current.next() == null) {
                    current.setNext(item);
                    item.setPrevious(current);
                    return true;
                }
                current = current.next();
            }
            else if (comparison > 0) {
                // Insert item before current
                item.setPrevious(current.previous());
                item.setNext(current);

                if (current.previous() != null) {
                    current.previous().setNext(item);
                } else {
                    // we are inserting at the beginning
                    root = item;
                }

                current.setPrevious(item);
                return true;
            }
            else {
                // Duplicate
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(Node item) {
        if (root == null) {
            // Empty
            return false;
        }

        // loop through Nodes
        ListItem current = root;
        while (current != null) {
            int comparison = current.compareTo(item);
            if (comparison == 0) {
                if (current == root) {
                    root = current.next();
                } else {
                    if (current.previous() != null) {
                        current.previous().setNext(current.next());
                    }
                    if (current.next() != null) {
                        current.next().setPrevious(current.previous());
                    }
                }
                return true;
            }
            current = current.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }

        ListItem current = root;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.next();
        }
    }
}
