package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int intArray[] = new int[3];
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("성적처리할 학생의 수를 입력하세요 >> "+ intArray.length);
		System.out.print("성적을 입력하세요 : ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scan.nextInt();
			System.out.print("성적을 입력하세요 : ");
		}
		for(int i=0; i<intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.println();
		System.out.println("==========================");
		System.out.println("총점은 "+ sum + " 점 입니다.");
		System.out.println("평균은 "+ (double)sum/intArray.length + " 점 입니다.");
		scan.close();
	}

}
