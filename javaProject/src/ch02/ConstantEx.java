package ch02;

public class ConstantEx {

	public static void main(String[] args) {

		final double KM_PER_MILE = 1.609344; //상수란 변하지 않은 값이다. 
											//상수 사용시 final을 꼭 사용해야한다.
		                                    //상수의 이름은 대문자로 표시하기를 권고 한다.
		
		double km;
		double mile = 60.0;
		
		km = KM_PER_MILE * mile;
		System.out.println("60마일은 " + km + "킬로미터 입니다.");
	}

}
