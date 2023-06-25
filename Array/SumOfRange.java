import java.util.*;
public class SumOfRange{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of m and n");
		int m = sc.nextInt();
		int n = sc.nextInt();

		Sum s1 = new Sum();
		s1.m = m;
		s1.n = n;

		s1.calc();
	}
}

class Sum
{
	int m,n;
	int sum=0;
	void calc(){
	for(int i=m;i<=n;i++)
	{
		sum=sum+i;
	}

	System.out.println(sum);
}

}