package assignment1;

public class ex2{
	int isOn;
	ex2(int isOn){
		this.isOn = isOn;			
	}
	void turnOn(){
		System.out.println("True");
	}
	void turnOff(){
		System.out.println("False");
	}

	public static void main(String[] args) {
		
		ex2 led = new ex2(1);
		ex2 halogen = new ex2(0);
		if(led.isOn == 1)
			led.turnOn();
		else
			led.turnOff();
		if(halogen.isOn == 1)
			halogen.turnOn();
		else
			halogen.turnOff();
	}

}