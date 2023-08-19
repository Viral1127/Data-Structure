import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Node inserted at the front.");
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            if (current == null) {
                System.out.println("Position out of range.");
                return;
            }
            current = current.next;
        }

        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            System.out.println("Node deleted from position " + position);
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        System.out.println("Node inserted at the end.");
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedListMenu {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDoubly Linked List Operations:");
            System.out.println("1. Insert at the front");
            System.out.println("2. Delete at specified position");
            System.out.println("3. Insert at the end");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = scanner.nextInt();
                    linkedList.insertFront(data);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    linkedList.deleteAtPosition(position);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    linkedList.insertEnd(data);
                    break;
                case 4:
                    linkedList.display();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
