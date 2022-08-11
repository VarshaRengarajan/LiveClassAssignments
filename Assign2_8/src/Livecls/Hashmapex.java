package Livecls;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> hm=new LinkedHashMap();
		hm.put(1,new String("apple"));
		hm.put(2,new String("orange"));
		hm.put(3,new String("banana"));
		hm.put(4,new String("papaya"));
		hm.put(5,new String("pear"));
		hm.put(6,new String("rambutan"));
		hm.put(7,new String("cherry"));
		hm.put(8,new String("bluberry"));
		hm.put(9,new String("custard apple"));
		hm.put(10,new String("watermelon"));
		
		System.out.println("the map of fruits are:"+hm);
		System.out.println("the iterated order of fruits:");
		 for (Integer key : hm.keySet()) {
	            System.out.println(key + ":" + hm.get(key));
	        }
		 hm.remove("papaya");
		 hm.remove(7);
		 System.out.println("the modified order of fruits:");
		 for (Integer key : hm.keySet()) {
	            System.out.println(key + ":" + hm.get(key));
	        }
		 System.out.println(hm.containsValue("banana"));
		 System.out.println(hm.containsValue("apple"));
		 System.out.println(hm.hashCode());
		 hm.clear();
		 System.out.println("the contents after clearing:"+hm);
		 
		

	}

}
