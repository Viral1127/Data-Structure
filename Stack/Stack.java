import java.util.*;
public class Stack{
	public static void main(String[] args){
		
		int q=1;
		StackOperation s1 = new StackOperation();
		Scanner sc = new Scanner(System.in);
		while(q!=0){
			System.out.println("enter 1.push , 2.pop , 3.display");
			System.out.println("enter choice");
			int ch = sc.nextInt();

			switch(ch){
			case 1: System.out.println("enter element u want to push");
				int element = sc.nextInt();
				s1.push(element);
				break;

			case 2:int popele;
				popele = s1.pop();
				System.out.println("popped element is :  ");
				System.out.println(popele+" ");
				break;

			case 3:System.out.println("elements in the stack are :  ");
				s1.display();
				break;

			case 4:q=0;

			}
		}
	}
}

class StackOperation{
	Scanner sc = new Scanner(System.in);
	int top;
	int[] Stack;
	int n;
	StackOperation(){
		System.out.println("enter size of Stack");
		n = sc.nextInt();
		Stack = new int[n];
		top=0;
	}
	
	void push(int element){

		//System.out.println("enter push element :  ");
		//int x = sc.nextInt();
		if(top>=n){
			System.out.println("overflow");
			return;
		}
		else{
			top++;
			Stack[top] = element;
			//System.out.println(value);
		}
	}

	int pop(){
		int v = 0;
		if(top == 0){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			top--;
			v = Stack[top];
			return v;
			//System.out.println();
		}
	}

	void peep(){
		if(top==0){
			System.out.println("stack is empty");
		}
		else{
			System.out.println(Stack[top]);
		}
	}

	void display(){
		if(top==0){
			System.out.println("Stack is empty :  ");
		}
		else{
		for(int i=top ; i>0 ; i--){
			System.out.println(Stack[i]);
			}
		}
		
	}

}