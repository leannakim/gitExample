package ch06;

import java.math.BigInteger;
//BigInteger가 어마어마한 숫자를 만들어 저장함.
public class BigIntEx {
	static BigInteger factorial (int n) {
		BigInteger fac = BigInteger.ONE;//1
		for(int i=1; i<n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));//객체로 바꿔주는 작업
		}
		return fac;
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=200; i++) {
			System.out.println(i + "팩토리얼 ="+factorial(i));
			System.out.println();//줄바꿈
		}
	}

}
