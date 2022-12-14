package ch11;

public class ControllableDemo {

	public static void main(String[] args) {//6
		TV tv=new TV();
		tv.trunOn();
		tv.trunOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		Controllable.reset();//ststic멤버일때는 클래스 이름.메소드 접근해야한다.
		
		Computer com = new Computer();
		com.trunOn();
		com.trunOff();
		com.repair();
		Controllable.reset();
		
		Notebook n = new Notebook();
		n.trunOn();
		n.trunOff();
		n.repair();
		Controllable.reset();
	}

}
