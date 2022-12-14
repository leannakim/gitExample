package ch13;

public class AutoBox {

	public static void main(String[] args) {
		//기본자료형
		int num1 =10;
		int num2;
		
		//참조자료형
		Integer i1;//선언만 했을 때는 i1의 값은 null상태
		Integer i2 = new Integer(20);//Auto boxing(기본자료형 리터럴을 객체로 박스처리)
		
		
		i1 = num1;//기본자료형인 int와 객체자료형인 Wrapper class인 Integer와는 호환된다.
		num2 = i2;//Auto Unboxing(객체 안에 들어 있는 값을 풀어서 저장)
		
		
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
		
	}

}
