package assignment1;

import java.util.Scanner;

interface b{
	void readCustomerInfo(); 
}

interface ICICI extends b{
	void calculateInterest();
	void displayDetails();
}

interface Axis extends b{
	void calculateInterest();
	void displayDetails();
}

class impl implements ICICI, Axis{

	 public String name;
	public int acno,t;
	public float amt,si,r;
	public void readCustomerInfo(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the account number:");
		acno=in.nextInt();
		System.out.println("Enter the name:");
		name=in.next();
		System.out.println("Enter the amount:");
		amt=in.nextFloat();
		System.out.println("Enter the interest:");
		r=in.nextFloat();
		System.out.println("Enter the time:");
		t=in.nextInt();
	}

	public void calculateInterest() {
		// TODO Auto-generated method stub
		si = ( amt * t * r)/100;
	}

	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name   		    : "+name);
		System.out.println("Acoount Number  : "+acno);
		System.out.println("Amount          : "+amt);
		System.out.println("Rate Of Interest: "+r);
		System.out.println("Time            : "+t);
		System.out.println("Interest        : "+si);
	}
}
public class ex19 extends impl {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		impl a = new impl();
		a.readCustomerInfo();
		a.calculateInterest();
		a.displayDetails();
	}

}
