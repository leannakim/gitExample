package ch09;

class Bank{
	double getInterestRate() {
		return 0.0;
	}
}
class BadBank extends Bank{
	@Override
	double getInterestRate() {//메소드 오버라이딩(재정의목적을 가짐)
		return 10.0;
	}
}

class NomalBank extends Bank{
	@Override
	double getInterestRate() {//메소드 오버라이딩(재정의목적을 가짐)
		return 5.0;
	}
}

class GoodBank extends Bank{
	@Override
	double getInterestRate() {//메소드 오버라이딩(재정의목적을 가짐)
		return 3.0;
	}
}
public class BankTest {
	public static void main (String []agrs) {
		BadBank b1 = new BadBank();//객체생성, 인스턴스화
		NomalBank b2 = new NomalBank();
		GoodBank b3 = new GoodBank();
		
		
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate() );
		System.out.println("NomalBank의 이자율 : " + b2.getInterestRate() );
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate() );
	}
	
}
