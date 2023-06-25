import java.util.Scanner;
public class DisplayNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();

		int a[] = new int[n];
		Array a1 = new Array();
		a1.Scan(a);
		a1.print(a);
		
	}
}

class Array{
	Scanner sc = new Scanner(System.in);
	void Scan(int a[])
	{
		for(int i=0;i<a.length;i++){
			System.out.println("enter array elements");
			a[i] = sc.nextInt();
		}
	}

	void print(int a[])
	{
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}