package assignment1;
import bank.bank_op.*;

public class ex16 {

	public static void main(String[] args) {
		o b1 = new o();
		b1.create_acc();
		b1.withdraw(1500);
		b1.display();
		b1.deposit(2500f);
		b1.display();
	}

}