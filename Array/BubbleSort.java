import java.util.*;
public class BubbleSort{
	public static void main(String[] args){
		int[] a ={10,20,5,8,9,11,30,};
		int temp;
		
		for(int i=0;i<a.length;i++){
			int fleg=0;
			for(int j=0;j<a.length-1;j++){

				if(a[j] > a[j+1]){
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				fleg =1;
				}
			}
			if(fleg==0){
				break;
			}
		}

		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	int pos = 3;
	int element = 25;

	for(int i=a.length-1;i>pos;i--){
		a[i] = a[i-1];
	}

	a[pos-1] = element;

	for(int i=0;i<a.length;i++){
		System.out.println("updated :  "+a[i]);
	}

	int delete = 25;

	for(int i=0;i<a.length;i++){
		if(delete == a[i])
		{
			for(int j=i;j<a.length-1;j++){
				a[j] = a[j+1];
			}
			break;
		}
	}

	for(int i=0;i<a.length;i++){
		System.out.println("deleted :  "+a[i]);
	}
}
}