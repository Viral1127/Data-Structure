import java.util.Scanner;
public class Vowel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
		char n = sc.next().charAt(0);

		Number n1 = new Number();
		n1.n = n;
		n1.check();
	}
}

class Number{
	char n;

	void check(){
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
			System.out.println("vowel");
		}
		else{
			System.out.println("consonant");
		}
	}
}