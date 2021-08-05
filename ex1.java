package assignment1;
class lamp{
	int isOn;
	lamp(int isOn){
		this.isOn = isOn;			
	}
	void turnOn(){
		System.out.println("True");
	}
	void turnOff(){
		System.out.println("False");
	}
}
public class ex1 {

	public static void main(String[] args) {
		
		lamp led = new lamp(0);
		lamp halogen = new lamp(1);
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