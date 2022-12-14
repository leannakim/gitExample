package ch04;

import java.util.Random;
import java.util.Scanner;
//랜덤으로 난수를 발생시키는 랜덤객체
public class RandomNumber {

	public static void main(String[] args) {
		
		Random gennerator = new Random();//난수를 발생시키는 랜덤객체이다.
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int sum = 0;
		scan.close();
		
		for(int i=0; i<count; i++) {
			int number = gennerator.nextInt(100);
			System.out.println("생성된 난수 : "+ number);
			sum =+ number;
		}
		System.out.println("난수 "+ count + "개의 합은 "+sum);
		
	}
}

