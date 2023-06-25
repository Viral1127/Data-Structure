import java.util.*;
public class Avg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number :  ");
		int n = sc.nextInt();

		Average a1 = new Average();
		a1.n = n;

		a1.calc();
	}
}

class Average{
	int n,sum=0,count=0;

	void calc(){
	for(int i=0;i<=n;i++){
		sum = sum+i;
		count++;
	}
	double avg = sum/n;
	System.out.println("average is "+avg);
}
}