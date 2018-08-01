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
-----------------------------------
package oops;

public class Executive extends Employee {

	private double bonus;
	public Executive() {
	}

	public Executive(String empName, double salary, double bonus) {
		super(empName, salary);
		this.bonus=bonus;
	}
	
	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Bonus:" + bonus);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	
	

}
------------------------------------------------------
package oops;

public class Manager extends Employee {
	private double commission;

	public Manager() {
	}

	public Manager(String empName, double salary, double commission) {
		super(empName, salary);
		this.commission = commission;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commission:" + commission);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commission;
	}

}
--------------------------------
package oops;

public class TestEmployee {
	public static void main(String[] args) {

		Manager mgr = new Manager("Lili", 7000, 2000);
		showSalary(mgr);

		Executive exe = new Executive("Mili", 9000, 3000);
		showSalary(exe);

	}

	private static void showSalary(Employee emp) {
		if (emp instanceof Manager)
			System.out.println("Manager Salary:" + emp.getSalary());
		else 
			System.out.println("Executive Salary:"+emp.getSalary());
	}

	// private static void showSalary(Executive exe) {
	// System.out.println("Executive Salary:" + exe.getSalary());
	// }
	//
	// private static void showSalary(Manager mgr) {
	// System.out.println("Manager Salary:" + mgr.getSalary());
	// }
}

