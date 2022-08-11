package prog1;
class Product{
	int id=78;
	String name="Amul";
	void display(){
		System.out.println("The id is:"+id);
		System.out.println("The name is:"+name);
	}
}
class A extends Product{
	int count=50;
	String category="butter";
	void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(count);
		System.out.println(category);
		
	}
}
class B extends Product{
	int count=90;
	String category="Milk";
			void display(){
				System.out.println(id+" "+name+" "+count+" "+category);
			}
}
class C extends Product{
	int count=56;
	String category="choco";
	void display(){
		System.out.println(count+" "+category);
	}
}
class suba extends A{
	int price=30;
	
	void result(){
		System.out.println("the total price:"+(count*price));
	}
	void display(){
		System.out.println(id+" "+name+" "+category);
	}
}
class subb extends B{
	int price=10;
	void result(){
		System.out.println("the total price:"+(count*price));
	}
	void display(){
		System.out.println(id+" "+name+" "+category);
	}
	
}



public class Maininherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subb obj1=new subb();
		suba obj2=new suba();
		obj1.display();
		obj1.result();
		obj2.display();
		obj2.result();
		

	}

}
