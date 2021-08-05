package assignment1;

class shapes{
	double area;
	void area(float a, float b){
		area = a * b;
		System.out.println("Area of rectangle is : "+area);
	}
	void area(float r){
		area=3.142 * r * r;
		System.out.println("Area of circle is : "+area);
	}
	void area(int a){
		area = a * a;
		System.out.println("Area of square is : "+area);
	}
	void area(float a, float b, float h){
		area = ((a + b)/2)*h;
		System.out.println("Area of trapezium is : "+area);
	}
	
}
public class ex10 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		shapes s = new shapes();
		s.area(10);
		s.area(5f);
		s.area(5.4f, 5f);
		s.area(2.5f,3.0f,5.0f);
	}

}
