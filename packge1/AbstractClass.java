package packge1;

abstract class Bike{
	abstract void speed();
	void display() {
		System.out.println("Bike Class");
	}
}

class MotorBike extends Bike{

	@Override
	void speed() {
		System.out.println("Motorbike Speed");
		
	}
	
}

abstract class SportBike extends Bike{//if the subclass is declared abstract, it's not mandatory to override abstract methods

//	@Override
//	void speed() {
//		System.out.println("Sport Bike speed");
//		
//	}

}

public class AbstractClass extends Bike{

	public static void main(String[] args) {
		AbstractClass a = new AbstractClass();
		a.display();
		a.speed();
		
		//Bike b = new Bike();		cannot create obj of abstract class
		
		MotorBike m = new MotorBike();
		m.speed();
	}

	@Override
	void speed() {
		System.out.println("Speed");
		
	}

}
