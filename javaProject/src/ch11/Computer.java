package ch11;

public class Computer implements Controllable {//3

	@Override
	public void trunOn() {
		System.out.println("컴퓨터를 켠다.");
	}

	@Override
	public void trunOff() {
		System.out.println("컴퓨터를 끈다.");
	}

}
