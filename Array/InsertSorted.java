import java.util.*;
public class InsertSorted{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array");
	int n = sc.nextInt();
	int a[] = new int[n+1];
	Assending a1 = new Assending();
	a1.n = n;
	a1.scan(a);
	a1.Assending(a);
	a1.insert(a);
	}
}

class Assending{
	Scanner sc = new Scanner(System.in);
	int n;

void scan(int a[]){
	for(int i=0;i<n;i++){
		System.out.println("Enter element "+i);
		a[i] = sc.nextInt();
		}
	}

void Assending(int a[]){
	int temp;
	for(int i=0;i<n;i++){
		int fleg = 0;
		for(int j=0;j<n-1-i;j++){
			if(a[j] > a[j+1]){
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				fleg = 1;
			}
		}
		if(fleg == 0){
			break;
		}
	}
	for(int i=0;i<n;i++){
		System.out.println("assending" + a[i]);
		}
	}
	void insert(int a[]){
	System.out.println("enter location where u want to insert");
	int pos = sc.nextInt();
	System.out.println("enter element which u want to insert");
	int element = sc.nextInt();

	for(int i=n; i>=pos ;i--){
		a[i] = a[i-1];
	}
	a[pos-1] = element;
	n++;
	for(int i=0;i<n;i++){
		System.out.println(a[i]);
		}
	}
}