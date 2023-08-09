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

		c.insertFirst(10);
		c.insertFirst(20);
		c.insertFirst(30);
		c.display();
		//c.delete(1);
		//c.display();
	}
}