import java.util.*;
class Stack{
	Scanner sc = new Scanner(System.in);
	int top;
	char[] stack;
	int maxsize;

	Stack(int size){
		maxsize = size;
		stack = new	char[maxsize];
		top=0;
	}
	
	void push(char element){
		if(top==maxsize-1){
			System.out.println("overflow");
			return;
		}
		else{
			top++;
			stack[top] = element;
			//System.out.println(value);
		}
	}

	public char pop(){
		char v;
		if(top == 0){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			top--;
			v = stack[top];
			return v;
			//System.out.println();
		}
	}

	public char peep(){
		if(top==0){
			System.out.println("stack is empty");
			return 0;
		}
		else{
			return stack[top];
		}
	}

	void display(){
		if(top==0){
			System.out.println("Stack is empty :  ");
		}
		else{
		for(int i=top ; i>0 ; i--){
			System.out.println(stack[i]);
			}
		}
	}

	public boolean isEmpty(){
            return(top == 0);
        }	
}

public class Recognize{
	public static void main(String[] args){
		String[] testStrings = {"aca", "bcb", "abcba", "abbcbba"};

            
        for (String str : testStrings){
        	Stack s1 = new Stack(str.length( ));
            boolean isRecognized = false;

        	for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                if (currentChar == 'a') {
                    s1.push(currentChar);
                } else if (currentChar == 'b') {
                    if (s1.isEmpty() || s1.peep() != 'a') {
                        isRecognized = true;
                        break;
                    } else {
                        s1.pop();
                    }
                } else if (currentChar == 'c') {
                    if (s1.isEmpty() || s1.peep() != 'b') {
                        isRecognized = true;
                        break;
                    } else {
                        s1.pop();
                    }
                } else {
                    isRecognized = true;
                    break;
                }
            }

            if (isRecognized && s1.isEmpty()) {
                System.out.println("String \"" + str + "\" is recognized.");
            } else {
                System.out.println("String \"" + str + "\" is not recognized.");
            }
        } 
        }
    }