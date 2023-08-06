public class Evaluation{
    public static void main(String[] args) {
        String infix = "";
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            if(ch==character.isDigit(ch))
        }
        PostfixEvaluation p1 = new PostfixEvaluation();
        String postfixExpression = "45-";
        int result = p1.evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }
}


class PostfixEvaluation{
    public static int evaluatePostfix(String expression) {
        int length = expression.length();
        StackOperation s1 = new StackOperation(length);

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)){
                s1.push(ch - '0');
            } 
            else{
                int o2 = s1.pop();
                int o1 = s1.pop();

                switch (ch) {
                    case '+':
                        s1.push(o1 + o2);
                        break;
                    case '-':
                        s1.push(o1 - o2);
                        break;
                    case '*':
                        s1.push(o1 * o2);
                        break;
                    case '/':
                        s1.push(o1 / o2);
                        break;
                }
            }
        }
        return s1.pop();
    }
}

public class PrefixEvaluation{
    public static int evaluatePostfix(String expression) {
        int length = expression.length();
        StackOperation s1 = new StackOperation(expression.length());

        for (int i = length-1; i>=0; i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)){
                s1.push(ch - '0');
            } 
            else{
                int operand2 = s1.pop();
                int operand1 = s1.pop();

                switch (ch) {
                    case '+':
                        s1.push(operand1 + operand2);
                        break;
                    case '-':
                        s1.push(operand1 - operand2);
                        break;
                    case '*':
                        s1.push(operand1 * operand2);
                        break;
                    case '/':
                        s1.push(operand1 / operand2);
                        break;
                }
            }
        }
        return s1.pop();
    }
class StackOperation{
    int top;
    int[] stack;
    int n;
    StackOperation(int n){
        this.n = n;
        stack = new int[n];
        top=-1;
    }
    
    void push(int element){
        if(top>=n){
            System.out.println("overflow");
            //return;
        }
        else{
            top++;
            stack[top] = element;
        }
    }
    int pop(){
        int v = 0;
        if(top == -1){
            System.out.println("stack underflow");
            return 0;
        }
        else{
            v = stack[top];
            top--;
            return v;
            //System.out.println();
        }
    }
    int peep(){
        if(top==-1){
            return 0; 
        }
        else{
            return stack[top];
        }
    }
    boolean isEmpty(){
        if (top == -1){
            return true;
        }
        else{
            return false;
        }
    }}


