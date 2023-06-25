import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double redious = sc.nextDouble();

		Circle c1 = new Circle();
		c1.redious = redious;
		double area = c1.calculation();

		System.out.println(area);
	}
}

class Circle{
	double redious;

	double calculation(){
		return 3.14*redious*redious;
	}
}