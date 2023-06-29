import java.util.*;
public class DeleteArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array :  ");
		int n = sc.nextInt();
		int a[] = new int[n];

		Delete d1 = new Delete();
		d1.n = n;
		d1.scan(a);
		d1.delete(a);
	}
}

class Delete{
	Scanner sc = new Scanner(System.in);
	int n;

	void scan(int a[]){
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
	}

	void delete(int a[]){
		System.out.println("enter location where u want to delete");
		int pos = sc.nextInt();

		for(int i=pos;i<n-1;i++)
		{
			a[i] = a[i+1];
		}
		n--;

		for(int i=0;i<n;i++){
			System.out.println("deleted :  "+a[i]);
		}
	}
}