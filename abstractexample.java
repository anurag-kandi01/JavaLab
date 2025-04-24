abstract class shape{
	abstract double area();
	void display(){
		System.out.println("Displays area of shape");
	}
}
class circle extends shape{
	private double radius;
	circle(double radius){
		this.radius=radius;
	}
	double area(){
		return Math.PI*radius*radius;
	}
}
public class abstractexample{
	public static void main(String[] args){
	shape circle=new circle(5.5);
	System.out.println("Area of circle is "+circle.area());
	}
}