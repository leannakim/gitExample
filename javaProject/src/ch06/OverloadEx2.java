package ch06;

public class OverloadEx2 {

	public static void main(String[] args) {//매개변수가 같은 오버로딩이 있다면 데이터 타입은 무조건 달라야 한다.
		int i1 = 3, i2 = 7, i3 = 10;
		double d1=7.0, d2=3.0;
		
		System.out.printf("max(%d, %d) = %d%n", i1, i2, max(i1,i2));
		System.out.printf("max(%.1f, %.1f) = %.1f%n", d1, d2, max(d1,d2));
		System.out.printf("max(%d, %d, %d) = %d%n", i1, i2, i3, max(i1,i2,i3));
		
	}




	public static int max(int n1, int n2) {//n1=3, n2=7
		int result = n1>n2 ? n1 : n2;		
		return result;//7
	}

	public static double max(double n1, double n2) {//n1=7.0, n2=3.0
		double result = n1>n2 ? n1 : n2;
		return result;//7.0
	}
	public static int max(int n1, int n2, int n3) {//n1=3, n2=7, n3=10
		return max(max(n1,n2),n3);//수행을 할때는 안쪽max를 먼저 수행하고(max(7,10))리턴하여 10이 나옴, 최종 10을 리턴
	}
	
}
