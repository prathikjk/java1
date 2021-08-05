package assignment1;

import java.util.Scanner;

abstract class shape{
	double area,a,b;
	abstract void area();
}

class rect extends shape{
	void area(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length:");
		a = in.nextDouble();
		System.out.println("Enter the breadth:");
		b = in.nextDouble();	
		area = a * b;
		System.out.println("Area of rectangle with length "+a+" and breadth "+b+" is : "+area);
	}
}

class cir extends shape{
	void area(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius:");
		a = in.nextDouble();
		area=3.142 * a * a;
		System.out.println("Area of circle with radius "+a+" is : "+area);
	}
}

class sqr extends shape{
	void area(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side:");
		a = in.nextDouble();
		area = a * a;
		System.out.println("Area of square with side "+a+" is : "+area);
	}
}

public class ex20 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		shape ref;
		ref = new sqr();
		ref.area();
		
		ref = new rect();
		ref.area();
		
		ref = new cir();
		ref.area();
		
	}

}
