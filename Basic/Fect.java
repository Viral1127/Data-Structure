import java.util.Scanner;
public class Fect{
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
	int n;

	void check(){
		int fect=1;
		for(int i=1 ; i<n; i++){
			fect = n*i;
		}

		System.out.println(fect);
	}
}