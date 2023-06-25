import java.util.*;
public class Min{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array :  ");
		int n = sc.nextInt();
		int a[] = new int[n];

		Minimum m1 = new Minimum();
		m1.read(a);
		m1.getMin(a);	

	}
}

class Minimum{
	Scanner sc = new Scanner(System.in);

	void read(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println("enter array elements");
			a[i] = sc.nextInt();
		}
	}
	void getMin(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(min > a[i]){
			min = a[i];
			}
		}
	
		System.out.println(min);		
	}
}