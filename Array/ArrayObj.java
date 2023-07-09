import java.util.*;
public class ArrayObj{
	public static void main(String[] args){

		System.out.println("enter number of students :  ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student_Detail s[] = new Student_Detail[n];

		for(int i=0;i<n;i++){
			s[i] = new Student_Detail();
		}
		for(int i=0;i<n;i++){
			s[i].scan();
			s[i].print();
		}
	}
}

class Student_Detail{
	int enrollment_No;
	String name;
	int semester;
	double cpi;

	public void scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\nenter details of student - ");
		System.out.print("enter enrolmentNo  : ");
		enrollment_No=sc.nextInt();
		System.out.print("enter name  : ");
		name=sc.next();
		System.out.print("enter semester  : ");
		semester=sc.nextInt();
		System.out.print("enter cpi  : ");
		cpi=sc.nextDouble();
	}

	public void print()
	{

		System.out.println("\nenrolmentNo  : " + enrollment_No);
		System.out.println("name  : " + name);
		System.out.println("gender  : " + semester);
		System.out.println("marks  : " + cpi);
		
	}

}