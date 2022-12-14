package ch03;

public class CastEx {

	public static void main(String[] args) {
//자료형변환
		float f = 1.6F; //4바이트로 저장
		System.out.println(f);
		
		f = 100; //자동형변환(정수100을 자동으로 float형 실수 100.0f로 변환)
		System.out.println(f);
		
		f = 100.5F;
		int i = (int)f;//강제형변환
		
		System.out.println(i);//정수형으로 나오면서 .5의 값손실이 있을 수 있다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
