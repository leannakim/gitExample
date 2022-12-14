package ch11;

public class Boat implements Vehicle {//Vehicle - 4

	@Override
	public void speedUp() {
		System.out.println("Boat SpeedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Boat SpeedUp");
	}

	@Override
	public void handle() {
		System.out.println("Boat SpeedUp");
	}

}
