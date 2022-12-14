package ch05;

public class ArrayBasic {

	public static void main(String[] args) {
	/*	int[] score;//배열참조변수 선언
		score = new int[5];//new를 통해서 메모리에 5개의 int형을 만듦.
		//배열을 생성(4byte x 5 = 20byte)
		 * 
		 */
		
	/*	int[] score = new int[5];//한줄로 선언을 할 수 있다.
		System.out.println(score);//score는 메모리의 주소갖ㅅ을 가리키는 참조변수가 된다.
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 60;
		score[4] = 70;
		//score[5] = 90;//범위초과
		*/
		
		int[] score = {100,90,80,60,70};//실무기법
	/*	System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		*///배열을 다루는데 있어서 for문은 거의 필수적으로 사용된다.
		//System.out.println(score[5]); java.lang.ArrayIndexOutOfBoundsException: 5 에러가뜸
		for(int i=0; i<5; i++) {
			System.out.println(score[i]);
		}
	}

}
