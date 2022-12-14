package ch11;

public class Notebook implements Controllable {//4

	@Override
	public void trunOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void trunOff() {
		System.out.println("노트북을 끈다.");
	}

}
