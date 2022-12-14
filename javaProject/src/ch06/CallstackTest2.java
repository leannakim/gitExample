package ch06;

public class CallstackTest2 {

	public static void main(String[] args) {//프로그램은 메인에서 시작이 되서 순차적으로 진행 후 역으로 올라와서 메인에서 종료됨
		System.out.println("main(string[]args)이 시작되었음.");
		firstMethod();//메소드 호출
		System.out.println("main(string[]args)이 끝났음.");
	}

	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음.");
		secondMethod();//메소드 호출
		System.out.println("firstMethod()이 끝났음.");
	}

	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}

}
