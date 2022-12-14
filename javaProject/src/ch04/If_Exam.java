package ch04;

public class If_Exam {

	public static void main(String[] args) {
		//if문
		int a = 10;
		//int a = 9;//조건이 맞지 않아서 실행하지 않고 마지막 출력만 출력된다.
		if( a % 2 == 0){ //a를 2로 나눈 나머지가 0이면
			System.out.println(a + "는 짝수 입니다.");
		}//end if
		System.out.println("if문이 끝난이후 그 다음 명령문을 수행한다.");
			
	}//end main

}//end class
