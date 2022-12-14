package ch11;

public class AutoCarTest {

	public static void main(String[] args) {
		OperaterCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(30);
		obj.trun(15);
		obj.stop();
	}

}
