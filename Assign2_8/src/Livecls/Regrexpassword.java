package Livecls;
import java.util.Scanner;
import java.util.regex.*;
public class Regrexpassword {
	static boolean check(String password){
		String regrex=".*[A-Z].*[@#&*!]\\d{4}[a-zA-Z0-9]{4}";
		return password.matches(regrex);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the password");
		Scanner sc=new Scanner (System.in);
		String pp= sc.next();
		
		System.out.println("the password is:"+pp);
		System.out.println("the validation of email:"+check(pp));
		

	}

}
