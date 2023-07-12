public class Recognize{
	public static void main(String args[]){
		String v = "c_";
		int i=0;
		char c = v.charAt(i);
		StackOperation s1 = new StackOperation(v.length());
		//push
		while (c != 'c' && c != '_'){
			s1.push(c);
			i++;
			c = v.charAt(i);
		}
		if (c != '_' ){
			i++;
			c = v.charAt(i);
		}

		//pop
		while (c != '_' && ! (s1.isEmpty()) ){
			if(c == s1.peep()){
				s1.pop();
			}
			else{
				break;
			}
			i++;
			c = v.charAt(i);
		}
		if(c == '_' && s1.isEmpty()){
			System.out.println("Valid .. ");
		}
		else {
			System.out.println("InValid . ");
		}
	}
}



class StackOperation{
	int top;
	char[] Stack;
	int n;
	StackOperation(int n){
		this.n = n;
		Stack = new char[n];
		top=-1;
	}
	
	void push(char element){

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
		if(top == -1){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			v = Stack[top];
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
			return Stack[top];
		}
	}

	void display(){
		if(top==-1){
			System.out.println("Stack is empty :  ");
		}
		else{
		for(int i=top ; i>0 ; i--){
			System.out.println(Stack[i]);
			}
		}
		
	}

	boolean isEmpty(){
		if (top == -1){
			return true;
		}
		else{
			return false;
		}
	}

}