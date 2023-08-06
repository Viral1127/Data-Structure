import java.util.Scanner;
class Node{
	int data;
	Node next;

	Node(int x){
		this.data = x;
	}
}

class LinkList{
	Node head;

	void insertLast(int y){
		Node n = new Node(y);

		if(head==null){
			head = n;
		}
		else{
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=n;
		}
	}
	void display(){
		Node temp = head;

			while(temp != null ){
				System.out.println(temp.data);
				temp = temp.next;
			}
	}
	void deleteLast(){
		Node temp = head;
		while(temp != null){
			if(temp.next.next == null){
				temp.next = null;
			}
			temp = temp.next;
		}
	}

	void insertFirst(int value){
		Node n = new Node(value);
		n.next = head;
		head = n;
	}

	void deleteFirst(){
		Node temp = head;
		head = temp.next;
	}

	// void deletePosition(int x){
	// 	Node temp = head;
	// 	while(temp.next != x && temp.next != null){
	// 		temp = temp.next;

	// 		if(temp.next != x){
	// 			System.out.println("Node not found");
	// 		}
	// 	}
	// }
}


public class LinkListDemo{
	public static void main(String[] args) {
		LinkList l = new LinkList();
		Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter choice :  \n 1 for insertFirst\n 2 for deleteFirst \n 3 for display \n 4 for insertLast \n 5 for deleteLast \n 6 for exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Enter element");
                            int x = sc.nextInt();
                            l.insertFirst(x);
                            break;
                case 2 : l.deleteFirst();
                            break;

                case 3 : l.display();
                            break;
                
                case 4 : System.out.println("Enter element");
                            int y = sc.nextInt();
                            l.insertLast(y);
                            break;

                case 5 : l.deleteLast();
                			break;

                case 6 : return;
          	}
        }
	}
}


// npm install -g create-react-app
// npx create-react-app vc
// npm Start
