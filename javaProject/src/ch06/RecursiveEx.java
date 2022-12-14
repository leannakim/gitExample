package ch06;
//재귀호출 - 실제 잘 사용하지 않음(메모리 증가)
//factorial 계산 : 5!=5x4x3x2x1
public class RecursiveEx {
	static long fact1(int n) {//메소드설정//매개변수의 갯수와 데이터타입일 일치하는것이 중요함
		return n==1 ? 1 : n*fact1(n-1);//5x4x3x2x1
	}
	
	
	public static void main(String[] args) {
		System.out.println(fact1(5));
		
	}

}
