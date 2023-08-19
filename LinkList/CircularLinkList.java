import java.util.Scanner;

class Node{

	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class CLinkList{
	Node head;

	void insertFirst(int x) {
        Node n = new Node(x);
        	if (head == null){
            	head = n;
            	head.next=head;
        	}
        	else{	
            	Node temp = head;
            	while (temp.next != head){
                	temp = temp.next;
            	}
           		n.next = head;
           		head = n;
            	temp.next = head;
			}
	}

	void insertEnd(int y){
		Node n = new Node(y);

		if(head==null){
			head = n;
		}
		else{
			Node temp = head;
			while(temp.next != head){
				temp=temp.next;
			}
			temp.next = n;
			n.next = head;
		}
	
	}

	void delete(int position){
		if (head == null) {
            System.out.println("Cannot delete.");
            return;
        }

        Node temp = head;
        Node pred = null;
        int count = 1;

        while (count != position) {
            pred = temp;
            temp = temp.next;
            count++;
        }

		if (count!=position) {
			System.out.println("Node not found.");
            return;
        }

        if (temp == head){
            Node lastNode = head;
            while (lastNode.next != head) {
                lastNode = lastNode.next;
            }
            head = head.next;
            lastNode.next = head;
        } else {
            pred.next = temp.next;
        }
	}



	void display(){
		Node temp = head;
		while(temp.next != head ){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}

public class CircularLinkList{
	public static void main(String[] args){

		CLinkList c = new CLinkList();

		Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter choice :  \n 1 for insertFirst\n 2 for delete\n 3 for display \n 4 for insertLast \n 5 for exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Enter element");
                            int x = sc.nextInt();
                            c.insertFirst(x);
                            break;
                case 2 : System.out.println
                	("Enter position where u want to insert");
                			int v = sc.nextInt();
                			c.delete(v);
                            break;

                case 3 : c.display();
                            break;
                
                case 4 : System.out.println("Enter element");
                            int y = sc.nextInt();
                            c.insertEnd(y);
                            break;

                case 5 : return;
          	}
        }
	}
}