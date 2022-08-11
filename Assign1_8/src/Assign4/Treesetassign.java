package Assign4;

import java.util.TreeSet;

public class Treesetassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tr=new TreeSet<String>();
		tr.add("java");
		tr.add("python");
		tr.add("C");
		tr.add("c++");
		tr.add("php");
		tr.add("javascript");
		System.out.println("the prog languages are"+tr);
		tr.remove("php");
		tr.remove("c++");
		System.out.println("after deleting 2 lang"+tr);
		System.out.println(tr.contains("java"));
		tr.clear();
		System.out.println(tr);
		

	}

}
