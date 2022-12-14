package ch06;

import java.util.Scanner;

public class Ex {

	
	public static void main(String[] agrs) {
	

	//public static void count() {
		Scanner sc = new Scanner(System.in);
		
		/*while(true) {
			System.out.println("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}else {
				System.out.println(str.length() + "글자입니다.");
				//length() : 문자열에 대한 글자수 반환메소드
			}
		}
		System.out.println("프로그램을 종료합니다.");
	*/
		
		
		for(int i=1; i<=20; i++) {
			switch(i % 5) {
			case 0:
				System.out.println(i + ": 5의 배수입니다.");
				break;
			default:
			System.out.println(i + ": 5의 배수가 아닙니다.");
			}
		}
		
		/*int[] arr = new int[4];
		for(int i=0; i<arr.length; i++) {
			arr[i] += (10 + i);
			System.out.println(arr[i]);
		}
		}*/
	
	}
}


