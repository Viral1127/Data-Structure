import java.util.*;
public class Employee{
	public static void main(String[] args){

		Employee_Detail e1 = new Employee_Detail();
		e1.scan();
		e1.print();
	}
}

class Employee_Detail{
	int employee_ID;
	String name;
	String designation;
	int salary;

	Scanner sc = new Scanner(System.in);
	public void scan(){
		System.out.println("enter employee id :  ");
		employee_ID  = sc.nextInt();
		System.out.println("enter employee name :  ");
		name = sc.next();
		System.out.println("enter employee designation :  ");
		designation = sc.next();
		System.out.println("enter employee salary :  ");
		salary = sc.nextInt();
	}

	public void print(){
		System.out.println(employee_ID);
		System.out.println(name);
		System.out.println(designation);
		System.out.println(salary);
	}

}