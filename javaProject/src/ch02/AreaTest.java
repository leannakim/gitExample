package ch02;

public class AreaTest {

	public static void main(String[] args) {

		//반지름이 5.0인 원의 면적을 계산
		//double radius;
		//double area; /각각 정의를 해도 되지만 ,를 사용하여 정의를 할 수 있다.
		
		double radius, area;//이렇게 정의해도 가능하다.
		radius = 5.0;
		area = 3.141592 * radius * radius;
		System.out.println("원의 면적은 : " + area);
		
	}

}
