package ch07;

public class RadioTest {

	public static void main(String[] args) {
		Radio Britz = new Radio();
		Britz.onOff = true;
		Britz.channel = 89.1;
		Britz.valume = 12;
		
		System.out.println("[브리츠 라디오]");
		Britz.onOff();
		System.out.println("현재 채널은 "+ Britz.channel + "입니다."+"\n"
		+"볼륨은 "+Britz.valume+"입니다." );
		
		Radio iriver = new Radio();
		iriver.onOff = false;
		iriver.channel = 95.1;
		iriver.valume = 9;
		System.out.println("[아이리버 라디오]");
		iriver.onOff();
		System.out.println("현재 채널은 "+ iriver.channel + "입니다."+"\n"
				+"볼륨은 "+iriver.valume+"입니다." );
		
	}

	
}
