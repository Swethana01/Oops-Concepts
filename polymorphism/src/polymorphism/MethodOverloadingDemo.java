package polymorphism;
 class Shape {
	
double calcArea(int a){
	return a*a;
}
double calcArea(int a, int b )
{
	return a*b;
}
double calcArea(double a)
{
	return 3.14*a*a;
}
	

}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Shape s=new Shape();
		System.out.println("area:  "+s.calcArea(5));
		System.out.println("area:  "+s.calcArea(5,3));
		System.out.println("area:  "+s.calcArea(5.3));
	}

}
