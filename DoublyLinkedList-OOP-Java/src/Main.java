public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);

        list.addItem(new Node(30));
        list.addItem(new Node(10));
        list.addItem(new Node(40));
        list.addItem(new Node(20));

        System.out.println("List after adding numbers:");
        list.traverse(list.getRoot());


        System.out.println("\nRemoving '20':");
        list.removeItem(new Node(20));
        list.traverse(list.getRoot());


        System.out.println("\nTrying to remove '50':");
        list.removeItem(new Node(50));
        list.traverse(list.getRoot());
    }
}
