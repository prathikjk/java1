package assignment1;

import java.util.Scanner;
class Address{
	String city, state, country;
	public Address(String city, String state, String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class emp{
	String name,city,state,country;
	int eno;
	float basic;
	Address address;
	void getInfo(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Employee number   :");
		eno = in.nextInt();
		System.out.println("Enter the Employee name     :");
		name = in.next();
		System.out.println("Enter the Employee city  :");
		city = in.next();
		System.out.println("Enter the Employee state  :");
		state = in.next();
		System.out.println("Enter the Employee country  :");
		country=in.next();
		System.out.println("Enter the Basic Salary	    :");
		basic = in.nextFloat();
		address = new Address(city,state,country);
	}
}
 
class sal extends emp{
	float da, hra, pf, it, gross, net;
	void calc(){
		da =(float) ( 0.3 * basic);
		hra = (float)(0.2 * basic);
		pf = (float)(0.5 * basic);
		it = (float)(0.1 * basic);
		gross = basic + da + hra;
		net = gross - pf - it;
	}
	
	void display(){
		System.out.println("Employee number   : "+eno);
		System.out.println("Employee name     : "+name);
		System.out.println("Employee address  : "+address.city+", "+address.state+", "+address.country);
		System.out.println("Basic Salary	  : "+basic);
		System.out.println("DA                : "+da);
		System.out.println("HRA               : "+hra);
		System.out.println("PF                : "+pf);
		System.out.println("IT                : "+it);
		System.out.println("Gross Salary	  : "+gross);
		System.out.println("Net Salary        : "+net);
	}
}
public class ex17{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of employees:");
		n = in.nextInt();
		sal e[] = new sal[n];
		for(int i=0;i<n;i++)
		{
			e[i]= new sal();
			System.out.println();
			System.out.println("Enter Emloyee "+(i+1)+" details:");
			e[i].getInfo();
			e[i].calc();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println();
			System.out.println("************");
			System.out.println("Employee "+(i+1));
			System.out.println("************");
			e[i].display();
		}
	}

}
