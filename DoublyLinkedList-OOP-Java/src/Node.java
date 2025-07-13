public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        // if Object is String
        if (item.getValue() instanceof String && this.getValue() instanceof String) {
            return ((String) this.getValue()).compareTo((String) item.getValue());
        }

        // if Object is Integer
        if (item.getValue() instanceof Integer && this.getValue() instanceof Integer) {
            return ((Integer) this.getValue()).compareTo((Integer) item.getValue());
        }

        return 0;
    }


}
