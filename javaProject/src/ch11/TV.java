package ch11;

public class TV implements Controllable, RemoteControllable {//2

	@Override
	public void remoteOn() {
		System.out.println("리모콘으로 TV를 켠다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("리모콘으로 TV를 끈다.");
	}

	@Override
	public void trunOn() {
		System.out.println(" TV를 켠다.");
	}

	@Override
	public void trunOff() {
		System.out.println(" TV를 끈다.");
	}

}
