import java.util.*;
public class InsertArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array :  ");
		int n = sc.nextInt();
		int a[] = new int[n+1];

		Insert i1 = new Insert();
		i1.n = n;
		i1.scan(a);
		i1.insert(a);
	}
}

class Insert{
	int n;
	Scanner sc = new Scanner(System.in);

	void scan(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println("Enter array elements , last element must be zero");
			a[i] = sc.nextInt();
		}
	}

	void insert(int a[]){
		System.out.println("enter location where u want to insert :  ");
		int pos = sc.nextInt();
		System.out.println("enter element :  ");
		int element = sc.nextInt();
		for(int i=a.length-1;i>pos-1;i--){
			a[i] = a[i-1];
		}
		a[pos-1] = element;
		n++;


		for(int i=0;i<a.length;i++){
			System.out.println("inserted :  "+a[i]);
		}
	} 

}