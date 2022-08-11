package Method;

public class methodoverloading {
	public int calculate (int a,int b){
	
		return(a+b);
	}
	public float calculate(float r){
		
		return(float)(3.14*r*r);
	}
	public int calculate(double l,int h){
		
		return (int)(l*h);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading obj=new methodoverloading();
		
		int a=obj.calculate(4, 7);
		System.out.println("The addition of two numbers:"+(a));
		
		float i=obj.calculate(2);
		System.out.println("The area of circle:"+(i));
		
		int j=obj.calculate(7.1,8);
		System.out.println("The area of rectangle:"+(j));
	

	}

}
