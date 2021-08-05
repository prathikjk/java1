package assignment1;
import java.util.*;

class distance{
	private
		int feet;
		int inch;
	public
		void getDist(){
		Scanner in=new Scanner(System.in);
			System.out.print("Enter the feet: ");
			feet=in.nextInt();
			System.out.print("Enter the inch: ");
			inch=in.nextInt();			
		}
		void Display(){
			System.out.println("Result");
			System.out.println("Feet: "+feet+" Inches: "+inch);
		}
		distance adddist(distance d1, distance d2){
			distance d=new distance();
			d.feet=d1.feet+d2.feet;
			d.inch=d1.inch+d2.inch;
			if(d.inch>=12){
				d.feet++;
				d.inch-=12;
			}
			return d;
		}
}

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		distance d1= new distance();
		distance d2=new distance();
		distance d3= new distance();
		System.out.println("Enter first distance:");
		d1.getDist();
		System.out.println("Enter second distance:");
		d2.getDist();
		d3=d3.adddist(d1, d2);
		d3.Display();
	}

}
