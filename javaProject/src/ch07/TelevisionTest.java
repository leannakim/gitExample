package ch07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();//객체생성(인스턴스화)tv는 주소값을 가짐
		//System.out.println(tv);
		tv.channel = 7;//tv.=> 인스턴스화된 Television메모리의 주소값으로 접근
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("텔레비전의 채널은"+tv.channel+"이고 볼륨은"+tv.volume+"입니다.");
	}//클래스와 클래스끼리 인스턴스화를 하여 연결해서 사용이 가능하다.

}
