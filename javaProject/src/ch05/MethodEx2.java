package ch05;
//메소드 사용
public class MethodEx2 {
	//메인 메소드(프로그램의 시작이자 끝)
	//메인메소드는 해당 코딩영역의 위치와 상관없다.
	public static void main(String[] args) {
		//프로그램 시작
		System.out.println("합(1~10) : "+ sum(1,10));//sum(1,10) 함수 호줄
		System.out.println("합(10~100) : "+ sum(10,100));
		System.out.println("합(100~1000) : "+ sum(100,1000));
		//프로그램 끝
	}
	//사용자 저의 메소드
	private static int sum(int a, int b) {//a=1,b=10//a=10,b=100//a=100,b=1000
		int sum = 0;//리턴할 용도(변환할 용도)
		for(int i=a; i<=b; i++) {
			sum +=1;
		}
		return sum;
	}

}
