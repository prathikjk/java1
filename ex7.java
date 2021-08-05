package assignment1;

class fruits{
	void seed(){
		System.out.println("has seeds");
	}
}

class mango extends fruits{
	void name(){
		System.out.print("Mango ");
	}
}

class orange extends fruits{
	void name(){
		System.out.print("Orange ");
	}
}

class papaya extends fruits{
	void name(){
		System.out.print("Papaya ");
	}
}

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		papaya p = new papaya();
		mango m = new mango();
		orange o = new orange();
		p.name();
		p.seed();
		m.name();
		m.seed();
		o.name();
		o.seed();
	}

}
