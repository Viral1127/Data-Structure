import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number-1");
		int a = sc.nextInt();
		System.out.println("enter number-2");
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
}