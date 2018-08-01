package oops;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		String email;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the email address+");
        email=sc.nextLine();
		
		
		int i1=email.indexOf('@');
		int i2=email.indexOf('.');
		
		if(!(email.contains("@")&&email.contains("."))||email.substring(0,i1).length()<4||email.substring(i1+1, i2).length()<3||email.substring(i2+1, email.length()).length()<2)
			System.out.println("rejected");
		else System.out.println("accepted");	
	}

}
