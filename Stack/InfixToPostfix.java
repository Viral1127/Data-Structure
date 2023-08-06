import java.util.*;
public class InfixToPostfix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter infix expression :  ");
		String s = sc.nextLine();
		String postfix = convertIntoPostfix(s);
		System.out.println("Postfix : "+postfix);
	}

		static String convertIntoPostfix(String s){
			String postfix = "";
			StackOperation s1 = new StackOperation(s.length());
			s1.push('(');
			s += ')';
			int rank = 0;

			for(char i : s.toCharArray()){
				if(Character.isLetterOrDigit(i)){
					postfix += i + " ";
					rank++;
				}
				else if(i=='('){
					s1.push(i);
				}
				else if(i==')'){
					while(!s1.isEmpty() && s1.peep()!='('){
						postfix += s1.pop() + " ";
					}
					if(s1.isEmpty() || s1.peep()!='('){
						return "invalid string";
					}
					else{
						s1.pop();
					}
				}
				else if(isOperator(i)){
						if(i=='^' || i=='$'){
						s1.push(i);
					}
					else{
						while(!s1.isEmpty() && getPrecedence(i) <= getPrecedence(s1.peep())){
							postfix += s1.pop() + " ";
							rank--;
						}
						s1.push(i);
					}
				}
				if(rank<1){
					return "Invalide String";
				}	
			}
			return postfix;
		}
		static int getPrecedence(char ch){
				switch(ch){
				case '+' :
				case '-' :
					return 1;

				case '*' :
				case '/' :
					return 3;

				case '^' :
				case '$' :
					return 6;
				}
				return -1;
			}
		static boolean isOperator(char ch){
				return ch=='+' || ch=='-' || ch=='*' || ch=='/'||ch=='^'||ch=='$';
			}

}

class StackOperation{
	int top;
	char[] stack;
	int n;
	StackOperation(int n){
		this.n = n;
		stack = new char[n];
		top=-1;
	}
	
	void push(char element){

		//System.out.println("enter push element :  ");
		//int x = sc.nextInt();
		if(top>=n){
			System.out.println("overflow");
			//return;
		}
		else{
			top++;
			stack[top] = element;
			//System.out.println(value);
		}
	}

	char pop(){
		char v = 'a';
		if(top == -1){
			System.out.println("stack underflow");
			return 'a';
		}
		else{
			v = stack[top];
			top--;
			return v;
			//System.out.println();
		}
	}

	char peep(){
		if(top==-1){
			return ' ';	
		}
		else{
			return stack[top];
		}
	}
	// void display(){
	// 	if(top==-1){
	// 		System.out.println("Stack is empty :  ");
	// 	}
	// 	else{
	// 	for(int i=top ; i>0 ; i--){
	// 		System.out.println(Stack[i]);
	// 		}
	// 	}
		
	// }
	boolean isEmpty(){
		if (top == -1){
			return true;
		}
		else{
			return false;
		}
	}
}

class Postfix{

}