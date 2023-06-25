import java.util.Scanner;
public class Duplicate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();

		int a[] = new int[n];
		Array a1 = new Array();
		a1.Read(a);
		a1.Check(a);
	}
}

class Array{
	Scanner sc = new Scanner(System.in);
	void Read(int a[])
	{
		for(int i=0;i<a.length;i++){
			System.out.println("enter array elements");
			a[i] = sc.nextInt();
		}
	}
	void Check(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
				count++;
			}
			}
		}
		if(count==1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}