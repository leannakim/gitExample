package ch06;

public class CallstackTest {

	public static void main(String[] args) {
		firstMethod();
	}//프로그램 끝

	private static void firstMethod() {
		secondMethod();
		
	}

	private static void secondMethod() {
		System.out.println("secondMethod()");//프로그램은 역으로 올라가서 메인메소드에서 끝이난다.
	}

}
