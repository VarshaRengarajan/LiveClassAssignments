package Assign4;

import java.util.ArrayList;

public class Arraylisteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>ar=new ArrayList<String>();
		ar.add(0,"mango");
		ar.add(1,"apple");
		ar.add(2,"berry");
		ar.add(3,"orange");
		ar.add(4,"banana");
		ar.add(5,"pear");
		ar.add(6,"Chennai");
		ar.add(7,"Trichy");
		ar.add(8,"Singing");
		ar.add(9,"painting");
		System.out.println("The arraylist is"+ar);
		System.out.println(ar.remove(9));
		System.out.println("The new arraylist is:"+ar);
		System.out.println(ar.contains("cricket"));
		ar.remove(6);
		ar.remove(2);
		System.out.println("The modified arraylist is"+ar);
		System.out.println("The fourth element is:" +ar.get(4));
		System.out.println("The sixth element element is:" +ar.get(6));
		
		
		

	}

}
