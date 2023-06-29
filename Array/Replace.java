import java.util.*;
public class Replace{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		Array a1 = new Array();
		a1.scan(a);
		a1.replace(a);
	}
}

class Array{
	int n;
	Scanner sc = new Scanner(System.in);

	void scan(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println("Enter array element : "+ i);
			a[i] = sc.nextInt();
		}
	}

	void replace(int a[]){
		System.out.println("enter number 1 :  ");
		int n1 = sc.nextInt();
		System.out.println("enter number 2 :  ");
		int n2 = sc.nextInt();

		for(int i=0;i<a.length;i++){
			if(n1==a[i]){
				a[i] = n2;
			}
			System.out.println("replaced :  " + a[i] + "  Index is :  "+i);
		}
	}
}