import java.util.Scanner;
public class Matrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter Number of nodes ");
		int n = sc.nextInt();
		int m[][] = new int[n][n];
		for(int i=0 ; i < n ; i++ ){
			for(int j = 0; j < n ; j++){
				System.out.println("enter element of matrix ");
				m[i][j] = sc.nextInt();
			} 
		}
		for(int i=0 ; i < n ; i++ ){
			for(int j = 0; j < n ; j++){
				System.out.print(m[i][j]+" ");
			} 
			System.out.println();
		}
	}
}