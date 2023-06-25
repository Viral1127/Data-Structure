import java.util.Scanner;
public class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();

		Number n1 = new Number();
		n1.n = n;
		n1.check();
	}
}

class Number{
	double n;

	void check(){
		if(n%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("Odd");
		}
	}
}