import java.util.*;
public class Replace{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		Array a1 = new Array();
		a1.Scan(a);
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
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		for(int i=0;i<a.length;i++){
			if(n1==a[i]){
				a[i]=n2;
				System.out.println(a[i],i);
			}
		}
	}
}