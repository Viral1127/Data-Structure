import java.util.*;
public class SumMatrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][2];
		int sum=0;
		for(int i = 0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("enter array-1 element");
				a[i][j] = sc.nextInt();
			}
		}

		int[][] b = new int[2][2];
		for(int i = 0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("enter array-2 element");
				b[i][j] = sc.nextInt();
			}
		}

		for(int i = 0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("Sum is : ");
				sum = a[i][j] + b[i][j];
				System.out.println(sum);
			}
			
		}
	}
}