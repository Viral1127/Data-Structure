import java.util.Scanner;
class Node{

	int data;
	Node next;

	Node(int x){
		this.data = x;
	}
}

class Queue{
	Node head;

	void insertQueue(int y){
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

	void deleteQueue(){
		Node temp = head;
		head = temp.next;
	}

	void display(){
	Node temp = head;

		while(temp != null ){
		System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class LinkListQueue{
	public static void main(String[] args) {
		
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter choice :  \n 1 for insert\n 2 for delete\n 3 for display \n 4 for exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Enter element");
                            int x = sc.nextInt();
                            q.insertQueue(x);
                            break;
                case 2 : q.deleteQueue();
                            break;

                case 3 : q.display();
                            break;

                case 4 : return;
          	}
        }
	}
}