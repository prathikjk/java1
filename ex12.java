package assignment1;

class A1{
	int x=5;
	A1(){
		System.out.println("Hello A");
	}
	A1(int x){
		this();
		System.out.println(this.x);
		System.out.println(x);
	}
}
public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1(10);
	}

}
