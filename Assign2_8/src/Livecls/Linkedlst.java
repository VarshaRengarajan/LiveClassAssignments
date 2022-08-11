package Livecls;

import java.util.LinkedList;
import java.util.Iterator;

public class Linkedlst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=6;
		
		LinkedList<String>ll=new LinkedList<String>();
		
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		ll.add("April");
		ll.add("November");
		ll.addLast("December");
		ll.addFirst("January");
		ll.add(2, "March");
		ll.add(1, "February");
		ll.add(8, "September");
		ll.add(9, "October");
		
		
		ll.remove(2);
		ll.remove(6);
		
		ll.add(3, "April");
		ll.add(4, "May");
		System.out.println("the months are"+ll);
		System.out.println("months at even positions:"+ll.get(1)+" "+ll.get(3)+" "+ll.get(5)+" "+ll.get(7)+" "+ll.get(9)+" "+ll.get(11));
		System.out.println("months at odd pos:"+ll.get(0)+" "+ll.get(2)+" "+ll.get(4)+" "+ll.get(6)+" "+ll.get(8)+" "+ll.get(10));

		Iterator itr=ll.iterator();
		while (itr.hasNext()) {
            System.out.println(itr.next());
        }
		System.out.println(ll.remove("July"));
		System.out.println("the modified list of months:"+ll);
		System.out.println(ll.contains("winter month"));
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println("the final list of months:"+ll);
		

	}

}
