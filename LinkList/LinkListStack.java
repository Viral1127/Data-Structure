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

		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.peep();
		s.display();
	}
}