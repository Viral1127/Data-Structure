import java.util.Scanner;
public class Recursion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();

		Fect f1 = new Fect();
		System.out.println(f1.fect(n));
	}
}

class Fect{
	int fect(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*fect(n-1);
		}
	}
}