import java.util.Scanner;
class Node{
	int data;
	Node next;

	Node(int x){
		this.data = x;
	}
}

class Stack{
	Node head;

	void push(int value){
		Node n = new Node(value);
		n.next = head;
		head = n;
	}

	void pop(){
		Node temp = head;
		head = temp.next;
	}

	void peep(){
		Node temp = head;
		System.out.println(temp.data);
	}

	void display(){
	Node temp = head;

		while(temp != null ){
		System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class LinkListStack{
	public static void main(String[] args){
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter choice :  \n 1 for push\n 2 for pop\n 3 for peep\n 4 for display \n 5 for exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Enter element");
                            int x = sc.nextInt();
                            s.push(x);
                            break;
                case 2 : s.pop();
                            break;

                case 3 : s.peep();
                            break;

                case 4 : s.display();
                			break;

                case 5 : return;			
          	}
        }
	}
}