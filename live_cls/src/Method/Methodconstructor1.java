package Method;

public class Methodconstructor1 {
	Methodconstructor1(){
		System.out.println("default");
	}
	Methodconstructor1(int i){
		System.out.println("The area of square:"+(i*i));
	}
	Methodconstructor1(int i,int j){
		System.out.println("The area of rectangle:"+(i*j));
	}
	Methodconstructor1(double i){
		System.out.println("The area of circle:"+(3.14*i*i));
	}
	public void calculate(int a,int b){
		System.out.println("The area of rhombus:"+(0.5*a*b));
	}
	public void calculate(double i,double j){
		System.out.println("The are of triangle:"+(0.5*i*j));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodconstructor1 obj=new Methodconstructor1();
		Methodconstructor1 obj1=new Methodconstructor1(4);
		Methodconstructor1 obj2=new Methodconstructor1(2,3);
		Methodconstructor1 obj3=new Methodconstructor1(3.678);
		obj.calculate(1,2);
		obj.calculate(1.2,1.5);

	}

}
