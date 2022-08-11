package Assign4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linkedhashassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lk=new LinkedHashSet();
		lk.add(6);
		lk.add(7);
		lk.add(5.678f);
		lk.add(5.6f);
		lk.add('h');
		lk.add('y');
		lk.add(true);
		
		System.out.println("the linkedhash set is"+lk);
		
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
       System.out.println("Enter the input to be added in LinkedHashSet");
        
        Scanner input = new Scanner(System.in); // comnnad line to take user input
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        int s4 = input.nextInt();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        System.out.println("the LinkedHashset are"+ls);
        
		

	}

}
