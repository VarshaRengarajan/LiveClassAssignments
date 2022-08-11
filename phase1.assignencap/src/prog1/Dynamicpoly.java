package prog1;

class Shape{
	public void area(int i,int j){
		System.out.println("The formula for area of");
	}
}
class Rectangle extends Shape{
	
	public void area(int i,int j ){
		System.out.println("the area of rectangle:"+(i*j));
	}
}
class Triangle extends Shape{
	
	public void area(int i,int j){
		System.out.println("the area of triangle:"+(0.5*i*j));
	}
	
}
class Square extends Shape{
	
	public void area(int i,int j){
		System.out.println("the area of square:"+(i*i));
	}
}
class Rhombus extends Shape{
	
	public void area(int i,int j){
		System.out.println("the area of rhombus:"+(0.5*i*j));
	}
}

public class Dynamicpoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj1=new Square();
		Shape obj2=new Rectangle();
		Shape obj3=new Triangle();
		Shape obj4=new Rhombus();
		obj1.area(4,5);
		obj2.area(5, 7);
		obj3.area(10, 5);

	}

}
