package ch09;

public class ManagerTest {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.input(20220101,"123456-1234567" , "홍길동", 3000);
		m1.input("서울 강남구", "hong@gamil.com");
		m1.print();
	}

}
